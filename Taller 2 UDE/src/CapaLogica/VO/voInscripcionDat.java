package CapaLogica.VO;

import java.io.Serializable;

public class voInscripcionDat extends voInscripcionCal implements Serializable{

	private int anioLectivo;
	private float monto;
	
	public voInscripcionDat (int num,int cal, int anio, float mon) {
		super (num,cal);
		this.anioLectivo = anio;
		this.monto = mon;
	}
	
	
	public int getAnioLectivo(){ 
		return anioLectivo; 
	}
	
	
	public float getMonto(){ 
		return monto; 
	}
	
}