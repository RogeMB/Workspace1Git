package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa que calcule el volumen de un cilindro. Vosotros debéis decidir qué método
		* usar y qué valores pasarle.*/
		
		
		double radio, altura, volCilin;
		
		System.out.println("\t\tPrimera forma de calcularlo:");
		
		System.out.println("\n¿Qué radio tiene el cilindro?"); 
		radio=Leer.datoDouble();
		System.out.println("\n¿Qué altura tiene el cilindro?"); 
		altura=Leer.datoDouble();
		
		Cilindro c = new Cilindro (radio, altura);
		
		volCilin =c.CalcularVolumen();
		System.out.println("El volumen del cilindro es: "+volCilin+" u3.");
		
		System.out.println("\n\t\tSegunda forma de calcularlo:");
		
		System.out.println("\n¿Qué radio tiene el cilindro?"); 
		radio=Leer.datoDouble();
		System.out.println("\n¿Qué altura tiene el cilindro?"); 
		altura=Leer.datoDouble();
		
		Cilindro cl = new Cilindro ();
		
		cl.setRadio(radio);
		cl.setAltura(altura);
		
		volCilin =cl.CalcularVolumen();
		System.out.println("El volumen del cilindro es: "+volCilin+" u3.");
		System.out.println("El radio vale: "+cl.getRadio()+" u.");
		System.out.println("La altura vale: "+cl.getAltura()+" u.");

	}

}
