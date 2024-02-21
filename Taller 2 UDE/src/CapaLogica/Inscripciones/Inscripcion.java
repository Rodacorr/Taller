package CapaLogica.Inscripciones;
import CapaLogica.Asignaturas.*;

public class Inscripcion {

	private int numero;
	private int anioLectivo;
	private float monto;
	private int calificacion;
	private Asignatura asig;
	
	public Inscripcion (int num, int anio, float mon,  Asignatura as) {    // El número de la nueva inscripción será uno más que el de la última inscripción registrada para dicho alumno (si es su primera inscripción, será la 1)
		this.numero = num;
		this.anioLectivo = anio;
		this.monto = mon;
		this.calificacion = 0;
		this.asig = as;
	}
	
	public int getNumero(){ 
		return numero; 
	}
	
	public int getAnioLectivo(){ 
		return anioLectivo; 
	}
	
	
	public float getMonto(){ 
		return monto; 
	}
	
	public int getCalificacion(){ 
		return calificacion; 
	}
	
	/*
	public Asignatura getAsignatura(){ 
		return asig; 
	}
	*/
	public String getAsignatura(){ 
		return asig.getNombre(); 
	}
	
	public void setCalificacion(){ 
		this.calificacion = 0;
	}
	
	public float calcularRecaudado(int x){ 
		
	    //// ????
	}
	
}