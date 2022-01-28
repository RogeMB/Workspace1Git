package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0, desde = 0, hasta = 0, idOficina = 0, superficio = 0, superficie = 0, precioVenta = 0;
		int mes = 0, ganancia = 0, precioM2 = 0, cero = 0, uno = 1, seis = 6;
		double cambio  = 0.0, precioLibras = 0.0;
		String direccion = "C/Conde de Bustillo", reformar = "No";
		int [] listaPrecios  = new int [seis];
		
		Piso piso = new Piso (direccion, superficie, reformar, precioVenta);
		Inmobiliaria inmo;
		
		System.out.println("Bienvenido/a, a este programa de gestión de pisos.");
		
		idOficina  = 1;
		inmo = new Inmobiliaria (idOficina, piso, listaPrecios);
		
		do {
			System.out.println("Menu");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Chao Pescao");
				break;
			case 1:
				desde = 50000;
				hasta = 100000;
				listaPrecios = inmo.rellenarLIstadoPRecio(desde, hasta);
				for (int i = 0; i < listaPrecios.length; i++) {
					System.out.println(listaPrecios [i]+"€");
				}
				break;
			case 2:
				System.out.println("Diga mes:");
				
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			}
		} while (opcion != cero);

	}

}
