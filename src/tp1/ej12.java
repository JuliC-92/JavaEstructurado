package tp1;

import java.util.Scanner;

public class ej12 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0, n2=0;
		
		System.out.println("Ingrese dos numero uno debajo del otro");
		
		n1= Integer.parseInt(input.nextLine());
		
		n2= Integer.parseInt(input.nextLine());
		
		if (n1>n2)
		{System.out.println("El primer numero es mayor que el segundo");}
		
		else 
			if (n1==n2)
			{System.out.println("Los numeros son iguales");}
			
			else
			{System.out.println("El segundo numero es mayor que el primero");}
		
		
		
		
		
		
		input.close();
		

	}

}
