package ejemploIf;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		int edad=0, mayoria=0;
		
		System.out.println("¿Con cuántos años se es mayor de edad en tu país?");
		mayoria=Leer.datoInt();
		
		System.out.println("¿Cuántos años tienes?");
		edad=Leer.datoInt();
		
		if (edad>=mayoria) {
			System.out.println("Entre en mi bar.");
		}else {
			System.out.println("Váyase a casa.");
			
		}
		
		System.out.println("Hemos terminado.");

	}

}
