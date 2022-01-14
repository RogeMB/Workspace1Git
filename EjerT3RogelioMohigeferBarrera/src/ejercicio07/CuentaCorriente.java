package ejercicio07;


public class CuentaCorriente {
	
	//Atributos
	
	private double saldo;  //nunca se instancia objetos ni se le da valor a los atributos//
	private String nNombreTitular;
	private Oficina o;
	
	//Constructores//
	
	public CuentaCorriente(double saldo, String nNombreTitular) {
		this.saldo = saldo;
		this.nNombreTitular = nNombreTitular;
	}
	
	
	//Getters & Setters//
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getnNombreTitular() {
		return nNombreTitular;
	}

	public void setnNombreTitular(String nNombreTitular) {
		this.nNombreTitular = nNombreTitular;
	}
	
	//toString//
	
	@Override
	public String toString() {
		return "CuentaCorriente [saldo= " + saldo + ", NombreTitular= " + nNombreTitular + "]";
	}

	
	//Métodos de cálculo
	
	/*public void ingresarDinero () {
		double dineroIngresar=0.00; 
		dineroIngresar = Leer.datoDouble();
		if (dineroIngresar >= 0) {
			saldo = saldo + dineroIngresar;
			this.imprimirCorrecto();
		} else 
			this.imprimirIncorrecto();
	}
	
	public void retirarDinero () {
		double dineroRetirar=0.00;
		dineroRetirar = Leer.datoDouble();
		if (dineroRetirar >= 0 && dineroRetirar <= saldo) {
			saldo = saldo - dineroRetirar;
			this.imprimirCorrecto();
		} else 
			this.imprimirIncorrecto();
	}
	
	public void cambioDolar () {
		double precioDolar=1.134, saldoDolar=0.00;
		System.out.println("\nEl valor actual del dóllar Americano es de: " + precioDolar+ "€");
		saldoDolar = precioDolar * saldo; 
		System.out.printf("Su saldo en dóllares americanos es: $%.2f\n", saldoDolar);  
		this.imprimirCorrecto();
	} //aquí tiene que haber un return get.saldo(); No actualizamos saldo. Solo hacemos una operacion sobre saldo sin una variable de saldoDolar.
	
	public void imprimeSaldo () {
		System.out.printf("\nSu saldo actual es de: %.2f€", saldo);
	}*/
}
