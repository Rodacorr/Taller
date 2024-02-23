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
        voAsignatura asignatura4 = new voAsignatura("GHIe89", "Sistemas Operativos", "SSH");
        voAsignatura asignatura45 = new voAsignatura("GHf789", "Sistemas Operativos", "SSH");
        voAsignatura asignatura46 = new voAsignatura("GHg789", "Sistemas Operativos", "SSH");
        voAsignatura asignatura47 = new voAsignatura("GHh789", "Sistemas Operativos", "SSH");
        voAsignatura asignatura48 = new voAsignatura("GHj789", "Sistemas Operativos", "SSH");
        voAsignatura asignatura49 = new voAsignatura("GHk789", "Sistemas Operativos", "SSH");
        voAsignatura asignatura410 = new voAsignatura("GHk789", "Sistemas Operativos", "SSH");
        voAsignatura asignatura10 = new voAsignatura("GlI7549", "Sistemas Operativos", "SSH");
        voAsignatura asignatura11 = new voAsignatura("2lI7549", "Sistemas Operativos", "SSH");


        try {
            fachada.registrarAsignatura(asignatura1);
            System.out.println("Primera asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
	        
        try {
            fachada.registrarAsignatura(asignatura2);
            System.out.println("Segunda asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura3);
            System.out.println("Tercera asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura4);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura45);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura46);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura47);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura48);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura49);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura410);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        // Asignatura con error - Mismo codigo

        try {
            fachada.registrarAsignatura(asignatura10);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
        } catch (AsignaturaYaExisteException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
        
        try {
            fachada.registrarAsignatura(asignatura11);
            System.out.println("Cuarta asignatura registrada correctamente.");
	    } catch (AsignaturasCompletaException exc) {
	        System.out.println("Error: " + exc.darMensaje());
	    
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
        
        voAlumno alumno = new voAlumno(49983130L, "Lucas", "Millan", "Andes 1118", 92066888L);		
		voBecado alumnoBecado = new voBecado(55650767L, "Santiago", "Bonfrisco", "Por ahi", 99999999L, 60,"Nos dio lastima");

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
        voAlumno alumno2 = new voAlumno(49983130L, "Juan", "Perez", "Maldonado 1118", 95666443L);		
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
        voAlumno alumno1 = new voAlumno(49983130L, "Lucas", "Millan", "Andes 1118", 92066888L);		
		voBecado alumnoBecado1 = new voBecado(434343767L, "Santiago", "Bonfrisco", "Por ahi", 99999999L, 60,"Nos dio lastima");
		voAlumno alumno2 = new voAlumno(475535330L, "Juan", "Perez", "coso 1118", 92066888L);		
		voBecado alumnoBecado2 = new voBecado(564323227L, "Pablo", "Perezoso", "pum", 99999999L, 60,"Nos dio lastima");
		voAlumno alumno3 = new voAlumno(232322424L, "Carlos", "Perez", "tuki 1118", 92066888L);		
		voBecado alumnoBecado3 = new voBecado(54342112L, "Federico", "Martinez", "taka", 99999999L, 60,"Nos dio lastima");


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
            ArrayList<voAlumnoDatTipo> listaAlumnos = fachada.listarAlumnoApe(ape);
            for (voAlumnoDatTipo alumno : listaAlumnos) {
                System.out.println("Apellido: " + alumno.getApellido());
            	System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Cedula: " + alumno.getCedula());
                System.out.println("Tipo: " + alumno.getTipo());
                System.out.println("-----------------------------------");
            }
        } catch (DicAlumnosVacioException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
       
        
        
        /*
        
        // REQUERIMIENTO 5
        
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
        
        long ced = 49983130L;
        try {
            System.out.println("Los datos del alumno son: ");
            System.out.println("");
        	fachada.listarAlumnoCed(ced);
        } 
        catch (AlumnoNoInscriptoException exc) {
            System.out.println("Error: " + exc.darMensaje());
        }
*/
	}

}
