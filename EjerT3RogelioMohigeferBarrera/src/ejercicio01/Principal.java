package ejercicio01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1. Hacer un programa que calcule el área de un círculo en cm2. En el main, debemos crear un 
		 * objeto tipo Círculo y llamar a dicho método. Mejorar el programa añadiendo a la clase 
		 * Círculo otro método que calcule el área del círculo en m2.*/
		
		double radio;
		Circulo c = new Circulo ();
		double areaCir=0.0;
		
		System.out.println("¿Cuánto vale el radio en cm?");
		radio = Leer.datoDouble();
		
		c.setRadio(radio); /*valor en cm*/
		System.out.println("El radio vale: " +c.getRadio()+" cm.");
		
		areaCir=c.calcularArea();
		System.out.println("El área del círculo es: "+areaCir+" cm2.");
		System.out.println("El área del círculo es: "+c.calcularAreaMcuad ()+" m2.");  //ambos son válidos, pero iremos eligiendo uno u otro según el caso//
	} 

}
