package tp1;

import java.util.Scanner;

public class ej8 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0,num2=0;
		
		System.out.println("Ingrese un numero");
		
		num1= Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro numero");
		
		num2= Integer.parseInt(input.nextLine());
		
		System.out.println("La multiplicacion entre ellos es "+num1*num2);

		System.out.println("La division entre ellos es "+ num1/num2);

		System.out.println("La suma entre entre ellos es "+num1+num2);
		
		System.out.println("La resta entre ellos es "+ (num1-num2));
		
		
		
		
		input.close();

	}

}
