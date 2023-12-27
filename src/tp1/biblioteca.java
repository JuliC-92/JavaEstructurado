package tp1;

import java.util.Scanner;

public class biblioteca {
	
	static Scanner	input = new Scanner(System.in);

	public static void main(String[] args) {

		String estante="", nombreLibro="",genero="",libroMax="";
		int	cantLibros=0,vueltaLibro=0,cantPaginas=0,maxPaginas=0,totalLibros=0;
		int cantH=0,cantI=0,cantN=0,cantEstantes=0,promedioLE=0;
		
		do {
			System.out.println("Ingrese letra del estante - Z para finalizar");
			estante=input.nextLine();
		}while (estante.isEmpty());
		
		
		
		while (!estante.equalsIgnoreCase("Z"))
		{
			cantEstantes++;
			
			do {
				System.out.println("Ingrese cantidad de libros - mayor a 0");
				cantLibros=Integer.parseInt(input.nextLine());
			}while(cantLibros<=0);
			
			totalLibros+=cantLibros;
			
			while(vueltaLibro<cantLibros){
				
				vueltaLibro++;
				
				do {
					System.out.println("Ingrese nombre del libro");
					nombreLibro=input.nextLine();
				}while(nombreLibro.equalsIgnoreCase(""));
				
				
				do {
					System.out.println("Ingrese genero de libro - solo I,H o N");
					genero=input.nextLine();
				}while(!genero.equalsIgnoreCase("I") && !genero.equalsIgnoreCase("n") &&!genero.equalsIgnoreCase("H"));
				
				
				do {System.out.println("Ingrese de paginas");
					cantPaginas=Integer.parseInt(input.nextLine());
				}while(cantPaginas<=0);
				
				if(cantPaginas>maxPaginas) {
					libroMax=nombreLibro;
					maxPaginas=cantPaginas;
				}
				
				switch(genero) {
				case "i":
					cantI++;
					break;
				case "n":
					cantN++;
					break;
				case "h":
					cantH++;
					break;
					
					
				}/*finaliza switch*/
				
				
				}/*finaliza while de libro*/
			
			do {
				System.out.println("Ingrese letra del estante - Z para finalizar");
				estante=input.nextLine();
			}while (estante.isEmpty());
			
		}/*Finaliza while de estante*/
		
		if (cantEstantes>0)
		{
			promedioLE= totalLibros/cantEstantes;
			System.out.println("En promedio hay "+promedioLE+" de libros por estantes");
	
			System.out.println("Se ingresaron "+cantI+" de infantiles "+cantH+" de historia "+" y "+cantN+" de novelas");
			
			System.out.println("El libro que mas paginas tienes es "+libroMax+" con "+maxPaginas+" de paginas");
		}else {
			System.out.println("No se ingresaron datos");
		}
		
		
		input.close();
	}

}
