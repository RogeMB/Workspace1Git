package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioLitro = 0.70, altura = 0.0, radio = 0.0, precio = 0.0, volumen = 0.0; 
		int opcion = 0, salir = 0, beneficio = 0, litros = 0, tam = 0, seleccion = 0, uno = 1, cero = 0;
		Deposito d;
		String nombre ="";
		Plataforma p;
		
		System.out.print("Hola, ingrese su nombre para comenzar: ");
		nombre=Leer.dato();
		Plataforma.bienvenido(nombre);
		System.out.print("Por favor, ingrese la cantidad máxima de depósitos que caben en la"
				+ "la plataforma"
				+ "\n\tRespuesta: ");
		tam=Leer.datoInt();
		
		p = new Plataforma ();
		
		do {
			Plataforma.imprimirMenu();
			switch (opcion) {
			case 0:
				Plataforma.imprimirDespedida();
				opcion = Leer.datoInt();
				break;
			case 1: 
				System.out.print("\nSeleccione la posicion en la que quiere agregar el deposito. \nRespuesta: ");
				seleccion = Leer.datoInt()-uno;
				p.addDeposito(seleccion, altura, radio, litros, precio);
				break;
			case 2:
				p.toString();
				break;
			case 3: 
			
				do {
					System.out.print("\nBien, diga por favor el depósito que quiere calcular. Respuesta: ");
					seleccion = Leer.datoInt()-uno;
					System.out.println("\nBien, ahora diga el porcentaje de ganancia que quiere sacarle. Respuesta: ");
					beneficio = Leer.datoInt();
					if (beneficio < cero){
						p.calcularPrecioVenta(seleccion, beneficio);
					}else {
						System.out.println("\n***ERROR***. Ingrese un beneficio mayor o igual que 0.");
					}
					
				} while (beneficio < cero);
				
				break;
			case 4: 
				System.out.println("\nVamos a calcular la capacidad total.");
				p.calcularCapacidadTotal();
				break;
			case 5:
				System.out.print("\nIngrese el depósito que quiere calcular la ganancia de la venta del crudo. Respuesta: ");
				seleccion=Leer.datoInt();
				p.gananciaRepsolDeposito(seleccion, precioLitro);
				break;
			case 6:
				System.out.println("\nVamos a calcular lo que se llevaría Respsol por toda la plataforma.");
				p.gananciaRepsolTodos(precioLitro);
				break;
			case 7:
				System.out.println("\nVamos a calcular lo que se llevaría Respsol por toda la plataforma si estuviese llena.");
				p.gananciaRepsolLleno(precioLitro);
				break;
			
			default:
				Plataforma.imprimirTarugo();
			}
			
			
		}while (opcion != salir);
		
		
		

	}

}
