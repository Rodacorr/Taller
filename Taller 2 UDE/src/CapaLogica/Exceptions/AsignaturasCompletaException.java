package CapaLogica.Exceptions;

public class AsignaturasCompletaException extends Exception {
	private String mensaje;
	
	public AsignaturasCompletaException (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}
}