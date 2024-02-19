package CapaLogica.VO;

public class voInscripcionCal {

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