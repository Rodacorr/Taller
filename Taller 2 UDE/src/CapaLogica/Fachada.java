public class Fachada {
	
	private Alumnos diccioAl;
	private Asiganturas diccioAs;
	
	public Fachada () {
		 
	}
	
	public void registrarAsignatura(voAsignatura asig, tipoError &error){ 
		
	}
	
	public voAsignatura[] listarAsignaturas(){ 
		
	}
	
	public void registarAlumno(voAlumno,tipoError &error){ 
	
		/*
		throws AlumnoYaExisteExceptions{ 
					if (member()){
						String msg = "El alumno ya existe";
				throw new AlumnoYaExiste(msg);
				// creo y lanzo una nueva Excepción
				}
				//insertar
				}
		*/
	}
	
	public voAlumnoDat[] listarAlumnoApe(string ape){ 
		
	}
	
	public voAlumnoDatCom listarAlumnoCed(long ced){ 
		
	}
	
	public void registrarInscripcion(String cod, long ced, float mon, int anio, tipoError &error){ 
		
	}
	
	public void registrarCalificacion(long ced, int cal, int num, tipoError &error){ 
		
	}
	
	public float montoRecaudado (long ced, int anio, tipoError &error){ 
	
	}
	
	public voInscripcion[] listarEscolaridad(long ced, boolean modo){ 
		
	}
	
	public voPromedio[] listarEgresados(boolean modo){ 
		
	}
	
	public void respaldar(){ 
	
	}
	
	public void recuperar(){ 
		
	}


}