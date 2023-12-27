package tp1;

import java.util.Scanner;

public class ej19 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean esDeUnSoloDigito=false, esImpar=false, estaEnAmbosGrupos=true, noEstaEnNingunGrupo=false; 
		int num=0;
		
		System.out.println("Ingrese un numero entero");
		
		num=Integer.parseInt(input.nextLine());
		
		esDeUnSoloDigito = num<10;
		
		esImpar = (num%2)!=0;
		
		estaEnAmbosGrupos= esImpar==true && esDeUnSoloDigito==true;
		
		noEstaEnNingunGrupo = esImpar==false && esDeUnSoloDigito==false;
		
		if (estaEnAmbosGrupos)
		{
			System.out.println(num+ " Esta en ambos grupos");
		}
		else
		{
			if(noEstaEnNingunGrupo)
			{
				System.out.println(num+" No esta en ningun grupo");
			}
			else
			{
				System.out.println(num+" Esta solo en un grupo");
			}
		}
		
		
		input.close();
	}

}
