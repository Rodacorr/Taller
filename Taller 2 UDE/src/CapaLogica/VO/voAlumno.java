package CapaLogica.VO;

import java.io.Serializable;

public class voAlumno extends voAlumnoDat implements Serializable{

	private String domicilio;
	private long telefono;

	public voAlumno(long ced, String nom, String ape, String dom, long tel) {
		super(ced,nom,ape);
		this.domicilio = dom;
		this.telefono = tel;
	}

	public String getDomicilio(){ 
		return domicilio; 
	}

	public long getTelefono(){ 
		return telefono; 
	}

}