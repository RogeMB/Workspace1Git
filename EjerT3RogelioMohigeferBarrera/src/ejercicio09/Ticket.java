package ejercicio09;

public class Ticket {
	private double precio1Ticket = 1.5;
	private int numViajeros = 0;
	
	// Constructores
	public Ticket(int pasajeros) {
		this.numViajeros = pasajeros;
	}
	
	public Ticket() {
	}
	
	// Setters and Getters
	public double getPrecio1Ticket() {
		return precio1Ticket;
	}
	
	public void setPrecio1Ticket(double precioTicket) {
		this.precio1Ticket = precioTicket;
	}
	
	public int getNumViajeros() {
		return numViajeros;
	}
	public void setNumViajeros(int numViajeros) {
		this.numViajeros = numViajeros;
	}
	
	// Métodos
	public double precioTicket() {
		return precio1Ticket*numViajeros;
	}
	
	public void imprimeTicket() {
		System.out.println("\n");
		System.out.println("*** Ticket correctamente emitido ***");
		System.out.println("\tViajeros: " + numViajeros);
		System.out.println("\tPrecio abonado: " + precioTicket());
		System.out.println("******* Disfrute de su viaje *******");
	}
	
}
