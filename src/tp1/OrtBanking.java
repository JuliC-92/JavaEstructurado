package tp1;

import java.util.Scanner;

public class OrtBanking {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		
	final int PRESTAMOA=100000, PRESTAMOB=500000, PRESTAMOC=1000000;
	
	boolean usuarioCorrecto = true;
	boolean contraCorrecta= true;
		
	long usuario=0, usuarioIngresado=0;
	int montoARetirar=0, saldo=5000, intentos=0;
	int montoADepositar=0, montoATransferir=0,contrasena=0;
	int contrasenaIngresada=0;
	
	String alias="", prestamo="", opcion="";
	
	/* Creacion de usuario y contraseña */
	
	
	/*validamos usuario creado*/
	do
		{System.out.println("Bienvenido a OrtBanking - Cree su usuario(dni)");
		usuario=Long.parseLong(input.nextLine());
		}while(usuario<1000000 || usuario>99999999);
		
	/*validamos contraseña creada*/		
	do 
		{System.out.println("Cree su contraseña (4 numeros)");
		contrasena=Integer.parseInt(input.nextLine());}	
		while(contrasena<0 || contrasena>9999);
	
	/* Acceso al sistema con usuario y contraseña (lo validamos)*/
	
	do {
		System.out.println("Ingrese su usuario (dni)");
		usuarioIngresado=Long.parseLong(input.nextLine());
		System.out.println("Ingrese su contraseña (4 digitos)");
		contrasenaIngresada=Integer.parseInt(input.nextLine());
		usuarioCorrecto =( usuario==usuarioIngresado);
		contraCorrecta= (contrasena==contrasenaIngresada);
		intentos++;
	}while((!contraCorrecta || !usuarioCorrecto) && intentos<5);
	
	
	
	/* Corroboramos ingreso correcto o bloqueo*/
	
	if (intentos<5)
	{
		/* Validacion de ingreso de opciones*/
		do {
			System.out.println("Coloque la letra correspondiente a una de las opciones:");
			System.out.println("A) Retirar dinero");
			System.out.println("B) Depositar dinero");
			System.out.println("C) Consultar saldo actual");
			System.out.println("D) Pedir prestamos");
			System.out.println("E) Transferir dinero");
			System.out.println("F) Salir");
			opcion=input.nextLine();
		}while(!opcion.equalsIgnoreCase("a") && !opcion.equalsIgnoreCase("a") && !opcion.equalsIgnoreCase("b") && !opcion.equalsIgnoreCase("c") && !opcion.equalsIgnoreCase("d") && !opcion.equalsIgnoreCase("e") && !opcion.equalsIgnoreCase("f"));
		
	
		while(!opcion.equalsIgnoreCase("f")){
		
		/* Definimos acciones para cada opcion*/	
		switch (opcion)
		{
		case "a":
			/* Validamos que ingrese un monto a retirar positivo */
			do {
			System.out.println("Ingrese un monto positivo");
			montoARetirar=Integer.parseInt(input.nextLine());
			}while(montoARetirar<=0);
			
			/*Verificamos si cuenta con ese monto para retirar ese saldo*/
			if (montoARetirar<saldo)
			{saldo=saldo-montoARetirar;
			System.out.println("Saldo disponible $"+saldo);}
			else
			{System.out.println("Error, no posee saldo suficiente");}
			break;/* Aca temrina caso A */
		
		case "b":	
			/*Validamos que ingrese un monto posiivo a depositar*/
			do {
				System.out.println("Ingrese monto a depositar (debe ser positivo)");
				montoADepositar=Integer.parseInt(input.nextLine());
			}while(montoADepositar<=0);
			saldo= saldo+montoADepositar;
			System.out.println("Saldo desponible es $"+saldo);
			break;/* Aca termina caso B*/
		
		case "c":	
			System.out.println("Saldo disponibles $"+saldo);
			break;/* Aca termina caso C */
		
		case "d":
			/* Validamos si tiene saldo suficiente para pedir prestamo*/
			if(saldo>0)
			{/*validamos que ingrese una opcion valida de prestamo*/
			do {
				System.out.println("Ingrese una opcion de solicitar:");
				System.out.println("A) $100000");
				System.out.println("B) $500000");
				System.out.println("C) $1000000");
				prestamo=input.nextLine();
			}while(!prestamo.equalsIgnoreCase("a") && !prestamo.equalsIgnoreCase("b") && !prestamo.equalsIgnoreCase("c"));	
				
			switch (prestamo) {
			case "a":
				System.out.println("Se ha solicitado tu prestamo de $"+PRESTAMOA);
				break;
			case "b":
				System.out.println("Se ha solicitado tu prestamos de $"+PRESTAMOB);
				break;
			case "c":
				System.out.println("Se ha solicitado tu prestamos de $"+PRESTAMOC);
			}/*termina switch de D*/
			
			} /*aca termina if de case D*/
			else
			{System.out.println("No esta habilitado para solicitar prestamos");}
			
			break;/* Aca termina caso D*/
			
		case "e":
			/*Validamos si puede realizar trasnferencias*/
			if(saldo<10000)
			{System.out.println("Usted no puede realizar trasnferencias");}
			else {
				/* validamos alias ingresado */
				do {
					System.out.println("Ingrese el alias");
					alias=input.nextLine();
				}while(alias.equalsIgnoreCase(""));
				
				/*Validamos que monto a trasnferir sea positivo*/
				do {
					System.out.println("Ingrese monto a trasnferir");
					montoATransferir=Integer.parseInt(input.nextLine());
				}while(montoATransferir<=0);
			
				
				/*validamos q tenga saldo suficiente*/
				if(montoATransferir<saldo)
				{saldo=saldo-montoATransferir;
				System.out.println("Trasnferencia exitosa a "+alias+" de $"+montoATransferir);}
				else
				{System.out.println("Usted no posee monto para realizar la trasnferencia");}
			}
			
			break;/* Aca termina caso E*/
			
				}/* Aca temrina switch de opciones*/
		do {
			System.out.println("Coloque la letra correspondiente a una de las opciones:");
			System.out.println("A) Retirar dinero");
			System.out.println("B) Depositar dinero");
			System.out.println("C) Consultar saldo actual");
			System.out.println("D) Pedir prestamos");
			System.out.println("E) Transferir dinero");
			System.out.println("F) Salir");
			opcion=input.nextLine();
		}while(!opcion.equalsIgnoreCase("a") && !opcion.equalsIgnoreCase("a") && !opcion.equalsIgnoreCase("b") && !opcion.equalsIgnoreCase("c") && !opcion.equalsIgnoreCase("d") && !opcion.equalsIgnoreCase("e") && !opcion.equalsIgnoreCase("f"));
		
			}/*aca termina el while */
		
		}/*Aca termina el IF principal*/
	else
	{System.out.println("Se le ha boquedo ingreso al cajero contacte un asesor en linea");}
	
	
	
	
		
		input.close();

	}

}
