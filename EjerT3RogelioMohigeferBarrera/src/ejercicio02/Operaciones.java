package ejercicio02;

public class Operaciones {
	public boolean esPar (int entrada) {
		if (entrada%2 == 0)
		return true;
		
		else return false;
	}
	
	public String esPos (int entrada) {
		if (entrada > 0)
			return "Positivo";
		else if (entrada == 0)
			return "Cero";
			else 
				return "Negativo";
	}
}
