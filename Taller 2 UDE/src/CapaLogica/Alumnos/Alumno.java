package CapaLogica.Alumnos;
import CapaLogica.Inscripciones.*;

public class Alumno {

	private long cedula;
	private String nombre;
	private String apellido;
	private String domicilio;
	private long telefono;
	private int CantAsigAprob;
	private Inscripciones insc;
	
	public Alumno (long ced, String nom, String ape, String dom, long tel) {    ///, int caa   ???
		 this.cedula = ced;
		 this.nombre = nom;
		 this.apellido = ape;
		 this.domicilio = dom;
		 this.telefono = tel;
		 setCantAsigAprob();
		 ///this.CantAsigAprob = caa;
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
	
	
	public boolean esEgresado() {
		boolean es = FALSE;
		if(getCantAsigAprob == 10)
			es = TRUE;
		return es;
	}
	
	public float calcularPromedioAprobaciones() {
		Inscripciones in = getInscripciones();
		return in.calcularPromedioAprobaciones();
	}
	
	public float calcularPromedioCursadas() {
		Inscripciones in = getInscripciones();
		return in.calcularPromedioCursadas();
	}
	
	public voAlumnoDatCom listarAlumnoCed() {
		long cedula = getCedula();
		string nombre = getNombre();
		string apellido = getApellido();
		int CantAprob = getCantAsigAprob();
		return voAlumnoDatCom(cedula,nombre,apellido,CantAprob); // ???? asi o solo los datos de el y no de la super clase, abajo ejemplo
	}

	
	public voInscripcion listarEscolaridad() {
		int anio = getAnioLectivo(); 
		string asig = ;                                    //???
		
	}
	
	public float calcularRecaudado(int x) {
		Inscripciones in = getInscripciones();
		return in.calcularRecaudado(x);
	}
	
}