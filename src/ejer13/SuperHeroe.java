package ejer13;

public class SuperHeroe {
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superPoderes;
	
	
	public SuperHeroe (String nombre, int fuerza, int resistencia, int superPoderes) {
		this.setNombre(nombre);
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setSuperPoderes(superPoderes);
	
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setFuerza(int fuerza) {
		if(fuerza<=100 && fuerza>=0){
		this.fuerza = fuerza;}
		else {if(fuerza>100){this.fuerza=100;}
		else {if(fuerza<0) {this.fuerza=0;}}}
	}
	private void setResistencia(int resistencia) {
		if(resistencia<=100 && resistencia>=0){
			this.resistencia = resistencia;}
			else {if(resistencia >100){this.resistencia =100;}
			else {if(resistencia<0) {this.resistencia=0;}}}
	}
	private void setSuperPoderes(int superPoderes) {
		if(superPoderes<=100 && superPoderes>=0){
			this.superPoderes = superPoderes;}
			else {if(superPoderes >100){this.superPoderes =100;}
			else {if(superPoderes<0) {this.superPoderes=0;}}}
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	private int getFuerza() {
		return fuerza;
	}

	private int getResistencia() {
		return resistencia;
	}

	private int getSuperPoderes() {
		return superPoderes;
	}

	public Resultado competir (SuperHeroe rival) {
		String ganador = null;
		int puntosHeroe=0, puntosRival=0;
		if(this.resistencia > rival.getResistencia()){
			puntosHeroe++;
		}else {if(this.resistencia<rival.getResistencia()) {puntosRival++;}}
		
		if(this.fuerza > rival.getFuerza()){
			puntosHeroe++;
		}else {if(this.fuerza<rival.getFuerza()) {puntosRival++;}}
		
		if(this.superPoderes > rival.getSuperPoderes()){
			puntosHeroe++;
		}else {if(this.superPoderes<rival.getSuperPoderes()) {puntosRival++;} }
		
		Resultado quienGano;
		
		if (puntosHeroe > puntosRival) {
			ganador = this.getNombre();
			quienGano = Resultado.GANADOR;
		}else {if(puntosHeroe<puntosRival) {
			quienGano = Resultado.PERDEDOR;
			ganador = rival.getNombre()+ " Gano, sos un ";
		}else {quienGano= Resultado.EMPATE;
			ganador = "Tienen el mismo Poder";}}
		System.out.print(ganador+" ");
		return quienGano;
	}

	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superPoderes=" + superPoderes + "]";
	}
	
	
	
	
	
	

}
