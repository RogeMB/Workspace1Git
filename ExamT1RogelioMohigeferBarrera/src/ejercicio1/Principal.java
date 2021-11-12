package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		String nAIni="ALTURA-Actual", nAFin="ALTURA-Fallec";
		String nNm="NOMBRE", nAp="APELLIDOS";
		String nNombre="Margarita", nApellidos="García Pérez", nEdad="EDAD", nEdadFall="EDAD-Fallec";
		
		String nMes="Octubre";
		double dia=8, annoCalen=2021;
		
		double altTorso=90.500, larTib=35.050, altAct=0.00, altFall=0.000;
		double decre=0.06, annosActu=30, annosMuert=63, annosTrans=0, constante=2.317;
		
		
		altAct=altTorso+constante*larTib; 
		annosTrans=annosMuert-annosTrans;
		altFall=altAct-(annosTrans*decre);
		
		System.out.println("\t\t\t---||BIENVENIDO/A A TIBIAX V1||--- "
				+ "\n\nEste programa le calcula la altura en cm de una persona en el momento del fallecimiento.");
		System.out.println("_______________________________________________________________________________________");
		System.out.printf("Fecha: A %.0f de %s del %.0f", dia, nMes, annoCalen);
		
		System.out.printf("\n\n%s \t\t%s \t%s \t%s \t%s \t%s", nNm, nAp, nEdad, nEdadFall, nAIni, nAFin);
		System.out.printf("\n%s \t%s   \t%.0f \t%.0f \t\t%.2f \t\t%.2f", nNombre, nApellidos, annosActu, annosMuert, altAct, altFall);
		System.out.println("\n_______________________________________________________________________________________");
		System.out.println("\t\t\t*****Muchas gracias por confiar en nosotros*****");	
	
	
	
	}

}
