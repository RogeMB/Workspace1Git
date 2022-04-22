package ejemploException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	// El método dividir no trata la excepción con lo que debe lanzarla (throws)
	public static int dividir(int numerator, int denominator) throws ArithmeticException {
		return numerator / denominator; // possible division by zero
	} // end method quotient

	public static void comprobarEdad (int edad) throws EdadNegativaExc{
		if (edad<0) {
			throw new EdadNegativaExc("No puede haber edades negativas, de momento.");
		}
	}
	
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		int num, den, edad;
		String aux;
		
		Scanner sc = new Scanner(System.in); // scanner for input
		boolean continueLoop = true; // determines if more input is needed
		do {
			try {// read two numbers and calculate quotient

				/*
				 * System.out.print("Please enter an integer numerator: ");
				 * int numerator = scanner.nextInt();
				 * System.out.print("Please enter an integer denominator: ");
				 * int denominator = scanner.nextInt();
				 */
				
				// Excepción propia
				System.out.println("Please enter your age: ");
				aux=sc.nextLine();
				edad= Integer.parseInt(aux);
				comprobarEdad(edad);
					
				
				System.out.print("Please enter an integer numerator: ");
				aux=sc.nextLine();
				num = Integer.parseInt(aux);
				System.out.print("Please enter an integer denominator: ");
				aux=sc.nextLine();
				den = Integer.parseInt(aux);
				
				int result = dividir(num, den);
				System.out.printf("\nResult: %d / %d = %d\n", num, den, result);
				continueLoop = false; // input successful; end looping
				
				/*
				 * int result = dividir(numerator, denominator);
				 * System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
				 * continueLoop = false; // input successful; end looping
				 */
				
			} // end try
			
			//Los catch se ordenan por concreción. El más genérico el último. El catch más concreto el primero.
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("\nException: %s\n", inputMismatchException);
				sc.nextLine(); // discard input so user can try again
				System.out.println("You must enter integers. Please try again.\n");
			} // end catch

			catch (ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("Zero is an invalid denominator. Please try again.\n");
			} // end catch
			
			catch (NumberFormatException numberFormatException) {
				System.err.printf("\nException: %s\n", numberFormatException);
				System.out.println("Yoy must enter numbers. Please try again.\n");
			}
			
			catch (EdadNegativaExc edadExc) { // es la más genérica de todas, por lo tanto, la última
				System.out.println(edadExc.getMessage());
				// System.out.println("You must enter a positive number. Please try again.\n");
			}
			
		} while (continueLoop); // end do...while
		sc.close();
	} // end main	
}