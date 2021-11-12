package ejemploArrays2;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=4;
		
		int [] edades =new int [tam];
		
		for (int i=0;i<edades.length;i++) { //el lenght es para determinar el tamaño siempre, para ver hasta donde llegamos en un for//
			System.out.println("Diga un número");
			edades[i]=Leer.datoInt();
		}
		
		for (int i=0; i<edades.length;i++) { //si solo quiero mostrar 2, en lugar de i<edades.lenght, ponemos 2//
			System.out.println("El número es: "+edades[i]);
		}
		
	}

}
