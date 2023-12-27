package compania;

public class Empleado {

	
	private String nombre;
	
	private String dni;
	
	private String domicilio;


	public Empleado(String nombre, String dni, String domicilio) {
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private String getDomicilio() {
		return domicilio;
	}

	private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + "]";
	}
	
	
}
