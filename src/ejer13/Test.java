package ejer13;

public class Test {

	public static void main(String[] args) {
		
		SuperHeroe superMan = new SuperHeroe("SuperMan",80,57,45);
		
		SuperHeroe spiderman = new SuperHeroe("SpiderMan",70,57,45);
		
		System.out.println("Hoy pelea "+spiderman.getNombre()+ " Vs "+superMan.getNombre());
		System.out.println("");
		System.out.println("En la esquina roja esta el "+spiderman);
		System.out.println("");
		System.out.println("En la esquina azul esta el "+superMan);
		
		
		System.out.println(superMan.competir(spiderman));
		
		;
	}

}
