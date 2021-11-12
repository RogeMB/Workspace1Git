package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		/*A mi padre le gusta medir la capacidad de personas que admite un lugar o eventos en el "número de Navas (nombre de mi pueblo)", en este caso, 
		 * Navas sería una unidad de medida de un número de personas que habría en un lugar, por ejemplo, si mi pueblo tiene 1500 habitantes, en un campo 
		 * de fútbol de 15000 espectadores cabrían "10Navas". Calcula el número de Navas que entrarían en el Camp Nou, en el concierto de U2 en el Estadio
		 * Olímpico donde asistieron 65000 personas y en el teatro del colegio, que tiene 600 localidades.*/
		
		double estad=65000, cole=600, CNou=99354, hab=1500, resultNavasCartu=0, resultNavasNou=0, resultNavasCole=0;
		
		System.out.println("Bienvenido/a,\n\nEste programa calcula el número de navas que caben en los diferentes recintos declarados");
		
		resultNavasCartu= estad/hab;
		System.out.printf("\n\tEl número de Navas que asistirán al Estado para el concierto de U2 serán de: %.2f Navas.", resultNavasCartu); /*Hay que expresarlo 
		* a double para que no se pierdan decimales, es decir, información*/
		
		resultNavasNou=CNou/hab;
		System.out.printf("\n\tEl número de Navas que cabrían en el Camp Nou serán de: %.2f Navas.", resultNavasNou);
		
		resultNavasCole=cole/hab;
		System.out.printf("\n\tEl número de Navas que cabrían en el teatro del colegio serán de: %.2f Navas.", resultNavasCole);
		
		System.out.println("\n\nGracias por su confianza");
	}

}
