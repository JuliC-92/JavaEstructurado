package tp1;

import java.util.Scanner;

public class ej24 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0;

		do {
			System.out.println("Ingrese dos numeros uno debajo del otro (el primero debe ser menor o igual que el segundo)");
			num1=Integer.parseInt(input.nextLine());
			num2=Integer.parseInt(input.nextLine());
		} while (num1>num2);/*Validacion de entrada de datos*/
		
		for (int i=num1;i<=num2;i++)/*en este tramos se incluye a los num*/
		{
			System.out.println(i);
		}
		
		for (int j=num1+1; j<num2;j++) /*en este tramo se excluye a los num*/
		{
			System.out.println(j);
		}
		
		
		
		
		
		
		input.close();
		}
		

	}


