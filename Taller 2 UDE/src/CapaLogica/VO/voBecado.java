package CapaLogica.VO;

public class voBecado extends voAlumno{

	private int porcentajeBeca;
	private String razon;
	
	public voBecado (long ced, String nom, String ape,String dom, long tel, int pb, String raz){
		super (ced,nom,ape,dom,tel); 
		this.porcentajeBeca = pb;
		this.razon = raz;
	}
	
	public int getPorcentajeBeca(){
		return porcentajeBeca;
	}
	
	public String getRazon(){
		return razon;
	}
	
}