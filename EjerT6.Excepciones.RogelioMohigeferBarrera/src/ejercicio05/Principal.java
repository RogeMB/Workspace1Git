package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String auxA, auxB;
		int a = 0, b= 0;		
		boolean salir = true;
		Scanner sc = new Scanner(System.in);
		
		CalculoSuma cal;
		
		imprimirBienvenida();
		
	
		do {
			try {
				System.out.print("\nIntroduzca un valor para a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.print("\nIntroduzca un valor para b: ");
				b = Integer.parseInt(sc.nextLine());
				
				cal = new CalculoSuma (a, b);
				cal.calculoSuma(a, b);
				System.out.printf("\nA + B es igual a %d", cal.calculoSuma(a, b));
				
				salir = false;
			}	
			catch (NumberFormatException num) {
				System.out.println("\n***ERROR***. Introduzca un número entero.");
			}	
			catch (MayorQueDiezExc mDiez) {
				System.out.println("\n" + mDiez.getMessage() + "\n");
			}
			
		}while (salir);
		sc.close();
		
		imprimirDespedida();
	}
	
	// Helpers
	
	public static void imprimirBienvenida() {
		System.out.println("\t\t=====BIENVENIDO AL PROGRAMA=====");
	}
	
	public static void imprimirDespedida() {
		System.out.println("\n\n\t\t=====GRACIAS POR USAR EL PROGRAMA=====");
	}
}

