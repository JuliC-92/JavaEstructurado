package tp1;

import java.util.Scanner;

public class ej34 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura=0, sumaAltura=0,alturaPromedio=0;
		
		double jugadores=0;
		
		System.out.println("Ingrese la primer altura - Cero para finalizar");
		altura = Double.parseDouble(input.nextLine());
		
		
		while (altura != 0)
		{
			sumaAltura=sumaAltura+altura;
			jugadores++;
			System.out.println("Ingrese otra altura - Cero para finalizar");
			altura=Double.parseDouble(input.nextLine());
		}
		alturaPromedio= sumaAltura/jugadores;
		System.out.println("La altura promedio del equipor es "+alturaPromedio);
		
		input.close();

	}

}
