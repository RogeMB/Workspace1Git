package ejercicio07;

import lectura.Leer;

public class Oficina {
	
	private CuentaCorriente c; //no ponemos = new Cuenta ()//
	private int id; //id de la oficina//

	//Constructores lleno y vacío
	
	public Oficina(CuentaCorriente c, int id) {
		this.c = c;
		this.id = id;
	}
	
	public Oficina() {
		
	}
	
	
	//Getters & Setters
	
	public CuentaCorriente getC() {
		return c;
	}
	public void setC(CuentaCorriente c) {
		this.c = c;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	//toString
	
	@Override
	public String toString() {
		return "Oficina [c=" + c + ", id=" + id + "]";
	}
	
	//otra versión sería sin objeto
	
	public void ingresarDinero (double cantidad) {
		c.setSaldo(c.getSaldo() + cantidad);
	}
	
	public boolean retirarDinero (double cantidad) {
		if (cantidad >= 0 && cantidad <= c.getSaldo()) {
			c.setSaldo(c.getSaldo() - cantidad);
			return true;
		} else 
			return false;	
	}
	
	public void cambioDolar () {
		double precioDolar=1.134, saldoDolar=0.00;
		System.out.println("\nEl valor actual del dóllar Americano es de: " + precioDolar+ "€");
		saldoDolar = precioDolar * c.getSaldo(); 
		System.out.printf("Su saldo en dóllares americanos es: $%.2f\n", saldoDolar);  
		c.imprimirCorrecto();
	}
	
	public void imprimeSaldo () {
		System.out.printf("\nSu saldo actual es de: %.2f€", c.getSaldo());
	}
	
	

}
