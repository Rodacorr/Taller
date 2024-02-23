package persistencia.exceptions;

import java.io.Serializable;

import generalUtils.FilePropertyReadUtil;
import logica.exceptions.abstractExeption;

public class PersistenciaException extends abstractExeption implements Serializable{
	
	private String mensaje;
	
	public MontoInvalidoException (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}

}