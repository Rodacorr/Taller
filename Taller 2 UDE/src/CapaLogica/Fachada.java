package CapaLogica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import CapaLogica.Alumnos.Alumno;
import CapaLogica.Alumnos.Alumnos;
import CapaLogica.Inscripciones.Inscripcion;
import CapaLogica.Alumnos.Becado;
import CapaLogica.Asignaturas.*;
import CapaLogica.Exceptions.*;
import CapaLogica.VO.*;
import persistencia.*;
import persistencia.exceptions.*;
import java.util.Properties;

public class Fachada extends UnicastRemoteObject implements IFachada{

	private Alumnos diccioAl;
	private Asignaturas diccioAs;
	private Monitor m;

	public Fachada () throws RemoteException{
		diccioAl = new Alumnos();
		diccioAs = new Asignaturas();
		m = new Monitor();
	}

	public void registrarAsignatura(voAsignatura asig) throws RemoteException, AsignaturaYaExisteException, AsignaturasCompletaException{ 
		m.comienzoEscritura();
		String cod = asig.getCodigo();
		String nom = asig.getNombre();
		String des = asig.getDescripcion();
		Asignatura as;
		as = new Asignatura(cod,nom,des);
		if(diccioAs.largo() == 10) {
			String msg = "Ya hay 10 asignaturas registradas";
			m.terminoEscritura();
			throw new AsignaturasCompletaException(msg);
		}
		else {
			if(diccioAs.member(cod)){ 
				String msg = "La asignatura dada ya existe con ese codigo";
				m.terminoEscritura();
				throw new AsignaturaYaExisteException(msg);
			}
			else {
				diccioAs.insBack(as);
				m.terminoEscritura();
			}
		}
	}

	public ArrayList<voAsignatura> listarAsignaturas() throws RemoteException, DicAsignaturasVacioException { 
		m.comienzoLectura();
		if(diccioAs.esVacio()) {
			String msg = "No existen asignaturas para mostrar";
			m.terminoLectura();
			throw new DicAsignaturasVacioException(msg);
		}
		else{
			ArrayList<voAsignatura> vo = diccioAs.listaAsignaturas();
			m.terminoLectura();
			return vo;
		}
	}



	public void registarAlumno(voAlumno al) throws RemoteException, AlumnoYaExisteExceptions{
		m.comienzoEscritura();
		long ced = al.getCedula();
		if (diccioAl.member(ced)){
			String msg = "El alumno ya existe";
			m.terminoEscritura();
			throw new AlumnoYaExisteExceptions(msg);  
		}		
		else {
			Alumno alu;
			if (al instanceof voBecado) 
				alu=new Becado(al.getCedula(),al.getNombre(),al.getApellido(),al.getDomicilio(),al.getTelefono(),((voBecado)al).getPorcentajeBeca(),((voBecado)al).getRazon());
			else 
				alu=new Alumno(al.getCedula(),al.getNombre(),al.getApellido(),al.getDomicilio(),al.getTelefono());
			diccioAl.insert(alu);
			m.terminoEscritura();
		}

	}

	public ArrayList<voAlumnoDatTipo> listarAlumnoApe(String ape) throws RemoteException, DicAlumnosVacioException {
		m.comienzoLectura();
		if(diccioAl.esVacio()) {
			String msg = "No hay alumnos para mostrar";
			m.terminoLectura();
			throw new DicAlumnosVacioException(msg);  
		}
		else {
			ArrayList<voAlumnoDatTipo> vo = diccioAl.listaAlumnoApe(ape);
			m.terminoLectura();
			return vo;
		}
	}

	public voAlumnoCompleto listarAlumnoCed(long ced) throws RemoteException, AlumnoNoInscriptoException{
		m.comienzoLectura();
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			m.terminoLectura();
			throw new AlumnoNoInscriptoException(msg);  
		}
		else {
			Alumno al = diccioAl.find(ced);
			long cedula = al.getCedula();
			String nombre = al.getNombre();
			String apellido = al.getApellido();
			int cantAprob = al.getCantAsigAprob();
			String tipo = al.getTipo();
			long telefono = al.getTelefono();
			String domicilio = al.getDomicilio();
			voAlumnoCompleto vo; 
			if(al instanceof Becado) {
				int porcentajeBeca = ((Becado)al).getPorcentajeBeca();
				String razon = ((Becado)al).getRazon();
				vo = new voBecadoDatCom(cedula,nombre,apellido,cantAprob,domicilio,telefono,tipo,porcentajeBeca,razon);
			}
			else
				vo = new voAlumnoCompleto(cedula,nombre,apellido,cantAprob,domicilio,telefono,tipo);
			m.terminoLectura();
			return vo;
		}
	}

	public void registrarInscripcion(String cod, long ced, float mon, int anio) throws RemoteException, AlumnoNoInscriptoException, AsignaturaNoExisteException,AlumnoYaCursaAsignatura,AñoMenorAlUltimoReg{ 
		m.comienzoEscritura();
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			m.terminoEscritura();
			throw new AlumnoNoInscriptoException(msg);  
		}	
		else {
			Alumno al = diccioAl.find(ced);
			if(!diccioAs.member(cod)) {
				String msg = "asignatura no registrada";
				m.terminoEscritura();
				throw new AsignaturaNoExisteException(msg); 

			}
			else{
				if(al.estaInscriptoCursando(cod, anio))  {  
					String msg = "el alumno ya esta cursando la asignatura o ya la aprobo";
					m.terminoEscritura();
					throw new AlumnoYaCursaAsignatura(msg);
				}
				Inscripcion ultIn;
				if(al.tieneInscripciones())
					ultIn = al.darUltimaInscripcion();
				else
					ultIn = null;
				if(ultIn != null && ultIn.getAnioLectivo() > anio) {
					String msg = "el año dado es menor al de la ultima inscripcion";
					m.terminoEscritura();
					throw new AñoMenorAlUltimoReg(msg);
				}
				else {
					int numInscripcion = 0;
					if(ultIn != null)
						numInscripcion = ultIn.getNumero();
					Asignatura asig = diccioAs.find(cod);
					Inscripcion in = new Inscripcion (numInscripcion + 1,anio, mon,asig); 
					al.agregarInscripcion(in);
					m.terminoEscritura();
				}
			}
		}
	}

	public void registrarCalificacion(long ced, int cal, int num) throws RemoteException, AlumnoNoInscriptoException, NumInscripcionNoExiste, YaTieneCalificacion, NotaInvalida{ 
		m.comienzoEscritura();
		///mover para aca el if dew la nota valida
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			m.terminoEscritura();
			throw new AlumnoNoInscriptoException(msg);  
		}
		else {
			Alumno al = diccioAl.find(ced);
			if(!al.existeInscripcionPorNum(num)) {
				String msg = "el alumno no tiene una inscripción con dicho número";
				m.terminoEscritura();
				throw new NumInscripcionNoExiste(msg);
			}
			else {
				if(al.tieneCalificacion(num)) {
					String msg = "ya tiene una calificación en esta inscripcion "; 
					m.terminoEscritura();
					throw new YaTieneCalificacion(msg); 
				}
				else{
					if(cal < 1 || cal > 12) {
						String msg = "nota invalida";
						m.terminoEscritura();
						throw new NotaInvalida(msg);
					}
					else {
						al.registrarCalificacion(num, cal);
						m.terminoEscritura();
					}
				}
			}
		}	                              

	}



	public float montoRecaudado (long ced, int anio) throws RemoteException, AlumnoNoInscriptoException{ 
		m.comienzoLectura();
		if(!diccioAl.member(ced)){
			String msg = "alumno no existe";
			m.terminoLectura();
			throw new AlumnoNoInscriptoException(msg);
		}
		else{
			Alumno al = diccioAl.find(ced);
			m.terminoLectura();
			return al.calcularRecaudado(anio);
		}	
	}

	public  ArrayList<voInscripcion> listarEscolaridad(long ced, boolean modo) throws RemoteException, AlumnoNoInscriptoException,SecInscripcionesVaciaException{ 
		m.comienzoLectura();
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			m.terminoLectura();
			throw new AlumnoNoInscriptoException(msg);
		}
		else{
			Alumno al = diccioAl.find(ced);
			if(!al.tieneInscripciones()) {
				String msg = "este alumno aun no curso materias";
				m.terminoLectura();
				throw new SecInscripcionesVaciaException(msg);
			}
			else {
				m.terminoLectura();
				return al.listarEscolaridad(modo);
			}	
		}
	}

	public  ArrayList<voAlumnoDat> listarEgresados(boolean modo) throws RemoteException, DicAlumnosVacioException{
		m.comienzoLectura();
		if(diccioAl.esVacio()) {
			String msg = "No hay egresados para mostrar";
			m.terminoLectura();
			throw new DicAlumnosVacioException(msg);
		}
		else {
			m.terminoLectura();
			return diccioAl.listarEgresados(modo);
		}

	}

	public void respaldar() throws RemoteException, PersistenciaException{ 
		m.comienzoLectura();
		voPersistencia vo = new voPersistencia(diccioAl, diccioAs);
		Persistencia p = new Persistencia();
		try {
			Properties prop = new Properties();
			String nomArch = "config/txt.properties";
			prop.load (new FileInputStream (nomArch));
			String nombreArchivo = prop.getProperty("nombreArchivo");


			p.respaldar(nombreArchivo, vo);
			m.terminoLectura();
		}catch(PersistenciaException e) {
			m.terminoLectura();
			throw e;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			m.terminoLectura();
			throw new PersistenciaException(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			m.terminoLectura();
			throw new PersistenciaException(e.getMessage());
		}
	}

	public void recuperar() throws RemoteException, PersistenciaException{ 
		m.comienzoEscritura();
		Persistencia p = new Persistencia();
		try {
			Properties prop = new Properties();
			String nomArch = "config/txt.properties";
			prop.load (new FileInputStream (nomArch));
			String nombreArchivo = prop.getProperty("nombreArchivo");

			voPersistencia vo = p.recuperar(nombreArchivo);
			diccioAl = vo.getDiccioAl();
			diccioAs = vo.getDiccioAs();
			m.terminoEscritura();
		}catch(PersistenciaException e) {
			m.terminoEscritura();
			throw e;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			m.terminoLectura();
			throw new PersistenciaException(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			m.terminoLectura();
			throw new PersistenciaException(e.getMessage());
		}

	}


}