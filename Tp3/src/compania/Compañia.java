package compania;

import java.util.ArrayList;

public class Compañia {
	
	private String nombre;
	
	private ArrayList <Area> areas;
	
	public Compañia (String nombre) {
		this.nombre=nombre;
		this.areas = new ArrayList<>();
	}
	

	public void importarArea(Area areaASumar) {
		areas.add(areaASumar);
	}


	@Override
	public String toString() {
		return "Compañia [nombre=" + nombre + ", areas=" + areas + "]";
	}
	
	
	
}
