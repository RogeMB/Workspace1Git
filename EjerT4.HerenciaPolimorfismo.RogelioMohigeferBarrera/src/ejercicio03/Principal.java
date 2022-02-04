package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Los vehículos a motor pagan un determinado impuesto de circulación. La cantidad a pagar depende
		de la cilindrada, caballos y tipo de combustible. Crear un programa para calcular la cantidad que debe
		pagar un vehículo dependiendo de sus características. (Los vehículos a motor pueden ser motocicletas,
		coches y furgonetas).
		El impuesto se calcula con una cantidad fija por el simple hecho de ser un vehículo con motor, más el
		60 % de la potencia en el caso de las motocicletas, más una cantidad fija a las furgonetas por ser
		transporte de mercancías y más el 25 % de la cilindrada para los coches.
		La jerarquía de clases no tiene mucho sentido en este ejemplo, pero está puesto para reescribir métodos.
		Probar todo en un main sencillo.*/
		
		TipoCombustible tipoCombustible = null;
		String clave, nuevaClave, nuevaClaveDos, bastidor;
		double cilindrada = 0.0, caballos = 0.0, incremento = 0.0;
		int cilindros = 0, salir = 0, opcion = 0, cargaUtil = 0, numeroPlazas = 0, tam = 999999999;
		boolean activo;
		
		VehiculoMotor vm;
		Motocicleta m;
		Coche c;
		Furgoneta f;
		Gestion g;
		VehiculoMotor listado [] = new VehiculoMotor [tam];
		
		imprimirBienvenida();
		clave=Leer.dato();
		g = new Gestion (listado, clave);
		g.comprobarContrasenna(clave);
		imprimirMenu();
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case 0: 
			System.out.println("\n\t\tMuchas Gracias por elegirnos. ¡Tenga un buen día!");
			break;
		case 1: 
			
			break;
		case 2: 
			
			break;
		case 3: 
			/*VehiculoMotor furgo = new Furgoneta(cilindrada, caballos, cilindros, tipoCombustible, bastidor, activo, cargaUtil, numeroPlazas);*/
			break;
		case 4: 
			
			break;
		case 5: 
			System.out.print("Inserte el número de bastidor del vehículo que quiere editar: ");
			bastidor = Leer.dato();
			System.out.println("Ha elegido usted el siguiente vehículo: ");
			g.mostrarSeleccionado(bastidor);
			System.out.print("\nInserte la cilindrada nueva: ");
			cilindrada=Leer.datoDouble();
			System.out.print("\nInserte los caballos nuevos: ");
			caballos=Leer.datoDouble();
			System.out.print("\nInserte los cilindros nuevos: ");
			cilindros=Leer.datoInt();
			System.out.print("\nInserte el tipo de motor nuevo entre los siguientes: ");
			System.out.println(tipoCombustible); 
			/*tipoCombustible = Leer.dato(); leer aquí el int pero hay que hacer un helper para transformar booleano a int*/
			
			g.editarVehiculo(bastidor, cilindrada, caballos, cilindros, tipoCombustible);
			break;
		case 6: 
			System.out.print("Inserte el número de bastidor del vehículo que quiere eliminar: ");
			bastidor = Leer.dato();
			System.out.println("\n\tEliminando vehículo...");
			g.eliminarVehiculo(bastidor);
			break;
		case 7: 
			System.out.println("\tImprimiendo la lista de vehículos activos...");
			g.mostrarActivos();
			break;
		case 8: 
			System.out.println("\tImprimiento la lista completa de vehículos...");
			g.mostrarToitosTos();
			break;
		case 9: 
			System.out.print("\nIntroduzca la nueva contraseña: ");
			nuevaClave=Leer.dato();
			System.out.print("\nRepita la nueva contraseña: ");
			nuevaClaveDos=Leer.dato();
			if(nuevaClave.equals(nuevaClaveDos)) {
				g.cambiarContrasenna(nuevaClave);
			}else {
				System.out.println("\n\t\t***ERROR***. Las contraseñas no coinciden."
						+ "\n<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---");
			}
			
			break;
		default:
			System.out.println("\t\t***ERROR***. Teclee una opción válida, haga ustéh el favoh");
		}
		
	}
	
	//Helpers
		public static void imprimirBienvenida () {
			System.out.print("\t\tBIENVENIDO AL PROGRAMA B-iCulo.\nIntroduzca la contraseña para continuar: ");
		}
		
		public static void imprimirMenu () {
			System.out.print("\n\t---Proceso de instanciación iniciado---\nIntroduzca una opción entre las siguientes: "
					+ "\n\t Pulse 0 para salir del programa."
					+ "\n\t Pulse 1 para añadir un nuevo coche."
					+ "\n\t Pulse 2 para añadir una nueva motocicleta."
					+ "\n\t Pulse 3 para añadir una nueva furgoneta."
					+ "\n\t Pulse 4 revisar"
					+ "\n\t Pulse 5 para editar un vehículo"
					+ "\n\t Pulse 6 para borrar un vehículo"
					+ "\n\t Pulse 7 para mostrar lista de vehículos activos"
					+ "\n\t Pulse 8 para mostrar lista completa de vehículos"
					+ "\n\t Pulse 9 para cambiar la contraseña."
					+ "\nRespuesta: ");		
			
		}
		
		public static void imprimirComision () {
			System.out.print("\nIntroduzca la comisión de venta del producto, a partir de 0 (sin comisión) "
					+ "en adelante (sea cauto)."
					+ "Respuesta: ");
		}
}
