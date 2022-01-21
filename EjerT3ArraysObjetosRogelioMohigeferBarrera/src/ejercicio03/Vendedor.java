package ejercicio03;

import java.util.Arrays;

public class Vendedor {
	

	/*3. Vamos a intentar modelar a un vendedor ambulante de “móviles”. Los atributos de la clase Móvil
	serán, como mínimo, marca, modelo, vendido o no y precio unitario. En la clase Vendedor con un
	array de Móviles y total vendido, como atributos mínimos, se deben crear métodos que hagan las
	siguientes operaciones: Comprobar que le quedan móviles, mostrar cuántos móviles le quedan sin
	vender, mostrar precio final de un producto haciendo algún descuento al precio unitario, etc.
	Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio. Escribir también una clase
	de prueba para hacer todas las operaciones.*/

	
	
	Movil listado [];
	private static int totalMovilVendido;
	private static double totalRecaudado;
	
	//Constructor
	public Vendedor(Movil[] listado) {
		this.listado = listado;
	}

	//ToString
	@Override
	public String toString() {
		return "Vendedor [listado=" + Arrays.toString(listado) + ", totalMovilVendido=" + totalMovilVendido + "]";
	}
	
	
	//GettersSetters
	public Movil[] getListado() {
		return listado;
	}

	public void setListado(Movil[] listado) {
		this.listado = listado;
	}

	public int getTotalMovilVendido() {
		return totalMovilVendido;
	}

	public void setTotalMovilVendido(int totalMovilVendido) {
		Vendedor.totalMovilVendido = totalMovilVendido;
	}

	public static double getTotalRecaudado() {
		return totalRecaudado;
	}

	public static void setTotalRecaudado(double totalRecaudado) {
		Vendedor.totalRecaudado = totalRecaudado;
	}
	
	
	
}
