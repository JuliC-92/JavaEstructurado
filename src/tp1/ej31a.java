package tp1;

import java.util.Scanner;

public class ej31a {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String continuar="";
		
		System.out.println("¿Desea continuar? (S/N)");
		
		continuar= input.nextLine();
		
		while (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N"))
		{
			System.out.println("¿Desea continuar? (S/N)");
			continuar=input.nextLine();
		}
		
		
		
		
		
		input.close();

	}

}
