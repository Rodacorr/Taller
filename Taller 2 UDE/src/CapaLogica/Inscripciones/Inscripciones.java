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
		//hay que agregarle una linea que verifique que la lista no es null
		/*
		 if(lista.isEmpty())
		 	throw new RuntimeException("lista vacia");
		  */
		for (Inscripcion inscripcion : lista) {
		    if (inscripcion.getCalificacion() >= 5) {
		      sumador += inscripcion.getCalificacion();
		      contador++;
		    }
		  }
		//hicimos esto, porque hay que recorrer todas las incripciones
		/*while (!estaVacia){ 
			if(inscripcion.getCalificacion() >= 5){ 
				sumador = sumador + inscripcion.getCalificacion();
				contador++;
			}
		//avanzar en la lista
		}
		*/
		return (float)sumador / contador;
	}
	
	public float calcularPromedioCursadas(){ 
		float sumador = 0;
		float contador = 0;
		/*
		 * Iterator<Inscripcion> i = lista.i();
		 * while (iterador.hasNext()){ 
		 	Inscripcion insc = i.next();
			sumador = sumador + insc.getCalificacion();
			contador++;
			}
		 */
		while (!estaVacia){ 
			sumador = sumador + inscripcion.getCalificacion();
			contador++;
			}
		return (sumador / contador);
	}
	
	public float calcularRecaudado(int x){ 
		float sumador = 0
			while (!estaVacia)
				sumador = sumador + calcularRecaudado(x);
		
		/* creo que asi se recorreria la lista
  			for (Inscripcion insc : lista) {
    			if (insc.getCalificacion() >= 5) {
      				sumador += insc.getMonto();
    			}
  			}
		 */
		return sumador;
	}
	
	public void registrarInscripcion(asignatura as, voInscripcionDat){ 
		
	}
	
	public void registrarCalificacion(long ced, voInscripcionCal){ 
		
	}
	
	public voInscripcion[] listarEscolaridad(boolean modo){ 
		
	}
}