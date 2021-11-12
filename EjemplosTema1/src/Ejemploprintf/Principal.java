package Ejemploprintf;

public class Principal {

	public static void main(String[] args) {
		
		double sueldo=867.342796;
		double sueldoBruto=867.342796;
		int edad=32;
		int a=4;
		
		String apellido1="Mohigefer"; //String con la S en may�scula SIEMPRE//
		
		
System.out.println("Tu sueldo sin redondear es: "+sueldo+ " euros"); 
System.out.print("Tu sueldo redondeado es: ");
System.out.printf("%.2f %n", +sueldoBruto);

//otra manera m�s eficaz es://

System.out.printf("Tu sueldo redondeado es: %.2f euros " //hemos dado a Enter para no hacer una l�nea tan larga, sin que afecte a la visualizaci�n final//
		+ "y el sueldo bruto es: %.5f euros %n \n",sueldo, sueldoBruto); //al estar %n y \n ha dejado dos l�neas blancas.//
System.out.printf("Tu sueldo redondeado es: %.2f euros "
		+ "\t y el sueldo bruto es: %.5f euros \n" ,sueldo, sueldoBruto);
System.out.printf("\n \t \tMi edad es: %d", edad); //tabulamos con \t, �til para tablas//

System.out.println ("\n \nSu apellido es: "+apellido1);
System.out.printf("Tu apellido es: %s y tienes %d a�os", apellido1, edad);
		
System.out.println(a);
	a=7;   //aqu� hemos dicho que a partir de aqu� para abajo, el valor o significado de la variable "a" va a ser 7 en lugar de 4//

	}

}
