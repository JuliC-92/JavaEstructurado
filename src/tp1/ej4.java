package tp1;

import java.util.Scanner;

public class ej4 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valorHs=0, horasT=0, valorSem=0;
		
		final double horasSem = 5.5;
		
		System.out.println("Ingrese el valor de la hora trabajada");
		
		valorHs = input.nextDouble();
		
		System.out.println("Ingrese la cantidad de horas trabajadas");
		
		horasT = input.nextDouble();
		
		valorSem = (valorHs * horasT)* horasSem;
		
		System.out.println("El monto semanal a cobrar es $"+valorSem);
		
		input.close();
		
		

	}

}
