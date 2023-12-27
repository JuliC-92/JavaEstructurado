package tp1;

import java.util.Scanner;

public class ej15 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int edad=0;
		double altura=0;
		String nombre="";
		
		System.out.println("Ingrese el nombre, edad y altura (en mts) uno debajo de otro del participante");
		
		nombre= input.nextLine();
		
		edad= Integer.parseInt(input.nextLine());
		
		altura= Double.parseDouble(input.nextLine());
		
		if (altura > 1.5 || edad >= 6)
		{
			System.out.println(nombre + " Puede ingresar a la montaña rusa");
		}
		else
			System.out.println(nombre+" No puede ingresar a la montaña rusa");
		
		input.close();
		
	}

}
