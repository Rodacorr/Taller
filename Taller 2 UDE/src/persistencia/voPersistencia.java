package persistencia;

import CapaLogica.Alumnos.Alumnos;
import CapaLogica.Asignaturas.Asignaturas;
import java.io.*;

public class voPersistencia implements Serializable{
	
	private Alumnos diccioAl;
	private Asignaturas diccioAs;
 
	public voPersistencia (Alumnos al, Asignaturas as){
		diccioAl = al;
		diccioAs = as;
	}
	
	public Alumnos getDiccioAl(){ 
		return diccioAl; 
	}
	
	
	public Asignaturas getDiccioAs (){ 
		return diccioAs; 
	}
}
