package CapaLogica.Exceptions;

public class NotaInvalida extends Exception{
	private String mensaje;

	public NotaInvalida (String mensaje){ 
		this.mensaje = mensaje; 
	}

	public String darMensaje(){ 
		return mensaje; 
	}
}