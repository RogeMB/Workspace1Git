package ejercicio11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*11. Escriba un programa al que se le pasen dos números a y b y calcule y muestre la operación ab. 
		 *  No se puede usar la función pow (). */

		  int base=0, exponente=0, potencia=1;
		  int repetir=1;
		  
		  System.out.println("Cálculo de potencias");
		  do { 
	         do {
	             System.out.print("Introduzca base: ");
	             base=Leer.datoInt();
	             if (base<0) {
	                 System.out.println("La base debe ser > 0");
	             }
	         } while (base<0);
	         do {
	             System.out.print("Introduzca exponente: ");
	             exponente=Leer.datoInt();
	             if (exponente<0) {
	                 System.out.println("El exponente debe ser > 0");
	             }
	         } while (exponente<0);

	         for(int i=0;i<exponente;i++) {  //i tiene que valer 1 sí o sí en este caso//
	             potencia = potencia*base;
	         }
	         if (base==0 && exponente==0) {
	        	 System.out.println("\t***Operación imposible de realizar***");
	         }else {
	             System.out.println(base + " elevado a " + exponente + " = " +
	            			potencia);  				 
	         }
	         System.out.printf("\nTeclee 1 para repetir el proceso. Cualquier otro número para salir.");
	         repetir=Leer.datoInt();
	         
		 } while (repetir==1);  
		 System.out.println("FIN. GRACIAS");
	}
}
