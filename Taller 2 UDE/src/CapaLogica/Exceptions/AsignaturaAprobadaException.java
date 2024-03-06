package CapaLogica.Exceptions;


public class AsignaturaAprobadaException extends Exception{
	private String mensaje;

	public AsignaturaAprobadaException (String mensaje){ 
		this.mensaje = mensaje; 
	}

	public String darMensaje(){ 
		return mensaje; 
	}
}
