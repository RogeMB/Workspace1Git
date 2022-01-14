package ejercicio06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. Crear un programa que simule el juego de cara o cruz. Para ello, se usarán los siguientes
		* métodos:
		*	 • Método que simule el lanzamiento de la moneda y resultado.
		*	 • Método para comprobar ganador, se le pasará el número elegido por el jugador y dentro
		* 	   se generará el aleatorio llamando al método anterior. Devuelve true si son iguales o false
		* 	   si no.
		* 	 • Un método para mostrar en bonito el ganador. Si se le pasa true mostrar un mensaje de
		*	   ganador y si no, debe mostrar "Siga jugando".
		* 	 • En el main, se debe crear lo necesario para simular un juego de cara o cruz.*/
		
		
		int opcion = 0, salir = 0, eleccion = 0, aciertos = 0, porcentajeAcierto = 0;
		int  caras = 0, cruces = 0, cien = 100, cero = 0;
		String nCara = "CARA", nCruz = "CRUZ", nNombre, nEnter;
		Metodos m;
		
		m = new Metodos ();
		m.imprimirTitulo ();
		
		System.out.print("Bienvenido/a,\n Ingrese su nombre: ");
		nNombre = Leer.dato();
		System.out.println("\n¡Hola " +nNombre+"!. Para comenzar pulsa la tecla:  \r\n\t\t\t\t"
				+ "╔═╗╔╗╔╔╦╗╔═╗╦═╗\r\n\t\t\t\t"
				+ "║╣ ║║║ ║ ║╣ ╠╦╝\r\n\t\t\t\t"
				+ "╚═╝╝╚╝ ╩ ╚═╝╩╚═\r\n");
		nEnter= Leer.dato();
	
		do {
			System.out.print("\nTeclee el número de la opción que desee entre las siguientes: \t\n0. Salir. "
					+ "\t\n1. Instrucciones. \t\n2. Elegir Cara o Cruz. \t\n3. Lanzar moneda y comprobar resultado. "
					+ "\t\n4. Mostrar porcentaje ganador. "
					+ "\nRespuesta: ");
			opcion=Leer.datoInt();
			switch (opcion) {
				case 0:
					if (opcion == salir) {
						m.imprimirAdios();
					}
					break;
				case 1: 
					m.imprimirInstrucciones ();
					break;
				case 2:
					do {
						System.out.print("\n¿Qué eliges, Cara o Cruz? Pulsa 1 para Cara, pulsa 2 para Cruz."
								+ "\n\tRespuesta: ");
						eleccion=Leer.datoInt();
						if (eleccion == 1) 
							System.out.println("\n¡¡¡Bien, has elegido "+nCara+"!!! Ahora lanza la moneda.\n_____________________________"
									+ "_______________________________________");
						else if (eleccion== 2) 
							System.out.println("\n¡¡¡Bien, has elegido "+nCruz+"!!! Ahora lanza la moneda.\n_____________________________"
									+ "_______________________________________");
						else 
							m.imprimirIncorrecto();
					} while (eleccion != 1 && eleccion != 2);
					break;
				case 3:
					if(eleccion==1 || eleccion==2) {
						m.lanzarMoneda();
						m.imprimirCaraCruz();
						
						if (m.comprobarEleccion(eleccion)) {
							m.imprimirGanador();
							aciertos++;
						}else
							m.imprimirPerdedor();
					}else {
						System.out.println("\n\t***ERROR. Elige antes tu apuesta.***\n___________________________"
								+ "_____________________________________________");
					}
					break;
				case 4:
					if (m.getNumLanzamientos() != cero) {
						m.calcularPorcentaje();
						porcentajeAcierto=m.calcularPorcentajeAcierto(aciertos);
						System.out.println("\nTu número de aciertos han sido: "+aciertos+" sobre "+m.getNumLanzamientos()+" "
								+ "lanzamientos. Tu porcentaje de acierto ha sido un "+porcentajeAcierto+"%.");
						caras=m.getPorcentaje();
						cruces = cien - caras;
						System.out.println("\nEl porcentaje de caras ha sido "+caras+"%, y el de cruces "
								+ "ha sido "+cruces+"%.");
						System.out.println("\nToString:");
						System.out.println(m);
					} else {
						m.imprimirIncorrecto();
					}
					break;
				default:
					m.imprimirPalabraMagica();
			
			}
			
		} while (opcion != salir);
	}

}
