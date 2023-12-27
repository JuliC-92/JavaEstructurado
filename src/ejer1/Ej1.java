package ejer1;

public class Ej1 {
	
	public double sumar (double numero, double numero2) {
		double resultado;
		resultado=numero+numero2;
		return resultado;
	}

	public String pedirNumero(String texto, double min, double max) {
		double numeroAMostrar=0;
		numeroAMostrar= min + (int)(Math.random() * (max - min));
		return texto+numeroAMostrar;
	}
	
	
	
	
}
