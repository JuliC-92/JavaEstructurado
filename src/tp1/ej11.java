package tp1;

import java.util.Scanner;

public class ej11 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		
		System.out.println("Ingrese un numero entero");
		
		n= Integer.parseInt(input.nextLine());
		
		if (n%2==0)
		{System.out.println("El numero es par");}
		
		else
		{System.out.println("El numero es impar");}
		
		
		
		
		
		
		
		
		input.close();

	}

}
