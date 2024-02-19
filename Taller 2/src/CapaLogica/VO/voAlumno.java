package CapaLogica.VO;

public class voAlumno extends voAlumnoDatCom{

	private String domicilio;
	private long telefono;
	
	public voAlumno(long ced, String nom, String ape, int caa, String dom, long tel) {
		super(ced,nom,ape,caa);
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