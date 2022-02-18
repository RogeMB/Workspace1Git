package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion=0, salir=0, numeroHijos=0, anno=0, edad=0, id=0, tamano=99999999, eleccion=0;
		double precioBase=0.0, cantPatrocinio=0.0, totalRecaudado=0.0;
		String nombreEmpresa, nombre; 
		
		
		VisitanteGeneral listado [] = new VisitanteGeneral [tamano]; 
		VisitanteGeneral vg;
		
		imprimirBienvenido();
		Leer.dato();
		
		System.out.print("Por favor, antes de comenzar ingrese el año actual:  ");
		anno = Leer.datoInt();
		Feria f = new Feria (anno, listado, totalRecaudado);
		System.out.print("Genial, ahora necesito que introduzca un importe base para una entrada: ");
		precioBase=Leer.datoDouble();
		
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				imprimirAdios();
				break;
			case 1:
				System.out.println("\nBien, vamos a registrar un nuevo visitante. Comenzamos proceso de registro: ");
				System.out.print("Diga el nombre del visitante: ");
				nombre=Leer.dato();
				System.out.println("Diga la edad del visitante: ");
				edad=Leer.datoInt();
				imprimirSubMenu();
				opcion=Leer.datoInt();
				switch (opcion) {
				case 0:
					vg= new VisitanteGeneral (nombre, id, precioBase, edad);
					id++;
					System.out.println("\n\tGenial, ¡Visitante registrado!");
					break;
				case 1:
					System.out.print("\nVale, indique por favor, el nombre de la empresa: ");
					nombreEmpresa=Leer.dato();
					System.out.println("\nY ahora indique qué cantidad ha aportado el empresario como atrocinio al cole: ");
					cantPatrocinio=Leer.datoDouble();
					vg = new Empresario (nombre, id, precioBase, edad, nombreEmpresa, cantPatrocinio);
					id++;
					System.out.println("\n\tGenial, ¡Visitante registrado!");
					break;
				case 2:
					System.out.print("\nVale, indique por favor el numero de hijos del famliar en el cole: ");
					numeroHijos=Leer.datoInt();
					vg = new Familiar (nombre, id, precioBase, edad, numeroHijos);
					id++;
					System.out.println("\n\tGenial, ¡Visitante registrado!");
					break;
				}
				break;
				
			case 2: 
				System.out.println("El listado completo de visitantes es: ");
				f.mostrarListado();
				break;
			case 3: 
				eleccion=0;
				System.out.println("Vamos a calcular el precio de una entrada. Elija de qué visitante del listado siguiente: ");
				f.mostrarListado();
				System.out.print("Respuesta: ");
				id=Leer.datoInt();
				System.out.println("\nEl precio de la entrada para el visitante elegido es de: " + f.calcularUna(eleccion-1));
				break;
			case 4:
				eleccion=0;
				System.out.println("\nEl total recaudado por los visitantes es: " + f.calcularRecaudado(eleccion));
				break;
			case 5:
				eleccion=0;
				System.out.println("\nEl total recaudado por los visitantes familiares es: " + f.calcularRecaudadoFamiliar(eleccion));
				break;
			default:
				System.out.println("***ERROR, por favor ingrese una opción válida****");
			}
		} while (opcion!=salir);
		
	}

	
	
	// Helpers
	
	public static void imprimirBienvenido () {
		System.out.println("\t\t=====BIENVENIDO AL GESTOR DE LA FERIA SALESIANA====="
				+ "\t\t\n (pulse la tecla Enter para comenzar");
	}
	
	public static void imprimirMenu () {
		System.out.print("\n\nEstupendo! Elija una opción entre las siguientes: "
				+ "\n0. Salir del programa"
				+ "\n1. Añadir Visitante"
				+ "\n2. Mostrar el listado de visitantes"
				+ "\n3. Calcular Precio entrada unitario"
				+ "\n4. Mostrar toto lo recaudado"
				+ "\n5. Mostrar todo lo recaudado por familiares"
				+ "\nRespuesta: ");
	}
	
	public static void imprimirAdios () {
		System.out.println("\n\t\t=====¡Ha sido un placer! ¡HASTA PRONTO!=====");
	}
	
	public static void imprimirSubMenu ( ) {
		System.out.print("\nPor favor, sin equivocarse: \n pulse 0 si el visitante es del tipo general, "
				+ "\n1 para empresario, "
				+ "\n2 para familiar. "
				+ "\nRespuesta: ");
	}
}
