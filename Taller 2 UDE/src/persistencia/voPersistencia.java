package persistencia;

import CapaLogica.Alumnos.Alumnos;
import CapaLogica.Asignaturas.Asignaturas;

public class voPersistencia {
	
	private Alumnos diccioAl;
	private Asignaturas diccioAs;
 
	public voPersistencia (){
		
	}
	
	public Alumnos getDiccioAl(){ 
		return diccioAl; 
	}
	
	
	public Asignaturas getDiccioAs (){ 
		return diccioAs; 
	}
}
