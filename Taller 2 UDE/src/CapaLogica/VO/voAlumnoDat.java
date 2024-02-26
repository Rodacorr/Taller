package CapaLogica.VO;

import java.io.Serializable;

public class voAlumnoDat  implements Serializable {

	private long cedula;
	private String nombre;
	private String apellido;	
	
	public voAlumnoDat (long ced, String nom, String ape) {
		 this.cedula = ced;
		 this.nombre = nom;
		 this.apellido = ape;
		 
	}
	
	public long getCedula(){ 
		return cedula; 
	}
	
	public String getNombre(){ 
		return nombre; 
	}
	
	public String getApellido(){ 
		return apellido; 
	}
	
	
}