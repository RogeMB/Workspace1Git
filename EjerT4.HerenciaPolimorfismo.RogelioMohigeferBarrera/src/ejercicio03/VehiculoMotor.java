/**
 * 
 */

package ejercicio03;

/**
 * Base class of Motocicleta, Furgoneta and Coche with main attributes of the sub classes.
 * 
 * @author mohigefer.barog22
 * @version: JDK 11. Minimum JDK 5.
 */

public class VehiculoMotor {
	
	// NO ES ABSTRACTA PORQUE LA CLASE VEHÍCULO TIENE (DEVUELVE) UNA CANTIDAD FIJA DE IMPUESTOS
	private double cilindrada;
	private double caballos;
	private int cilindros;
	private TipoCombustible tipoCombustible;
	private String bastidor;
	private boolean activo;
	
	// Constructors	
	public VehiculoMotor(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible,
			String bastidor, boolean activo) {
		super();
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.cilindros = cilindros;
		this.tipoCombustible = tipoCombustible;
		this.bastidor = bastidor;
		this.activo = activo;
	}

	// ToString
	@Override
	public String toString() {
		return "VehiculoMotor [cilindrada=" + cilindrada + ", caballos=" + caballos + ", cilindros=" + cilindros
				+ ", tipoCombustible=" + tipoCombustible + ", bastidor=" + bastidor + ", activo=" + activo + "]";
	}


	// GettersSetters
	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}
	
	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	
	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	// Methods
	
	/**
	 * Method with two constants that changes CV into HP.
	 * @param void
	 * @return HP power.
	 * @exception If this.caballos is 0 returns 0.
	 * @see this.caballos
	 */
	public double calculoPotenciaHP () {
		double constanteKW =  1.341;
		double constanteHP = 0.746;
		return (this.caballos*constanteKW)/constanteHP;
	}
	
	/**
	 * Method that calculates CM3 through cilindrada and cilindros.
	 * @param void
	 * @return CM3.
	 * @exception If this.cilindrada && this.cilindros is 0 returns ERROR.
	 * @see this.cilindrada && cilindros
	 */
	public double calculoCM3 () {
		return this.cilindrada/this.cilindros;
	}
	
	
	/**
	 * Method that defines minimum imports depending of the HP power
	 * @param void
	 * @return minimum quantity to be paid
	 * @exception If this.caballos is 0 returns 0.
	 * @see this.caballos
	 */
	public double importePotencia () {
		double importe = 0.0;
		if (calculoPotenciaHP() >= 0 && calculoPotenciaHP() < 70.00) {
			importe = 30.83;
		}else if (calculoPotenciaHP() >= 70.00 && calculoPotenciaHP() <= 119.99) {
			importe = 50.42;
		}else {
			importe = 80.64;
		}
		return importe;
	}
	
	
	public double importeCM3 () {
		double importe = 0.0;
		if (calculoCM3() >= 0 && calculoCM3() <= 125.00) {
			importe = 1.618;
		}else if (calculoCM3() > 125.0 && calculoCM3() <= 250.00) {
			importe = 2.618;
		}else if (calculoCM3() > 250.0 && calculoCM3() <= 500.00) {
			importe = 6.834;
		}else {
			importe = 46.971;
		}
		return importe;
	}
	
	
	public void muestraTipoCombustible () { // cambiarlo por un void y varios sysos con las opciones si no funciona.
		TipoCombustible.values();
	}
	
	
	public TipoCombustible eligeTipoCombustible (int opcion) { 
		switch (opcion) {
		case 1: //no hacen falta los breaks con return.
			return TipoCombustible.Gasolina;
		case 2: 
			return TipoCombustible.Diésel;
		case 3:
			return TipoCombustible.Eléctrico;
		case 4:
			return TipoCombustible.Gas;
		case 5:
			return TipoCombustible.Híbrido;
		}
		return null;
	}
	
	
	public double calculoSuplemento () {
		double suplemento = 0.0, default1 = 1.0;
		switch(tipoCombustible) {
			case Gasolina:
				return suplemento = 1+suplemento; // Just for suplemento doens't appear as an not used variable.
			case Diésel:
				return suplemento = 1.2;
			case Eléctrico:
				return suplemento = 0.5;	
			case Gas:
				return suplemento = 0.75;
			case Híbrido:
				return suplemento = 0.85;
		}
		return default1;
	}
	
	
	public double calcularImpuestoCirculacion (int incremento) {
		return (importePotencia () + importeCM3 ()) * calculoSuplemento();
	}

}
