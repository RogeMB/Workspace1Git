package ejercicio06;

import java.util.Comparator;

public class CompararPorSueldo implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		// TODO Auto-generated method stub
		if(t1.getSueldoFinal()>t2.getSueldoFinal()) {
			return -1;
		}else if(t1.getSueldoFinal()<t2.getSueldoFinal()){
			return 1;
		}else {
			return 0;
		}
	}
	
}