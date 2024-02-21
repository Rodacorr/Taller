package CapaLogica.Exceptions;

public class AñoMenorAlUltimoReg extends Exception{

	private String mensaje;
	
	public AñoMenorAlUltimoReg (String mensaje){ 
		this.mensaje = mensaje; 
	}
	
	public String darMensaje(){ 
		return mensaje; 
	}
	
}
