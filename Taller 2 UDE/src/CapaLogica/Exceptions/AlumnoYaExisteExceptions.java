package CapaLogica.Exceptions;
import java.lang.Exception;


public class AlumnoYaExisteExceptions extends Exception{

	private String mensaje;
	
	public AlumnoYaExiste (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}
	
}
