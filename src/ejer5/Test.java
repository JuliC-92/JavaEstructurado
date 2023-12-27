package ejer5;

public class Test {

	public static void main(String[] args) {
		
		Persona newPersona = new Persona();
		Domicilio newDomicilio = new Domicilio();
		
		
		
		newPersona.setApellido("Gomez");
		
		newPersona.setNombre("Fulano");
	
		newDomicilio.setCalle("Bermudez");
		newDomicilio.setCiudad("Buenos Aires");
		newDomicilio.setNumero(2456);
		
		
		newPersona.setDomicilio(newDomicilio);
		
		System.out.println(newPersona.toString());
		
	}

}
