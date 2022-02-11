package ejemploInterfaz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carta c =  new Carta ("Salesianos Triana", "Estimados Alumnos, \nvayánse a tomar viento fresco.");
		Web w = new Web ("Salesianos todos juntos en una misa.");
		c.imprimirAsterisco();
		w.imprimirAsterisco();
		
		
	}

}
