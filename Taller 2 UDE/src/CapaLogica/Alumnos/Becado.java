package CapaLogica.Alumnos;

public class Becado extends Alumno{
	private int porcentajeBeca;
	private String razon;
	
	public Becado (long ced, String nom, String ape, String dom, long tel, int caa, int pb, String raz) {
		super (ced,nom,ape,dom,tel,caa);
		this.porcentajeBeca = pb;
		this.razon = raz;
	}
	
	public int getPorcentajeBeca(){
		return porcentajeBeca;
	}
	
	public String getRazon(){
		return razon;
	}
	
	public String getTipo() {
		return "Becado";
	}
	
}