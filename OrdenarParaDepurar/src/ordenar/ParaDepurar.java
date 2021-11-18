package ordenar;

import java.util.Arrays;

public class ParaDepurar {

		private static int [] sort (int[] numbers) {
			for (int i= 0; i < numbers.length - 1; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers [i] < numbers [j]) {  //si se hace doble clic sobre un número de línea de la izquierda del todo saldrá un punto de breakpoint//
						int auxiliar = numbers [i];   //para quitarlo, doble clic de nuevo//
						numbers [i] = numbers [j];  //para depurar le damos al bichito verde del menú de arriba, y vamos siguiendo pasos por defecto y abriendo permisos en firewall
						numbers [j] = auxiliar;
					
					
					}
				}
			}
			return numbers;
		
		}
		public static void main (String[] args) { //aquí empieza a ejecutar Java, siempre en el main
			
			int[] numeros1 = new int [] {6, 54, 3, 45, 7, 9, 14, 21, 16, 4, 2, 1, 9, 17, 27, 33};
			int[] ordenado = sort (numeros1);
			System.out.println(Arrays.toString(ordenado));
		}
		
}

