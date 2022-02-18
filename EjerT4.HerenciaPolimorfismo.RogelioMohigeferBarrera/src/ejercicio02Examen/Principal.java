package ejercicio02Examen;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0, salir=0, cantidad=0, tamano=0, indice=0, elegido=0, fijo=0;
		double precioBase, costeVenta, pago, porcentaje;
		String nombre, marca, modelo, tipo;
		
		
		Producto p [] = new Producto [tamano];
		EspadaLaser el;
		Movil m;
		Ventas v = new Ventas (p);
		Producto pr;
		
		bienvenido ();
		System.out.print("Las espadas doble tienen un fijo por compra. Inserte el fijo: ");
		fijo = Leer.datoInt();
		System.out.print("\nBien. ¿Qué porcentaje quiere ganar de comisión? ");
		porcentaje=Leer.datoDouble();
		pr = new Movil (350, 10, "Movil", true, "Xiaomi", "X10");
		v.annadirProducto(pr);
		pr = new EspadaLaser (500, 5, "EspadaLaser", true, "Doble");
		v.annadirProducto(pr);
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			switch (opcion) {
				case 0:
					salir();
					break;
				case 1: 
					System.out.println("Vamos a añadir un producto.");
					System.out.print("Diga el nombre del producto: ");
					nombre=Leer.dato();
					System.out.print("Diga el precio del producto: ");
					precioBase=Leer.datoDouble();
					System.out.print("Diga la cantidad a adquirir: ");
					cantidad=Leer.datoInt();
					System.out.println("\nBien, ahora diga 0 si el producto es un móvil o 1 si es espada Laser: ");
					opcion=Leer.datoInt();
					switch(opcion) {
						case 0:
							System.out.print("Diga la marca del movil: ");
							marca=Leer.dato();
							System.out.print("Diga el modelo del movil :");
							modelo=Leer.dato();
							pr = new Movil (precioBase, cantidad, nombre, true, marca, modelo);
							v.annadirProducto(pr);
							indice++;
							break;
							
						case 1:
							System.out.print("Diga el tipo de espada (doble o normal): ");
							tipo=Leer.dato();
							pr = new EspadaLaser (precioBase, cantidad, nombre, true, tipo);
							v.annadirProducto(pr);
							indice++;
							break;
						default:
							System.out.println("***ERROR***");
					}
					break;
				case 2: 
					v.mostrarListado();
					System.out.println("Elija un producto del catálogo: ");
					elegido=Leer.datoInt()-1;
					System.out.println("¿Cuántos quiere comprar?");
					cantidad=Leer.datoInt();
					costeVenta=v.venderProducto(elegido, cantidad, fijo, porcentaje);
					System.out.println("El coste de la venta es: " + costeVenta);
					
					do {
						System.out.print("¿Cuánto paga?");
						pago=Leer.datoDouble();
						if (pago < costeVenta) 
							System.out.println("Dinero insuficiente, amigo.");
					}while (pago < costeVenta);	
					System.out.println("Tenga aquí su cambio: " + v.calcularCambio(costeVenta, pago));
					break;
					
				case 4:
					System.out.println("El total de productos sin vender es: " + v.cantidadStock());
					break;
				
				case 5:
					System.out.println("El total recaudado es: "+ v.getRecaudado());
					break;
				case 6:
					v.mostrarListado();
					break;
				default:
					System.out.println("***ERROR diga opción correcta****");
			}
			
			
		}while (opcion!=salir);
		
		
	}

	
	
	// helpers
	
	public static void bienvenido () {
		System.out.println("\t\tBienvenido al programa de venta Tatooine.");
	}
	
	public static void salir () {
		System.out.println("Hasta luego Lucas!");
	}
	
	public static void imprimirMenu () {
		System.out.print("\nIndique la opción que desea realizar: "
				+ "\n0. Salir" //
				+ "\n1. Agregar nuevo producto a stock" //
				+ "\n2. Vender producto y cambio" //
				+ "\n3. Buscar producto" 
				+ "\n4. Stock actual" // 
				+ "\n5. Calcular cantidad de dinero recaudado" //
				+ "\n6. Mostrar listado completo" //
				+ "\n7. Calcular en dólares"
				+ "\nRespuesta: ");
	}
}
