package ejercicio13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*13.Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga 
		16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa deberá 
		pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario que le 
		corresponde.*/
	
		int horasTot=0, horasPri=0, horasEx=0, cero=0, menosuno=-1;
		double salPri=16.00, salEx=20.00, salTot=0.00;
		
		System.out.println("Bienvenido/a, \nEste programa le calcula el salario por hora de su trabajo");
		
		do {
			System.out.println("\nBuenas, ¿cuántas horas has trabajado durante la semana? O pulse 0 para terminar");
			horasTot=Leer.datoInt();
						
			if (horasTot>horasPri && horasTot>=cero) {
				horasEx=horasTot-horasPri;
				salTot=(salPri*horasPri)+(salEx*horasEx);
			}else {
				salTot=horasTot*salPri;
			}
			System.out.printf("\nTu salario total es: %.2f€", salTot);
			
		}while (horasTot!=menosuno);
	
		System.out.println("\nFIN. Gracias por elegirnos.");
	
	
	
		
		
	
	}

}
