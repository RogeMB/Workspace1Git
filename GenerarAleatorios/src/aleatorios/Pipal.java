package aleatorios;

import java.util.Random;

public class Pipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, tam=1000, nombre, booleano, apellido1, apellido2;

		
		
		
		String [] nombres = {
				new String ("Jerónimo") , new String ("José Luis") , new String ("Antonio"), new String ("Pedro"), 
				new String ("Manuel"), new String ("Victor"), new String ("Carlos"), new String ("Santiago"), 
				new String ("José Ignacio"), new String ("Adrián"), new String ("David"), new String ("Rogelio"), new String ("Luis Miguel"),
				new String ("Nicolás"), new String ("Ana Pilar"), new String ("Álvaro"), new String ("Maylor"), new String ("Arturo"),
				new String ("Nacho"), new String ("Mario"), new String ("Valentín"), new String ("Roberto"), new String ("Jorge"),
				new String ("Alejandro"), new String ("José Manuel"), new String ("Rafael"), new String ("Jesús"), new String ("Ángel"),
				new String ("Miguel"), new String ("Alberto"), new String ("Eduardo"), new String ("Goku"), new String ("Krilin"),
				new String ("Piccolo"), new String ("Bulma"), new String ("Vegeta"), new String ("Gohan"), new String ("Trunks"),
				new String ("Satán"), new String ("Juan Bosco"), new String ("Jon"), new String ("Lee"), new String ("Marina")
		}; //43
		
		String [] apellidos = {
			new String ("García"), new String ("Pérez"), new String ("González"), new String ("Jiménez"), new String ("Infante"),
			new String ("Puertas"), new String ("Arnáiz"), new String ("Cano"), new String ("Durbán"), new String ("Franco"),
			new String ("Fernández"), new String ("Chaves"), new String ("Ardana"), new String ("Martínez"), new String ("Barba"),
			new String ("López"), new String ("Céspedes"), new String ("Pedrazas"), new String ("Viloca"), new String ("Ortega"),
			new String ("Reina"), new String ("María"), new String ("Moreno"), new String ("Gómez"), new String ("Tenorio"),
			new String ("Rodríguez"), new String ("Rivas"), new String ("Fuentes"), new String ("Gil"), new String ("Martín"),
			new String ("Carrillo"), new String ("Iglesias"), new String ("Serón"), new String ("Delgado"), new String ("Lora"),
			new String ("Barrera"), new String ("Tejado"), new String ("Morilla"), new String ("Macho"), new String ("Romero"),
			new String ("Ruiz"), new String ("Bustamante"), new String ("Mercado"), new String ("Puertas"), new String ("Carvajal"),
			new String ("Velasco"), new String ("Mohigefer"), new String ("Barrera"), new String ("Tola"), new String ("Carro"),
			new String ("Puig"), new String ("Chavez"), new String ("Giménez"), new String ("Infantes"), new String ("Cano"),
			
		}; //55
		
 		char letra;
		
		
		
		for(int i=0;i<tam;i++) {
			
			Random aleatorio = new Random ();
			
			
			numero= aleatorio.nextInt(99999999-10000000 +1) +10000000;
			
			letra = (char) (aleatorio.nextInt(26) +'A');
			
			nombre = aleatorio.nextInt(42 +1);
			
			apellido1 = aleatorio.nextInt(54 +1);
			apellido2 = aleatorio.nextInt(54+1);
			
			booleano = aleatorio.nextInt(2+1);
			
			
			System.out.printf("(\'%d%c\', \'%s\', \'%s %s\', %s),\n", numero, letra, nombres[nombre], apellidos[apellido1], apellidos[apellido2], booleano!=1 ? "true": "false");
		}
		
	}
}