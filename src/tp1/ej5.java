package tp1;

import java.util.Scanner;

public class ej5 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1=0, num2=0, num3=0;
		
		System.out.println("Ingrese el valor de numero 1");
		
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el valor del numero 2");
		
		num2 = Integer.parseInt(input.nextLine());
		
		num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println("El primer numero es "+num1);
		
		System.out.println("El segundo numero es "+num2);
		
		input.close();
	}

}
