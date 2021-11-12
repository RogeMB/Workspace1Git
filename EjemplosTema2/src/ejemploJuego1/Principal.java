package ejemploJuego1;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
	
	int nvl=0;
	double puntosExp, x20000=20000;
	
	System.out.println("Introduzca sus puntos de Experiencia");
	puntosExp=Leer.datoDouble();
	
	while (puntosExp>=20000) {
		nvl++;
		puntosExp=puntosExp-x20000;
		
	
	}
	System.out.println("Su nivel de experiencia es: " +nvl);
	
	}

}
