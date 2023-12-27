package compania;

public class Domicilio {

	private String calle;
	
	private int altura;


	private int getAltura() {
		return altura;
	}

	private void setAltura(int altura) {
		this.altura = altura;
	}

	private String getCalle() {
		return calle;
	}

	private void setCalle(String calle) {
		this.calle = calle;
	}

	
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", altura=" + altura + "]";
	}

	public Domicilio (String calle, int altura) {}
	
	
	
	
}
