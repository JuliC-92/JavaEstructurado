package tp1;

import java.util.Scanner;

public class ej29 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota=0;
		
		do {
			System.out.println("Ingrese la nnota (1 a 10)");
			nota=Integer.parseInt(input.nextLine());
		}while (nota>10 || nota<0);
		
		
		
		
		
		
		
		
		input.close();
	}

}
