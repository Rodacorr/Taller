package CapaLogica.VO;

public class voAlumnoDatTipo extends voAlumnoDat {
	private String tipo;
	
	public voAlumnoDatTipo(long ced, String nom, String ape, String tipo) {
		super(ced, nom, ape);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
