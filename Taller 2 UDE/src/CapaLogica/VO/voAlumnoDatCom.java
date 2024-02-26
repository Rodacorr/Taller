package CapaLogica.VO;

import java.io.Serializable;

public class voAlumnoDatCom extends voAlumnoDat implements Serializable{

	private int CantAsigAprob;
	
	
	public voAlumnoDatCom (long ced, String nom, String ape, int caa) {
		 super(ced, nom, ape);
		 this.CantAsigAprob = caa;
	}
	

	public int getCantAsigAprob(){ 
		return CantAsigAprob; 
	}
	
	public String getTipo(){ 
		 return "Alumno";
	}
	
}