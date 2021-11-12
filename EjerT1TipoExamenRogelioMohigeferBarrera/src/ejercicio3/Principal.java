package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		/*Hacer un programa que imite un cutre ticket de McDonals*/
		
		String nVendedor="Rogelio Mohigefer", nMcdonal="McDonalds Constitución";
		String nPatMed="Patatas Medianas", nBebidaMed="Bebida Mediana", nHamburgesa= "McRoyal";
		String nTotalaPagar="TOTAL A PAGAR", nPago="Entregado", nCambio="CAMBIO";
		
		String nMes="Octubre";
		double anno=2021, dia=07;		
		
		double cantidad1=1, cantidad2=1, cantidad3=1;
		double precioPat=2.00, precioHamb=5.00, precioBeb=1.50, totalApag=0.00, pagado=10, cambio=0.00;
		
		precioPat=precioPat*cantidad1;
		precioHamb=precioHamb*cantidad2;
		precioBeb=precioBeb*cantidad3;
		totalApag=precioPat+precioHamb+precioBeb;
		cambio=totalApag-pagado;
		
		System.out.printf("Bienvenido/a a %s\n", nMcdonal);
		System.out.printf(" Le atendió: %s \n A fecha: %.0f de %s de %.0f", nVendedor, dia, nMes, anno);
		System.out.println("\n\nPRODUCTOS \t\t   CANTIDADES \t\tSUBTOTAL");
		System.out.println("__________________________________________________________");
		System.out.printf("\n%s \t\t%.0f \t\t%.2f ", nPatMed, cantidad1, precioPat);
		System.out.printf("\n%s \t\t\t%.0f \t\t%.2f ", nHamburgesa, cantidad2, precioHamb);
		System.out.printf("\n%s \t\t\t%.0f \t\t%.2f ", nBebidaMed, cantidad3, precioBeb);
		System.out.println("\n__________________________________________________________");
		System.out.printf("\t\t\t\t %s: %.2f€",nTotalaPagar, totalApag );
		System.out.printf("\n\t\t\t\t %s:    %.2f€",nPago, pagado);
		System.out.printf("\n\t\t\t\t %s:       %.2f€",nCambio, cambio);
		System.out.println("\n**********************************************************");
		System.out.println("\tGRACIAS POR SU VISITA. ¡¡VUELVA PRONTO!!\n\t\t*****I'm Loving It******");
		
		
				
				
	}

}
