package tp1;

import java.util.Scanner;

public class ej17 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad=0;
		char sexo;
		
		System.out.println("Ingrese el sexo mujer (f) o varon (m)");
		
		sexo= input.next().charAt(0);

		System.out.println("Ingrese la edad (Entre 0 y 120)");
		
		edad= input.nextInt();
		
		if (sexo !='m' && sexo!='f' || edad>120 || edad<0)
			System.out.println("Valor Erroneo");
		else
		{
			if (sexo =='m')
			{
				if (edad>65)
					System.out.println("Esta en edad de jubilarse");
				else
				{
					System.out.println("No esta en edad de jubilarse");
				}
			}
			else
			{
				if (edad>60)
				{
					System.out.println("Esta en edad de jubilarse");
				}
				else
				{
					System.out.println("No esta en edad de jubilarse");
				}
			}
			
		}
		
		
		
		
		input.close();
	}

}
