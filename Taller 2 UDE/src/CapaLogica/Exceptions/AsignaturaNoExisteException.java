package CapaLogica.Exceptions;

public class AsignaturaNoExisteException extends Exception{
	private String mensaje;

	public AsignaturaNoExisteException(String mensaje) {
		this.mensaje = mensaje; 
	}

	public String darMensaje(){ 
		return mensaje; 
	}
}
