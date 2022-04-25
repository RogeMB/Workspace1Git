package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String auxA, auxB, auxC;
		int a = 0, b = 0, c = 0;
		boolean seguir = true;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\t\t\t=====BIENVENIDO AL PROGRAMA \n \t\tCÁLCULO DE ECUACIONES DE SEGUNDO GRADO=====");
		
		do {
			try {
				System.out.print("\nIndique el coeficiente cuadrático: ");
				auxA = sc.nextLine();
				a = Integer.parseInt(auxA);
				System.out.print("Indique el coeficiente lineal: ");
				auxB = sc.nextLine();
				b = Integer.parseInt(auxB);
				System.out.print("Indique el término independiente: ");
				auxC = sc.nextLine();
				c = Integer.parseInt(auxC);
				
				CalculoEcuacion ce = new CalculoEcuacion (a, b, c);
				
				ce.comprobarAB();
				ce.calcularDiscriminante();
				
				for (double sol : ce.calcularEc()) {
					System.out.printf("\nLa solución es: %.2f", sol);				
				}
				seguir = false;
				
			}
			
			catch (NumberFormatException num) {
				System.out.println("\nIntroduzca un número entero.");
			}
			catch (ArithmeticException ar) {
				System.out.println("\nNo se puede dividir entre 0.");
			}
			catch (EcuacionDegenerada ecDeg) {
				System.out.println("\n" + ecDeg.getMessage() + "\n");
			}
			catch (RaizCompleja raiz) {
				System.out.println("\n" + raiz.getMessage() + "\n");
			}
			
		} while (seguir);
		sc.close();
		System.out.println("\n\t\t=====GRACIAS POR USAR EL PROGRAMA=====");
	}

}
