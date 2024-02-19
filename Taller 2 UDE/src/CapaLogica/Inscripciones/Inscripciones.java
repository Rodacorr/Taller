package CapaLogica.Inscripciones;
import java.util.*;

import CapaLogica.VO.voInscripcion;

public class Inscripciones  {
	
	private LinkedList<Inscripcion> lista;
	
	
	public Inscripciones() {
		lista = new LinkedList<Inscripcion>();
	}
	
	public void insBack(Inscripcion ins){ 
		
	}
	
	public int largo(){ 
		
	}
	
	public Inscripcion k_esimo(int x){ 
		
	}
	
	public boolean estaVacia(){ 
		
	}
	
	public float calcularPromedioAprobaciones(){ 
		int sumador = 0;
		int contador = 0;
		while (!estaVacia){ 
			if(getCalificacion() >= 5){ 
				sumador = sumador + getCalificacion();
				contador++;
			}
		}
		return (sumador / contador);
				
	}
	
	public float calcularPromedioCursadas(){ 
		float sumador = 0;
		float contador = 0;
		while (!estaVacia){ 
			sumador = sumador + getCalificacion();
			contador++;
			}
		return (sumador / contador);
	}
	
	public float calcularRecaudado(int x){ 
		float sumador = 0
			while (!estaVacia)
				sumador = sumador + calcularRecaudado(x);
				
		return sumador;
	}
	
	public void registrarInscripcion(asignatura as, voInscripcionDat){ 
		
	}
	
	public void registrarCalificacion(long ced, voInscripcionCal){ 
		
	}
	
	public voInscripcion[] listarEscolaridad(boolean modo){ 
		
	}
}