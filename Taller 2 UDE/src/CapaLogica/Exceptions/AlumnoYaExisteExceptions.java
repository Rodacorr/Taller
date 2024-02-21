package CapaLogica.Exceptions;



public class AlumnoYaExisteExceptions extends Exception{

	private String mensaje;
	
	public AlumnoYaExisteExceptions (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}
	
}
