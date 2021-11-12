package ejercicio16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nRespuesta="Respuesta";
		double numUno=0, numDos=0, resultado=0;
		int salida=0;
		
		System.out.println("***MINI-CALCULATIX***");	
		
		
		do {
			resultado=0; //aunque esto no es necesario pues se reinicia solo al poner nuevos valores
			
			System.out.print("Introduzca el número 1: ");
			numUno=Leer.datoDouble();
			
			System.out.print("Introduzca el número 2: ");
			numDos=Leer.datoDouble();
			
			System.out.println("\nAhora pulse la opción según la operación que quiere hacer con ellos"
					+ " entre las siguientes posibles:");
			System.out.println("Pulse 0 para salir \nPulse + pasa sumar \nPulse - para restar \nPulse * para multiplicar"
					+ "\nPulse / para dividir\nPulse P (mayúscula) para ver si el primer número es par");
			
			nRespuesta=Leer.dato();
			switch (nRespuesta) {
				case "0" : 
					System.out.println("Salir");
				break;
				case "+" : 
					resultado=numUno+numDos;
					System.out.println(numUno + " + " + numDos + " = " + resultado);
				break;
				case "-" : 
					resultado=numUno-numDos;
					System.out.println(numUno + " - " + numDos + " = " + resultado);
				break;
				case "*" : 
					resultado=numUno*numDos;
					System.out.println(numUno + " * " + numDos + " = " + resultado);
				break;
				case "/": 
					if (numDos != 0) {
						resultado=numUno/numDos;
						System.out.println(numUno + " / " + numDos + " = " + resultado);
						}else {
							System.out.println("\t***ERROR***");
						}
				break;
				case "P": 
					if (numUno%2==0) {
						System.out.println("El primer número es un número PAR");
						}else {
							System.out.println("El primer número NO es PAR");
						}
						if (numDos%2==0) {
							System.out.println("El segundo número es un número PAR");
						}else {
							System.out.println("El segundo número NO es PAR");
						}
				break;
				default: System.out.println("***Operación incorrecta****");
			}
			System.out.println("\nPulse cualquier número excepto 0 para seguir operando. Pulse 0 para salir");
			salida=Leer.datoInt();
		
		} while (salida!=0);
		System.out.println("Gracias por utilizar Mini-Calculatix");
	
	}

}
