package ejercicio05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5. Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan en cada  una.
		 *  Se debe leer la sala deseada y mostrar: 
				a. Un mensaje con el precio de la entrada, que será diferente en cada sala (por ejemplo,  
				sala vip, sala 3D, sala normal y sala para niños). 
				b. Pedir el número de entradas. 
				c. Calcular el precio final y mostrarlo. */

		//mejor utilizar string para el nombre de la película: String pelicula1= loquesea//
	int opcion, entradaA=5, entradaB=6, entradaC=8, entradaD=10, numEntradas, preciototalentradas;
	
	System.out.println("\tBienbenido al cine!\n");
	System.out.println("A continuación le mostramos la cartelera");
	System.out.println("1. Maléfica - (Sala para niños)");
	System.out.println("2. Las posibles vidas d Mr Nobody - (Sala Normal)");
	
	opcion=Leer.datoInt();  /*podemos hacerlo más fácil que el caso explicado más abajo, indicando ANTES, el número de entradas,
	 para que no haya que indicarlo en cada case. OTRA opción es hacer otro switch diciendo qué tipo de sala quiere elegir, si VIP, 3D o normal, 
	 todo eso después de haber elegido la película y el número de entradas*/
	
	switch (opcion){
		
	}
	
	/*utilizaremos un switch, con 1 caso por película posible. En cada case habrá un print ln con la elección. Otro println indicando 
	el precio de la entrada, y un último println preguntando cuántas entradas quiere. Luego leemos de nuevo para preciototalentradas e imprimimos
	println con el precio total de las entradas*/
	
	/*Podemos hacer un solo cálculo final declarando precioEntrada=precioSala1; en el case 1. y Así en todos los casos. 
	 * Al final después del switch, precioF=numEntradass*precioEntrdadas*/	
		
	/*habría que poner un if para que el usuario ponga un número correcto de entradas. Pero esto no incluirlo aún porque no hemos visto bucles para repetir la operación*/
	
	}

}
