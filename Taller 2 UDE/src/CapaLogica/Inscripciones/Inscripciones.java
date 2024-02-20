package CapaLogica.Inscripciones;
import java.util.*;
import CapaLogica.VO.voInscripcion;

public class Inscripciones  {
	
	private LinkedList<Inscripcion> lista;
	
	
	public Inscripciones() {
		lista = new LinkedList<Inscripcion>();
	}
	
	public void insBack(Inscripcion ins){ 
		lista.addLast(ins);
    }
		
	
	public int largo(){ 
		return lista.size();
	}
	
	public Inscripcion k_esimo(int x){ 
		//se valida que la pos es correcta aca?
		return lista.get(x);
	}
	
	public boolean estaVacia(){ 
		return lista.isEmpty();
	}
	
	public float calcularPromedioAprobaciones(){ 
		int sumador = 0;
		int contador = 0;
		
		if(estaVacia)
			   //manejar el error
		else {
			Iterator<Inscripcion> i = lista.i();
			while (i.hasNext()){
				Inscripcion insc = i.next(); //la variable se crea dentro del while o por fuera,ya que si se crea adentro, se vana crear varias
				if (insc.getCalificacion() >= 5) {
					sumador = sumador + insc.getCalificacion();
					contador++;
				}
			}
		}
		return (sumador / contador);	
	}
	
	public float calcularPromedioCursadas(){ 
		float sumador = 0;
		float contador = 0;
		if(estaVacia)
			   //manejar el error
		else {
			Iterator<Inscripcion> i = lista.i();
			while (i.hasNext()){ 
				Inscripcion insc = i.next(); //la variable se crea dentro del while o por fuera,ya que si se crea adentro, se vana crear varias
				sumador = sumador + insc.getCalificacion();
				contador++;
			}
		}
		return (sumador / contador);
	}
	
	public float calcularRecaudado(int x){ 
		float sumador = 0
		if(!estaVacia)
			Iterator<Inscripcion> i = lista.i();
			while (i.hasNext()){ 
				Inscripcion insc = i.next(); //la variable se crea dentro del while o por fuera,ya que si se crea adentro, se vana crear varias
				sumador = sumador + insc.getMonto();
			}
	
		return sumador;
	}
	
	public void registrarInscripcion(asignatura as, voInscripcionDat){ 
		
	}
	
	public void registrarCalificacion(long ced, voInscripcionCal){ 
		
	}
	
	public voInscripcion[] listarEscolaridad(boolean modo){ 
		
	}
}