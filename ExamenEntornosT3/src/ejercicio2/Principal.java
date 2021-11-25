package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[] { 3, 102, 6, 1, 2, 4, 7, 9, 4, 100, 101 };

		// Integer.MAX_VALUE es el valor más grande que
		// se puede representar con un número entero en Java
		int menor = Integer.MAX_VALUE;
		int siguiente = Integer.MAX_VALUE;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < siguiente) {
				siguiente = numeros[i];
			}
			if (numeros[i] < menor) {
				siguiente = menor;
				menor = numeros[i];
			}
		}
		System.out.println("El menor número es " + menor + " y el siguiente es " + siguiente);
	}
}
