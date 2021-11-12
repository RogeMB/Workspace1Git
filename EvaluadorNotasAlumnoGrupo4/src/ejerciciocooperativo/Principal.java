package ejerciciocooperativo;

import java.util.Random;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nNombreAl = "NombreAlumno";
		String nAsignatura [];
		int numAsig=0, numSusp=0, numApro=0, salida=0, menu=0, min=1, max=15, hasta=10, desde=1, cien=100, porcSusp=0, porcAprob=0; 
		double media=0.00, suma=0.00; 
		int nota [];
		Random r = new Random (System.nanoTime());
		
		
		System.out.println("\t\t_____________________||-EVALUATOR 3000-||_____________________\nBienvenido/a profesor/a, \nEste programa le genera el boletín de calificaciones de un alumno.");
		
		do {
			nNombreAl="NombreAlumno";
			
			System.out.print("Introduzca nombre del alumno: ");
			nNombreAl=Leer.dato();
			System.out.print("\nIngrese cuántas asignaturas ha realizado el alumno: ");
			numAsig=Leer.datoInt();
			while (numAsig<min || numAsig>max) {
				System.out.print("\t\t***ERROR: Tiene que ser un número mayor o igual a 1 y menor de 15***.\nIngrese cuántas asignaturas ha realizado el alumno: ");
				numAsig=Leer.datoInt();
			}
			nAsignatura=new String [numAsig];
			nota=new int [numAsig];
			for (int i=0; i<nAsignatura.length; i++) {
				System.out.printf("Nombre asignatura %d: ", i+1);
				nAsignatura [i]=Leer.dato();
			}
			System.out.print("______________________________________________________________");
			
			do {
				
				
				
				System.out.print("\n\nAhora teclee el número correspondiente a la opción que desee de entre las siguientes: "
						+ "\n\n\t0. Terminar con este alumno. \n\t1. Generar las notas de las asignaturas. "
						+ "\n\t2. Calcular media. \n\t3. nº supensos y nº aprobados y porcentajes. \n\t4. Imprimir boletín."
						+ "\n______________________________________________________________\nRespuesta: ");
				menu=Leer.datoInt();	
				switch (menu) {
					case 0: 
						System.out.println("<<---<<----<<---<<----<<---<<----<<---<<----<<---<<----<<----");
						break;
					case 1:
						for (int i=0; i<nAsignatura.length; i++) {
							nota [i] = r.nextInt(hasta-desde+1)+desde;
							System.out.println("\t->"+nAsignatura[i]+": "+nota [i]);
						}System.out.println("______________________________________________________________");
						
						break;	
					case 2:   
						suma=0; //reiniciamos//
						for (int i=0; i<nAsignatura.length; i++) {
							suma=suma+nota[i];
						}
						media=suma/numAsig;
						System.out.printf("\nLa media del alumno %s es: %.2f", nNombreAl, media);
						break;	
					case 3: 
						numSusp=0;
						numApro=0;
						for (int i=0; i<nAsignatura.length; i++) {
							if (nota[i]<5) {
								numSusp= numSusp+1;
							}else {
								numApro=numApro+1;
							}
						}System.out.printf("\nEl número de aprobados es %d "
								+ "y el número de suspensos es %d", numApro, numSusp);
						porcSusp=(numSusp*cien)/numAsig;
						System.out.println("\nEl porcentaje de asignaturas suspensas es: "+porcSusp+"%");
						porcAprob=cien-porcSusp;
						System.out.println("El porcentaje de asignaturas aprobadas es: "+porcAprob+"%");
						break;
					case 4:
						System.out.printf("Esta es la evaluación del alumno: %s", nNombreAl);
						System.out.println("\n\tASIGNATURA \tNOTA");
						for (int i=0; i<nAsignatura.length; i++) {
							System.out.println("\t"+nAsignatura[i]+": \t\t"+nota [i]);
						}
						System.out.printf("El alumno %s ha sacado una media de %.2f", nNombreAl, media);
						
						break;
					default : 
						System.out.println("Di una de las opciones válidas.");
				}
				
				
			} while (menu!=0);
			
			System.out.print("\n¿Desea reiniciar con otro alumno? Introduzca 0 para terminar o 1 para reiniciar: ");	
			salida=Leer.datoInt();
			
		} while (salida!=0);
		System.out.println("\t\t****GRACIAS. ¡¡VUELVA PRONTO!!*****");

	}

}
