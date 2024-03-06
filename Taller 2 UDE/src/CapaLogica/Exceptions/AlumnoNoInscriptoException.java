package CapaLogica.Exceptions;


public class AlumnoNoInscriptoException extends Exception{
	private String mensaje;

	public AlumnoNoInscriptoException (String mensaje){ 
		this.mensaje = mensaje; 
	}

	public String darMensaje(){ 
		return mensaje; 
	}
}
