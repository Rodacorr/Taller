package CapaLogica.Exceptions;

public class DicAsignaturasVacioException extends Exception{
	private String mensaje;
	
	public DicAsignaturasVacioException (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}
}
