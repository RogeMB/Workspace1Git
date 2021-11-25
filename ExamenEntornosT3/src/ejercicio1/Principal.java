package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] otroArray = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };
		int[] resultado = noComunes(unArray, otroArray);
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}
	/**
	 * Este método recibe dos arrays como argumento (que pueden ser de tamaños
	 * diferentes) y devuelve como resultado un array con los elementos que están
	 * presentes solamente en uno de los dos arrays, pero no están presentes en los
	 * dos.
	 * 
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static int[] noComunes(int[] array1, int[] array2) {
		// El array resultante podría ser
		// del tamaño de array1.length + array2.lenght
		int[] elementosNoComunes = new int[array1.length + array2.length];
		int pos = 0;
		
		for (int i = 0; i < array1.length; i++) {
			boolean encontrado = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					encontrado = true;
				}
			}
			if (!encontrado) {
				elementosNoComunes[pos] = array1[i];
				pos++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			boolean encontrado = false;
			for (int j = 0; j < array1.length; j++) {
				if (array2[i] == array1[j]) {
					encontrado = true;
				}
			}
			if (!encontrado) {
				elementosNoComunes[pos] = array2[i];
				pos++;
			}
		}
		// Ajustamos el array al tamaño final
		int[] result = new int[pos];
		for (int i = 0; i < pos; i++) {
			result[i] = elementosNoComunes[i];
		}
		return result;
	}
}