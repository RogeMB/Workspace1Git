package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
		String nNombre="Rogelio", nApellido="Mohigefer Barrera", nHabR="SUITEGOOGLE", nBebR="JackDaniels";
		
		
		double precioN=120, miniB=0.00, cantiF=0.00, precioNDef=0.00;
		double numBebi=2, preJackD=8.00, numCenas=2, numNoches=5, preCena=32.50,
				descu=5, divisor=100, total=0.00, subTotal=0.00, precioDescon;
		
		precioNDef=precioN*numNoches;
		miniB=preJackD*numBebi;
		cantiF=numCenas*preCena;
		subTotal=precioNDef+miniB+cantiF;
		precioDescon=(descu*subTotal)/divisor;
		total=subTotal-precioDescon;
		
		System.out.println("\t\t*****BILL GATES's GRAN HOTEL*****");
		System.out.println("_________________________________________________________________________");
		System.out.printf("NOMBRE: %s \nAPELLIDOS: %s", nNombre, nApellido);
		
		System.out.printf("\n\nHABITACION: %s", nHabR);
		System.out.printf("\nPRECIO por NOCHE= $%.2f \tNUMERO de NOCHES:%.0f "
				+ "\n\nMINIBAR= %s \tCANTIDAD: %.0f \tPRECIO=$%.2f",precioN, numNoches, nBebR, numBebi, preJackD);
		System.out.printf("\n\nCANTINA de FACEBOOK: CENAS:%.0f \tPRECIO cena=$%.2f", numCenas, preCena);
		System.out.printf("\n\nSUBTOTAL= $%.2f \nDESCUENTO= %.0f%% \nTOTAL= $%.2f", subTotal, descu, total);
		
		System.out.println("\n_______________________________________________________________________");
		System.out.println("\t***AGRADECEMOS MUCHO SU ESTANCIA Y ESPERAMOS SU REGRESO***");
		
		
		
	}

}
