package tp1;

import java.util.Scanner;

public class ej33 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0, numMax=0, numMin=0;
		
		System.out.println("Ingrese un numero entero - Cero para finalizar");
		
		num= Integer.parseInt(input.nextLine());
		
		while (num !=0)
		{
			if (num>numMax)
			{numMax=num;}
			
			if (num!=0 || num<numMin)
			{numMin=num;}
		
		System.out.println("Ingrese un numero entero - Cero para finalizar");
		
		num= Integer.parseInt(input.nextLine());
		
		}
		
		System.out.println("El numero maximo ingresado es "+numMax);
		
		System.out.println("El numero menor ingresado es "+numMin);
		
		
		
		
		
		input.close();
	}

}
