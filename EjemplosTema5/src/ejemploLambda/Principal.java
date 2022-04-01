package ejemploLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcionMenu = 0, min = 30, max = 120, tope = 0;
		Random r = new Random (System.nanoTime());
		Luchador ganador;
		String fighter1, fighter2, nombre = "Pepito";
		// CompararPorPuntosHP cpphp = new CompararPorPuntosHP();
		List<Luchador> listado = new ArrayList <Luchador> ();
		// CrudLuchador crudL = new CrudLuchador (listado);
	
		
		Supplier <Double> crearRandom =  () -> min + (max - min) * r.nextDouble();
		Supplier <Luchador> generadorLuchadores = () -> new Luchador("", crearRandom.get(), crearRandom.get(),
														 crearRandom.get(), crearRandom.get(), crearRandom.get());
		
  
	}

}
