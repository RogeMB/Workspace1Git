package ejemplo1;

public class principal {

	public static void main(String[] args) {
		
		int edad=444654655;
		byte numero=-111;
		short pais=034;
		long codigopostal=41010; //si nos sale el s�mbolo de advertencia a la izquierda, es que no est� siendo usada esta variable y podemos borrarla//
		float sueldo=156455.55F;  //hay que poner una F para que el programa sepa que es un Float y no un double//
		double litros=3476553.349;
		double a=1;
		double b=3;
		char piso='B';
		boolean betis= true;
					
				
	System.out.println("Hola Mundo!");
	System.out.println("Tu edad es: "+edad+" a�os");
	System.out.println("El total de litros son: "+litros+" litros totales");
	System.out.println("El n�mero de la calle es el: "+numero);
	System.out.println("Mi sueldo ser� de: "+sueldo+ " euros");
	System.out.println("El mejor equipo del mundo es el Betis: "+betis);
	System.out.println("1 entre 3 es igual a "+a/b);
	System.out.println("Letra del Piso es la "+piso);
	}

}
