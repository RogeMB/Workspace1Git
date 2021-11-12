package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		/*El precio de un venta de un automóvil nuevo para un comprador es la suma total de: el coste de fabricación del vehículo, 
		 * el porcentaje de la ganancia del vendedor y los impuestos estatales aplicables (sobre el coste de fabricación). Suponer una ganancia
		 * del vendedor del 15% en cada coche y un impuesto del 12,5% y diseñar un programa para calcular el precio de un automóvil e imprimirlo
		 * por pantalla. Para ello, vosotros asignaréis el coste de fabricación del coche y se deben realizar los cálculos para un sólo vehículo*/
		 
		String nConcesionario= "ROJAUTO", nimpEstatal="Impuesto Estatal", nComisionV="Comisión Venta", nPrecioF="Coste Total", nCosteFab="Coste Fabricación";
		String nPorcentaje="Porcentaje", nCantidad="Cantidad en €", nTipo="Tipo";
		
		double precioVentaV= 0.00, gananciaV=0.00, costeImp=0.00;
		double costeFabV= 10000.00, pcntjGananVdor=15.00, impAplic=12.50, divisor=100;
		
		System.out.printf("\t\t\tConcesionario:%s", nConcesionario);
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("Bienvenido/a, "
				+ "\n\nEste programa le calculará el precio de venta de su vehículo.");
		
		gananciaV=(costeFabV*pcntjGananVdor)/divisor;
		costeImp=(costeFabV*impAplic)/divisor;
		precioVentaV=costeFabV+gananciaV+costeImp;
		
		System.out.printf("\n\t %s \t\t\t %s \t %s\n", nTipo, nPorcentaje, nCantidad);
		System.out.println("_______________________________________________________________");
		System.out.printf("\n %s: \t\t\t\t %.2f€", nCosteFab, costeFabV);
		System.out.printf("\n %s: \t\t %.2f%% \t %.2f€", nimpEstatal, impAplic, costeImp);
		System.out.printf("\n %s: \t\t %.2f%% \t %.2f€", nComisionV, pcntjGananVdor, gananciaV);
		System.out.printf("\n %s: \t\t\t\t\t %.2f€", nPrecioF, precioVentaV);
		System.out.println("\n\n**************************************************************");
		System.out.printf("\t%s, tu concesionario de confianza", nConcesionario);
	}
}
