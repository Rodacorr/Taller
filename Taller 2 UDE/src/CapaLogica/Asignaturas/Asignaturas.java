package CapaLogica.Asignaturas;
import java.util.*;


import CapaLogica.Alumnos.Alumno;
import CapaLogica.VO.voAlumnoDat;
import CapaLogica.VO.voAsignatura;
import java.io.*;

public class Asignaturas implements Serializable{

	private ArrayList<Asignatura> arre;
	
	public Asignaturas() {
		arre = new ArrayList<Asignatura>();
	}

    public boolean member(String cod) {
    	for (Asignatura asignatura : arre) {
            if (asignatura.getCodigo().equals(cod)) {
                return true;
            }
        }
        return false;
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
    
    public int largo(){
    	return arre.size();
    }
         
    public void insBack(Asignatura as) {
    	arre.add(as);
    }
    
    public boolean esVacio() {
    	return arre.isEmpty();
    }
    
    public ArrayList<voAsignatura> listaAsignaturas() {
    	voAsignatura vo;
    	ArrayList<voAsignatura> listado = new ArrayList<voAsignatura>();
    	for (Asignatura asi : arre) {
    		vo = new voAsignatura(asi.getCodigo(),asi.getNombre(),asi.getDescripcion());
    		listado.add(vo);
    	}
    	return listado;	
    }
}
