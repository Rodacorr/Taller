package CapaLogica.Asignaturas;
import java.util.*;

import CapaLogica.Alumnos.Alumno;
import CapaLogica.VO.voAlumnoDat;
import CapaLogica.VO.voAsignatura;

public class Asignaturas {

	private ArrayList<Asignatura> arre;
	
	public Asignaturas() {
		arre = new ArrayList<Asignatura>();
	}

    public boolean member(String cod) {
    	/*
    	boolean esta;
    	for (Asignatura asi : arre) {
            if (asi.getCodigo().equals(cod)) {
                esta=true;
            }
        }
        return esta;
        */
    }
    
    public Asignatura find(String cod) {
    	/*
    	 for (Asignatura asi : arre) {
            if (asi.getCodigo().equals(cod)) {
                return asignatura;
            }
        }
        */
    }
    
    public void insBack(Asignatura asi) {
    	//arre.add(asi);
    }
    
    public boolean esVacio() {
    	//return arre.isEmpty();
    }
    
    public voAsignatura [] listaAsignaturas() {
    	
    }
}
