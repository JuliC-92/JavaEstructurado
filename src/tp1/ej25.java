package tp1;

import java.util.Scanner;

public class ej25 {
	
	static Scanner input=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int alto=0, ancho=0;

	
	System.out.println("Ingrese el ancho de la matiz");
	
	ancho=Integer.parseInt(input.nextLine());
	
	System.out.println("Ingrese el alto de la matiz");
	
	alto=Integer.parseInt(input.nextLine());
	
	for(int i=0; i<alto; i++) {
		for (int j=0;j<ancho;j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	

	
	
	
	
	
	
	
	input.close();
	}

}
