package ejercicio05;

import java.util.Comparator;

public class CompararPorDNI implements Comparator <Contacto> {
	
	public int compare(Contacto c1, Contacto c2) {
		return (c1.getDni().toLowerCase().compareTo(c2.getDni().toLowerCase()));
	}
}