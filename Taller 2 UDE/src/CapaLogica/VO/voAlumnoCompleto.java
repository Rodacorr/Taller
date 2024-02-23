package CapaLogica.VO;

public class voAlumnoCompleto extends voAlumnoDatCom {
	private String tipo;
	private String domicilio;
	private long telefono;
	
	public voAlumnoCompleto(long ced, String nom, String ape, int caa, String dom, long tel, String ti) {
		super(ced, nom, ape, caa);
		this.tipo = ti;
		this.domicilio = dom;
		this.telefono = tel;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDomicilio() {
		return domicilio;
	}
	
	public long getTelefono() {
		return telefono;
	}
}
