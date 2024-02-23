package CapaLogica;

import java.util.ArrayList;
import CapaLogica.Alumnos.Alumno;
import CapaLogica.Alumnos.Alumnos;
import CapaLogica.Inscripciones.Inscripcion;
import CapaLogica.Alumnos.Becado;
import CapaLogica.Asignaturas.*;
import CapaLogica.Exceptions.*;
import CapaLogica.VO.*;

public class Fachada {
	
	private Alumnos diccioAl;
	private Asignaturas diccioAs;
	
	public Fachada () {
        diccioAl = new Alumnos();
        diccioAs = new Asignaturas();
	}
	
	public void registrarAsignatura(voAsignatura asig) throws AsignaturaYaExisteException, AsignaturasCompletaException{ 
		String cod = asig.getCodigo();
		String nom = asig.getNombre();
		String des = asig.getDescripcion();
		Asignatura as;
		as = new Asignatura(cod,nom,des);
		if(diccioAs.largo() == 10) {
			String msg = "Ya hay 10 asignaturas registradas";
			throw new AsignaturasCompletaException(msg);
		}
		else {
			if(diccioAs.member(cod)){ 
				String msg = "La asignatura dada ya existe con ese codigo";
				throw new AsignaturaYaExisteException(msg);
			}
			else {
				diccioAs.insBack(as);
			}
		}
	}
	
	public ArrayList<voAsignatura> listarAsignaturas() throws DicAsignaturasVacioException { 
		if(diccioAs.esVacio()) {
			String msg = "No existen asignaturas para mostrar";
			throw new DicAsignaturasVacioException(msg);
		}
		else{
			ArrayList<voAsignatura> vo = diccioAs.listaAsignaturas();
			return vo;
		}
	}
		
	
	
	public void registarAlumno(voAlumno al) throws AlumnoYaExisteExceptions{
		long ced = al.getCedula();
		if (diccioAl.member(ced)){
			String msg = "El alumno ya existe";
			throw new AlumnoYaExisteExceptions(msg);  
		}		
		else {
			Alumno alu;
			if (al instanceof voBecado) 
				alu=new Becado(al.getCedula(),al.getNombre(),al.getApellido(),al.getDomicilio(),al.getTelefono(),((voBecado)al).getPorcentajeBeca(),((voBecado)al).getRazon());
			else 
				alu=new Alumno(al.getCedula(),al.getNombre(),al.getApellido(),al.getDomicilio(),al.getTelefono());
			diccioAl.insert(alu);
		}
		
	}
	
	public ArrayList<voAlumnoDatTipo> listarAlumnoApe(String ape) throws DicAlumnosVacioException {
		if(diccioAl.esVacio()) {
			String msg = "No hay alumnos para mostrar";
			throw new DicAlumnosVacioException(msg);  
		}
		else {
			ArrayList<voAlumnoDatTipo> vo = diccioAl.listaAlumnoApe(ape);
			return vo;
		}
	}
	
	public voAlumnoCompleto listarAlumnoCed(long ced) throws AlumnoNoInscriptoException{
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
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
			return vo;
		}
	}
	
	public void registrarInscripcion(String cod, long ced, float mon, int anio) throws AlumnoNoInscriptoException, AsignaturaNoExisteException,AlumnoYaCursaAsignatura,AñoMenorAlUltimoReg{ 
		
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			throw new AlumnoNoInscriptoException(msg);  
		}	
		else {
			Alumno al = diccioAl.find(ced);
			if(!diccioAs.member(cod)) {
				String msg = "asignatura no registrada";
				throw new AsignaturaNoExisteException(msg); 
				
			}
			else{
				if(al.estaInscriptoCursando(cod, anio))  {  
					String msg = "el alumno ya esta cursando la asignatura o ya la aprobo";
					throw new AlumnoYaCursaAsignatura(msg);
				}
				Inscripcion ultIn;
				if(al.tieneInscripciones())
					ultIn = al.darUltimaInscripcion();
				else
					ultIn = null;
				if(ultIn != null && ultIn.getAnioLectivo() > anio) {
					String msg = "el año dado es menor al de la ultima inscripcion";
					throw new AñoMenorAlUltimoReg(msg);
				}
				else {
					int numInscripcion = 0;
					if(ultIn != null)
						numInscripcion = ultIn.getNumero();
					Asignatura asig = diccioAs.find(cod);
					Inscripcion in = new Inscripcion (numInscripcion + 1,anio, mon,asig); 
					al.agregarInscripcion(in);
				}
			}
		}
	}
	
	public void registrarCalificacion(long ced, int cal, int num) throws AlumnoNoInscriptoException, NumInscripcionNoExiste, YaTieneCalificacion, NotaInvalida{ 
		///mover para aca el if dew la nota valida
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			throw new AlumnoNoInscriptoException(msg);  
		}
		else {
			Alumno al = diccioAl.find(ced);
			if(!al.existeInscripcionPorNum(num)) {
				String msg = "el alumno no tiene una inscripción con dicho número";
				throw new NumInscripcionNoExiste(msg);
			}
			else {
				if(al.tieneCalificacion(num)) {
					String msg = "ya tiene una calificación en esta inscripcion "; 
				 	throw new YaTieneCalificacion(msg); 
				}
				else{
					if(cal < 1 || cal > 12) {
						String msg = "nota invalida";
						throw new NotaInvalida(msg);
					}
					else {
						al.registrarCalificacion(num, cal);
					}
				}
			}
		}	                              
			
	}
		
	
	
	public float montoRecaudado (long ced, int anio) throws AlumnoNoInscriptoException{ 
		if(!diccioAl.member(ced)){
			String msg = "alumno no existe";
			throw new AlumnoNoInscriptoException(msg);
		}
		else{
			Alumno al = diccioAl.find(ced);
			return al.calcularRecaudado(anio);
		}	
	}
	
	public  ArrayList<voInscripcion> listarEscolaridad(long ced, boolean modo) throws AlumnoNoInscriptoException,SecInscripcionesVaciaException{ 
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			throw new AlumnoNoInscriptoException(msg);
		}
		else{
			Alumno al = diccioAl.find(ced);
			if(!al.tieneInscripciones()) {
				String msg = "este alumno aun no a cursado materias";
				throw new SecInscripcionesVaciaException(msg);
			}
			else {
				return al.listarEscolaridad(modo);
			}	
		}
	}
	
	public  ArrayList<voAlumnoDat> listarEgresados(boolean modo) throws DicAlumnosVacioException{
		if(diccioAl.esVacio()) {
			String msg = "No hay egresados para mostrar";
			throw new DicAlumnosVacioException(msg);
		}
		else {
			return diccioAl.listarEgresados(modo);
		}
		
	}
	
	public void respaldar(){ 
	
	}
	
	public void recuperar(){ 
		
	}


}