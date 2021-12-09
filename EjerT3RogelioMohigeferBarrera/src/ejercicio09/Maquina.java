package ejercicio09;

import lectura.Leer;

public class Maquina {
	double precio = 1.5;
	
	public double calcularPrecio (int numTickets) {
		return precio*numTickets;
	}
	
	public int preguntarTickets () {
		int numTickets = 0;
		System.out.println("¿Cuántos tickets desea adquirir?");
		numTickets=Leer.datoInt();
		while (numTickets < 0) {
			System.out.println("Introduzca una opción correcta.");
			numTickets=Leer.datoInt();
		}
		return numTickets;
	}
	
	public double calcularCambio (int numTickets, double ingreso) {
		return ingreso-calcularPrecio (numTickets);
	}
	
	public double pago (int numTickets) {
		double ingreso, cambio;
		do {
			System.out.println("El precio total es : "+calcularPrecio(numTickets)+"\nIntroduzca importe: ");
			ingreso=Leer.datoDouble();
			cambio=calcularCambio (numTickets, ingreso);
			if (cambio < 0) {
				System.out.println("Falta: "+(-cambio)+"\nIntroduzca importe restante: ");
				ingreso=ingreso+Leer.datoDouble();
				cambio=calcularCambio (numTickets, ingreso);
			} else {
				System.out.println("Recoja el cambio: "+cambio);
			}
		} while (cambio < 0);
		return 1;
	}
	
	public void venderTickets () {
		int numTickets;
		double ingreso, cambio;
		numTickets = preguntarTickets();
		
		if (numTickets > 0) {
			
		} 
		
	}

}
