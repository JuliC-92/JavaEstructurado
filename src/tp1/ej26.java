package tp1;

import java.util.Scanner;

public class ej26 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0, vuelta=0, resul=0;
		
		System.out.println("Ingrese un numero entero");
		n=Integer.parseInt(input.nextLine());
		
		
		
		while (vuelta<n)
		{ vuelta++; 
			resul=vuelta*3;
			if((resul%5)!=0)
			{
				System.out.println(resul);
			}
			
		}
		
		
	}

}
