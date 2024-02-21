package CapaLogica.Exceptions;

public class DicAlumnosVacioException extends Exception{
	private String mensaje;
	
	public DicAlumnosVacioException (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}
}
