package ejer6;

public class Dado {
	
	private int valor;

	public Dado() {	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int tirarDados() {
		valor = (int)(Math.random() * 6);
		return valor;
	}

	@Override
	public String toString() {
		return "Dado [valor=" + valor + "]";
	}
	
	
	

}
