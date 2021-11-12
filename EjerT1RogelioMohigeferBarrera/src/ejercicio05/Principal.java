package ejercicio05; /* Crear un programa donde se declare una variable que ser� una cantidad de euros, 
					y mostrar por pantalla su cambio a d�lares americanos. Se debe tener otra variable cuyo valor
					ser� el valor de 1 d�lar americano en euros, y otra para guardar el resultado (pod�is inventar el valor
					del cambio o buscarlo en internet).*/

public class Principal {

	public static void main(String[] args) {

		double eurInici=50.00, valorDolarUs=0.853219, chngDolarUs=0.00;

		
	System.out.println("Bienvenido/a,\n\n\tEste programa cambia a dólares americanos su cantidad de euros.");
		
		chngDolarUs=valorDolarUs*eurInici;	
	System.out.printf("\n\tTus euros iniciales son %.2f€, que son en dólares $%.2f .", eurInici, chngDolarUs);
	
	System.out.println("\n\nGracias por su confianza.");
	}

}
