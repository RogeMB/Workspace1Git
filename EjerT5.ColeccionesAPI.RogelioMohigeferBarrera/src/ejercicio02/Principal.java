package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un programa para gestionar los socios de un club de Campo “de categoría”. Se debe poder
		 * guardar Socios con sus datos personales, buscarlos, mostrar sus datos, modificarlos y borrarlos. Usar
		 * la clase ArrayList. Este ejercicio es para empezar, así que no es necesario hacer nada más, aunque se
		 * podrían agregar funcionalidades como alquilar pistas, pagar cuotas, etc. (¡Para aburridos!).
		 * Debemos usar la clase Socio, la clase gestión Club y la principal como mínimo.
		 */
		
		double cuota=0.0, cuotaPremium=0.0, descuentoMenores, descuentoAncianos, descuentoPremium;
		int edad=0, id=0, opcion=0, salir=0, minimoMiembros=0, cantidadNuevos=0, eleccion=0;
		String nombre, apellidos;
		Gestion g;
		Socio s;
		
		
		List <Socio> listado = new ArrayList <Socio> ();
		
		g = new Gestion (listado);
	
		imprimirBienvenido();
		System.out.print("Antes de empezar, determine la cuota base para cualquier socio: ");
		cuota=Leer.datoDouble();
		System.out.print("Ahora determine la cuota para socios Premium: ");
		cuotaPremium=Leer.datoDouble();
		System.out.print("Ahora determine el mínimo de miembros nuevos que debe traer el socio premium"
				+ " para aplicar un descuento: ");
		minimoMiembros=Leer.datoInt();
		System.out.print("Ahora determine el porcentaje de descuento para menores de 18 años: ");
		descuentoMenores=Leer.datoDouble();
		System.out.print("Ahora determine el porcentaje de descuento para mayores de 70 años: ");
		descuentoAncianos=Leer.datoDouble();
		System.out.print("Ahora determine el porcentaje de descuento para socios premiums que traigan consigo "
				+ "al menos " +minimoMiembros +" nuevos miembros: ");
		descuentoPremium=Leer.datoDouble();
		
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 0:
				imprimirDespedida();
				break;
			case 1:
				System.out.print("\n\tInicio proceso de alta.");
				id=g.generarID();
				System.out.print("Diga el nombre del nuevo socio: ");
				nombre=Leer.dato();
				System.out.print("Bien, ahora diga los apellidos del nuevo socio: ");
				apellidos=Leer.dato();
				System.out.print("Bien, ahora diga la edad del socio: ");
				edad=Leer.datoInt();
				System.out.println("Bien, ahora diga cuántos nuevos socios ha traído consigo: ");
				cantidadNuevos=Leer.datoInt();
				System.out.print("Bien, ahora pulse 1 o 2 según la categoría quiere pagar entre las siguientes:"
						+ " \n\t1. Socio: " + cuota + "\n\t2. Socio Premium: "+ cuotaPremium + "\nRespuesta: ");
				eleccion=Leer.datoInt();
				if(eleccion==1) {
					s = new Socio (id, nombre, apellidos, edad, cuota, true);
					g.annadirSocio(s);
				}else{
					s = new SocioPremium (id, nombre, apellidos, edad, cuotaPremium, true, cantidadNuevos);
					g.annadirSocio(s);
				}
				System.out.println("\n\t***PROCESO DE ALTA CORRECTO***");
				break;
			case 2:
				System.out.print("\nInicio proceso de búsqueda. Diga el id del socio: ");
				id=Leer.datoInt();
				g.buscarSocio(listado.get(id).getId());
				break;
			case 3:
				System.out.print("\n\tInicio proceso de edición. Diga el id del socio: ");
				id=Leer.datoInt();
				g.buscarSocio(listado.get(id).getId());
				System.out.print("\nBien, ahora diga el nuevo nombre: ");
				nombre=Leer.dato();
				System.out.print("\nBien, ahora diga los nuevos apellidos: ");
				apellidos=Leer.dato();
				System.out.println("\nBien, ahora diga la edad nueva: ");
				edad=Leer.datoInt();
				System.out.print("Bien, ahora pulse 1 o 2 según la categoría quiere pagar entre las siguientes:"
						+ " \n\t1. Socio: " + cuota + "\n\t2. Socio Premium: "+ cuotaPremium + "\nRespuesta: ");
				eleccion=Leer.datoInt();
				if(eleccion==1) {
					g.editarSocio(id, nombre, apellidos, edad, cuota);
				}else{
					g.editarSocio(id, nombre, apellidos, edad, cuotaPremium);
				}
				break;
			case 4:
				System.out.print("\n\tInicio proceso de baja. Diga el id del socio: ");
				id=Leer.datoInt();
				g.borrarSocio(listado.get(id).getId());
				break;
			case 5:
				System.out.println("\n\t\t-----LISTADO COMPLETO-----");
				g.mostrarListado();
				break;
			case 6:
				System.out.println("\n\t\t-----LISTADO PREMIUM-----");
				g.mostrarPremiums();
				break;
			case 7:
				System.out.println("\n\t\t-----LISTADO ACTIVOS-----");
				g.mostrarActivos();
				break;
			case 8:
				System.out.println("La cantidad actual de socios del Club Viñeda es: " + g.calcularCantidadSocios() + " socios.");
				break;
			default:
				System.out.println("\t\t***ERROR, elija una opción válida***");
			}
			
		}while (opcion!=salir);
		
	}
	
	
	public static void imprimirBienvenido () {
		System.out.println("\t\t=====BIENVENIDO A LA GESTIÓN DEL CLUB DE CAMPO VIÑEDA=====");
	}
	
	public static void imprimirMenu () {
		System.out.print("\n\nElija una opción entre las siguientes: "
				+ "\n\t0. Salir"
				+ "\n\t1. Crear y agregar socio"
				+ "\n\t2. Buscar un socio"
				+ "\n\t3. Editar un socio"
				+ "\n\t4. Dar de baja un socio"
				+ "\n\t5. Mostrar listado completo de socios"
				+ "\n\t6. Mostrar listado de socios premium"
				+ "\n\t7. Mostrar listado de socios activos"
				+ "\n\t8. Mostrar cantidad de socios"
				+ "\nRespuesta: ");
	}
	
	public static void imprimirDespedida () {
		System.out.println("\\t\\t=====GRACIAS, HASTA PRONTO=====");
	}

}
