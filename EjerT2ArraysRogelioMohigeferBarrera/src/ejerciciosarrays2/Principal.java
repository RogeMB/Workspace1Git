package ejerciciosarrays2;

//import java.util.Random;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2.Implementar un programa que rellene automáticamente un array de enteros con 10 posiciones, 
		cada elemento debe contener el valor del doble de su índice. Mostrar el resultado por pantalla.*/

	int tam=10, dos=2;
	int [] lista = new int [tam];
	//Random r = new Random (System.nanoTime());
	
	for (int i=0; i<lista.length; i++) {
		//lista [i]= r.nextInt(11)*dos;  // aleatorio entre 0 y 10
		lista[i]=dos*i;
		System.out.printf("\nValor: %d", lista[i]);
		
	}
	
	}

}
