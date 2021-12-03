package ejercicio05;

import java.util.Random;

public class Aleatorio {
	
	
	/*todo en un método*/
	public int calcularAleatorio (int max, int min) {
		int valor = 0;
		Random num = new Random (System.nanoTime());
		valor= num.nextInt(max - min + 1) + min;
		return valor;
	}
	
	public char calcularGanador (int prob) {
		char valor;
		if (prob == 1) {
			valor = '1';
			return valor;		
		}else if (prob == 3) {
			valor = 'X';
			return valor;
		}else {
			valor = '2';
			return valor;
		}
	} /*lo correcto sería que los 1, 2 y X pinten en consola a través de otro método. 
	   * Los métodos que imprimen van con void*/
	
	public boolean comprobarGanadorPrimi (int numJugado, int numGanado) {
		boolean resultado = true;
		if (numJugado == numGanado) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	public void mostrarGanador (boolean decimo) {  /*mostramos ganador*/  /*dentro del IF se hace si la condición es verdadera*/
		if (decimo) { /*como la variable que ya estamos usando (decimo) es booleana no hace falta poner decimo = true, o true a secas*/
			System.out.println("¡Enhorabuena, has ganado!");
		}else {
			System.out.println("Sigue probando suerte.");
		}
	} 
	
	/*podemos LLAMAR a un método dentro de otro método, pero no podemos HACER un método dentro de otro método*/
	
	/*---------------------------------------------------------------------------------------------------------*/
	public char quiniela () {
		int n = aleatorio (2) + 1;
		switch (n) {
			case 1: return '1';
			case 2: return '2';
			default: return 'x';
		}
	}
	
	public int chinos () {
		return aleatorio (3);
	}
	public int primitiva () {
		return aleatorio (48) +1;
	}
	
	//maximo está incluido entre los valores de retornos
	private int  aleatorio (int maximo) {
		Random r = new Random ();
		return r.nextInt (maximo+1);
	}

	

	
	
	
	
	
	
	
}
