package CapaLogica.Exceptions;

public class AlumnoYaCursaAsignatura extends Exception{
	private String mensaje;
	
	public AlumnoYaCursaAsignatura (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}
}