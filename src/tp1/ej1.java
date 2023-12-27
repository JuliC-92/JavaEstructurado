package tp1;

import java.util.Scanner;

public class ej1 {

	static Scanner input = new Scanner(System.in);	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="", apellido="";
		
		System.out.println("Ingrese su nombre");
		
		nombre = input.nextLine();
		
		System.out.println("Ingrese Apellido");
		
		apellido= input.nextLine();
		
		System.out.println("El nombre es "+nombre+" "+apellido);
		
		
		

	}

}
