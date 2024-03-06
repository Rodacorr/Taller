package CapaLogica.VO;

import java.io.Serializable;

public class voInscripcion extends voInscripcionCal implements Serializable{

	private int anioLectivo;
	private String asig;

	public voInscripcion(int num,int cal, int anio, String as){
		super (num,cal);
		this.anioLectivo = anio;
		this.asig = as;
	}


	public int getAnioLectivo(){ 
		return anioLectivo; 
	}


	public String getAsignatura (){ 
		return asig; 
	}

}