package CapaLogica.Alumnos;
import java.util.ArrayList;

import CapaLogica.Inscripciones.*;
import CapaLogica.VO.*;


public class Alumno {

	private long cedula;
	private String nombre;
	private String apellido;
	private String domicilio;
	private long telefono;
	private int CantAsigAprob;
	private Inscripciones insc;
	
	public Alumno (long ced, String nom, String ape, String dom, long tel) {    
		 this.cedula = ced;
		 this.nombre = nom;
		 this.apellido = ape;
		 this.domicilio = dom;
		 this.telefono = tel;
		 this.CantAsigAprob = 0;
		 this.insc = new Inscripciones();
	}
	
	public long getCedula(){ 
		return cedula; 
	}
	
	public String getNombre(){ 
		return nombre; 
	}
	
	public String getApellido(){ 
		return apellido; 
	}
	
	public String getDomicilio(){ 
		return domicilio; 
	}
	
	public long getTelefono(){ 
		return telefono; 
	}
	
	public int getCantAsigAprob(){ 
		return CantAsigAprob; 
	}
	
	public String getTipo(){ 
	 	return "Alumno";
	}
	
	public Inscripciones getInscripciones() {
		return insc;
	}
	
	public void setCantAsigAprob (int CantAsigAprob) {
	    this.CantAsigAprob = 0;
	}
	
	public void agregarInscripcion(Inscripcion in) {
		insc.insBack(in);
	}
	
	public boolean esEgresado() {
		boolean es = false;
		if(getCantAsigAprob() == 10)
			es = true;
		return es;
	}
	
	public boolean existeInscripcionPorNum(int nroInsc) {
		boolean existe = false;
		if(nroInsc > 0 && nroInsc <= insc.largo())
			existe = true;
		return existe;
	}
	
	public void registrarCalificacion(int nroInsc,int cal) {
		insc.registrarCalificacion(nroInsc,cal);
		if(cal > 5)
			this.CantAsigAprob = getCantAsigAprob() + 1;
	}
	
	public Inscripcion darUltimaInscripcion() {
		return insc.darUltimaInscripcion();
	}
	
	public float calcularPromedioAprobadas() {
		return insc.calcularPromedioAprobadas();
	}
	
	public float calcularPromedioCursadas() {
		return insc.calcularPromedioCursadas();
	}
	
	public voAlumnoDatCom listarAlumnoCed() {
		long cedula = getCedula();
		String nombre = getNombre();
		String apellido = getApellido();
		int CantAprob = getCantAsigAprob();
		voAlumnoDatCom vo;
		vo = new voAlumnoDatCom(cedula,nombre,apellido,CantAprob);
		return vo;
	}

	
	public ArrayList<voInscripcion> listarEscolaridad(boolean modo) {
		return insc.listarEscolaridad(modo);                                                   
	}
	
	
	public boolean tieneCalificacion(int nroInsc) {
		return insc.tieneCalificacion(nroInsc);
	}
	
	public boolean tieneInscripciones() {
		return insc.largo() > 0;
	}
	
	public float calcularRecaudado(int x) {
		return insc.calcularRecaudado(x);
	}
	
	public boolean estaInscriptoCursando(String cod, int anio) {
		return insc.estaInscriptoCursando(cod,anio);
	}
}