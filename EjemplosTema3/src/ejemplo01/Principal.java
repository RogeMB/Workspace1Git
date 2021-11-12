package ejemplo01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=0; //no es obligatorio que las VARIABLES se llamen igual que los ATRIBUTOS del constructor, lo que sí tienen que ser del mismo tipo!!//
		String nombre, apellidos;
		double notaMedia=0.00, puntosExtra=0.00;
		Alumno aEditado, aEditado2;
		
		Alumno a1 = new Alumno (32, "Roge", "Mohigefer", 9.9); //la llamamos igual que la clase que hemos creado y luego le damos nombre a la variable ej: a1 (alumno1)//
									//Si instanciamos una variable sin darle valores, Eclipse le da valores por defecto (al int le da 0, al String le pone null, y al double le da 0.0)//
									/*Utilizamos un "constructor" para dar valores. Los constructores se crean en la clase que define al objeto, 
									 * es decir, en la clase Alumno en este caso*/
									/*Después de haber hecho el constructor, rellenamos entre el paréntesis con los valores de sus atributos (color azul)*/
		
		Alumno a2 = new Alumno (20, "Paco", "Pacomé", 7.8);
		
		//lo que guarda a2 es la dirección de la memoria donde están los datos instanciados podemos comprobarlo con un syso (a1)//
		
		///Alumno aEditado; //ahora le diremos al usuario que meta los datos de la variable aEditado//
		//Alumno aEditado2;
		
		System.out.print("Diga la edad: ");
		edad=Leer.datoInt();
		System.out.print("Diga el nombre: ");
		nombre=Leer.dato();
		System.out.print("Diga el apellido: ");
		apellidos=Leer.dato();
		System.out.print("Diga la nota media: ");
		notaMedia=Leer.datoDouble();
		
		aEditado = new Alumno (edad, nombre, apellidos, notaMedia); //tienen que ir en el mismo orden establecido previamente!!! se enredarían los datos en caso contrario//
		System.out.println("\nSu edad es: "+aEditado.getEdad());/*puede imprimir si en el constructor, en el atributo "edad" no hay un private. Si aparecería aEditado.edad, no podría imprimir).*
		*Si lo hay, para imprimir un atributo privado, habrá que utilizar un getters and setters (getEdad)*/
		System.out.println("Su nombre es: "+aEditado.getNombre());
		System.out.println("Su nota actual es: "+aEditado.getNotaMedia()); //muestro la nota media antes de cambiarla//
		
		System.out.print("\nDiga la nueva nota media: ");
		notaMedia=Leer.datoDouble();
		aEditado.setNotaMedia (notaMedia);
		System.out.println("Nueva nota después del cambio: "+aEditado.getNotaMedia());
		notaMedia=1212.5;
		System.out.println("Pero no es lo mismo que la variable notaMedia, que si la cambio vale: "+notaMedia);
		notaMedia=aEditado.getNotaMedia();
		System.out.println("Podemos hacer esta barbaridad también: "+notaMedia); //ojito//
		
		System.out.printf("\n¿Cuántos puntos extra quiere sumar?");
		puntosExtra=Leer.datoDouble(); //hay que declarar puntosExtra arriba como variable para que lo pueda leer el usuario//
		aEditado.sumarPuntosExtra(puntosExtra);
		System.out.println("La nueva nota media después de sumarle "+puntosExtra+" puntos extra es: "+aEditado.getNotaMedia());
		
		
		System.out.println("\n_______________________________________________________________________");
		System.out.print("Diga la edad: "); //creamos un alumno2. Los alumnos que queramos, tantos como haya guardados en variables arriba//
		edad=Leer.datoInt();
		System.out.print("\nDiga el nombre: ");
		nombre=Leer.dato();
		System.out.print("\nDiga el apellido: ");
		apellidos=Leer.dato();
		System.out.print("\nDiga la nota media: ");
		notaMedia=Leer.datoDouble();
		
		aEditado2 = new Alumno (edad, nombre, apellidos, notaMedia);
		System.out.println(aEditado2);
		
		//Todo esto lo podríamos resumir con un bucle//
		
		
	
	
	
	
	}

}
