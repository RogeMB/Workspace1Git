package ejerciciosarrays1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*1.Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5 personas y
mostrarlo por la pantalla mediante un bucle for.*/
	
	int tam=5;
	String [] nombres = {"Roge", "Javier", "Papá", "Mamá", "Ítaca"};
	String [] nombresDos = new String [tam];
	
	
	System.out.println("Bienvenido/a al programa,");
	System.out.println("Este programa le imprime los nombres predefinidos."); 
	for (int i=0; i<nombres.length; i++) {	
		System.out.println("Nombre "+(i+1)+": "+nombres[i]); //Ejercicio 1 de Arrays hasta aquí.//
	}
	
	System.out.println("\nEsto es otra parte del programa.");//********ejercicio extra*********//
	for (int i=0;i<nombresDos.length;i++) {  
		System.out.println("\nEscriba su nombre aquí: "); 
		nombresDos[i]=Leer.dato();
	}

	for (int i=0;i<nombresDos.length;i++) {
		System.out.println("Su nombres es: "+nombresDos[i]);
	}
	
	}

}
