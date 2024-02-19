package Asignatura;

public class Asignatura {

	private String codigo;
	private String nombre;
	private String descripcion;
	
	public Asignatura (String cod, String nom, String desc) {
		this.codigo = cod;
		this.nombre = nom;
		this.descripcion = desc;
	}
	
	public String getCodigo(){ 
		return codigo; 
	}
	
	public String getNombre(){ 
		return nombre; 
	}
	
	public String getDescripcion(){ 
		return descripcion; 
	}

	
}