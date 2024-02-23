package persistencia.exceptions;
import java.io.Serializable;


public class PersistenciaException extends Exception implements Serializable{
	
	private String mensaje;
	
	public PersistenciaException (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}

}