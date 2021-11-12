package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Hacer un programa que calcule el área de un círculo en cm2. En el main, debemos crear un objeto tipo Círculo y llamar a dicho método. 
		 * Mejorar el programa añadiendo a la clase Círculo otro método que calcule el área del círculo en m2.*/
		
		Circulo c = new Circulo (3.3); //dos con tres es un valor aleatorio //
		c.calcularArea ();
		
		double areaCir=0.0;
		
		areaCir=c.calcularArea();
		System.out.println("El área del círculo es: "+areaCir);
		System.out.println("El área del círculo es: "+c.calcularArea());  //ambos son válidos, pero iremos eligiendo uno u otro según el caso//
		
	}

}
