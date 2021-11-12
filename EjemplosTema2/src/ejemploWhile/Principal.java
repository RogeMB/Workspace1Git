package ejemploWhile;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imprimir un número del 1 al 10//
	
		int num=0, top=0, cond=0, max=10;
		System.out.println("Diga hasta qué número quiere mostrar");
		top=Leer.datoInt();
		
		do {
		while (num<top) {
			num++; //El orden de las operaciones influye muchísimo en los bucles, OJO//
			System.out.println("El número es: "+num);
		}
		}while (num<=15);
		
		System.out.println("Diga un número del 1 al 10");
		cond=Leer.datoInt(); //imprime hasta el 10 desde el número que se quiera//
		
		while (cond<max) {
			cond++; 
			System.out.println("El número es: "+cond);
		
		}
		
		
		
		
		
		
		
		
		
		
	
	}

}
