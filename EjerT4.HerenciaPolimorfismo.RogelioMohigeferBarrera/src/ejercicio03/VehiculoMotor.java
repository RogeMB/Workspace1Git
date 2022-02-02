package ejercicio03;

public class VehiculoMotor {
	/*Los vehículos a motor pagan un determinado impuesto de circulación. La cantidad a pagar depende
	de la cilindrada, caballos y tipo de combustible. Crear un programa para calcular la cantidad que debe
	pagar un vehículo dependiendo de sus características. (Los vehículos a motor pueden ser motocicletas,
	coches y furgonetas).
	El impuesto se calcula con una cantidad fija por el simple hecho de ser un vehículo con motor, más el
	60 % de la potencia en el caso de las motocicletas, más una cantidad fija a las furgonetas por ser
	transporte de mercancías y más el 25 % de la cilindrada para los coches.
	La jerarquía de clases no tiene mucho sentido en este ejemplo, pero está puesto para reescribir métodos.
	Probar todo en un main sencillo.*/
	
	//NO ES ABSTRACTA PORQUE LA CLASE VEHÍCULO TIENE (DEVUELVE) UNA CANTIDAD FIJA DE IMPUESTOS//
	
	private double cilindrada;
	private double caballos;
	private int cilindros;
	private TipoCombustible tipoCombustible;
	
	//Constructores
	public VehiculoMotor(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible) {
		super();
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.cilindros = cilindros;
		this.tipoCombustible = tipoCombustible;
	}

	
	//ToString
	@Override
	public String toString() {
		return "VehiculoMotor [cilindrada=" + cilindrada + ", caballos=" + caballos + ", cilindros=" + cilindros
				+ ", tipoCombustible=" + tipoCombustible + "]";
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

	
	
	//Métodos
	public double calculoPotencia () {
		double constanteKW =  1.341;
		double constanteHP = 0.746;
		return (this.caballos*constanteKW)/constanteHP;
	}
	
	public double calculoCM3 () {
		return this.cilindrada/this.cilindros;
	}
	
	
	public double importePotencia () {
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
	
	
	public double importeCM3 () {
		double importe = 0.0;
		if (this.cilindrada >= 0 && this.cilindrada <= 125.00) {
			importe = 4.12;
		}else if (this.cilindrada > 125.0 && this.cilindrada <= 250.00) {
			importe = 8.35;
		}else if (this.cilindrada > 250.0 && this.cilindrada <= 500.00) {
			importe = 14.73;
		}else {
			importe = 19.99;
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
