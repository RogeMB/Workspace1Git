package ejemplooperadores;

public class Principal {

	public static void main(String[] args) {
		
		int contador=1;
		int numASumar=2;
		
	System.out.println(contador); //imprimimos lo que vale contador en la pantalla del usuario//
	System.out.println(numASumar);//imprimimos el valor de numASumar en la pantalla del usuario//
		
	numASumar=5; //esto es una simple asignación nueva, ahora numASumar vale 5 en lugar de 2//
		
	System.out.println(numASumar); //imprimimos el nuevo valor de numASumar en la pantalla del usuario//
	
	contador=contador+numASumar; //estamos diciendo que sume el valor de contador y el de numASumar y que lo guarde y asigne a contador, perdiendo el antiguo valor.//
	//Lo potente de esto es que 
	System.out.println(contador); //imprimimos el nuevo valor de contador//
	
	contador=contador+numASumar;//Si repetimos la operación, volveríamos a asignar a contador un nuevo valor y guardarlo en contador//
	System.out.println(contador); //imprimimos el nuevo valor de contador para el usuario//

	}

}
