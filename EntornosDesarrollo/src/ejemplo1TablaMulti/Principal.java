package ejemplo1TablaMulti;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Tablas de Multiplicar: ");
		for(int i = 1; i<=10; i++) {
			System.out.println("\nTabla del "  + i);
			for(int j = 1; j<=10; j++) {
				System.out.printf("%d*%d = %d\n", i, j, i*j);
			}
		}
		System.out.println("\n\tFIN");
		
	}

}
