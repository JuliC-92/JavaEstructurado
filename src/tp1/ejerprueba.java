package tp1;

import java.util.Scanner;

public class ejerprueba {
	
	
	static Scanner input=new Scanner (System.in);

	public static void main(String[] args) {
		
		double  sueldo=0, antiguedad=0,sueldoFinal=0;
		int diaVaca=0,cantEmpleado=0;
		
		String nombre="",nombreMayorSueldo="", nombreMasAntiguo="",categoria="";
		
		double mayorSueldo=0,masAntiguo=0;
		
		System.out.println("Ingrese el nombre del empleado - Fin para finalizar");
		
		nombre=input.nextLine();
		
		/* Comienza nuestro ciclo principal*/
		
		while(!nombre.equalsIgnoreCase("Fin"))
		{
			cantEmpleado++;
			diaVaca=0;
			sueldo=0;
			
			do {
				System.out.println("Ingrese la categoria del empleado - A, B o C");
				categoria=input.nextLine();
			}while(!categoria.equalsIgnoreCase("A") && !categoria.equalsIgnoreCase("B") && !categoria.equalsIgnoreCase("C") );
			/*estamos validando ingreso de categoria valida*/
			
			switch (categoria) {
			case "a":
				sueldo+=20000;
				break;
			case"b":
				sueldo+=30000;
				break;
			case "c":
				sueldo+=40000;
				break;
				}
			/* aca termina eleccion de categoira */
			
			
			do {
			System.out.println("Ingrese la antiguedad");
			antiguedad=Integer.parseInt(input.nextLine());
			}while(antiguedad>50 || antiguedad<0);
			/* Validacion de antiguedad*/
			
			
			
			/* Anidamos ifs para poder sacar la cantidad de dias de vacaciones q corresponde*/
			if (antiguedad<5)
			{ diaVaca=14;}
			else
			{ if(antiguedad<10)
				{diaVaca=21;}
			else
			{diaVaca=28;}
			}
			
			/* Calculamos sueldo total */
			
			sueldoFinal= ((sueldo/30)*(30-diaVaca)+(sueldo/25)*diaVaca);
			
			System.out.println("El sueldo de "+nombre+" es de $ "+sueldoFinal);
			
			/* Vamos a calcular los mayotes */
			
			if(sueldoFinal>mayorSueldo)
			{nombreMayorSueldo=nombre;
			mayorSueldo=sueldoFinal;}
			
			if(antiguedad>masAntiguo)
			{nombreMasAntiguo=nombre;
			masAntiguo=antiguedad;}
			
			System.out.println("Ingrese nombre del empleado");
			nombre=input.nextLine();
			
			
		}
		/* Finaliza ciclo principal*/
		
		
		/* validamos que por lo menos haya ingresado una vez al siclo */
		
		if(cantEmpleado>0)
		{
			System.out.println("La cantidad de empleados es "+cantEmpleado);
			System.out.println("El empleado de mayor sueldo es "+nombreMayorSueldo);
			System.out.println("El empleado mas antiguo es "+nombreMasAntiguo);
		}
		else
		{System.out.println("No ingreso nignun empleado");}
		
		
		
		
		input.close();
	}

}
