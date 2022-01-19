package ejercicio02prof;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero estilo hotel para que
		tenga caché. Debemos gestionar mi “minihotel” y para ello, debemos crear la clase Habitación, una
		clase Hotel con una lista de Habitaciones y una clase de prueba para gestionar el hotel (realmente
		habría algunas clases más, como serían Cliente, Productos, etc. Pero no entraremos en eso). Se
		podrá crear una habitación (cuyos atributos serán tipo, precio, qué servicios extra tiene, nombre de
		cliente asignado, número de días contratados, etc.) ver si está ocupada o no, calcular precio final
		según número de días, servicios extra contratados y consumo del minibar, mostrar factura,
		comprobar si está “limpia” (que ha pasado la limpiadora cada día) y aquellos métodos que se quieran
		añadir. Crear un main de prueba.*/
		
		
		String nombreCliente, clave;
		int numNoches, opcion = 0, salir = 0, numH = 0;
		
		//int tam;
		Habitacion listado [] =  {new Habitacion (1, 50.0, false, "Miguel", 2, true, false), 
				new Habitacion (2, 200.0, false, "Rafa", 2, false, true)};
		Hotel h;
		
		System.out.println("Bienvenido al hotel.");
		//System.out.println("¿Cuántas habitaciones quieres alquilar?");
		//tam=Leer.datoInt();
		//listado = new Habitacion [tam];
		
		h = new Hotel (listado);
		
		h.imprimirListado();
		System.out.println("¿Qué habitación quiere consultar?");
		numH=Leer.datoInt()-1; //se podría restar aqúi el numH-1 en lugar de en cada método.
		h.imprimirLimpia(numH);
		
		
	}

}
