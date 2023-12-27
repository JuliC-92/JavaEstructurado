package tp1;

import java.util.Scanner;

public class ej9 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ang1=0, ang2=0, ang3=0;
		
		final double totalAng=180;
		
		System.out.println("Ingrese los grados del primer angulo");
		
		ang1=Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese los grados del segundo angulo");
		
		ang2=Double.parseDouble(input.nextLine());
		
		ang3= totalAng - ang1 - ang2;
				
		System.out.println("El tercer angulo es de "+ang3+" grados");
		
		input.close();
		
	}

}
