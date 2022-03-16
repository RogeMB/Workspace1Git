package ejercicio05;

import java.util.Comparator;

public class CompararPorTelefono implements Comparator <Contacto> {
	
	public int compare(Contacto c1, Contacto c2) {
		return (c1.getTelefono().toLowerCase().compareTo(c2.getTelefono().toLowerCase()));
	}
}
