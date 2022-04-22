package ejercicio01;

import java.util.Scanner;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;
	Scanner sc = new Scanner (System.in);
	
	public void LeerDatosPersonales () {
		String aux;
		System.out.println("Diga su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Diga sus apellidos: ");
		apellidos = sc.nextLine();
		System.out.println("Diga su DNI: ");
		dni = sc.nextLine();
		System.out.println("Diga su edad: ");
		aux = sc.nextLine();
		edad = Integer.parseInt(aux);
		
	}

}
