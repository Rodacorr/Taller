package CapaLogica.VO;

import java.io.Serializable;

public class voInscripcionCal implements Serializable {

	private int numero;
	private int calificacion;


	public voInscripcionCal (int num, int cal) {
		this.numero = num;
		this.calificacion = cal;

	}

	public int getNumero(){ 
		return numero; 
	}


	public int getCalificacion(){ 
		return calificacion; 
	}

}