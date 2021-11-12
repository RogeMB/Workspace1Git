package ejercicio14;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*14. Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de  un 
		 * sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra  por ventas 
		 * se calculará mediante el 20 % de lo vendido en total al mes.*/
		 
		int comision=20, cero=0, repetir=0, cien=100;
		double ventas=0.00, sueldoFijo=1000.00, sueldo=0.00;
		String nNombre= "nombre";
		
		System.out.println("\t\t*****SALARIATOR v1*****");
		do {
			System.out.print("Ingrese su nombre: ");
			nNombre=Leer.dato();
			System.out.println("¡Bienvenido/a "+nNombre+"!");
			System.out.println("Su sueldo fijo es de: "+sueldoFijo+"€."); //El programa busca en la BBDD el sueldo fijo del trabajador//
			System.out.print("Ingrese montante de las ventas realizadas: ");
			ventas=Leer.datoDouble();
			if (ventas<0) {
				System.out.println("Operación rechazada.");
			}else {
				sueldo=sueldoFijo+(ventas*comision/cien);
				System.out.printf("Su salario mensual será de: %.2f€.",sueldo);
			}
			System.out.println("\nPulse 0 para salir. Cualquier otro número para continuar.");
			repetir=Leer.datoInt();
		}while (repetir!=cero);
		System.out.println("\t\t*****GRACIAS. ¡VUELVA PRONTO!*****");
	}

}
