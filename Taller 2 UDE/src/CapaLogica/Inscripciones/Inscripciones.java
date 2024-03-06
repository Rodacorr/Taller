package CapaLogica.Inscripciones;
import java.util.*;
import CapaLogica.VO.*;

import CapaLogica.Alumnos.Alumno;
import java.io.*;

public class Inscripciones  implements Serializable{

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

	public boolean esta(int num){
		return lista.contains(num);
	}

	public Inscripcion k_esimo(int x){           
		return lista.get(x-1);
	}

	public boolean estaVacia(){ 
		return lista.isEmpty();
	}

	public Inscripcion darUltimaInscripcion() {
		return lista.getLast();
	}

	public void registrarCalificacion(int nroInsc,int cal) {
		lista.get(nroInsc-1).setCalificacion(cal);
	}

	public float calcularPromedioAprobadas(){
		float notaAprobadas = 0;
		Inscripcion insc;
		if(!estaVacia()) {
			Iterator<Inscripcion> iter = lista.iterator();
			while (iter.hasNext()){   
				insc = iter.next(); 
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
		if(!estaVacia()){
			Iterator<Inscripcion> iter = lista.iterator();
			while (iter.hasNext()){   
				insc = iter.next(); 
				cantCursadas = cantCursadas + 1;
				notaCursadas = notaCursadas + insc.getCalificacion();
			}
		}
		notaCursadas = notaCursadas / cantCursadas;
		return notaCursadas;
	}


	public float calcularRecaudado(int x){ 
		float sumador = 0;
		Inscripcion insc = null;
		boolean termine = false;
		if(!estaVacia()) {
			Iterator<Inscripcion> iter = lista.iterator();
			while (iter.hasNext() && !termine){   // lo del anio lectivo es para no recorrer de mas, ya que las insc estan ordenadas, cuando x es mayor ya no hay ninguna mas para contar
				insc = iter.next(); 
				if(x == insc.getAnioLectivo())
					sumador = sumador + insc.getMonto();
				else
					if(x < insc.getAnioLectivo())
						termine = true;
			}
		}
		return sumador;
	}


	public ArrayList<voInscripcion> listarEscolaridad(boolean modo){
		ArrayList<voInscripcion> arre = new ArrayList<voInscripcion>();
		Iterator<Inscripcion> iter = lista.iterator();
		Inscripcion insc;
		while (iter.hasNext()){
			insc = iter.next();
			if (modo == true) {  // true==completo se listarán todas las inscripciones del alumno, incluso aquellas que aún no tienen calificación final. también el monto base de cada inscripción.
				voInscripcion vo = new voInscripcionCompleto(insc.getNumero(),insc.getCalificacion(),insc.getAnioLectivo(),insc.getAsignatura().getNombre(),insc.getMonto()); 
				arre.add(vo);
			}
			else { //modo parcial se listarán solamente aquellas que ya tienen calificación final. Por cada inscripción se listará número de inscripción, nombre de asignatura, año lectivo y calificación (entre 0 y 12).
				if(insc.getCalificacion() != 0) {
					voInscripcion vo = new voInscripcion(insc.getNumero(),insc.getCalificacion(),insc.getAnioLectivo(),insc.getAsignatura().getNombre());
					arre.add(vo);
				}
			}
		}
		return arre;	
	}




	public boolean estaInscriptoCursando(String cod, int anio) {
		boolean termine = false;
		Inscripcion insc;
		Iterator<Inscripcion> iter = lista.iterator();
		while (iter.hasNext() && !termine){   
			insc = iter.next(); 
			if(cod.equals(insc.getAsignatura().getCodigo())){
				if (insc.getCalificacion() == 0)
					termine = true;
				else
					if(insc.getCalificacion() > 5)
						termine = true;
					else
						if(insc.getAnioLectivo() >= anio)
							termine = true;
			}
		}
		return termine;
	}

	public boolean tieneCalificacion(int nroInsc) {
		boolean tiene = false;
		if(lista.get(nroInsc-1).getCalificacion() != 0 )
			tiene = true;
		return tiene;
	}


}