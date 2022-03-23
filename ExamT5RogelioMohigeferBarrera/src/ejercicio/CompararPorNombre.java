package ejercicio;

import java.util.Comparator;

public class CompararPorNombre implements Comparator <Mensaje>{

	@Override
	public int compare(Mensaje o1, Mensaje o2) {
		// TODO Auto-generated method stub
		return (o1.getNombreContacto().toLowerCase().compareToIgnoreCase(o2.getNombreContacto().toLowerCase()));
	}

}
