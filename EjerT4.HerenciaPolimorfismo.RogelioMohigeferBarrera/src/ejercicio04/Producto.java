package ejercicio04;
/**
 * Clase padre.  
 * @author Rogelio Mohigefer
 * @since jdk 5.1
 */
public abstract class Producto {
	
	private String nombre;
	private int id;
	private double precio;
	private int stock;
	
	private int longitudNombreProducto;
	
	
	
	// Contructores
	public Producto(String nombre, int id, double precio, int stock) {
		longitudNombreProducto = 15; //Longitud por defecto
		this.nombre = ponerLongitudCadena(nombre, longitudNombreProducto); 
		this.id = id;
		this.precio = precio;
		this.stock = stock;
	}



	// ToString
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", id=" + id + ", precio=" + precio + ", stock=" + stock + "]";
	}
		

	// GettersSetters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	// Métodos
	/**
	 * 
	 * @param variacion
	 * @return
	 */
	public abstract double calcularPrecioTotal (double variacion);
	
	
	
	/**
	 * <p>Se utiliza para determinar la <code>longitud del nombre</code> del producto y que no sea demasiado largo.</p>
	 * @param cad
	 * @param nuevaLongitud
	 * @return longitud del nombre del producto.
	 * @throws Error 401
	 * @see #setNombre(String)
	 */
	public String ponerLongitudCadena(String cad, int nuevaLongitud) {

		for (int i=0; i<nuevaLongitud; i++ ) {
			cad += " ";  //rellena huecos en blanco si se queda corto
		}
		
		cad = cad.substring(0, nuevaLongitud);  // acota a lo largo
		return cad;
	}
	
	
	public String lineaProducto() {
		return nombre + "\t" + id + "\t" + precio +"\t" + stock;
	}
	
	
}
