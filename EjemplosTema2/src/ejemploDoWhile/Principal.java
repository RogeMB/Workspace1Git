package ejemploDoWhile;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion= 0; 
		
		do {
		System.out.println("Pulse la opción que quiera");	
		System.out.println("\n0. Para salir");
		System.out.println("1. Para Matrix");
		System.out.println("2. Para SDLA");
		System.out.println("3. Para Dumbo");

		opcion=Leer.datoInt();
		
		switch (opcion){
			case 0:
				System.out.println("Ha decidido salir.");
				break;
			case 1:
				System.out.println("Sala 1");
				break;
			case 2:
				System.out.println("Sala 2");
				break;
			case 3:
				System.out.println("Sala 3");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
		}
			
		}while (opcion!=0);

		System.out.println("Gracias, hasta pronto");
			
		

}
}
