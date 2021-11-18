package ejercicio05;

import java.util.Random;

public class Aleatorio {
	
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
