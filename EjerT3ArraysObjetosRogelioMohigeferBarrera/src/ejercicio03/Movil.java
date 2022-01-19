package ejercicio03;

public class Movil {
	

	/*3. Vamos a intentar modelar a un vendedor ambulante de “móviles”. Los atributos de la clase Móvil
	serán, como mínimo, marca, modelo, vendido o no y precio unitario. En la clase Vendedor con un
	array de Móviles y total vendido, como atributos mínimos, se deben crear métodos que hagan las
	siguientes operaciones: Comprobar que le quedan móviles, mostrar cuántos móviles le quedan sin
	vender, mostrar precio final de un producto haciendo algún descuento al precio unitario, etc.
	Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio. Escribir también una clase
	de prueba para hacer todas las operaciones.*/
	
	
	private String marca;
	private String modelo;
	private boolean vendido;
	private double precioUnitario;
	private boolean reacondicionado;
	
	//Constructores
	public Movil(String marca, String modelo, boolean vendido, double precioUnitario, boolean reacondicionado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.precioUnitario = precioUnitario;
		this.reacondicionado = reacondicionado;
	}

	public Movil() {
		super();
	}

	
	//ToString
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", precioUnitario="
				+ precioUnitario + ", reacondicionado=" + reacondicionado + "]";
	}

	
	//GettersSetters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public boolean isReacondicionado() {
		return reacondicionado;
	}

	public void setReacondicionado(boolean reacondicionado) {
		this.reacondicionado = reacondicionado;
	}

}
