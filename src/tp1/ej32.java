package tp1;

import java.util.Scanner;

public class ej32 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota=0;
		
		do {
			System.out.println("Ingrese nota");
			nota= Integer.parseInt(input.nextLine());
			
		}while ((nota!=0 && nota!=2) && (nota<4 || nota>10));
		
		
		if(nota!=0) {
		System.out.println("La nota es valida y es "+nota);
		}
		else
			System.out.println("El alumno se ausento");
		
		
		input.close();

	}

}
