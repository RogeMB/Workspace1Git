package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribir un programa que tenga una clase Documento y dos clases hijas, Tarjeta de visita y Carta.
		Crear los métodos necesarios para que cada tipo de documento se imprima en pantalla de una forma
		diferente, según sus características. Como es un ejemplo académico, podemos hacer los métodos de
		impresión dentro de cada clase.
		Crear un main para hacer una prueba con cada método llamado con objetos de las distintas clases. Por
		ejemplo, el documento genérico solo tiene un pequeño encabezado con los datos de la empresa, la
		tarjeta puede llevar, además, los datos de contacto de una persona y la carta, una fecha leída por teclado.*/
		
		Documento d;
		Carta c;
		TarjetaVisita tv;
		String fecha, nombreEmpresa, titulo, cuerpo, lugar, firmaAutor, departamento, despedida, destinatario, 
		posdata, saludo, nombreContacto, telefono, email;
		int opcion = 0, salir = 0;
		
		
		do {
			imprimirMenuBienvenida();

			opcion = Leer.datoInt();

			switch (opcion) {
			case 0:
				System.out.println("\n\tFIN DEL PROGRAMA, GRACIAS.");
				break;
			case 1:
				System.out.println("Vamos a crear el documento. Ingrese el nombre de la empresa: ");
				nombreEmpresa = Leer.dato();
				System.out.println("Bien, ahora ingrese la fecha: ");
				fecha = Leer.dato();
				System.out.println("Bien, ahora ingrese el lugar: ");
				lugar = Leer.dato();
				System.out.println("Bien, ahora ingrese el título: ");
				titulo = Leer.dato();
				System.out.println("Bien, ahora ingrese el cuerpo del documento: ");
				cuerpo = Leer.dato();
				System.out.println("Bien, ahora ingrese el departamento: ");
				departamento = Leer.dato();
				System.out.println("Bien, ahora ingrese la firma del autor: ");
				firmaAutor = Leer.dato();
				d = new Documento (nombreEmpresa, fecha, lugar, firmaAutor, departamento, titulo, cuerpo);
				System.out.println("Todo correcto, procedemos a la impresión...");
				d.imprimirDocumento();
				break;
				
			case 2:
				System.out.println("Vamos a crear la carta. Ingrese el nombre del destinatario: ");
				destinatario = Leer.dato();
				System.out.println("Bien, ahora ingrese la fecha: ");
				fecha = Leer.dato();
				System.out.println("Bien, ahora ingrese el lugar: ");
				lugar = Leer.dato();
				System.out.println("Bien, ahora ingrese el saludo: ");
				saludo = Leer.dato();
				System.out.println("Bien, ahora ingrese el cuerpo de la carta: ");
				cuerpo = Leer.dato();
				System.out.println("Bien, ahora ingrese la despedida: ");
				despedida = Leer.dato();
				System.out.println("Bien, ahora ingrese la firma del autor: ");
				firmaAutor = Leer.dato();
				System.out.println("Bien, ahora ingrese la posdata si hubiere");
				posdata = Leer.dato();
				
				c = new Carta (destinatario, fecha, lugar, firmaAutor, saludo, despedida, cuerpo, posdata);
				System.out.println("Todo correcto, procedemos a la impresión...");
				c.imprimirOtros();
				break;
				
			case 3: 
				System.out.println("Vamos a crear la tarjeta de visita. Ingrese el nombre de la empresa: ");
				nombreEmpresa = Leer.dato();
				System.out.println("Bien, ahora ingrese el departamento: ");
				departamento = Leer.dato();
				System.out.println("Bien, ahora ingrese el título: ");
				titulo = Leer.dato();	
				System.out.println("Bien, ahora ingrese el nombre de contacto del autor: ");
				nombreContacto = Leer.dato();
				System.out.println("Bien, ahora ingrese el teléfono: ");
				telefono = Leer.dato();
				System.out.println("Bien, ahora ingrese el email: ");
				email = Leer.dato();
				
				tv = new TarjetaVisita (nombreEmpresa, departamento, titulo, nombreContacto, telefono, email);
				System.out.println("Todo correcto, procedemos a la impresión...");
				tv.imprimirOtros();
				break;
				
			default:
				System.out.println("\n\tnERROR, ingrese opción válida");
			}
		} while (opcion != salir);
	
	}
	
	
	// helpers
	
	public static void imprimirMenuBienvenida() {
		System.out.println("\nBIENVENIDO AL PROGRAMA DE IMPRESIÓN");
		System.out.print("Ingrese por teclado la opción que quiere crear: \nPulse 0 para salir,"
				+ "\npulse 1 para crear un documento, "
				+ "\npulse 2 para crear una carta, "
				+ "\npulse 3 para crear una tarjeta de visita.");
	}

}
