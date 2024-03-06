package CapaLogica.Alumnos;
import java.util.TreeMap;
import java.util.*;
import CapaLogica.Inscripciones.*;
import CapaLogica.VO.*;


import java.io.*;

import java.lang.Object;


public class Alumnos implements Serializable{

	private TreeMap<Long,Alumno> ABBAlumnos;

	public Alumnos() {
		ABBAlumnos = new TreeMap<Long, Alumno>();
	}

	public boolean member(long ced) {
		return ABBAlumnos.containsKey(ced);
	}

	public Alumno find(long ced) {
		return ABBAlumnos.get(ced);
	}

	public void insert(Alumno alumno) {
		ABBAlumnos.put(alumno.getCedula(),alumno);
	}

	public boolean esVacio() {
		return ABBAlumnos.isEmpty();
	}

	public ArrayList<voAlumnoDatTipo> listaAlumnoApe(String ape) {
		ArrayList<voAlumnoDatTipo> arre = new ArrayList<voAlumnoDatTipo>();
		Iterator <Alumno> iter = ABBAlumnos.values().iterator();
		while (iter.hasNext()){
			Alumno alum = iter.next();
			if(alum.getApellido().toLowerCase().startsWith(ape.toLowerCase())) {
				voAlumnoDatTipo vo = new voAlumnoDatTipo(alum.getCedula(),alum.getNombre(),alum.getApellido(),alum.getTipo());
				arre.add(vo);
			}
		}
		return arre;
	}

	public ArrayList<voAlumnoDat> listarEgresados(boolean modo) {
		ArrayList<voAlumnoDat> arre = new ArrayList<voAlumnoDat>();
		Iterator <Alumno> iter = ABBAlumnos.values().iterator();
		float notaCursadas; 
		float notaAprobadas;
		while (iter.hasNext()){
			Alumno alum = iter.next();
			if(alum.esEgresado()) {
				if (modo == true) {   //COMPLETO == TRUE
						notaCursadas = alum.calcularPromedioCursadas();
				notaAprobadas = alum.calcularPromedioAprobadas();
				voPromedio vo = new voPromedio(alum.getCedula(),alum.getNombre(),alum.getApellido(),notaAprobadas,notaCursadas);		
				arre.add(vo);
				}
				else {
					voAlumnoDat vo = new voAlumnoDat(alum.getCedula(),alum.getNombre(),alum.getApellido());
					arre.add(vo);
				}
			}
		}
		return arre;	
	}
}
