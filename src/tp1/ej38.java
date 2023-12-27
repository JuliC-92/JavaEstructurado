package tp1;

import java.util.Scanner;

public class ej38 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean CORRECTO=true;
	final String USUARIO = "admin";
	final String CONTRASENA= "123456";
	
	String usuarioIngresado = "", contraIngresada ="";
	int intentos=0;
	boolean usuarioCorrecto = false;
	boolean contraCorrecta= false;
	
	do {
		System.out.println("Ingrese usuario");
		
		usuarioIngresado = input.nextLine().toUpperCase();
		
		System.out.println("Ingrese contrasena");
		
		contraIngresada = input.nextLine().toUpperCase();
		
		intentos++;
		
		usuarioCorrecto =USUARIO.equalsIgnoreCase(usuarioIngresado);
		
		contraCorrecta= CONTRASENA.equalsIgnoreCase(contraIngresada);
		
	}while ((!contraCorrecta || !usuarioCorrecto) && intentos<3);
	
	CORRECTO= (USUARIO.equalsIgnoreCase(usuarioIngresado)) && (CONTRASENA.equalsIgnoreCase(contraIngresada));
	
	if (CORRECTO)
		System.out.println("Bienvenido");

	else
		System.out.println("Acceso denegado");
	
	
		
	input.close();

	}

}
