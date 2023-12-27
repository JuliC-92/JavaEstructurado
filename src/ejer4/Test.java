package ejer4;

public class Test {

	public static void main(String[] args) {
		
		Persona nuevaPersona = new Persona();
		Persona persona2= new Persona();
		
		nuevaPersona.setNombre("Fulano");
		
		nuevaPersona.setApellido("Gomez");
		
		System.out.println(nuevaPersona.toString());
		
		System.out.println("");
		
		persona2.setNombre("Esteban");
		
		persona2.setApellido("Banquito");
		
		System.out.println(persona2.toString());
	}

}
