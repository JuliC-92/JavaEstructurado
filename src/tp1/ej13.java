package tp1;

import java.util.Scanner;

public class ej13 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0, n2=0, n3=0, nMax=0;
		
		System.out.println("Ingrese tres numeros, uno debajo del otro");
		n1= Integer.parseInt(input.nextLine());
		n2= Integer.parseInt(input.nextLine());
		n3= Integer.parseInt(input.nextLine());
		
		if (n1>n2)
		{
			nMax=n1;
		}
		else
		{
			nMax=n2;
		}
		if(n3>nMax)
		{
			nMax=n3;
		}
			
		System.out.println("El valor mayor es "+nMax);
		
		
		
		input.close();

	}

}
