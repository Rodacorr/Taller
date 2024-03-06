package CapaLogica.VO;

import java.io.Serializable;

public class voInscripcionCompleto extends voInscripcion implements Serializable{
	private float monto;

	public voInscripcionCompleto(int num, int cal, int anio, String as,float monto) {
		super(num, cal, anio, as);
		this.monto = monto;
		// TODO Auto-generated constructor stub
	}

	public float getMonto() {
		return monto;
	}



}
