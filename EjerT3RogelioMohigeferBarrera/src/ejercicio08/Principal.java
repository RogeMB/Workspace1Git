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
		
		int opcion = 0, salir = 0, cantidad = 0, cero = 0;
		String nNombre;
		double precio = 20, saldo;
		Sorteo s;
		Decimo d;
		
		
		System.out.print("¡Bienvenido/a al sorteo de la lotería!\n Ingrese su nombre: ");
		nNombre = Leer.dato();
		System.out.print("\nBien. Ahora introduzca cuánto saldo tienes: ");
		saldo = Leer.datoDouble();
		
		d = new Decimo ();
		s = new Sorteo ();
		
		do {
			System.out.print("Genial, "+nNombre+". Ahora ingrese por teclado una opción entre las siguientes: "
					+ "\n\t1. Comprar un décimo.\n\t2. Generar sorteo.\n\t3. Comprobar número premiado.\n\t4. Mostrar resultado económico.");
			switch (opcion) {
				case 0: 
					if (opcion == salir) {
						System.out.println("\n\t***Muchas gracias por participar. ¡Qué la suerte te acompañe!***");
					}
					break;
				case 1:
					while (cantidad * precio > saldo && cantidad > cero){
						System.out.print("\nIntroduzca la cantidad de décimos que quiere comprar sin sobrepasar tu saldo: ");
						cantidad = Leer.datoInt();
					}
					

					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				default:
					System.out.println("\n\t\t***ERROR: Elige una opción válida***.");
			
			}
			
		}while (opcion != salir);
	
		
	
	
	
	}

}
