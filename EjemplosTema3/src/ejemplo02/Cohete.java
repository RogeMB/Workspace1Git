package ejemplo02;

public class Cohete {
	
	private static int numCohetes;  //pensar siempre en los totales para hacer staticos
	
	public Cohete() {
		numCohetes++;
	}

	public static int getNumCohete() {
		return numCohetes;
	}

	public static void setNumCohete(int numCohete) {
		Cohete.numCohetes = numCohete;
	}



}
