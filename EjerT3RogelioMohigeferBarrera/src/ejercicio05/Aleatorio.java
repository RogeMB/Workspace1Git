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
		int quince = 15, min=1, max=3, nueve=9;;
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
	
	
	
	
	
	

	

	
	
	
	
	
	
	
}
