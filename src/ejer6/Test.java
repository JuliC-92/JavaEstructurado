package ejer6;

public class Test {

	public static void main(String[] args) {
		Dado dado1 = new Dado();
		Dado dado2= new Dado();
		double promedio=0;
	
		
	for(int i=0; i<100;i++) {
	dado1.tirarDados();
	dado2.tirarDados();
	
	
	if(dado1.getValor()==dado2.getValor()) {
		System.out.println("El valor de los dados es el mismo "+ dado1.getValor());
	}
	else if (dado1.getValor() > dado2.getValor()) {
        System.out.println("el dado 1 es mas grande que el dado 2; y su valor es " + dado1.getValor());
    } else {
        System.out.println("el dado 2 es mas grande que el dado 1; y su valor es " + dado2.getValor());
    }
	
	promedio= promedio+dado2.getValor()+dado1.getValor();
	}
	
	System.out.println("El promedio de tirada de dados es "+(promedio/100));
	
	
	}
	
}
