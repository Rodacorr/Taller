package CapaLogica.VO;

import java.io.Serializable;

public class voBecadoDatCom extends voAlumnoCompleto implements Serializable{

	private int porcentajeBeca;
	private String razon;

	public voBecadoDatCom (long ced, String nom, String ape, int caa, String dom, long tel, String ti, int pb, String raz) {
		super (ced,nom,ape,caa,dom,tel,ti);
		this.porcentajeBeca = pb;
		this.razon = raz;
	}

	public int getPorcentajeBeca(){
		return porcentajeBeca;
	}

	public String getRazon(){
		return razon;
	}

	public String getTipo(){ 
		return "Alumno";
	}

}