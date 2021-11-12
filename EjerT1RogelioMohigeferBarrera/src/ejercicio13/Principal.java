package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		/*Imprime por pantalla el ticket de una tienda. El empleado se llama "John Snow", y el cliente ha comprado 
		 * dos latas de Coca Cola a 70 céntimos, una bolsa de pipas a 40 céntimos y una espada llamada "Garra"
		 * que cuesta 150€. No hace falta calcular la devolución de la compra*/
	
		
		String empleado="Roge", compraC="cocaCola/S", compraP="pipas", nEspada="Garra", botellas="latas", nBolsas="bolsas";
		String nTotal="TOTAL", nContado="Contado", nCambio="Cambio", nDescuento="Descuento";
		//Las string llevan un "n" delane para poder diferenciarlas del nombre que saldrá en pantalla"//
		
		//colocamos l precio por unidd de cada producto//
		//Los nombres tienen que ir dentro de String//

		double precioC=0.70, precioB=0.40, precioO=150, descuento=0.20, tantoporuno=1;		
		//ahor cantidad de cada producto//
		
		int cantidadC=2, cantidadB=1, cantidadO=1; //probar esto hacerlo int en lugar de double// //DOUBLE POR INT SE PUEDEN MULTIPLICAR//
		
		//realizamos cuanto se tendrá que pagar tras precio y unidades//
		double importeC=0, importeP=0, importeO=0, totalCompra=0, cambioCompra=0, contadoCompra=160, precioDescontado=0, cantidadDescuento=0;
		
		//se puede hacer con precio unitario, precio unitario por la cantidd nos daría los subtotales y luego sumar los subtotales para tener el total//
	
		//hacemos los calculos ahora antes de imprimir//
		importeC= cantidadC*precioC;
		importeP= cantidadB*precioB;
		importeO= cantidadO*precioO;
		
		totalCompra= importeC + importeP + importeO;
		//---------------------------------------------------------------------//
		//EJERCICIO ADICIONAL: vamos a aplicarle un 20% a la espada, imprimir el descuento debajo del producto//
		descuento=tantoporuno-descuento; //si es un suplemento, sumar en lugar de restar//
		precioDescontado=precioO*descuento;
		cantidadDescuento=precioO-precioDescontado;
		//Ojo al imprimir porque hay que multiplicar el descuento por las cantidades//
		
		//OTRA FORMA://descuentoGarra= (precioGarra*porcentajeGarra)/divisor;//
		//precioGarraDescontado= precioFinalGarra-descuentoGarra;//
		//---------------------------------------------------------------------//
		cambioCompra= contadoCompra - totalCompra;
		
		//incluir la fecha, el total, subtotales o importes, el pago al contado, y cambio//
		
		System.out.println("Bienbenidos al programa que imprimirá su ticket tras realizar los cálculos");
		System.out.println("\t\t\t\tEl tiendazo");
		System.out.printf("El empleado se llama: %s", empleado); //este se puede imprimir con println porque solo imprime una String, de hecho deberíamos usarlo//
		System.out.println("Artículo \t\tCantidad \tPrecio \t\tImporte");
		System.out.printf("%s %s \t%d \t\t%.2f \t\t%.2f", compraC, botellas, cantidadC, importeC);//todos los enteros van con %d, en este caso las cantidades van sin decimales y deberían ser int//
		System.out.printf("\n%s %s \t\t%.2f \t\t ", nEspada, cantidadO);
	
		//imprimimos descuento//
		System.out.printf(" %s \t\t -%.2f. de %.2f€", nDescuento, cantidadDescuento, precioDescontado);
	
	}

}
