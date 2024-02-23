package CapaLogica.VO;

public class voBecadoDatCom extends voAlumnoCompleto {

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