package tp1;

import java.util.Scanner;

public class ej21 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		System.out.println("Ingrese un numero del 1 al 7");
		
		num= Integer.parseInt(input.nextLine());
		
		switch (num) {
				
				case 1:
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Lunes");
					break;
				case 3:
					System.out.println("Martes");
					break;
				case 4:
					System.out.println("Miercoles");
					break;
				case 5:
					System.out.println("Jueves");
					break;
				case 6:
					System.out.println("Viernes");
					break;
				case 7:
					System.out.println("Sabado");
					break;
				default:
					System.out.println("ERROR");
				
		}
		
		
		
		
		
		
		
		input.close();

	}

}
