package tp1;

import java.util.Scanner;

public class ej36 {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int promedio=0, num=0, cantNum=0,sumaNum=0;
		
		
		do {
			System.out.println("Ingrese un numero");
			
			num=Integer.parseInt(input.nextLine());
			
			cantNum++;
			
			sumaNum+=num;
			
			promedio= sumaNum/cantNum;
			
		}while(promedio<20);
		
		System.out.println("Se ingresaron "+cantNum+" de nuemeros");
		
		
		
		
		input.close();
	}

}
