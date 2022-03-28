package ejercicio;

import java.util.Comparator;

public class CompararPorHora implements Comparator<Trabajador>{
	/*
	 * Este es un comparador igual que los que hemos visto hasta ahora pero que compara por dos argumentos.
	 * Estamos diciendo que si las horas son iguales, que compare por el sueldo.
	 * La forma de hacerlo es añadiendo otra serie de condiciones en el else.
	 */
	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		// TODO Auto-generated method stub
		if(t1.getHorasTrabajadas()>t2.getHorasTrabajadas()) {
			return -1;
		}else if(t1.getHorasTrabajadas()<t2.getHorasTrabajadas()){
			return 1;
		}else {
			if(t1.getSueldoFinal()>t2.getSueldoFinal()) {
				return -1;
			}else if(t1.getSueldoFinal()<t2.getSueldoFinal()) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
}
