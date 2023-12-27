package tp1;

import java.util.Scanner;

public class ej37 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sueldoMen=0, sumaSueldo=0;
		
		int vueltas=0;
		
		System.out.println("Ingrese el monto a cobrar en el mes");
		
		sueldoMen= Double.parseDouble(input.nextLine());
		
		while(sueldoMen>0 && vueltas<12) 
		{
			vueltas++;
			sumaSueldo+=sueldoMen;
			System.out.println("Ingrese el monto a cobrar en el mes");
			sueldoMen=Double.parseDouble(input.nextLine());
		}
		
		System.out.println("El monto percibido por el empleado hasta el momento es de "+sumaSueldo);
		
		
		
		
		input.close();
	}

}
