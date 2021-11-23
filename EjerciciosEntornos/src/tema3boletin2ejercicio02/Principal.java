package tema3boletin2ejercicio02;

public class Principal {

	public static boolean contains(int[] arr, int item) {
	      for (int n : arr) { //es lo mismo que escribir: for (int i = 0; i < arr.length; i++){ int n = arr[i];//
	         if (item == n) {
	            return true;
	         }
	      }return false;
	}
	public static void main(String[] args) {
		int[] my_array1 = {  //este array se referencia en el array de arriba que se llama arr. Es el mismo objeto.
				1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
	      
	      System.out.println(contains(my_array1, 2013));
	      System.out.println(contains(my_array1, 2015));
	   }
}

//diferencia paso por valor vs paso por referencia//
