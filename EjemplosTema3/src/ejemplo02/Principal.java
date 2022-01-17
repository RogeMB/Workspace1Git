package ejemplo02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cohete c1 = new Cohete ();
		Cohete c2 = new Cohete ();
		Cohete c3 = new Cohete ();
		
		
		imprimirMenu ();
		
		System.out.println(c1.getNumCohete());
		System.out.println(c3.getNumCohete());
		

		
	}
	
	//helper:
	public static void imprimirMenu () {
		System.out.println("Hola.");
		System.out.print("\nDiga qué cohete: ");
	}

}
