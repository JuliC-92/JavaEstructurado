package tp1;

import java.util.Scanner;

public class ej31b {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String continuar="";

		do {
			System.out.println("¿Desea continuar? (S/N)");
			continuar =input.nextLine();
			
		} while (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N") );
		
		
		
		
		
		
		
		input.close();
	}

}
