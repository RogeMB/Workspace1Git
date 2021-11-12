package ejemplosaldo1;

public class Principal {

	public static void main(String[] args) {
		
		double saldo=100.00, reintegro=50.00, olvido=20.00;
	
		saldo=saldo-reintegro;
		
	
	
	System.out.printf("Tienes en la cuenta %.2f euros, y vas a sacar %.2f euros", saldo, reintegro);
	System.out.printf("\n\tTe quedan en la cuenta: %.2f euros.\n" , saldo);
	
		saldo=saldo-olvido; /*cuando en una línea hay un igual lo empezamos a leer desde el igual
							hacia la derecha. Hacemos las operaciones, y al final, se guarda en 
							la variable de la izquierda del igual.*/
		
	System.out.printf("\nTu nuevo saldo en la cuenta después de sacar el olvido es de: %.2f euros", saldo);
	System.out.printf("\n\tTe quedan en la cuenta: %.2f euros.\n" , saldo);
	
	//PODEMOS HACERLO DE UNA MANERA AÚN MÁS FÁCIL DE ESTA MANERA://
	
	saldo-=olvido; //esto es restarle a una variable otra variable, puede hacerse igual con sumar+=, multiplicar*= etc//
	System.out.printf("\n\tTe quedan en la cuenta: %.2f euros.\n" , saldo);
	
	System.out.println("Gracias.");
	
	}

}
