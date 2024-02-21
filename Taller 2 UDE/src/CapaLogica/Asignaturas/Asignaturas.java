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
    	return arre.contains(cod);  //containsKey???
    }
    
    public Asignatura find(String cod) {
    	Asignatura as = null;
    	for (Asignatura asi : arre) {
            if (asi.getCodigo().equals(cod)) {         
                as = asi;
            break;
            }
    	}
         return as;
    }
        
    
    
    public void insBack(Asignatura as) {
    	arre.add(as);
    }
    
    public boolean esVacio() {
    	return arre.isEmpty();
    }
    
    public voAsignatura [] listaAsignaturas() {
    	
    }
}
