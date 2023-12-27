package tp1;

import java.util.Scanner;

public class Primerparcial {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		
		final int SALIDA = -1;
		
		int fecha=0, bandera=0, fecha2=0;
		
		double diaMayorDif=0, mayorDifMareas=0, difMarea=0;
		double pivotMarea=0, mareaMin=0, mareaMax=0;
		
		System.out.println("Bienvenido al servicio meteorologico");
		System.out.println("Ingrese la fecha (AAAAMMDD) - Ingrese -1 para finalizar");
		fecha=Integer.parseInt(input.nextLine());
		
		while (fecha!=-1)
		{
			bandera++;
			System.out.println("Ingrese la altura minima de la marea del dia , en metros");
			mareaMin= Double.parseDouble(input.nextLine());
			
			System.out.println("Ingrese la altura maxima de la marea del dia, en metros");
			mareaMax=Double.parseDouble(input.nextLine());
			
			if(mareaMax<mareaMin) {
				pivotMarea=mareaMax;
				mareaMax=mareaMin;
				mareaMin=pivotMarea;
				System.out.println("Los datos de la marea maxima y minima se han invertido");
			}/*aca termina if de comp max y min marea*/
			
			System.out.println("El dia "+fecha+" la marea minima fue de "+mareaMin+" mts. y la marea maxima fue de "+mareaMax+" mts.");
			
			difMarea= mareaMax-mareaMin;
			
			System.out.println("La diferencia entre la mayor y la menor del dia es de "+difMarea+" mts.");
			
			if (mayorDifMareas<difMarea) {
				mayorDifMareas=difMarea;
				diaMayorDif=fecha;
			}/*aca termina comparacion menor marea*/
			
			do {
				System.out.println("Ingrese la fecha (AAAAMMDD) - Ingrese -1 para finalizar");
				fecha2=Integer.parseInt(input.nextLine());
				if(fecha2<fecha && fecha2!=SALIDA) {
					System.out.println("Error - No se puede ingresar una fecha menor a la anterior");
				}
				
			}while((fecha2<fecha) && fecha2!=SALIDA);
			
			fecha=fecha2;
			
		}/*aca temrina el while grande*/
		
		if(bandera>0)
		{System.out.println("Se produjo la mayor diferencia de mareas el dia "+diaMayorDif);}
		else {
			System.out.println("No hay suficientes datos processados");
		}
		
		input.close();
	}

}
