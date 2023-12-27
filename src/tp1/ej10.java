package tp1;

import java.util.Scanner;

public class ej10 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre1="",nombre2="",nombre3="";
		
		double cap1=0,cap2=0,cap3=0,capTotal=0;
		
		double porc1=0, porc2=0, porc3=0;
		
		System.out.println("Ingrese el nombre y el capital aportado del primer socio");
		
		nombre1= input.nextLine();
		
		cap1 = Double.parseDouble(input.nextLine());
		
		
		System.out.println("Ingrese el nombre y el capital aportado del segundo socio");
		
		nombre2= input.nextLine();
		
		cap2 = Double.parseDouble(input.nextLine());
		
		
		System.out.println("Ingrese el nombre y el capital aportado del tercer socio");
		
		nombre3= input.nextLine();
		
		cap3 = Double.parseDouble(input.nextLine());
		
		capTotal=cap1+cap2+cap3;
		
		porc1 = (100*cap1)/capTotal;
		
		porc2 = (100*cap2)/capTotal;
		
		porc3 = (100*cap3)/capTotal;
		
		System.out.println("El socio "+nombre1+ " aporto el "+porc1+ " % del total");
		
		System.out.println("El socio "+nombre2+ " aporto el "+porc2+ " % del total");
		
		System.out.println("El socio "+nombre3+ " aporto el "+porc3+ " % del total");
		
		
		input.close();

	}

}
