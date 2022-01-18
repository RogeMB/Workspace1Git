package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica).
		En una clase Gestion, con un array de productos como atributo se podrá: listar datos de todos los
		productos, calcular el precio de venta al público, que será el precio de fábrica más un 50 %,
		comprobar si el producto es “frágil” o no, mediante un método que devuelva un tipo boolean y añadir
		un producto a la lista pasando como parámetro un producto. Crear un main de prueba*/
		
		boolean salir = false, fragil = false;
		int opcion = 0, tam = 100, nPs = 0, tasa = 50;
		double precio = 0;
		String nombre, sFragil;
		
		Gestion gestion = new Gestion (new Producto [tam]);
		Producto producto;

	}

}
