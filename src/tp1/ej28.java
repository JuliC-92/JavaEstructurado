package tp1;

import java.util.Scanner;

public class ej28 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cant=0, numMax=0, contador=0, posicionMax=0,num=0;
		
		System.out.println("Ingrese la cantidad de numero a ingresar");
		
		cant= Integer.parseInt(input.nextLine());
		
		while (contador<cant)
		{
			System.out.println("Ingrese un numero entero");
			num=Integer.parseInt(input.nextLine());
			
			contador++;
			
			if (num>numMax)
			{
				numMax=num;
				posicionMax=contador;
			}
		}
		
		System.out.println("El mayor numero ingresado fue "+numMax);
		System.out.println("El mayor se ingreso en la posicion nro "+posicionMax);
		
		input.close();
		
	}

}
