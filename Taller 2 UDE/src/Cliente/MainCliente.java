package Cliente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Properties;

import CapaLogica.IFachada;
import CapaLogica.Exceptions.*;
import CapaLogica.VO.*;
import persistencia.exceptions.PersistenciaException;

public class MainCliente {

	public MainCliente() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try
		{ 
			Properties prop = new Properties();
			String nomArch = "config/txt.properties";
			prop.load (new FileInputStream (nomArch));
			String ip = prop.getProperty("ip");
			String puerto = prop.getProperty("puerto");
			IFachada fachada = (IFachada)
					Naming.lookup("//"+ip+":"+puerto+"/fachada");

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

			/*

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




	        /*

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





	        // REQUERIMIENTO 5

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

	        long ced = 55650767L;
	        try {
	            System.out.println("Los datos del alumno son: ");
	            System.out.println("");
	            voAlumnoCompleto vo = fachada.listarAlumnoCed(ced);
	            System.out.println("Cedula: " + vo.getCedula());
	           	System.out.println("Nombre: " + vo.getNombre());
	        	System.out.println("Apellido: " + vo.getApellido());
	           	System.out.println("Domicilio: " + vo.getDomicilio());
	           	System.out.println("Telefono: " + vo.getTelefono());
	           	System.out.println("Tipo: " + vo.getTipo());
	           	if(vo instanceof voBecadoDatCom) {
	               	System.out.println("Porcentaje: " + ((voBecadoDatCom)vo).getPorcentajeBeca());
	               	System.out.println("Razon: " + ((voBecadoDatCom)vo).getRazon());
	           	}
	        } 
	        catch (AlumnoNoInscriptoException exc) {
	            System.out.println("Error: " + exc.darMensaje());
	        }

	        long ced2 = 49983130L;
	        try {
	            System.out.println("Los datos del alumno son: ");
	            System.out.println("");
	            voAlumnoCompleto vo = fachada.listarAlumnoCed(ced2);
	            System.out.println("Cedula: " + vo.getCedula());
	           	System.out.println("Nombre: " + vo.getNombre());
	        	System.out.println("Apellido: " + vo.getApellido());
	           	System.out.println("Domicilio: " + vo.getDomicilio());
	           	System.out.println("Telefono: " + vo.getTelefono());
	           	System.out.println("Tipo: " + vo.getTipo());
	           	if(vo instanceof voBecadoDatCom) {
	               	System.out.println("Porcentaje: " + ((voBecadoDatCom)vo).getPorcentajeBeca());
	               	System.out.println("Razon: " + ((voBecadoDatCom)vo).getRazon());
	           	}
	        } 
	        catch (AlumnoNoInscriptoException exc) {
	            System.out.println("Error: " + exc.darMensaje());
	        }

	        long ced3 = 424242424L;
	        try {
	            System.out.println("Los datos del alumno son: ");
	            System.out.println("");
	            voAlumnoCompleto vo = fachada.listarAlumnoCed(ced3);
	            System.out.println("Cedula: " + vo.getCedula());
	           	System.out.println("Nombre: " + vo.getNombre());
	        	System.out.println("Apellido: " + vo.getApellido());
	           	System.out.println("Domicilio: " + vo.getDomicilio());
	           	System.out.println("Telefono: " + vo.getTelefono());
	           	System.out.println("Tipo: " + vo.getTipo());
	           	if(vo instanceof voBecadoDatCom) {
	               	System.out.println("Porcentaje: " + ((voBecadoDatCom)vo).getPorcentajeBeca());
	               	System.out.println("Razon: " + ((voBecadoDatCom)vo).getRazon());
	           	}
	        } 
	        catch (AlumnoNoInscriptoException exc) {
	            System.out.println("Error: " + exc.darMensaje());
	        }




	        // REQUERIMIENTO 6
	        voAlumno alumno = new voAlumno(49983130L, "Lucas", "Millan", "Andes 1118", 92066888L);		
			voBecado alumnoBecado = new voBecado(55650767L, "Santiago", "Bonfrisco", "Por ahi", 99999999L, 60,"Nos dio lastima");

			voAsignatura asignatura1 = new voAsignatura("ABC123", "Programacion", "Codigo en C++");
	        voAsignatura asignatura2 = new voAsignatura("DEF456", "Taller", "Codigo en JAVA");
	        voAsignatura asignatura3 = new voAsignatura("GHI789", "Base de datos", "Codigo en SQL");

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


	        float monto = 200;
	        int anio = 2024;
	        try {
	            fachada.registrarInscripcion(asignatura1.getCodigo(),alumno.getCedula(),monto,anio);
	            System.out.println("La inscripcion se registro con exito.");
	        } catch (AlumnoNoInscriptoException exc) {
	            System.out.println("Error: " + exc.darMensaje());
		    } catch (AsignaturaNoExisteException exc) {
		        System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
			    System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
			    System.out.println("Error: " + exc.darMensaje());
			}

	        // Error 1
	        float monto1 = 200;
	        int anio1 = 2024;
	        try {
	            fachada.registrarInscripcion(asignatura1.getCodigo(),3493434L,monto1,anio1);
	            System.out.println("La inscripcion se registro con exito.");
	        } catch (AlumnoNoInscriptoException exc) {
	            System.out.println("Error: " + exc.darMensaje());
		    } catch (AsignaturaNoExisteException exc) {
		        System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
			    System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
			    System.out.println("Error: " + exc.darMensaje());
			}

	       // Error 2

	        float monto2 = 200;
	        int anio2 = 2024;
	        try {
	            fachada.registrarInscripcion("sdd2323",alumno.getCedula(),monto2,anio2);
	            System.out.println("La inscripcion se registro con exito.");
	        } catch (AlumnoNoInscriptoException exc) {
	            System.out.println("Error: " + exc.darMensaje());
		    } catch (AsignaturaNoExisteException exc) {
		        System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
			    System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
			    System.out.println("Error: " + exc.darMensaje());
			}

	        // Error 3

	        float monto3 = 200;
	        int anio3 = 2024;
	        try {
	            fachada.registrarInscripcion(asignatura1.getCodigo(),alumno.getCedula(),monto3,anio3);
	            System.out.println("La inscripcion se registro con exito.");
	        } catch (AlumnoNoInscriptoException exc) {
	            System.out.println("Error: " + exc.darMensaje());
		    } catch (AsignaturaNoExisteException exc) {
		        System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
			    System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
			    System.out.println("Error: " + exc.darMensaje());
			}

	        // Error 4
	        float monto4 = 200;
	        int anio4 = 2021;
	        try {
	            fachada.registrarInscripcion("DEF456",49983130L,monto4,anio4);
	            System.out.println("La inscripcion se registro con exito.");
	        } catch (AlumnoNoInscriptoException exc) {
	            System.out.println("Error: " + exc.darMensaje());
		    } catch (AsignaturaNoExisteException exc) {
		        System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
			    System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
			    System.out.println("Error: " + exc.darMensaje());
			}





			// REQUERIMIENTO 7
			voAlumno alumno = new voAlumno(49983130L, "Lucas", "Millan", "Andes 1118", 92066888L);		
			voBecado alumnoBecado = new voBecado(55650767L, "Santiago", "Bonfrisco", "Por ahi", 99999999L, 60,"Nos dio lastima");

			voAsignatura asignatura1 = new voAsignatura("ABC123", "Programacion", "Codigo en C++");
	        voAsignatura asignatura2 = new voAsignatura("DEF456", "Taller", "Codigo en JAVA");


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
				System.out.println("Primera asignatura registrada correctamente.");
			} catch (AsignaturasCompletaException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaYaExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

	        //1
			float monto = 200;
			int anio = 2024;
			try {
				fachada.registrarInscripcion(asignatura2.getCodigo(),alumno.getCedula(),monto,anio);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			//2
			float monto1 = 600;
			int anio1 = 2024;
			try {
				fachada.registrarInscripcion(asignatura1.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			int cal = 3;
			int num = 1;
			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal, num);;
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
			System.out.println("Error: " + exc.darMensaje());
			}

			int cal1 = 6;
			int num1 = 2;
			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, num1);;
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
			System.out.println("Error: " + exc.darMensaje());
			}

			// Error 1
			try {
				fachada.registrarCalificacion(3232332L, cal, num);;
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
			System.out.println("Error: " + exc.darMensaje());
			}

			// Error 2
			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal, 6);;
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
			System.out.println("Error: " + exc.darMensaje());
			}

			// Error 3
			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal, num);;
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
			System.out.println("Error: " + exc.darMensaje());
			}

			// Error 4
			try {
				fachada.registrarCalificacion(alumno.getCedula(), 15, 2);;
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
			System.out.println("Error: " + exc.darMensaje());
			}

			float monto3 = 200;
			int anio3 = 2025;
			try {
				fachada.registrarInscripcion(asignatura2.getCodigo(),alumno.getCedula(),monto3,anio3);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura1.getCodigo(),alumno.getCedula(),monto3,anio3);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}




			// REQUERIMIENTO 8
			try {
				float mon = fachada.montoRecaudado(alumno.getCedula(), anio);
				System.out.println("El monto recaudado es " + mon);
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}	

			// Error
			try {
				float mon = fachada.montoRecaudado(4343434L, anio);
				System.out.println("El monto recaudado es " + mon);
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}	




			// REQUERIMIENTO 9
			boolean modo = true;
			try {
				 ArrayList<voInscripcion> listaEscolaridad = fachada.listarEscolaridad(alumno.getCedula(), modo);
				 if(modo) {
		            for (voInscripcion escolaridad : listaEscolaridad) {
		                System.out.println("Numero: " + escolaridad.getNumero());
		            	System.out.println("Calificacion: " + escolaridad.getCalificacion());
		                System.out.println("Anio: " + escolaridad.getAnioLectivo());
		                System.out.println("Asignatura" + escolaridad.getAsignatura());
		               	if(escolaridad instanceof voInscripcionCompleto)
		                   	System.out.println("Monto: " + ((voInscripcionCompleto)escolaridad).getMonto());
		                System.out.println("-----------------------------------");
		            }
				 }
		          else {
			            for (voInscripcion escolaridad : listaEscolaridad) {
			                System.out.println("Numero: " + escolaridad.getNumero());
			            	System.out.println("Calificacion: " + escolaridad.getCalificacion());
			                System.out.println("Anio: " + escolaridad.getAnioLectivo());
			                System.out.println("Asignatura" + escolaridad.getAsignatura());
			                System.out.println("-----------------------------------");
			            }
		          }
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (SecInscripcionesVaciaException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}	

			// Parcial
			boolean modo2 = false;
			try {
				 ArrayList<voInscripcion> listaEscolaridad = fachada.listarEscolaridad(alumno.getCedula(), modo2);
		            for (voInscripcion escolaridad : listaEscolaridad) {
		                System.out.println("Numero: " + escolaridad.getNumero());
		            	System.out.println("Calificacion: " + escolaridad.getCalificacion());
		                System.out.println("Anio: " + escolaridad.getAnioLectivo());
		                System.out.println("Asignatura" + escolaridad.getAsignatura());
		               	if(escolaridad instanceof voInscripcionCompleto)
		                   	System.out.println("Monto: " + ((voInscripcionCompleto)escolaridad).getMonto());
		                System.out.println("-----------------------------------");
		            }
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (SecInscripcionesVaciaException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}	


			// Error 1
					try {
						 ArrayList<voInscripcion> listaEscolaridad = fachada.listarEscolaridad(34242424L, modo);
						 if(modo) {
				            for (voInscripcion escolaridad : listaEscolaridad) {
				                System.out.println("Numero: " + escolaridad.getNumero());
				            	System.out.println("Calificacion: " + escolaridad.getCalificacion());
				                System.out.println("Anio: " + escolaridad.getAnioLectivo());
				                System.out.println("Asignatura" + escolaridad.getAsignatura());
				               	if(escolaridad instanceof voInscripcionCompleto)
				                   	System.out.println("Monto: " + ((voInscripcionCompleto)escolaridad).getMonto());
				                System.out.println("-----------------------------------");
				            }
						 }
				          else {
					            for (voInscripcion escolaridad : listaEscolaridad) {
					                System.out.println("Numero: " + escolaridad.getNumero());
					            	System.out.println("Calificacion: " + escolaridad.getCalificacion());
					                System.out.println("Anio: " + escolaridad.getAnioLectivo());
					                System.out.println("Asignatura" + escolaridad.getAsignatura());
					                System.out.println("-----------------------------------");
					            }
				          }
					} catch (AlumnoNoInscriptoException exc) {
						System.out.println("Error: " + exc.darMensaje());
					} catch (SecInscripcionesVaciaException exc) {
						System.out.println("Error: " + exc.darMensaje());
					}


					// Error 2
					try {
						 ArrayList<voInscripcion> listaEscolaridad = fachada.listarEscolaridad(alumnoBecado.getCedula(), modo);
				            for (voInscripcion escolaridad : listaEscolaridad) {
				                System.out.println("Numero: " + escolaridad.getNumero());
				            	System.out.println("Calificacion: " + escolaridad.getCalificacion());
				                System.out.println("Anio: " + escolaridad.getAnioLectivo());
				                System.out.println("Asignatura" + escolaridad.getAsignatura());
				               	if(escolaridad instanceof voInscripcionCompleto)
				                   	System.out.println("Monto: " + ((voInscripcionCompleto)escolaridad).getMonto());
				                System.out.println("-----------------------------------");
				            }
					} catch (AlumnoNoInscriptoException exc) {
						System.out.println("Error: " + exc.darMensaje());
					} catch (SecInscripcionesVaciaException exc) {
						System.out.println("Error: " + exc.darMensaje());
					}	




			try {
				fachada.recuperar(); 
			} catch (PersistenciaException e){
				System.out.println("error recuperar: " + e.darMensaje());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*
			// REQUERIMIENTO 10
			voAlumno alumno = new voAlumno(49983130L, "Lucas", "Millan", "Andes 1118", 92066888L);		

			voAsignatura asignatura1 = new voAsignatura("ABC123", "Programacion", "Codigo en C++");
			voAsignatura asignatura2 = new voAsignatura("DEF456", "Taller", "Codigo en JAVA");
			voAsignatura asignatura3 = new voAsignatura("GHI789", "Base de datos", "Codigo en SQL");
			voAsignatura asignatura4 = new voAsignatura("GHIe89", "Sistemas Operativos", "SSH");
			voAsignatura asignatura5 = new voAsignatura("GHf789", "Sistemas Operativos", "SSH");
			voAsignatura asignatura6 = new voAsignatura("GHg789", "Sistemas Operativos", "SSH");
			voAsignatura asignatura7 = new voAsignatura("GHh789", "Sistemas Operativos", "SSH");
			voAsignatura asignatura8 = new voAsignatura("GHj789", "Sistemas Operativos", "SSH");
			voAsignatura asignatura9 = new voAsignatura("GHk789", "Sistemas Operativos", "SSH");
			voAsignatura asignatura10 = new voAsignatura("33k789", "Sistemas Operativos", "SSH");
			/*
			try {
				fachada.registarAlumno(alumno);
				System.out.println("El alumno se registro con exito.");
			} catch (AlumnoYaExisteExceptions exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

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
				fachada.registrarAsignatura(asignatura5);
				System.out.println("5 asignatura registrada correctamente.");
			} catch (AsignaturasCompletaException exc) {
				System.out.println("Error: " + exc.darMensaje());

			} catch (AsignaturaYaExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarAsignatura(asignatura6);
				System.out.println("6 asignatura registrada correctamente.");
			} catch (AsignaturasCompletaException exc) {
				System.out.println("Error: " + exc.darMensaje());

			} catch (AsignaturaYaExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarAsignatura(asignatura7);
				System.out.println("7 asignatura registrada correctamente.");
			} catch (AsignaturasCompletaException exc) {
				System.out.println("Error: " + exc.darMensaje());

			} catch (AsignaturaYaExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarAsignatura(asignatura8);
				System.out.println("8 asignatura registrada correctamente.");
			} catch (AsignaturasCompletaException exc) {
				System.out.println("Error: " + exc.darMensaje());

			} catch (AsignaturaYaExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarAsignatura(asignatura9);
				System.out.println("9 asignatura registrada correctamente.");
			} catch (AsignaturasCompletaException exc) {
				System.out.println("Error: " + exc.darMensaje());

			} catch (AsignaturaYaExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarAsignatura(asignatura10);
				System.out.println("10 asignatura registrada correctamente.");
			} catch (AsignaturasCompletaException exc) {
				System.out.println("Error: " + exc.darMensaje());

			} catch (AsignaturaYaExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			float monto1 = 600;
			int anio1 = 2024;
			try {
				fachada.registrarInscripcion(asignatura1.getCodigo(),49983130L,monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura2.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura3.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura4.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura5.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura6.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura7.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura8.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura9.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			try {
				fachada.registrarInscripcion(asignatura10.getCodigo(),alumno.getCedula(),monto1,anio1);
				System.out.println("La inscripcion se registro con exito.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AsignaturaNoExisteException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AlumnoYaCursaAsignatura exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (AñoMenorAlUltimoReg exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			int cal1 = 10;
			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 1);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 2);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 3);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 4);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 5);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 6);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 7);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 8);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 9);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}

			try {
				fachada.registrarCalificacion(alumno.getCedula(), cal1, 10);
				System.out.println("Calificacion registrada correctamente.");
			} catch (AlumnoNoInscriptoException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NumInscripcionNoExiste exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (YaTieneCalificacion exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (NotaInvalida exc) {
				System.out.println("Error: " + exc.darMensaje());
			}


			System.out.println("-------------------COMPLETO----------------");

			boolean modo = true;
			try {
				ArrayList<voAlumnoDat> listaEgresados = fachada.listarEgresados(modo);
				if(modo) {
					for (voAlumnoDat egresado : listaEgresados) {
						System.out.println("Cedula: " + egresado.getCedula());
						System.out.println("Nombre: " + egresado.getNombre());
						System.out.println("Apellido: " + egresado.getApellido());
						if(egresado instanceof voPromedio) {
							System.out.println("Promedio aprobadas: " + ((voPromedio)egresado).getPromedioAprobacion());
							System.out.println("Promedio cursadas: " + ((voPromedio)egresado).getPromedioTotal());
						}
						System.out.println("-----------------------------------");
					}
				}
				else {
					for (voAlumnoDat egresado : listaEgresados) {
						System.out.println("Cedula: " + egresado.getCedula());
						System.out.println("Nombre: " + egresado.getNombre());
						System.out.println("Apellido: " + egresado.getApellido());
						System.out.println("-----------------------------------");
					}
				}
			} catch (DicAlumnosVacioException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("----------------PARCIAL---------------");

			boolean modo2 = false;
			try {
				ArrayList<voAlumnoDat> listaEgresados = fachada.listarEgresados(modo2);
				for (voAlumnoDat egresado : listaEgresados) {
					System.out.println("Cedula: " + egresado.getCedula());
					System.out.println("Nombre: " + egresado.getNombre());
					System.out.println("Apellido: " + egresado.getApellido());
					if(egresado instanceof voPromedio) {
						System.out.println("Promedio aprobadas: " + ((voPromedio)egresado).getPromedioAprobacion());
						System.out.println("Promedio cursadas: " + ((voPromedio)egresado).getPromedioTotal());
					}
					System.out.println("-----------------------------------");
				}
			} catch (DicAlumnosVacioException exc) {
				System.out.println("Error: " + exc.darMensaje());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			try {
				fachada.respaldar(); 
			} catch (PersistenciaException e){
				System.out.println("error respaldar: " + e.darMensaje());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 */

		}
		catch (MalformedURLException e) { e.printStackTrace(); }
		catch (RemoteException e) { e.printStackTrace(); }
		catch (NotBoundException e) { e.printStackTrace(); } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


