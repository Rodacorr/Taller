package CapaLogica.Exceptions;

public class NumInscripcionNoExiste extends Exception{
	private String mensaje;
	
	public NumInscripcionNoExiste (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}
}
