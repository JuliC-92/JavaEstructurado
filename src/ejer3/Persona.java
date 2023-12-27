package ejer3;

public class Persona {
	
	private String nombre;
	private String apellido;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public Persona () {
		nombre="";
		apellido="";
	}

}
