package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear una clase con varios métodos que generen aleatoriamente distintos números o resultados 
		según las características del sorteo o para qué se vaya a usar, por ejemplo, generar 1, x, 2 para 
		una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para jugar a los 
		"chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben 
		todos.*/
		
		Aleatorio aleatorio = new Aleatorio ();
		
		System.out.println("Betis - Sevilla: " + aleatorio.quiniela());
		
		int j1 = aleatorio.chinos();
		int j2 = aleatorio.chinos();
		int j3 = aleatorio.chinos();
		
		int totalj1 = 5;
		int totalj2 = 7;
		int totalj3 = 3;
		//habría que averiguar para que esos valores lo ponga el usuario por pantalla. Y que no se repitan mediante un bucle//
		
		int total = j1+j2+j3;
		
		System.out.println("El total de monedas que se han sacado es :"+ total);
		
		if (totalj1==total) {
			System.out.println("El jugador 1 ha ganado");
		}else {
			System.out.println("El jugador 1 no ha ganado");
		}

		if (totalj2==total) {
			System.out.println("El jugador 2 ha ganado");
		}else {
			System.out.println("El jugador 2 no ha ganado");
		}

		if (totalj3==total) {
			System.out.println("El jugador 3 ha ganado");
		}else {
			System.out.println("El jugador 3 no ha ganado");
		}

	}

}
