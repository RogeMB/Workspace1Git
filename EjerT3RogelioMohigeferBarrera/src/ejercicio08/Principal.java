package ejercicio08;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8. Crear un programa que gestione un sorteo de lotería. Tendremos la clase Sorteo y la principal
			para probar todo. El programa debe hacer lo siguiente:
			• Posibilidad de comprar/generar un décimo (elegir un número).
			• Hacer sorteo, donde se generará aleatoriamente el número premiado.
			• Comprobar si nuestro décimo está premiado.
			• Mostrar si eres ganador o no (en el main).*/
		
		int opcion= 0, salir = 0, cantidad = 0, cero = 0, premio = 0;
		String nNombre;
		int precio, saldo;
		Sorteo s;
		Decimo d;
		
		
		d = new Decimo ();
		s = new Sorteo ();
		
		System.out.print("¡Bienvenido/a al sorteo de la lotería!\nIngrese su nombre: ");
		nNombre = Leer.dato();
		System.out.print("\nBien. Ahora introduzca cuánto saldo tienes: ");
		saldo = Leer.datoInt();
		System.out.print("\nEstablezca el precio del décimo. (20 sugerido): ");
		precio = Leer.datoInt();
		d.setPrecio(precio);
		System.out.print("\nEstablezca el premio: ");
		premio = Leer.datoInt();
		d.setPremio(premio);
	
		do {
			System.out.print("\n\nGenial, "+nNombre+". Ahora ingrese por teclado una opción entre las siguientes: "
					+ "\n\t0. Salir.\n\t1. Comprar décimos.\n\t2. Generar sorteo.\n\t3. Comprobar número premiado.\n\t"
					+ "4. Mostrar resultado económico.\nRespuesta: ");
			opcion= Leer.datoInt();
			switch (opcion) {
				case 0: 
					if (opcion == salir) {
						System.out.println("\n\t***Muchas gracias por participar. ¡Qué la suerte te acompañe!***");
					}
					break;
				case 1:
					precio=d.getPrecio();
					if (cantidad>=1) {
						System.out.println("\n***ERROR: No puedes comprar más. Ya has comprado los siguientes décimos: ");
						d.imprimirDecimo();
						
					}else {
						do {
							System.out.print("\nEl precio de un décimo es: "+precio);
							System.out.print("\nIntroduzca la cantidad de décimos que quiere comprar sin "
									+ "sobrepasar tu saldo: ");
							cantidad = Leer.datoInt();
						} while (cantidad * precio > saldo || cantidad <= cero);
						d.generarCartera(cantidad);
						System.out.println("\nEstas jugando con: ");
						d.imprimirDecimo();
					}
					break;
				case 2:
					if (cantidad!=cero) {
						System.out.print("\nEmpieza el sorteo! El número premiado es...: ");
						s.calcularPremiado();
						s.imprimirGanador();
					}else {
						System.out.println("\nERROR.***Compre primero al menos un décimo.***");
					}

					break;
				case 3:
					if (cantidad!=cero) {
						if (s.getSorteoEfectuado()) {
							System.out.print("\n¡El sorteo ha terminado! El número premiado ha sido...: ");
							s.imprimirGanador();
							System.out.println("\nEstabas jugando con: ");
							d.imprimirDecimo();
							if (s.verificarPremiado(d.getCartera())) {
								System.out.println("\n\n\t***¡E N H O R A B U E N A! ¡Has ganado!");
							} else {
								System.out.println("\n\n\t***No ha habido suerte, pruebe la próxima vez...");
							}
						}else {
							System.out.println("\nERROR. ***Genere primero el sorteo.***");
						}
					}else {
						System.out.println("\nERROR.***Compre primero al menos un décimo.***");
					}
					break;
				case 4:
					System.out.println("\nTu beneficio ha sido de: ");
					System.out.println(s.calcularGanancias (d.getPrecio(),cantidad, s.verificarPremiado(d.getCartera()), d.getPremio())); 
					
					break;
				default:
					System.out.println("\n\t\t***ERROR: Elige una opción válida***.");
			
			}
			
		}while (opcion != salir);
	
		
	
	
	
	}

}
