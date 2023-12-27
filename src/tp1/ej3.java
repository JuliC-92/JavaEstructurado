package tp1;

import java.util.Scanner;

public class ej3 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0;
		
		System.out.println("Ingrese un numero entero");
		
		num1=input.nextInt();
		
		System.out.println("El numero multiplicado por 5 es "+num1*5);
		
		System.out.println("El numero dividido por 2 es "+num1/2);
		
		input.close();

	}

}
