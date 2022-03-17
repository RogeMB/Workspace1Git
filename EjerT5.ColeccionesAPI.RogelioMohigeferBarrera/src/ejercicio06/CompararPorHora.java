package ejercicio06;

import java.util.Comparator;

public class CompararPorHora implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador o1, Trabajador o2) {
		// TODO Auto-generated method stub
		if(o1.getHorasTrabajadas()>o2.getHorasTrabajadas()) {
			return 1;
		}else if(o1.getHorasTrabajadas()<o2.getHorasTrabajadas()){
			return -1;
		}else {
			return 0;
		}
	}
	
}
