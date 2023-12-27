package tp1;

import java.util.Scanner;

public class ej39 {
	
	/*Integrantes de grupo: Matias Falon, Camarero Julian, Mauricio Ceriana, Federico Cotler y Marcos Zylberberg */
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="", nombreMayor="";
		
		int puntos=0, sumaPuntos=0,mayorPuntos=0,cantJugadores=0,vueltas=0,distanciaCentro=0,tiroCentro=0;
		
		do{System.out.println("Bienvenido a tiro al blanco, ingrese cantidad de jugadores a participar");
		cantJugadores=Integer.parseInt(input.nextLine());}while(cantJugadores<2);/*validamos ingreso*/
		
		/*while para la cantidad de participantes*/
		while(vueltas<cantJugadores)
		{
			System.out.println("Ingrese el nombre del jugador");
			nombre=input.nextLine();
			
			/*colocamos un for para los 3 disparos por participante*/
			for(int i=0;i<3;i++)
			{
				
				
				System.out.println("Realice el disparo - Ingrese distancia al centro");
				distanciaCentro=Integer.parseInt(input.nextLine());
				
				/*anidamos if para saber cuantos puntos suma por disparo*/
				
				if(distanciaCentro!=0)
				{
					if (distanciaCentro<=10)
					{puntos=250;}
					else
					{
						if(distanciaCentro>11 && distanciaCentro<50)
						{puntos=100;}
						else
						{System.out.println("Disparo fuera de tablero");}
					}
				}
				
				else
					{puntos=500;
					tiroCentro++;}
				
				
				sumaPuntos+=puntos;
			
			}/*aca termina el for*/
			
			/*realizamos un if para saber si la suma del jugador es el mayor puntaje y asignar valores*/
			if (sumaPuntos>mayorPuntos)
			{	mayorPuntos=sumaPuntos;
				nombreMayor=nombre;}
			vueltas++;
			sumaPuntos=0;
			
			
		}/*aca termina el while*/
		
		/*Sascamos por pantalla lo pedido en el enunciado*/
		
		
		System.out.println("El ganador del torneo es "+nombreMayor+ " con "+mayorPuntos+" puntos.");
		
		System.out.println("La cantidad de tiros al centro total es de "+tiroCentro);
		
		
		
		
		input.close();

	}

}
