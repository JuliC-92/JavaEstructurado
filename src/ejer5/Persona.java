package ejer5;

public class Persona {


	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Persona () {	}
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	
	public Domicilio getDomicilio() {
		return domicilio;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio.toString() + "]";
	}


	
	
	
}
