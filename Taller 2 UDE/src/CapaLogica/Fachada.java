import java.util.ArrayList;

import CapaLogica.Alumnos.Alumno;
import CapaLogica.Alumnos.Alumnos;
import CapaLogica.Inscripciones.Inscripcion;
import CapaLogica.Inscripciones.Inscripciones;
import CapaLogica.Alumnos.Becado;
import CapaLogica.Asignaturas.*;
import CapaLogica.Exceptions.*;
import CapaLogica.VO.*;

public class Fachada {
	
	private Alumnos diccioAl;
	private Asignaturas diccioAs;
	
	public Fachada () {
		 
	}
	
	public void registrarAsignatura(voAsignatura asig) throws AsignaturaYaExisteException{ 
		String cod = asig.getCodigo();
		String nom = asig.getNombre();
		String des = asig.getDescripcion();
		Asignatura as;
		as = new Asignatura(cod,nom,des);
		if(diccioAs.member(cod)){ 
			String msg = "La asignatura dada ya existe con ese codigo";
			throw new AsignaturaYaExisteException(msg);
		}
		else
			diccioAs.insBack(as);
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
	
	public ArrayList<voAlumnoDat> listarAlumnoApe(String ape) throws DicAlumnosVacioException {
		if(diccioAl.esVacio()) {
			String msg = "No hay alumnos para mostrar";
			throw new DicAlumnosVacioException(msg);  
		}
		else {
			ArrayList<voAlumnoDat> vo = diccioAl.listaAlumnoApe(ape);
			return vo;
		}
	}
	
	public voAlumnoDatCom listarAlumnoCed(long ced) throws AlumnoNoInscriptoException{
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
			voAlumnoDatCom vo; 
			if(al instanceof Becado) {
				int porcentajeBeca = ((Becado)al).getPorcentajeBeca();
				String razon = ((Becado)al).getRazon();
				vo = new voBecadoDatCom(cedula,nombre,apellido,cantAprob,porcentajeBeca,razon);
			}
			else
				vo = new voAlumnoDatCom(cedula,nombre,apellido,cantAprob);
			return vo;
		}
	}
	
	public void registrarInscripcion(String cod, long ced, float mon, int anio) throws AlumnoNoInscriptoException, AsignaturaYaExisteException,AlumnoYaCursaAsignatura,AñoMenorAlUltimoReg{ 
		
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			throw new AlumnoNoInscriptoException(msg);  
		}	
		else {
			Alumno al = diccioAl.find(ced);
			if(!diccioAs.member(cod)) {
				String msg = "asignatura no registrada";
				throw new AsignaturaYaExisteException(msg);  
			}
			else{
				if(al.estaInscriptoCursando(cod, anio))  {  
					String msg = "el alumno ya esta cursando la asignatura";
					throw new AlumnoYaCursaAsignatura(msg);
				}
				Inscripcion ultIn = al.darUltimaInscripcion();
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
	
	public void registrarCalificacion(long ced, int cal, int num) throws AlumnoNoInscriptoException, NumInscripcionNoExiste, NotaInvalida{ 
		if(!diccioAl.member(ced)) {
			String msg = "alumno no existe";
			throw new AlumnoNoInscriptoException(msg);  
		}
		else {
			Alumno al = diccioAl.find(ced);
			Inscripciones Insc = al.getInscripciones();
			if(!Insc.esta(num)) {
				String msg = "el alumno no tiene una inscripción con dicho número";
				throw new NumInscripcionNoExiste(msg);
				///ver validaciones
			}
			else {
			////	if() falta la validacion la calificación es distinta de 0 entonces error: ya tiene una calificación en esta asignatura      
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
			Inscripciones in = al.getInscripciones();
			if(in.estaVacia()) {
				String msg = "este alumno aun no a cursado materias";
				throw new SecInscripcionesVaciaException(msg);
			}
			else {
				return in.listarEscolaridad(modo);
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