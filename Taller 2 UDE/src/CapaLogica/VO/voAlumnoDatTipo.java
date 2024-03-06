package CapaLogica.VO;

import java.io.Serializable;

public class voAlumnoDatTipo extends voAlumnoDat implements Serializable {
	private String tipo;

	public voAlumnoDatTipo(long ced, String nom, String ape, String tipo) {
		super(ced, nom, ape);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
