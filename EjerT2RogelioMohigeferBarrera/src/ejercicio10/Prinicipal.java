package ejercicio10;

import lectura.Leer;

public class Prinicipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10. Leer un número y determinar su factorial. */
		
		int num = 0;
		double fac= 1;
		
		System.out.println("Bienvenido/a,"
				+ "Este programa le indicará el factorial del número que usted quiera.");
	
		do {
			System.out.print("Introduzca un número entero positivo, o negativo para salir: ");
			num=Leer.datoInt();
			if (num>=0) {
				for (double i=num; i>1; i--) {
					fac=fac*i;
				}
				System.out.println(num+"!= "+fac);
			}		
		} while (num>=0);
		System.out.println("FIN. GRACIAS.");
		
	} 
				
}			
		//Con recursividad//
       /* do {
            System.out.print("Introduzca un número entero positivo: ");
            num=Leer.datodouble();
        } while (num<0);

        System.out.println("Factorial de " + num + " = " + fact(num));
    }

    public static double fact(double n) {
        if (n==1 || n==0) {
            return (1);
        } else {
            return(n*fact(n-1));
        }
    }*/
  
