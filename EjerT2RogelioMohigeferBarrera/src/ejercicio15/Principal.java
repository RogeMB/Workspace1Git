package ejercicio15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*15. Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo,  
		 * retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos  necesarios
		 *  y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al  saldo de dicha
		 *   cuenta. La cuenta será creada por nosotros con un saldo inicial concreto. */
		 
		int opcion=0, cero=0, numEntradas=0;
		double saldo=1000.00, dineroSacar=0.00, dineroIngresar=0.00, precioEntrada=10.00;
		String nNombre ="Nombre";
		
		System.out.println("\t\t*****|| BARRIOCAJERO ||*****");
		System.out.printf("Ingrese su nombre: ");
		nNombre=Leer.dato();
		System.out.println("¡Bienvenido/a "+nNombre+"!. \nSu saldo actual es de "+saldo+"€.");
		
		do {
			System.out.println("\nTeclee el número de la operación que desea realizar. \n0. Salir \n1. Ingresar dinero "
					+ "\n2. Retirar dinero \n3. Comprar entradas \n4. Ver saldo actual.");
			opcion=Leer.datoInt();
			switch (opcion){
			case 0:
				if (opcion==cero){
					System.out.println("******GRACIAS POR ELEGIRNOS. VUELVA PRONTO******");
				}
			break;
			case 1:
				System.out.print("Teclee cantidad a ingresar: ");
				dineroIngresar=Leer.datoDouble();
				if (dineroIngresar>=0) {
					saldo=saldo+dineroIngresar;
					System.out.println("Operación realizada con éxito\n______________________________________________");
				}else {
					System.out.println("Operación rechazada.\n______________________________________________");
				}
			break;
			case 2: 
				System.out.print("Teclee cantidad a retirar: ");
				dineroSacar=Leer.datoDouble();
				if (dineroSacar >=0 && dineroSacar<=saldo) {
					saldo=saldo-dineroSacar;
					System.out.println("Operación realizada con éxito\n______________________________________________");
				}else {
					System.out.println("Operación rechazada.\n______________________________________________");
				}
			break;
			case 3:
				System.out.print("El precio de las entradas es de: "+precioEntrada+". "
						+ "\n¿Cuántas entradas desea comprar? ");
				numEntradas=Leer.datoInt();
				if (numEntradas>0 && numEntradas*precioEntrada<=saldo) {
					saldo=saldo-numEntradas*precioEntrada;
					System.out.println("Operación realizada con éxito\n______________________________________________");
				}else {
					System.out.println("Operación rechazada.\n______________________________________________");
				}
			
			case 4: 
				System.out.println("Su saldo actual es de: "+saldo+"€.");
			break;
			default : System.out.println("Opción inválida.\n______________________________________________");
			}
		} while (opcion!=cero);
	
	}

}
