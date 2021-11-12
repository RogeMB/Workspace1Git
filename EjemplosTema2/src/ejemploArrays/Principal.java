package ejemploArrays;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10, num=0, dos=2;
		
		int [] edades =new int [tam];
		
		//edades [2]=4; hay que decir en cual de los atributos hay que poner el 4. Para ello ponemos el [2] (posición 2)//
		
		/*System.out.println("Diga el número que quiere guardar");
		num=Leer.datoInt();
		edades[dos]=num; //si el tamaño del array es menor de la posición donde queremos guardar, nos dará error, ejemplo [23], dará error pues el tamaño es 10//
		
		System.out.println(edades[dos]);*/
	
		for (int i=0;i<tam;i++) { //utilizamos for para crear bucle//
			edades[i]=4; //al principio guarda el 4 en la posición 0, luego en la 1, luego en la 2, luego en la 3,...//
			
		}
		
		/*System.out.println(edades); NO HACER EL SYSO sin los [] en edades, nos imprimirá la dirección de memoria del pc donde están guardados los datos o valores del array*/
		//PARA VER EL ARRAY HAY QUE CREAR OTRO FOR://
		for (int i=0; i<tam;i++) {
			System.out.print(edades[i]); // O SEA, un bucle para cargar el ARRAY y otro para MOSTRAR el array//
		}
		
	}
	
}
