package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		/*Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área de un círculo de radio 5.2 metros*/
		
			double radioMtCircunf=3.00, radioMCircul=5.20, longCircunf=0.00, areaCircul=0.00, exponte=2.0;
	System.out.println("Bienvenido/a, \n\n\tEste programa le calculará la longitud de una circunferencia determinada y el área de un círculo determinado.");
	
	longCircunf=2*Math.PI*radioMtCircunf; //utilizamos la constante 2 multiplicando variables porque es una fórmula universal L=2*PI*r//
	System.out.printf("\n\tLa longitud de su circunferencia con un radio %.2f metros es de %.2f metros.", radioMtCircunf, longCircunf);
	
	areaCircul=Math.PI*Math.pow(radioMCircul, exponte); //Utilizaremos también constante pues es fórmula universal A=PI*r^2)
	System.out.printf("\n\n\tEl área de su círculo con un radio de %.2f metros es de %.2f metros cuadrados.", radioMCircul, areaCircul);
	
	System.out.println("\n\nGracias por su confianza");
	}

}
