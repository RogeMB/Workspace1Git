package ejemploAleatorio;

import java.util.Random;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Random num= new Random (System.nanoTime()); //num es el nombre que queramos a la variable//
		
		int aleatorio=0;
		int hasta=10, desde=0;
		
		System.out.println("Vamos a generar aleatorios enteros en el rango que usted quiera");
		System.out.println("Diga el número mayor");
		hasta=Leer.datoInt();
		System.out.println("Diga el número menor");
		desde=Leer.datoInt();
		aleatorio= num.nextInt(hasta-desde+1)+desde; //Nos devuelve un int aleatorio. num es el nombre que le hemos puesto arriba a la variable// 
		//el +1 es para que también nos incluya el 10//
		System.out.println("Ha salido el: " +aleatorio);
		
	}

}
