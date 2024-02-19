package CapaLogica.VO;

public class voBecadoDatCom extends voAlumnoDatCom {

	private int porcentajeBeca;
	private String razon;
	
	public voBecadoDatCom (long ced, String nom, String ape, int caa, int pb, String raz) {
		super (ced,nom,ape,caa);
		this.porcentajeBeca = pb;
		this.razon = raz;
	}
	
	public int getPorcentajeBeca(){
		return porcentajeBeca;
	}
	
	public String getRazon(){
		return razon;
	}
	
	/*public String getTipo(){ 
		 
	}
	*/
}