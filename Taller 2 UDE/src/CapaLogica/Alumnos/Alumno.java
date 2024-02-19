package CapaLogica.Alumnos;
import CapaLogica.Inscripciones.*;
//TEST LUCAS . Test 2.0/// hola
public class Alumno {

	private long cedula;
	private String nombre;
	private String apellido;
	private String domicilio;
	private long telefono;
	private int CantAsigAprob;
	private Inscripciones insc;
	
	public Alumno (long ced, String nom, String ape, String dom, long tel, int caa) {
		 this.cedula = ced;
		 this.nombre = nom;
		 this.apellido = ape;
		 this.domicilio = dom;
		 this.telefono = tel;
		 this.CantAsigAprob = caa;
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
	
	/*public String getTipo(){ 
		 
	}
	*/
	public void setCantAsigAprob (int CantAsigAprob) {
	    this.CantAsigAprob = 0;
	}
	
	/*public boolean esEgresado() {
		
	}
	
	public float calcularPromedioAprobaciones() {
		
	}
	
	public float calcularPromedioCursadas() {
		
	}
	
	public voAlumnoDatCom listarAlumnoCed() {
		
	}
	
	public voInscripcion listarEscolaridad() {
		
	}
	
	public float calcularRecaudado() {
		
	}
	*/
}