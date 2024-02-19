package CapaLogica.Alumnos;
import java.util.TreeMap;
import java.util.*;

import CapaLogica.VO.voAlumnoDat;
import CapaLogica.VO.voPromedio;

import java.lang.Object;

public class Alumnos {

    private TreeMap<Long, Alumno> ABBAlumnos;
    
    public Alumnos() {
        ABBAlumnos = new TreeMap<Long, Alumno>();
    }
    
    public boolean member(long ced) {
    	
    }
    
    public long find(long ced) {
    	
    }
    
    public void insert(Alumno alumno) {
    	ABBAlumnos.put(alumno.getCedula(),alumno);
    }
    
    public boolean esVacio() {
    	
    }
    
    public ArrayList<voAlumnoDat> listaAlumnoApe(String ape) {
    	
    }
    
    public ArrayList<voPromedio> listarEgresados(boolean modo) {
    	
    }
}
