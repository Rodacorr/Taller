package persistencia;

public class FachadaPersistencia {
private static Persistencia persist;
	
	private static FachadaPersistencia instancia;
	
	private FachadaPersistencia()
	{
		persist = new Persistencia();
	}
	
	//Singleton
	public static FachadaPersistencia getInstancia()
	{
		if (instancia == null)
			instancia = new FachadaPersistencia();	
		return instancia;
	}
}
