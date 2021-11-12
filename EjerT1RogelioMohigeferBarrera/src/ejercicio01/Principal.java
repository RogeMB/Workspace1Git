package ejercicio01; /*1. Declarar 3 variables de tipo entero (int) con valores 15, 1 y 6. Sumarlas y restar 1 al resultado,
					almacenándolo en una variable diferente. Imprimir el resultado almacenado en esa variable por la 
					salida estándar.*/


public class Principal {

	public static void main(String[] args) {

		int a=15, b=1, c=6;
		int result= 0;
	
	result=a+b+c;
	result--;

System.out.print("Bienvenido/a, \n \n \tEste programa calcula el resultado que busca"
		+ " al sumar las tres variables y restarle 1.\n");
System.out.println("\tTu resultado es: "+result+ ".");	
System.out.println("\nGracias por su confianza.");	

	}

}
