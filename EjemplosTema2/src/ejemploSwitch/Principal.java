package ejemploSwitch;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion=0, opcionDos=0;
	
		System.out.println("Elija la opción que desee:"); 
		System.out.println("\n1. Abrir la galería de fotos.");
		System.out.println("2. Abrir la cámara.");
		System.out.println("3. Abrir la agenda.");
		System.out.println("4. Abrir la configuración.");
		System.out.println("5. Abrir los mensajes.");

		opcion=Leer.datoInt();
		
		switch (opcion) {
			case 1:
				System.out.println("Ha abierto la galería.");
				break;
			case 2:
				System.out.println("Ha abierto la cámara.");
				System.out.println("Ahora eliga una de estas tres opciones");
				
				System.out.println("\n1. Para realizar una foto.");
				System.out.println("2. Para realizar un vídeo. ");
				System.out.println("3. Para realizar una panorámica.");
				
				opcionDos=Leer.datoInt();	//No nos sirve ponerla arriba junto a la otra opcion=Leer.//	
				switch (opcionDos) { 
					case 1:
						System.out.println("Ha elegido hacer una foto.");
						break;
					case 2:
						System.out.println("Ha elegido hacer un vídeo.");
						break;
					case 3:
						System.out.println("Ha elegido hacer una panorámica.");
						break;
					default:
						System.out.println("Esto no es una opción viable.");
						break;
				}
				
				break;
			case 3:
				System.out.println("Ha abierto la agenda.");
				break;
			case 4:
				System.out.println("Ha abierto la configuración.");
				break;
			case 5:
				System.out.println("Ha abierto los mensajes.");
				break;
			default:
				System.out.println("Esta opción no es posible.");
				break;
		
			
			
		}
	}
}
