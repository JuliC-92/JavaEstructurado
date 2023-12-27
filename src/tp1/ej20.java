package tp1;

import java.util.Scanner;

public class ej20 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0;
		
		String operacion="";
		
		System.out.println("Ingrese dos numero uno debajo de otro");
		
		num1= Integer.parseInt(input.nextLine());
		
		num2= Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el tipo de operacion que quiere realizar");
		
		operacion=input.nextLine();
		
		switch (operacion){
		case "+":
			System.out.println("La suma es ="+(num1+num2));
			break;
		case"-":
			System.out.println("La resta es ="+(num1-num2));
			break;
		case"*":
			System.out.println("La multiplicacion es ="+ (num1*num2));
		case"/":
			{if (num1!=0 && num2!=0)
			{
			System.out.println("La division entre ambos numeros es = "+num1/num2);
			}
			else
			{
			System.out.println("ERROR");
			}}
			default:
			System.out.println("ERROR1");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
