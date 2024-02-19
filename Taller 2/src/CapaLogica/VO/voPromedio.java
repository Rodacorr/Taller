package CapaLogica.VO;

public class voPromedio extends voAlumnoDat  {

	private float promedioAprobacion;
	private float promedioTotal;
		
	
	public voPromedio(long ced, String nom, String ape, float aprobacion, float total) {
		 super(ced,nom,ape);
		 this.promedioAprobacion = aprobacion;
		 this.promedioTotal = total;
		 
	}
	
	public float getPromedioAprobacion(){ 
		return promedioAprobacion; 
	}
	
	public float getPromedioTotal(){ 
		return promedioTotal; 
	}
	
}