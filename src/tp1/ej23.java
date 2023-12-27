package tp1;

import java.util.Scanner;

public class ej23 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		System.out.println("Ingrese un numero entero");
		
		n=Integer.parseInt(input.nextLine());
		
		for (int i=0; i<10; i++) {
			
			System.out.println("El numero ingresado multiplicado por "+(i+1)+" es = "+(n*(i+1)));
		}
		
		
		
		input.close();

	}

}
