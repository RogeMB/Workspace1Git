package ejercicio05;

import java.util.Random;

public class Aleatorio {
	
	
	/*todo en un método*/
	public int calcularAleatorio (int min, int max) {
		int valor = 0;
		Random num = new Random (System.nanoTime());
		valor= num.nextInt(max - min + 1) + min;
		return valor;
	}
	//==============================================QUINIELA==========================================
	public char calcularGanador (int ale) {
		char valor;
		if (ale == 1) {
			valor = '1';
			return valor;		
		}else if (ale == 3) {
			valor = 'X';
			return valor;
		}else {
			valor = '2';
			return valor;
		}
	}
	
	public void imprimirQuiniela () {
		int quince = 15, min = 1, max = 3, nueve = 9;
		char resultado;
		
		for (int i=0; i<quince; i++) {
			resultado=calcularGanador(calcularAleatorio(min, max));
			
			if (i<nueve) {
				System.out.print("Resultado  "+(i+1)+ ": ");
			}else 
				System.out.print("Resultado "+(i+1)+ ": ");
			
			switch (resultado) {
				case '1': 
					System.out.println("\t"+resultado);
					break;
				case 'X':
					System.out.println("\t\t"+resultado);
					break;
				case '2':
					System.out.println("\t\t\t"+resultado);
					break;
			}
		}
			
	}	
	//==============================================PRIMITIVA==========================================
	public void calcularPrimitiva (int primi[]) {
		int max = 49, min = 1;
		boolean control; //==false por defecto
		
		for (int i=0; i<primi.length; i++) {
			do {
				control=false; //no se han encontrado aún repeticiones
				primi [i] = calcularAleatorio (min, max);
				for (int j=0; j<i; j++) {
					if (primi [i] == primi [j]) {
						control=true; //se ha encontrado un número repetido
						break;
					}	
				}
			} while (control); //==true
			
		}	
	}
	
	public void imprimirPrimitiva (int primi[]) {
		for (int i=0; i<primi.length; i++) {
			System.out.print(primi [i]);
			if (i != primi.length-1)
				System.out.print(" - ");
			else System.out.println(".");
		}	
	}
	//==============================================CHINOS==========================================
	public int numeroPC () {
		int min = 0, max = 3;
		return calcularAleatorio (min, max);
	} 
	
	public int sumaChinosPC (int numPC) {
		int min = numPC, max = 6;
		return calcularAleatorio (min, max);
	}
	
	public int ganadorChinos (int numPC, int numJuga, int sumaPC, int sumaJuga) {
		int resultFinal = numPC+numJuga;
		if (sumaJuga == resultFinal) {
			return 1; //gana jugador
		} else if (sumaPC == resultFinal) {
			return 2; //gana pc
		} else 
			return 3; //no gana nadie
	}
	//==============================================PARESoNONES==========================================
	public int numeroPCdos () {
		int min = 0, max = 5;
		return calcularAleatorio (min, max);
	}
	
	private int esPar (int num) {
		int dos = 2;
		if (num %dos == 0) 
			return 2; //par
		else 
			return 1; //impar
	}
	
	private int ganadorParesNones (int numPC, int numJuga, int parImparJuga, int parImparPC) {
		int resultFinal = numPC + numJuga;
		if (esPar (resultFinal) == parImparJuga)
			return 1; //gana jugador
		else 
			return 2; //gana pc
	}
	
	public void imprimirGanadorParesNones (int numPC, int numJuga, int parImparJuga, int parImparPC) {
		int ganadorParesNones = ganadorParesNones(numPC, numJuga, parImparJuga, parImparPC);
		switch (ganadorParesNones) {
		case 1:
			System.out.println("\nEnhorabuena, has ganado tú. Yo había sacado "+numPC);
			break;
		case 2:
			System.out.println("\nPC: He ganado yo, otra vez será. Yo había sacado "+numPC);
			break;
		}
	}
}
