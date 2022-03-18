package ejercicio06;

import java.util.SortedMap;
import java.util.TreeMap;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear una clase Trabajador con los siguientes atributos:
		 * Nombre, DNI, Horas trabajadas y sueldo final (este se puede calcular de cualquier manera sencilla de las que
		 * hemos visto anteriormente).

		 * Guardar varios trabajadores en una colección y mostrar los trabajadores ordenados según el número de horas
		 * trabajadas o según el sueldo (del que menos al que más cobra). Se deben usar comparable o comparator.
		 */
		
		int opcion = 0, salir = 0;
		double horasTotales= 0.0, horasTrabajadas = 0.0, horasExtras = 0.0, bono = 0.0, euroHora = 0.0, euroHoraExtra = 0.0, sueldoFinal = 0.0; 
		String dni, nombre, apellidos;
		
		CompararPorHora ch = new CompararPorHora();
		CompararPorSueldo cs = new CompararPorSueldo();
		Trabajador t;
		SortedMap<String, Trabajador> listado = new TreeMap <String, Trabajador>();
		
		Trabajador t1 = new Trabajador ("11111111Q", "Roge", "Mohigefer Barrera", 160.8, 2000.24);
		Trabajador t2 = new Trabajador ("55555555T", "Carlota", "Moreno Rosendo", 170.1, 2220.73);
		Trabajador t3 = new Trabajador ("99999999R", "Pepe", "Martín Aguilar", 160.8, 1999.50);
		Trabajador t4 = new Trabajador ("99999999C", "Félix", "Rodríguez de la Fuente", 120.1, 1210.06);
		Trabajador t5 = new Trabajador ("33333333A", "Rodrigo", "Díaz de Vivar", 190.37, 2415.43);
		
		
		CrudPlantilla c = new CrudPlantilla (listado);
		
		listado.put("11111111Q", t1);
		listado.put("55555555T", t2);
		listado.put("99999999R", t3);
		listado.put("99999999C", t4);
		listado.put("33333333A", t5);
		
		
		imprimirBienvenida();
		System.out.print("Primero, indique a cuántos euros se les pagará a los trabajadores la hora: ");
		euroHora=Leer.datoDouble();
		System.out.print("Bien, y ahora indique a cuánto se les paragá la hora extra: ");
		euroHoraExtra=Leer.datoDouble();
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				imprimirDespedida();
				break;
			case 1:
				System.out.println("\n\t\t=====AÑADIR TRABAJADOR=====");
				System.out.print("Diga el dni del nuevo trabajador: ");
				dni=Leer.dato();
				System.out.print("Diga el nombre del nuevo trabajador: ");
				nombre=Leer.dato();
				System.out.print("Diga los apellidos del nuevo trabajador: ");
				apellidos=Leer.dato();
				System.out.print("Diga las horas trabajadas del nuevo trabajador: ");
				horasTrabajadas=Leer.datoDouble();
				System.out.print("Diga las horas extras del nuevo trabajador: ");
				horasExtras=Leer.datoDouble();
				System.out.print("Diga la cantidad del bono que va a recibir el nuevo trabajador: ");
				bono=Leer.datoDouble();
				horasTotales = horasTrabajadas + horasExtras;
				t = new Trabajador (dni, nombre, apellidos, horasTotales, sueldoFinal);
				c.annadir(dni, t);
				sueldoFinal = t.calcularSueldo(horasTrabajadas, euroHora, bono, horasExtras, euroHoraExtra);
				listado.get(dni).setSueldoFinal(sueldoFinal);
				break;
			case 2:
				System.out.println("\n\t\t=====LISTADO=====");
				c.mostrarListado(listado);
				break;
			case 3:
				System.out.println("\n\t\t=====LISTADO ORDENADOR POR HORAS=====");
				c.mostrarListadoOrdenadoHora(listado, ch);
				break;
			case 4:
				System.out.println("\n\t\t=====LISTADO ORDENADO INVERSAMENTE POR SUELDO=====");
				c.mostrarListadoOrdenadoSueldo(listado, cs);
				break;
			case 5:
				System.out.print("\nDiga el dni del trabajador: ");
				dni=Leer.dato();
				c.mostrarUno(dni);
				break;
			case 6:
				System.out.println("\nEl tamaño del listado es "+ c.calcularTamanno(listado));
				break;
			case 7:
				if (!listado.isEmpty()) {
					System.out.print("\nDiga el dni del trabajador: ");
					dni=Leer.dato();
					System.out.print("Diga las nuevas horas trabajadas del trabajador: ");
					horasTrabajadas=Leer.datoDouble();
					System.out.print("Diga las nuevas horas extras del trabajador: ");
					horasExtras=Leer.datoDouble();
					System.out.print("Diga la cantidad del bono que va a recibir el nuevo trabajador: ");
					bono=Leer.datoDouble();
					if (c.calcularSueldoUno(dni, horasTrabajadas, horasExtras, euroHora, euroHoraExtra, bono)) {
						System.out.println("\n\t\t=====El sueldo ha sido modificado correctamente=====");
					}else {
						System.out.println("\n\t\t***ERROR, trabajador no encontrado****");
					}
				}else {
					System.out.println("\n\t\t***EL LISTADO ESTÁ VACÍO***");
				}
				break;
			case 8:
				System.out.println("\n\t\t=====EL PRIMERO DEL LISTADO=====");
				c.mostrarElPrimero(listado);
				break;
			case 9:
				System.out.println("\n\t\t=====EL ÚLTIMO DEL LISTADO=====");
				c.mostrarElUltimo(listado);
				break;
			case 10:
				System.out.print("\nIngrese el nombre: ");
				nombre=Leer.dato();
				//c.buscarPorNombre(listado, nombre);
				break;
			default:
				System.out.println("\n\t\t***ERROR, elija una opción válida");
			}
		}while (opcion!=salir);
	}
	
	// Helpers
	
		public static void imprimirBienvenida () {
			System.out.println("\t\t=====BIENVENIDO AL PROGRAMA=====");
		}
		
		public static void imprimirDespedida () {
			System.out.println("\n\t\t=====HASTA PRONTO=====");
		}
		
		public static void imprimirMenu () {
			System.out.print("\nElija una opción entre las siguientes: "
					+ "\n0. Salir"
					+ "\n1. Añadir un nuevo trabajador"
					+ "\n2. Mostrar listado ordenado por dni"
					+ "\n3. Mostrar listado ordenado por horas trabajadas"
					+ "\n4. Mostrar listado ordenado por sueldo (inverso)"
					+ "\n5. Mostrar un trabajador"
					+ "\n6. Calcular tamaño del listado"
					+ "\n7. Modificar sueldo de un trabajador"
					+ "\n8. Mostrar el primero del listado"
					+ "\n9. Mostrar el último del listado"
					+ "\nRespuesta: ");
		}
}
