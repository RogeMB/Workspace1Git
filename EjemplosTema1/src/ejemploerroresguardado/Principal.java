package ejemploerroresguardado;

public class Principal {

	public static void main(String[] args) {
		
		int prueba ='a';  //con las comillas simples casteamos, obligamos, a un char guardarlo como un int.	En la tabla kastin el a vale 97, y el número 97 cabe en un int//
		System.out.println(prueba);
		
		//int pi= 3.14; //Daría error porque estamos guardando un double en un int//
		//System.out.println(pi);//
		
		//double pi=3,14;// //Esto también da error porque las "comas" no sirven como decimales en las variables, aunque sí sirven en el Syso//
		//System.out.println(pi);//
	
		boolean adivina= (1==4); //es un booleano que guardamos en un identificador de una variable booleana//
		System.out.println(adivina); //imprimimos el identificador//
		System.out.println(1==4); //el resultado de esta operación es un booleano//
		
		//boolean adivinaDos= (97=='a' ==97); //empezamos por la izquierda, ¿es 97= a 'a'(97)? sí, pero luego decimos que true es igual a 97, estamos comparando un booleano un int.//
		//System.out.println(adivinaDos); //nos da error por lo explicado antes, no puedes comparar un booleano con un int//

		boolean adivinaTres= (97=='a' ==true); //Aquí sí funciona porque transforma lo primero en un boolean (97=='a' y luego compara con otro boolean (true)//
		System.out.println(adivinaTres);

	}

}
