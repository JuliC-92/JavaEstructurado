package tp1;

import java.util.Scanner;

public class CasinoOrt2 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {

		final int RULETA=100;
		final int POKER=500;
		final int BLACKJACK=200;
		
		String nombre="",juego="";
		
		int dineroInicial=0,billetera=0,cantRul=0, porcBjk=0,porcPkr=0; 
		int cantPkr=0, cantBjk=0, juegosTotales=0,porcRul=0, opcion=0;
		
		
		
		do {
			System.out.println("Ingrese nombre del jugador");
			nombre=input.nextLine();
		}while(nombre.isEmpty()); /*Validacion nombre*/
		
		
		
		do {
			System.out.println("Ingrese monto inicial - minimo $500 y tope $5000");
			dineroInicial=Integer.parseInt(input.nextLine());
			if (dineroInicial>5000 || dineroInicial<500) {
				System.out.println("Monto invalido");}
		}while(dineroInicial>5000 || dineroInicial<500); /*Validacion dinero incial*/
		
		billetera = dineroInicial;
		
		
		
		while(billetera>(dineroInicial * 0.2) && billetera>RULETA && billetera<5000) {
			
			do {
			System.out.println("¿Que juego desea jugar? - RUL (Ruleta) / BJK (BlackJack) / PKR (Poker)");
			juego=input.nextLine();
			}while(!juego.equalsIgnoreCase("Rul")&& !juego.equalsIgnoreCase("Pkr") && !juego.equalsIgnoreCase("Bjk"));
			
			switch (juego) {
			
			
			
			case "rul":
				if (billetera>RULETA)
				{ cantRul++;
				billetera-=RULETA;
				do {
					System.out.println("Elija un numero 0/1/2");
					opcion=Integer.parseInt(input.nextLine());
				}while(opcion!=0 && opcion !=1 && opcion!=2);	
				switch(opcion) {
				case 1:
					billetera+=RULETA;
					break;
				case 2:
					billetera+=(RULETA*2);
					break;
				case 0:
					System.out.println("Perdiste");
					break;}
				System.out.println("Dinero disponible $"+billetera);} /* termina if ruleta */
				else {System.out.println("No alcanza dinero para este juego");}/* termina else de ruleta*/
				break; /* break de Ruleta*/
			
				
				
				
				
			case "bjk":
				if (billetera>BLACKJACK)
				{ cantBjk++;
				billetera-=BLACKJACK;
				do {
					System.out.println("Elija un numero 0/1/2");
					opcion=Integer.parseInt(input.nextLine());
				}while(opcion!=0 && opcion !=1 && opcion!=2);
				switch(opcion) {
				case 1:
					billetera+=BLACKJACK;
					break;
				case 2:
					billetera+=(BLACKJACK*2);
					break;
				case 0:
					System.out.println("Perdiste");
					break;}
				System.out.println("Dinero disponible $"+billetera);} /* termina if blackJack */
				else {System.out.println("No alcanza dinero para este juego");}/* termina else de blackJack*/
				break; /* break de blackJack*/
				
				
				
				
			case "pkr":
				if (billetera>POKER)
				{ cantPkr++;
				billetera-=POKER;
				do {
					System.out.println("Elija un numero 0/1/2");
					opcion=Integer.parseInt(input.nextLine());
				}while(opcion!=0 && opcion !=1 && opcion!=2);
				
				switch(opcion) {
				case 1:
					billetera+=POKER;
					break;
				case 2:
					billetera+=(POKER*2);
					break;
				case 0:
					System.out.println("Perdiste");
					break;}
				System.out.println("Dinero disponible $"+billetera);} /* termina if poker */
				else {System.out.println("No alcanza dinero para este juego");}/* termina else de poker*/
				break; /* break de poker*/
				
			} /* Aca temrina switch*/
			
		} /* Aca termina while principal */
		
		juegosTotales = cantBjk+cantRul+cantPkr;
		porcRul = (cantRul*100)/juegosTotales;
		porcBjk = (cantBjk*100)/juegosTotales;
		porcPkr = (cantPkr*100)/juegosTotales;
		
		System.out.println("Jugo un "+porcPkr+" % al poker un "+porcRul+" % a la ruleta y un "+porcBjk+" % el blackjack");
		System.out.println("Jugo a la ruleta "+cantRul+" veces jugo al blackjack "+cantBjk+" veces jugo al poker"+cantPkr+" veces");
		System.out.println("El dinero restante es $"+billetera);
		
		
		input.close();
	}

}
