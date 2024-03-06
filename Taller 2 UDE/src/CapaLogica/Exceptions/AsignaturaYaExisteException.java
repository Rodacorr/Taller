package CapaLogica.Exceptions;

public class AsignaturaYaExisteException extends Exception{
	private String mensaje;

	public AsignaturaYaExisteException (String mensaje){ 
		this.mensaje = mensaje; 
	}

	public String darMensaje(){ 
		return mensaje; 
	}
}
