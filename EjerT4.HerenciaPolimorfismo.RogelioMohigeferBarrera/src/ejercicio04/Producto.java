package ejercicio04;

public abstract class Producto {
	
	private double precio;
	private String nombre;
	private String codigo;
	//no se pueden crear objetos de la clase productos, por ser abstracta, en principal. pero sí se pueden crear arrays de productos,
	//es decir, direcciones de memoria donde están instanciados los productos de sus clases hijas
	
	//en principal podemos utilizar el instaceof así: listado [i] instaceof Alimentacion devuelve verdadero o falso. Luego Alimentacion A =(Alimentacion)listado[i]; Castear es poner entre parentesis. Y ahora a. puede llamar a metodos de Alimentacion. Este método iría en Venta.
	//otra forma es en lugar de guardarlo en una variable a, ponerlo entre parentesis y ya estamos casteando primero sin necesidad de nueva variable.
	
	/*public void mostar (double descuento){
		for (int i = 0; i < listado.lenght; i++ ) {
			
		}
		
		(())
	}
	*/
	//Constructores
	public Producto(double precio, String nombre, String codigo) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.codigo = codigo;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}


	//GettersSetters
	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	//Métodos
	public abstract double calcularPrecioFinal (double descuento);
	
}
