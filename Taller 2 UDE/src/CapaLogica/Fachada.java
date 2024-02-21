import CapaLogica.Alumnos.Alumno;
import CapaLogica.Alumnos.Alumnos;
import CapaLogica.Inscripciones.Inscripciones;
import CapaLogica.VO.voAlumno;
import CapaLogica.VO.voAsignatura;
import CapaLogica.VO.voBecado;
import CapaLogica.Alumnos.Becado;

public class Fachada {
	
	private Alumnos diccioAl;
	private Asiganturas diccioAs;
	
	public Fachada () {
		 
	}
	
	public void registrarAsignatura(voAsignatura asig, tipoError &error){  throws AsignaturaYaExisteException{ 
		string cod = asig.getCodigo();
		string nom = asig.getNombre();
		string des = asig.getDescripcion();
		Asignatura as;
		as = new Asignatura(cod,nom,des);
		if(diccioAs.member(cod))
			/// exeption
		else
			InsBack(As);

	}
	
	public voAsignatura[] listarAsignaturas(){ 
		
	}
	
	public void registarAlumno(voBecado al,tipoError &error) throws AlumnoYaExisteExceptions{
		long ced = al.getCedula();
		if (diccioAl.member(ced)){
			String msg = "El alumno ya existe";
			throw new AlumnoYaExisteExceptions(msg);
		}
			/// exeption			
		else {
			Alumno alu;
			if (al instanceof voBecado) 
				alu=new Becado(al.getCedula(),al.getNombre(),al.getApellido(),al.getDomicilio(),al.getTelefono(),al.getPorcentajeBeca(),al.getRazon());
			else 
				alu=new Alumno(al.getCedula(),al.getNombre(),al.getApellido(),al.getDomicilio(),al.getTelefono());
			diccioAl.insert(alu);
		}
		
	}
	
	public voAlumnoDat[] listarAlumnoApe(string ape){ 
		
	}
	
	public voAlumnoDatCom listarAlumnoCed(long ced){ throws AlumnoYaExisteExceptions{
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
			return al.calcularRecaudado(anio);
		}	
	}
	
	public voInscripcion[] listarEscolaridad(long ced, boolean modo){ 
		if(!diccioAl.member(ced)
				/// exeption
		else{
			Alumno al = diccioAl.find(ced);
			Inscripciones in = al.getInscripciones();
			if(in.estaVacia())
				//exeption
			else
				return in.
			
			else
				
		}
	}
	
	public voAlumnoDat[] listarEgresados(boolean modo){ 
		
	}
	
	public void respaldar(){ 
	
	}
	
	public void recuperar(){ 
		
	}


}