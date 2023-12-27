package tp1;

import java.util.Scanner;

public class ej35 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad=0, edadMin=250;
		
		String	nombre="", nombreMin="";
		
		System.out.println("Ingrese el nombre de la persona - * para finalizar");
		
		nombre= input.nextLine();
		
		while (!nombre.equals("*"))
		{
			System.out.println("Ingrese edad");
			edad=Integer.parseInt(input.nextLine());
			
			if (edad<edadMin)
				{
				nombreMin=nombre;
				edadMin=edad;
				}
			System.out.println("Ingrese otro nombre - * para finalizar");
			
			nombre=input.nextLine();
		}
		
		System.out.println("El nombre de la persona mas joven es "+nombreMin);
		
		
		
		
		
		input.close();
	}

}
