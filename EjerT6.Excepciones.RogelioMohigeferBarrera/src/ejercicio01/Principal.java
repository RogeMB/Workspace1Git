package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona ();
		
		try {
			p.LeerDatosPersonales();
		}
		
		catch (ArithmeticException arithmeticException) {
			System.err.printf("\nException: %s\n", arithmeticException);
			System.out.println("No puede haber números negativos pruebe de nuevo\n");
		}
		
	}

}
