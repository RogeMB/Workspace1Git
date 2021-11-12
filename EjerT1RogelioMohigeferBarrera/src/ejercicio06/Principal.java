package ejercicio06;
public class Principal {

	public static void main(String[] args) {
		
		/* Realizar un programa que escriba el precio de un producto en una compra, una vez descontado 
		el tanto por ciento de descuento, dando nosotros en la declaración de las variables el precio 
		inicial y el tanto por ciento que se va a descontar. Ojo, el cálculo del tanto por ciento 
		lo debe hacer el programa no el usuario, por ejemplo: descuento=20%,y no descuento=0.2*/
		
		double precioPcto=99.99, descPorcen=30, divisor=100, precioFn=0.00;
	System.out.println("Bienvenido/a, \n\n\tEste programa le calcula el precio final de su producto "
			+ "con el descuento aplicable.");
	
	System.out.printf("\n\tAplicaremos un descuento %.0f%% a su producto"
			+ " con un precio inicial de %.2f€.", descPorcen, precioPcto);
	
	descPorcen=(precioPcto*descPorcen)/divisor;
	precioFn=precioPcto-descPorcen;
	System.out.printf("\n\n\tEl precio final con descuento de %.2f€ será de: %.2f€", descPorcen, precioFn);
	
	System.out.println("\n\nGracias por su confianza.");
	}

}
