package CapaGrafica;
import CapaLogica.Alumnos.*;
import CapaLogica.Asignaturas.*;
import CapaLogica.Inscripciones.*;
import CapaLogica.VO.*;

import java.util.ArrayList;

import CapaLogica.Fachada;
import CapaLogica.Exceptions.*;

public class PrincipalConsola {

	public static void main(String[] args) {

		
        Fachada fachada = new Fachada();
        
        /*
		// REQUERIMIENTO 1 - FUNCIONA
        // SE PROBO CARGAR UNA ASIGNATURA CON EL MISMO CODIGO Y EL MENSAJE DE ERROR LO TIRA BIEN
        // VER COMENTARIO EN FACHADA SOBRE ESTE METODO
        voAsignatura asignatura1 = new voAsignatura("ABC123", "Programacion", "Codigo en C++");
        voAsignatura asignatura2 = new voAsignatura("DEF456", "Taller", "Codigo en JAVA");
        voAsignatura asignatura3 = new voAsignatura("GHI789", "Base de datos", "Codigo en SQL");
        voAsignatura asignatura4 = new voAsignatura("GHI789", "Sistemas Operativos", "SSH");


        try {
            fachada.registrarAsignatura(asignatura1);
            System.out.println("Primera asignatura registrada correctamente.");
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura2);
            System.out.println("Segunda asignatura registrada correctamente.");
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura3);
            System.out.println("Tercera asignatura registrada correctamente.");
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        // Asignatura con error
        try {
            fachada.registrarAsignatura(asignatura4);
            System.out.println("Cuarta asignatura registrada correctamente.");
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        System.out.println("-------------------------------------------------------------");




        // REQUERIMIENTO 2 - FUNCIONA BIEN
        // SE PROBO TIRAR ESTO SIN ASIGNATURAS Y EL MENSAJE DE ERROR LO TIRA BIEN
        try {
            System.out.println("El listado de asignatura es:");
            ArrayList<voAsignatura> listaAsignaturas = fachada.listarAsignaturas();

            for (voAsignatura asignatura : listaAsignaturas) {
                System.out.println("Código: " + asignatura.getCodigo());
                System.out.println("Nombre: " + asignatura.getNombre());
                System.out.println("Descripción: " + asignatura.getDescripcion());
                System.out.println("-----------------------------------");
            }
        } catch (DicAsignaturasVacioException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        
             
             
             
        // REQUERIMIENTO 3 -
        // FUNCIONA PERO TUVE QUE COLOCAR EL ATRIBUTO cantAsigAprob 
        // YA QUE SINO NO ME DEJABA CREAR EL OBJETO VOALUMNO Y VBECAD0 -> Ver los VO si dejamos o sacamos ese atributo del constructor
        voAlumno alumno = new voAlumno(49983130L, "Lucas", "Millan",0, "Andes 1118", 92066888L);		
		voBecado alumnoBecado = new voBecado(55650767L, "Santiago", "Bonfrisco",0, "Por ahi", 99999999L, 60,"Nos dio lastima");

        try {
            fachada.registarAlumno(alumno);
            System.out.println("El alumno se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registarAlumno(alumnoBecado);
            System.out.println("El alumno becado se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        // Pruebo el error - Dejo la misma cedula
        voAlumno alumno2 = new voAlumno(49983130L, "Juan", "Perez",0, "Maldonado 1118", 95666443L);		
        try {
            fachada.registarAlumno(alumno2);
            System.out.println("El alumno se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        
        
        */
        
        // REQUERIMIENTO 4 - FUNCIONA
        // LO QUE VI ES QUE EN LA LETRA DEL REQUERIMIENTO PIDE SABER EL TIPO Y EN EL VOAlumnoDat que es el vo que utiliza, no le pasa el tipo
        // EL MENSAJE DE ERROR FUNCIONA BIEN
        voAlumno alumno1 = new voAlumno(49983130L, "Lucas", "Millan",0, "Andes 1118", 92066888L);		
		voBecado alumnoBecado1 = new voBecado(434343767L, "Santiago", "Bonfrisco",0, "Por ahi", 99999999L, 60,"Nos dio lastima");
		voAlumno alumno2 = new voAlumno(475535330L, "Juan", "Perez",0, "coso 1118", 92066888L);		
		voBecado alumnoBecado2 = new voBecado(564323227L, "Pablo", "Perezoso",0, "pum", 99999999L, 60,"Nos dio lastima");
		voAlumno alumno3 = new voAlumno(232322424L, "Carlos", "Perez",0, "tuki 1118", 92066888L);		
		voBecado alumnoBecado3 = new voBecado(54342112L, "Federico", "Martinez",0, "taka", 99999999L, 60,"Nos dio lastima");


        try {
            fachada.registarAlumno(alumno1);
            System.out.println("El alumno1 se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registarAlumno(alumnoBecado1);
            System.out.println("El alumno becado1 se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registarAlumno(alumno2);
            System.out.println("El alumno2 se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registarAlumno(alumnoBecado2);
            System.out.println("El alumno becado2 se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registarAlumno(alumno3);
            System.out.println("El alumno3 se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registarAlumno(alumnoBecado3);
            System.out.println("El alumno becado3 se registro con exito.");
        } catch (AlumnoYaExisteExceptions exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        System.out.println("-----------------------------------");

        String ape = "Perez";
        try {
            System.out.println("Los alumnos que empiezan con apellido " + ape+"... son: ");
            System.out.println("");
            ArrayList<voAlumnoDat> listaAlumnos = fachada.listarAlumnoApe(ape);
            for (voAlumnoDat alumno : listaAlumnos) {
                System.out.println("Apellido: " + alumno.getApellido());
            	System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Cedula: " + alumno.getCedula());
                //System.out.println("Tipo: " + alumno.getTipo());
                System.out.println("-----------------------------------");
            }
        } catch (DicAlumnosVacioException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
       

	}

}
