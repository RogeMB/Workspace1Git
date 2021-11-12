package ejercicio02; 
public class Principal {
	
	/*Calcula y muestra en pantalla el área de una piscina olímpica (50m de largo por 21m de ancho)
	 * ¿Cuántos litros de agua hacen falta para llenarla si tiene 2.50m de profundidad?
	 * ¿Cuánto costará llenarla si el metro cúbico cuesta 1.80€*/

	public static void main(String[] args) {
		
		double largo=50.00, ancho=21.00, altura=2.50; //las variables del mismo tipo se pueden declarar en la misma línea double largo=X, ancho=Y,... etc;//
		double areaP=0.00;
		double volL=0.00, volMcub=0.00;
		double precioMcub=1.80, costeTtl=0.00; 
		double multipli=1000; //NUNCA PONEMOS NUMEROS OPERANDO VARIABLES, SIEMPRE COMO UNA VARIABLE NUEVA//
		
System.out.println("Bienvenido/a, \n\n\tEste programa calula el área de su piscina."
		+ " Además, conseguirá saber el volumen total y el precio que le costará llenarla de agua. \n");

	areaP=largo*ancho;
System.out.printf("\tEl área de su piscina es igual a: %.0f metros cuadrados.\n",areaP);

	volMcub=largo*ancho*altura;  //las variables de distinto tipo no se puede hacer operaciones con ellas.//
	volL=volMcub*multipli; //1 metro c�bico es igual a 1000 litros.// 
System.out.printf("\tEl volumen total de su piscina es de: %.2f litros.\n ",volL);
	
	volMcub=volL/multipli; //Como el precio que me dan es euro por metro cuadrado, volvemos a pasar los litros a metros cuadrados//
	costeTtl=precioMcub*volMcub;
System.out.printf("\tEl coste total de llenar su piscina será de: %.2f €. \n ",costeTtl);

System.out.println("\nGracias por su confianza.");	
	}
	
}

