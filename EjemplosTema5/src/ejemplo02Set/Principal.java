package ejemplo02Set;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> lista = new HashSet <String> ();
		
		lista.add("Roge");
		lista.add("Paco");
		lista.add("Pepe");
		lista.add("Carlota");
		lista.add("Papi");
		
		System.out.println(lista);  // No importa el orden de insercción. Lo guarda como si fuera un saco de papas al criterio de la IDE.
		
		
	}

}
