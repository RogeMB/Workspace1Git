package ejercicio03;

public class VehiculoMotor {
	
	//NO ES ABSTRACTA PORQUE LA CLASE VEHÍCULO TIENE (DEVUELVE) UNA CANTIDAD FIJA DE IMPUESTOS//
	private double cilindrada;
	private double caballos;
	private int cilindros;
	private TipoCombustible tipoCombustible;
	private String bastidor;
	private boolean activo;
	
	//Constructores	
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

	//ToString
	@Override
	public String toString() {
		return "VehiculoMotor [cilindrada=" + cilindrada + ", caballos=" + caballos + ", cilindros=" + cilindros
				+ ", tipoCombustible=" + tipoCombustible + ", bastidor=" + bastidor + ", activo=" + activo + "]";
	}


	//GettersSetters
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

	//Métodos
	public double calculoPotencia () {
		double constanteKW =  1.341;
		double constanteHP = 0.746;
		return (this.caballos*constanteKW)/constanteHP;
	}
	
	public double calculoCM3 () {
		return this.cilindrada/this.cilindros;
	}
	
	
	public double importePotencia (/*double incremento*/) {
		double importe = 0.0;
		if (calculoPotencia() >= 0 && calculoPotencia() < 70.00) {
			importe = 30.83;
		}else if (calculoPotencia() >= 70.00 && calculoPotencia() <= 119.99) {
			importe = 50.42;
		}else {
			importe = 80.64;
		}
		return importe;
	}
	
	
	public double importeCM3 (/*double incremento*/) {
		double importe = 0.0;
		if (this.cilindrada >= 0 && this.cilindrada <= 125.00) {
			importe = 1.618;
		}else if (this.cilindrada > 125.0 && this.cilindrada <= 250.00) {
			importe = 2.618;
		}else if (this.cilindrada > 250.0 && this.cilindrada <= 500.00) {
			importe = 6.834;
		}else {
			importe = 46.971;
		}
		return importe;
	}
	
	
	public void muestraTipoCombustible () { //cambiarlo por un void y varios sysos con las opciones si no funciona.
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
				return suplemento = 1+suplemento; //para que no me ponga como variable no usada.
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
	
	
	public double calcularImpuestoCirculacion () {
		return (importePotencia () + importeCM3 ()) * calculoSuplemento();
	}

}
