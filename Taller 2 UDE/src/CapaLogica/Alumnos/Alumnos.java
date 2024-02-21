package CapaLogica.Alumnos;
import java.util.TreeMap;
import java.util.*;
import CapaLogica.Inscripciones.*;
import CapaLogica.VO.*;

import CapaLogica.VO.voAlumnoDat;
import CapaLogica.VO.voPromedio;

import java.lang.Object;

public class Alumnos {

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
    
    public ArrayList<voAlumnoDat> listaAlumnoApe(String ape) {
    	ArrayList<voAlumnoDat> arre = new ArrayList<voAlumnoDat>();
    	Iterator <Alumno> iter = ABBAlumnos.values().iterator();
    	while (iter.hasNext()){
    		Alumno alum = iter.next();
    		if(alum.getApellido().startsWith(ape)) {
    			voAlumnoDat vo = new voAlumnoDat(alum.getCedula(),alum.getNombre(),alum.getApellido());
    			arre.add(vo);
    		}
    	}
    	return arre;
    }
    
    public ArrayList<voAlumnoDat> listarEgresados(boolean modo) {
    	ArrayList<voAlumnoDat> arre = new ArrayList<voAlumnoDat>();
    	Iterator <Alumno> iter = ABBAlumnos.values().iterator();
    	while (iter.hasNext()){
    		Alumno alum = iter.next();
    		if(alum.getCantAsigAprob() == 10)) {
    			if (modo == TRUE) {   //COMPLETO == TRUE
    				arre = insc.
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
