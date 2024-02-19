package Inscripcion;

public class voInscripcion extends voInscripcionCal{

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