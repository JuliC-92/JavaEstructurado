package tp1;

import java.util.Scanner;

public class ej30 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1=0, num2=0;
		
		String operacion="";
		
		System.out.println("Ingrese dos numeros enteros uno debajo de otro");
		
		num1=Integer.parseInt(input.nextLine());
		
		num2=Integer.parseInt(input.nextLine());
		
		
		System.out.println("Ingrese la operacion que quiere realizar(+,-,*,/) y F para finalizar");

		operacion=input.nextLine();
		
		while (!operacion.equals("F"))
		{
			switch (operacion) {
			case "+":
				System.out.println("La suma entre los numeros es = "+(num1+num2));
				break;
			case "-":
				System.out.println("La resta entre los numeros es = "+(num1-num2));
				break;
			case "*":
				System.out.println("La multiplicacion entre los numero es = "+(num1*num2));
				break;
			case "/":{
				if (num2!=0) {
					System.out.println("La division entre los numero es ="+(num1/num2));
				}
				else
				{
					System.out.println("Error, no se puede dividir por 0");
				}}
			}
			System.out.println("Ingrese la operacion que quiere realizar(+,-,*,/) y F para finalizar");
			
			operacion=input.next();
		}
		
		
		
		
		
		input.close();

	}

}
