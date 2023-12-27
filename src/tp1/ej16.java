package tp1;

import java.util.Scanner;

public class ej16 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int inscriptos=0, sillas=0, sillasDis=0;
	 
	 System.out.println("Ingrese la cantidad de insciptos a la conferencia");
		
	 inscriptos= Integer.parseInt(input.nextLine());
	 
	 System.out.println("Ingrese la cantidad de asientos en la conferencia");
	 
	 sillas= Integer.parseInt(input.nextLine());
	 
	 sillasDis= inscriptos - sillas;
	 
	 if (sillasDis >0)
	 {
		 System.out.println("Las sillas no son suficientes para todos los participantes, faltas "+sillasDis+" sillas");
		  
	 }
	 else
	 {
		 System.out.println("La cantidad de sillas alcanzan para los participantes");
	 }
		
		input.close();

	}

}
