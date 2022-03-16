package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crear una pequeña lista con los datos personales de algunas personas, y mostrarla por pantalla de
		 * forma NO ordenada y de forma ordenada (elegid la forma de ordenar vosotros, podéis empezar con
		 * orden natural, es decir, alfabéticamente y después crear otra “no natural”).
		 */
		
		int salir=0, opcion=0;
		String dni, nombre, apellidos, telefono, email;
		
		List<Contacto> listado = new ArrayList <Contacto> ();
		
		Contacto c1 = new Contacto ("11111111Q", "Roge", "Mohigefer Barrera", "680680680", "roge@hotmail.com");
		Contacto c2 = new Contacto ("11111111A", "Carlota", "Moreno Rosendo", "695195195", "carlota@hotmail.com");
		Contacto c3 = new Contacto ("99999999X", "Rodrigo", "Martín Villalobos", "635735735", "rodrigo@hotmail.com");
		Contacto c4 = new Contacto ("66666666R", "Pepe", "Cabezas Merino", "654654654", "pepe@hotmail.com");
		Contacto c5 = new Contacto ("33333333N", "Paco", "Moreno Aguilar", "612312312", "paco@hotmail.com");
	
		listado.add(c1);
		listado.add(c2);
		listado.add(c3);
		listado.add(c4);
		listado.add(c5);
		
		CrudAgenda a = new CrudAgenda (listado);
		
		imprimirBienvenida();
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				imprimirDespedida();
				break;
			case 1:
				System.out.println("\t\t\n=====PROCESO DE AÑADIR=====");
				System.out.print("Diga el dni del nuevo contacto: ");
				dni=Leer.dato();
				System.out.print("Diga el nombre del nuevo contacto: ");
				nombre=Leer.dato();
				System.out.print("Diga los apellidos del nuevo contacto: ");
				apellidos=Leer.dato();
				System.out.println("Diga el teléfono del nuevo contacto: ");
				telefono=Leer.dato();
				System.out.print("Diga el email del nuevo contacto: ");
				email=Leer.dato();
				Contacto c = new Contacto (dni, nombre, apellidos, telefono, email);
				a.annadir(c);
			case 2:
				System.out.println("\n\t\t =====LISTADO EN BRUTO=====");
				a.mostrarListado();
				break;
			case 3:
				System.out.println("\n\t\t =====LISTADO ORDENADO NOMBRE=====");
				a.mostrarOrdenNatural(listado);
				break;
			case 4:
				System.out.println("\n\t\t =====LISTADO ORDENADO TELEFONO=====");
				a.mostrarOrdenArtificial(listado);
				break;
			case 5:
				System.out.println("\n\t\t =====LISTADO ORDENADO DNI Inverso=====");
				a.mostrarOrdenDNIinverso(listado);
				break;
			default:
				System.out.println("\t\t***ERROR, elija una opción válida");
			}
		}while (opcion!=salir);
		

	}
	
	// Helpers
	
	public static void imprimirBienvenida () {
		System.out.println("\t\t=====BIENVENIDO AL PROGRAMA=====");
	}
	
	public static void imprimirDespedida () {
		System.out.println("\t\t=====HASTA PRONTO=====");
	}
	
	public static void imprimirMenu () {
		System.out.print("\nElija una opción entre las siguientes: "
				+ "\n0. Salir"
				+ "\n1. Añadir un nuevo contacto"
				+ "\n2. Mostrar listado en bruto"
				+ "\n3. Mostrar listado ordenado por nombre"
				+ "\n4. Mostrar listado ordenado por teléfono"
				+ "\n5. Mostrar listado ordenado por DNI inverso"
				+ "\nRespuesta: ");
	}

}
