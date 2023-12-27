package compania;

import java.util.ArrayList;

public class Oficina {

	private String nombre;
	
	private ArrayList <Empleado> empleados;
	
	public Oficina (String nombre) {
		this.nombre= nombre;
		this.empleados= new ArrayList<>();
	}
	
	public Empleado buscarEmpleado (String dniBuscado) {
		Empleado empleadoBuscado= null;
		Empleado empleadoActual= null;
		int i=0;
		while(i<this.empleados.size() && empleadoBuscado==null) {
			empleadoActual = this.empleados.get(i);
			if(empleadoActual.getDni()==dniBuscado) 
			{empleadoBuscado= empleadoActual;}
			else {i++;}}
		return empleadoBuscado;}
	
	public void mostrarEmpleado(String dni) {
		Empleado empleadoBuscado=null;
		empleadoBuscado= this.buscarEmpleado(dni);
		if (empleadoBuscado!=null) {
			System.out.println(empleadoBuscado);
		}
		else {System.out.println("El empleado no existe");}}
	
	public boolean agregarEmpleado(String nombre, String dni, String domicilio) {
		boolean pudoAgregar= false;
		Empleado empleadoNuevo = this.buscarEmpleado(dni);
		if (empleadoNuevo==null) {
			Empleado empleadoAAgregar = new Empleado(nombre,dni,domicilio);
			this.empleados.add(empleadoAAgregar);
			pudoAgregar=true;}
				return pudoAgregar;}
	
	public boolean eliminarPersona(String dni) {
		boolean sePudoEliminar=false;
		Empleado empleadoAEliminar = this.buscarEmpleado(dni);
		if (empleadoAEliminar != null) {
			empleados.remove(empleadoAEliminar);
			sePudoEliminar = true;
			System.out.println("Se elimino el empleado de la lista");}
		return sePudoEliminar;}
	
	public void mostrarEmpleados () {
		for (Empleado empleadoActual : this.empleados) {
			System.out.println(empleadoActual.toString());
		}
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Oficina [nombre=" + nombre + ", empleados=" + empleados + "]";
	}
	
	
	
}
