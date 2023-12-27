package tp1;

import java.util.Scanner;

public class ej7 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ancho=0, largo=0, valorMts2=0;
		
		final int vueltas=3;
		
		System.out.println("Ingrese el valor de Mt2");
		
		valorMts2= Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el ancho en metros del terreno");
		
		ancho=Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el largo en metros del terreno");
		
		largo=Double.parseDouble(input.nextLine());
		
		System.out.println("El valor del terreno es $"+valorMts2*(largo*ancho));

		System.out.println("La cantidad de mts de alambre que se necesitan es de "+((largo+ancho)*2)*vueltas+"mts");
		
		
		input.close();
		
	}

}
