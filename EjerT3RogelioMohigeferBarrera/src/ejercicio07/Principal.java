package ejercicio07;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está
		* caracterizada por su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de
		* operaciones:
		*	• Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No
		*		imprime de nuevo el saldo, pero sí lo actualiza.
		*	• Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la
		*		cuenta una determinada cantidad de dinero especificada por el usuario. No imprime de
		*		nuevo el saldo, pero sí lo actualiza.
		*	• Calcular el saldo en dólares americanos. Se le debe pasar el valor de cambio y debe
		*		devolver el valor del saldo en dólares.
		*	• Consultar el saldo.
		*
		* Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase CuentaCorriente que
		* implemente las funcionalidades descritas y un main con un menú para probarlas.*/
		
		int opcion=0, salir=0;
		CuentaCorriente c = new CuentaCorriente ();
		
		c.takeMyCash();
		c.bienvenido();
		
		do {
			System.out.print("\n\nTeclee el número de la operación que desea realizar. \n0. Salir \n1. Ingresar dinero "
					+ "\n2. Retirar dinero \n3. Cambio a Dóllar Americano \n4. Ver saldo actual. \nRespuesta: ");
			opcion=Leer.datoInt();
			switch (opcion){
				case 0:
					if (opcion == salir) {
						c.adios();
					}
					break;
				case 1:
					System.out.print("\nTeclee cantidad a ingresar: ");
					c.ingresarDinero();
					break;
				case 2:
					System.out.print("\nTeclee cantidad a retirar: ");
					c.retirarDinero ();
					break;
				case 3:
					c.cambioDolar ();
					break;
				case 4:
					c.imprimeSaldo();
					break;
				default:
					c.imprimirInvalido();
				}
		} while (opcion!=salir);
	
	}

}

