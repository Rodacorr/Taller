package CapaLogica.Exceptions;

public class SecInscripcionesVaciaException extends Exception{
	private String mensaje;

	public SecInscripcionesVaciaException (String mensaje){ 
		this.mensaje = mensaje; 
	}

	public String darMensaje(){ 
		return mensaje; 
	}
}
