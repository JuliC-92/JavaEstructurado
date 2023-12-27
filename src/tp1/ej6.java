package tp1;

import java.util.Scanner;

public class ej6 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalVentas=0;
		
		final double sueldoFijo=44000;
		
		final double porcentaje=0.16;
		
		System.out.println("Ingrese el monto total de ventas del mes");
		
		totalVentas = Double.parseDouble(input.nextLine());
		
		System.out.println("El importe cobrado por el vendedor es $"+(sueldoFijo+totalVentas*porcentaje));
		
		input.close();

	}

}
