import CapaLogica.Alumnos.Alumno;
import CapaLogica.Alumnos.Alumnos;
import CapaLogica.Inscripciones.Inscripciones;
import CapaLogica.VO.voAlumno;
import CapaLogica.VO.voAsignatura;

public class Fachada {
	
	private Alumnos diccioAl;
	private Asiganturas diccioAs;
	
	public Fachada () {
		 
	}
	
	public void registrarAsignatura(voAsignatura asig, tipoError &error){  ///throws AsignaturaYaExisteException{ 
		string cod = asig.getCodigo();
		string nom = asig.getNombre();
		string des = asig.getDescripcion();
		Asignatura(cod,nom,des);
		if(diccioAs.member(cod))
			/// exeption
		else
			InsBack(Asignatura);

	}
	
	public voAsignatura[] listarAsignaturas(){ 
		
	}
	
	public void registarAlumno(voAlumno al,tipoError &error){ //throws AlumnoYaExisteExceptions{
		long ced = al.getCedula();
		string nom = al.getNombre();
		string ape = al.getApellido();
		string dom = al.getDomicilio();
		long tel = al.getTelefono();
		//string tipo = al.getTipo   no me da la opc el .
		Alumno(ced,nom,ape,dom,tel);
		if (diccioAl.member(ced)){
			/// exeption			String msg = "El alumno ya existe";
		else
			if (esBecado)
				//crear el objeto becado
				
			insert(Alumno);
		
	}
	
	public voAlumnoDat[] listarAlumnoApe(string ape){ 
		
	}
	
	public voAlumnoDatCom listarAlumnoCed(long ced){ //throws AlumnoYaExisteExceptions{
		if(!diccioAl.member(ced)
			/// exeption
		else
			Alumno al = diccioAl.find(ced);
			long cedula = al.getCedula();
			string nombre = al.getNombre();
			string apellido = al.getApellido();
			int cantAprob = al.getCantAsigAprob();
			voAlumnoDatCom(cedula,nombre,apellido,cantAprob);
			return voAlumnoDatCom;
	}
	
	public void registrarInscripcion(String cod, long ced, float mon, int anio, tipoError &error){  // exeption
		
		if(!diccioAl.member(ced)
				/// exeption
		else
			Alumno al = diccioAl.find(ced);
			if(!diccioAs.member(cod))
				// exeption
			else{ 
				Inscripciones in = al.getInscripciones();
				registrarInscripcion(); // q hacer
			}
	}
	
	public void registrarCalificacion(long ced, int cal, int num, tipoError &error){ 
		if(!diccioAl.member(ced)
				/// exeption
		else {
			Alumno al = diccioAl.find(ced);
			registrarCalificacion(); ///?
		}	
	}
		
	
	
	public float montoRecaudado (long ced, int anio, tipoError &error){ 
		if(!diccioAl.member(ced)
				/// exeption
		else{
			Alumno al = diccioAl.find(ced);
			Inscripciones in = al.getInscripciones();
			return in.calcularRecaudado(anio);
		}	
	}
	
	public voInscripcion[] listarEscolaridad(long ced, boolean modo){ 
		if(!diccioAl.member(ced)
				/// exeption
		else{
			Alumno al = diccioAl.find(ced);
			Inscripciones in = al.getInscripciones();
			if (modo == TRUE) // TRUE completo
			
			else
				
		}
	}
	
	public voPromedio[] listarEgresados(boolean modo){ 
		
	}
	
	public void respaldar(){ 
	
	}
	
	public void recuperar(){ 
		
	}


}