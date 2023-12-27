package tp1;

import java.util.Scanner;

public class Mayor_menor {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		final int TOPE_MINIMO=0, TOPE_MAXIMO=1000;
		int numero=0,numero2=0, puntos=0;
		String prediccion ="";
		boolean correcto=true;
		
		numero = TOPE_MINIMO + (int)(Math.random() * (TOPE_MAXIMO - TOPE_MINIMO));
		System.out.println("El numero random es "+numero);
		
		while (correcto==true)
		{
			do{
				System.out.println("Ingrese su prediccion - MA (mayor) , ME (menor) y IG (igual)");
				prediccion=input.nextLine();
				
			}while(!prediccion.equalsIgnoreCase("MA") && !prediccion.equalsIgnoreCase("ME") && !prediccion.equalsIgnoreCase("IG"));
		
			numero2 = TOPE_MINIMO + (int)(Math.random() * (TOPE_MAXIMO - TOPE_MINIMO));
			System.out.println("El numero random es "+numero2);
			
			switch (prediccion) {
			
			case "MA":
				if (numero2>numero)
				{
					correcto = true;}
				else {
					correcto=false;}
				break;/*case MA*/
			
			case "ME":
				if (numero2<numero)
				{correcto = true;}
				else {
					correcto=false;}
				break;/*case ME*/
			
			case "IG":
				if (numero2==numero)
				{
					correcto = true;}
				else {
					correcto=false;}
				break;/*case IG*/
			
			}/*aca termina el switch*/
			
			if (correcto==true)
			{System.out.println("Correcto , vuelve a arriesgar");
			puntos++;}
			else
			{System.out.println("Incorrecto Perdiste");}
			
			numero=numero2;
			
		}/*Aca termina el while*/
		
		System.out.println("Termino el juego tu puntaje es de "+puntos);
		
		
		
		
		input.close();

	}

}
