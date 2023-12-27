package tp1;

import java.util.Scanner;

public class ej18 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0, numMay=0, numMen=0, resto=0;
		
		System.out.println("Ingrese dos numeros enteros, uno debajo del otro");
		
		num1=Integer.parseInt(input.nextLine());
		
		num2=Integer.parseInt(input.nextLine());

		
		if (num1 != num2 && num1!=0 && num2!=0)
		{
			if (num1>num2)
			{
				numMay=num1;
				numMen=num2;
				
				resto= numMay%numMen;
				
				if (resto==0)
				{
					System.out.println("El numero mayor es divisible por el menor");
				}
				else
				{
					System.out.println("El mayor no es divisible por el menor");
				}
				
			}
			else
			{
				numMay=num2;
				numMen=num1;
				
				resto= numMay%numMen;
				
				if (resto==0)
				{
					System.out.println("El numero mayor es divisible por el menor");
				}
				else
				{
					System.out.println("El mayor no es divisible por el menor");
				}
				
			}
			
			
			
		}
		else
			System.out.println("Se ingresaron dos numeros iguales o un 0(no se puede dividir por 0)");
		
		
		
		
		
		
		
		input.close();
		
	}

}
