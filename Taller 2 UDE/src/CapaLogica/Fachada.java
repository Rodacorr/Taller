import java.util.ArrayList;

import CapaLogica.Alumnos.Alumno;
import CapaLogica.Alumnos.Alumnos;
import CapaLogica.Inscripciones.Inscripciones;
import CapaLogica.VO.voAlumno;
import CapaLogica.VO.voAsignatura;
import CapaLogica.VO.voBecado;
import CapaLogica.Alumnos.Becado;
import CapaLogica.Asignaturas.*;

public class Fachada {
	
	private Alumnos diccioAl;
	private Asignaturas diccioAs;
	
	public Fachada () {
		 
	}
	
	public void registrarAsignatura(voAsignatura asig, tipoError &error) throws AsignaturaYaExisteException{ 
		String cod = asig.getCodigo();
		String nom = asig.getNombre();
		String des = asig.getDescripcion();
		Asignatura as;
		as = new Asignatura(cod,nom,des);
		if(diccioAs.member(cod)){ 
			/// exeption
		}
		else
			diccioAs.insBack(as);
	}
	
	public ArrayList<voAsignatura> listarAsignaturas() throws DicAsignaturasVacioException { 
		if(diccioAs.esVacio()) {
			///// exeption
		}
		else{
			ArrayList<voAsignatura> vo = diccioAs.listaAsignaturas();
			return vo;
		}
	}
		
	
	
	public void registarAlumno(voBecado al,tipoError &error) throws AlumnoYaExisteExceptions{
		long ced = al.getCedula();
		if (diccioAl.member(ced)){
			String msg = "El alumno ya existe";
			throw new AlumnoYaExisteExceptions(msg);  /// exeption
		}		
		else {
			Alumno alu;
			if (al instanceof voBecado) 
				alu=new Becado(al.getCedula(),al.getNombre(),al.getApellido(),al.getDomicilio(),al.getTelefono(),al.getPorcentajeBeca(),al.getRazon());
			else 
				alu=new Alumno(al.getCedula(),al.getNombre(),al.getApellido(),al.getDomicilio(),al.getTelefono());
			diccioAl.insert(alu);
		}
		
	}
	
	public ArrayList<voAlumnoDat> listarAlumnoApe(String ape) throws DicAlumnosVacioException {
		if(diccioAl.esVacio()) {
			/// exeption
		}
		else {
			ArrayList<voAlumnoDat> vo = diccioAl.listaAlumnoApe(ape);
			return vo;
		}
	}
	
	public voAlumnoDatCom listarAlumnoCed(long ced) throws AlumnoNoInscriptoException{
		if(!diccioAl.member(ced)) {
			/// exeption
		}
		else {
			Alumno al = diccioAl.find(ced);
			long cedula = al.getCedula();
			String nombre = al.getNombre();
			String apellido = al.getApellido();
			int cantAprob = al.getCantAsigAprob();
			voAlumnoDatCom vo = new voAlumnoDatCom(cedula,nombre,apellido,cantAprob);
			return vo;
		}
	}
	
	public void registrarInscripcion(String cod, long ced, float mon, int anio, tipoError &error) throws AlumnoNoInscriptoException, AsignaturaYaExisteException{ 
		
		if(!diccioAl.member(ced)) {
				/// exeption
		}	
		else {
			Alumno al = diccioAl.find(ced);
			if(!diccioAs.member(cod)) {
				// exeption
			}
			else{
				Inscripciones in = al.getInscripciones();            /// faltaaa
				if(in.)                                             /// faltaaa
				registrarInscripcion(); // q hacer
			}
		}
	}
	
	public void registrarCalificacion(long ced, int cal, int num, tipoError &error) throws AlumnoNoInscriptoException, NumInscripcionNoExiste{ 
		if(!diccioAl.member(ced)){
				/// exeption
		}
		else {
			Alumno al = diccioAl.find(ced);
			Inscripciones Insc = al.getInscripciones();
			if(!Insc.esta(num)) {
				/// exception
			}
			else {
				
			}
		}	                              /// falta
			
	}
		
	
	
	public float montoRecaudado (long ced, int anio, tipoError &error) throws AlumnoNoInscriptoException{ 
		if(!diccioAl.member(ced)){
				/// exeption
		}
		else{
			Alumno al = diccioAl.find(ced);
			return al.calcularRecaudado(anio);
		}	
	}
	
	public  ArrayList<voInscripcion> listarEscolaridad(long ced, boolean modo) throws AlumnoNoInscriptoException,SecInscripcionesVaciaException{ 
		if(!diccioAl.member(ced)) {
				/// exeption
		}
		else{
			Alumno al = diccioAl.find(ced);
			Inscripciones in = al.getInscripciones();
			if(in.estaVacia()) {
				//exeption
			}
			else {
				return in.listarEscolaridad(modo);
			}	
		}
	}
	
	public  ArrayList<voAlumnoDat> listarEgresados(boolean modo) throws DicAlumnosVacioException{
		if(diccioAl.esVacio()) {
			/// exeption
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