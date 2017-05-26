package mx.com.dmc.mb;

public class Usuario {
	
	private String nombre;
	private String apellido;
	
	public Usuario(){	//CONSTRUCTOR POR DEFAULT
		
	}

	public Usuario(String nombre, String apellido) {	//CONSTRUCTOR CON CAMPOS
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
