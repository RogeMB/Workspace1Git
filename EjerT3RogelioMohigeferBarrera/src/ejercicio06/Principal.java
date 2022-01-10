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
		
		
		int opcion = 0, salir = 0; 
		String nCara = "CARA", nCruz = "CRUZ";
		Metodos m = new Metodos ();
		
		m.imprimirTitulo ();
		m.bienvenido ();
	
		do {
			System.out.print("\nTeclee el número de la opción que desee entre las siguientes: \n0. Salir "
					+ "\n1. Instrucciones \n2. Elegir Cara o Cruz \n3. Lanzar moneda \n4. Mostrar porcentaje ganador "
					+ "\n\tRespuesta: ");
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
						m.elegirCaraCruz ();
						m.getEleccion();
						if (m.getEleccion() == 1) 
							System.out.println("\n¡¡¡Bien, has elegido "+nCara+"!!!\n_____________________________"
									+ "_______________________________________");
						else if (m.getEleccion() == 2) 
							System.out.println("\n¡¡¡Bien, has elegido "+nCruz+"!!!\n_____________________________"
									+ "_______________________________________");
						else 
							m.imprimirIncorrecto();
					} while (m.getEleccion() != 1 && m.getEleccion() != 2);
					
					break;
				default:
					m.imprimirPalabraMagica();
			
			}
			
		} while (opcion != salir);
	
		
		

	}

}
