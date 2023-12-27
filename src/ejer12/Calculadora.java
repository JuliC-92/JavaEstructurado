package ejer12;

public class Calculadora {
	
	public int sumar(int nrA, int nrB) {
	 return nrA + nrB;
	}
	
	public int resta(int nrA, int nrB) {
		return nrA - nrB;
	}

	public int multiplicacion(int nrA, int nrB) {
		return nrA * nrB;
	}
	
	public int dividir (int nrA, int nrB) {
		if (nrB==0) {return 0;
		}else {return nrA/nrB;}
		}
			
	}
