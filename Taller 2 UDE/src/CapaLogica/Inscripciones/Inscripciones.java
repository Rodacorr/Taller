package CapaLogica.Inscripciones;
import java.util.*;

import CapaLogica.Alumnos.Alumno;
import CapaLogica.VO.voAlumnoDat;
import CapaLogica.VO.voInscripcion;
import CapaLogica.VO.voPromedio;

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
	
	public float calcularPromedioAprobadas(){
		float notaAprobadas = 0;
		Inscripcion insc;
			if(!estaVacia()) {
				Iterator<Inscripcion> i = lista.i();
				while (i.hasNext()){   
					insc = i.next(); 
					if(insc.getCalificacion() > 5) 
						notaAprobadas = notaAprobadas + insc.getCalificacion();
					}
				notaAprobadas = notaAprobadas / 10;
			}
		return notaAprobadas;
	}
	
	public float calcularPromedioCursadas(){
		float cantCursadas = 0;
		float notaCursadas = 0;
		Inscripcion insc;
				if(!estaVacia())
					Iterator<Inscripcion> i = lista.i();
					while (i.hasNext()){   
						insc = i.next(); 
						cantCursadas = cantCursadas + 1;
						notaCursadas = notaCursadas + insc.getCalificacion();
						}
		notaCursadas = notaCursadas / cantCursadas;
		return notaCursadas;
	}
	
	
	public float calcularRecaudado(int x){ 
		float sumador = 0;
		Inscripcion insc;
		if(!estaVacia)
			Iterator<Inscripcion> i = lista.i();
			while (i.hasNext() && x <= insc.getAnioLectivo()){   // lo del anio lectivo es para no recorrer de mas, ya que las insc estan ordenadas, cuando x es mayor ya no hay ninguna mas para contar
				insc = i.next(); 
				if(x == insc.getAnioLectivo())
					sumador = sumador + insc.getMonto();
			}
	
		return sumador;
	}
	
	public void registrarInscripcion(asignatura as, voInscripcionDat){ 
		
	}
	
	public void registrarCalificacion(long ced, voInscripcionCal){ 
		
	}
	
	public voInscripcion[] listarEscolaridad(boolean modo){
		ArrayList<voInscripcion> arre = new ArrayList<voInscripcion>();
		Iterator<Inscripcion> i = lista.i();
		Inscripcion insc;
			while (i.hasNext()){
    		insc = i.next();
    		if (modo == true)  // true==completo
    			voInscripcion vo = 
    			arre.add(vo);
    		
    	return arre;	
    }
			
		
	}
	
	
	
	
}