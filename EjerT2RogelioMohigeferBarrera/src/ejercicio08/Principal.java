package ejercicio08;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8. Leer una secuencia de 10 números y mostrar solo la suma y el producto de todos ellos. */ 

	System.out.println("Bienvenido/a al programa");
	
	double numero=0, suma=0, producto=1;  //no puede ser el producto 0//
	int salir=0, i=0, tope=10;
	
	do {
		i=0; //reiniciamos// 
		suma=0;
		producto=1;
		
		//switch ()//
		
		while (i<tope) {
		System.out.println(+(i+1)+" Introduzca un número.");
		numero=Leer.datoDouble();
		suma=suma+numero;
		producto=producto*numero;
		i++;
	
		}
		System.out.printf("\nLa suma total es: %.2f", suma);
		System.out.printf("\nEl producto final es: %.2f", producto);
		System.out.println("\nSi quiere salir del programa pulse: 0. Si quiere seguir sumando o multiplicando pulse cualquier número menos 0");
		salir=Leer.datoInt(); //esto no es recomendable porque es muy pesado preguntarlo cada vez que se ejecute el programa. La solución es hacer un switch antes con el 0 para salir, y 1 para hacer el programa//
		
	}while(salir!=0);	
	
	System.out.println("\nFIN");
}
}