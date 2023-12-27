package tp1;

import java.util.Scanner;

public class ej2 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1=0, nota2=0, nota3=0, promedio=0;
		
		System.out.println("Ingrese la nota del primer trimestro");
		
		nota1=input.nextDouble();
		
		System.out.println("Ingrese la nota del segundo trimestro");
		
		nota2=input.nextDouble();
		
		System.out.println("Ingrese la nota del tercer trimestro");
		
		nota3=input.nextDouble();
		
		promedio= (nota1+nota2+nota3)/3;
		
		System.out.println("La nota final es "+promedio);
		
		

	}

}
