package tp1;

import java.util.Scanner;

public class ej27 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=0, contadorMayor=0, acumulador=0;
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Ingrese la edad");
			
			edad=Integer.parseInt(input.nextLine());
			
			acumulador= acumulador+edad;
			
			if(edad>=18) {
				contadorMayor++;
			}
		}
		
		System.out.println("El promedio de la edad es "+(acumulador/5));
		System.out.println("La cantidad de mayores de 18 años = "+contadorMayor);
		

	}

}
