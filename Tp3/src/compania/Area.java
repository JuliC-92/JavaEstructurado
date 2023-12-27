package compania;

import java.util.ArrayList;

public class Area {

	private String nombre;
	
	private ArrayList <Oficina> oficinas;

	
	public Area(String nombre) {
		this.nombre=nombre;
		this.oficinas = new ArrayList<>();
	}/*Constructor*/
	
	private Oficina buscarOficina (String oficinaBuscada) {
		Oficina oficinaEncontrada= null;
		Oficina oficinaActual=null;
		int i=0;
		while(i<this.oficinas.size() && oficinaEncontrada==null) {
			oficinaActual = this.oficinas.get(i);
			if (oficinaActual.getNombre()==oficinaBuscada) {
				oficinaEncontrada=oficinaActual;
			}else i++;}
		return oficinaEncontrada;}
	
	
	
	public void mostrarOficina (String oficinaAMostrar) {
		for (int i=0 ; i<this.oficinas.size(); i++) {
			System.out.println(this.oficinas.get(i));}}
	
	
	
	public boolean agregarEmpleado(String nombre, String dni, String domicilio, String oficinaAAgregar) {
		boolean sePudoAgregar = false;
		Oficina oficinaNueva = this.buscarOficina(oficinaAAgregar);
		if (oficinaNueva!=null) {
			Empleado empleadoASumar = oficinaNueva.buscarEmpleado(dni);
			if(empleadoASumar==null)
			{oficinaNueva.agregarEmpleado(nombre, dni, domicilio);
			sePudoAgregar=true;
			}else System.out.println("El empleado ya existe");}
		else System.out.println("No existe oficina");
		return sePudoAgregar;
	}

	public void mostrarOficina () {
		for (Oficina oficinaActual : this.oficinas) {
			System.out.println(oficinaActual.toString());
		}
	}
	
	public boolean crearOficina (String nombre) {
		boolean sePudoCrear = false;
		Oficina oficinaNueva = this.buscarOficina(nombre);
		if (oficinaNueva==null) {
			oficinaNueva= new Oficina(nombre);
			oficinas.add(oficinaNueva);
		}else System.out.println("Oficina existente");
		return sePudoCrear;
	}

	@Override
	public String toString() {
		return "Area [nombre=" + nombre + ", oficinas=" + oficinas + "]";
	}
	
	
	
	

	
	
	
	
}/*termina clase area*/
