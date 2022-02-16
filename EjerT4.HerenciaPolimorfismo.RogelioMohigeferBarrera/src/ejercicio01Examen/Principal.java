package ejercicio01Examen;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu1 = 0, numHab = 0, tam = 6;
		double porc = 0.0;
		HabitacionEstandar [] lista = new HabitacionEstandar [tam];
		Gestion gestion = new Gestion (lista);
		
		lista [numHab++] =  new HabitacionEstandar (500, false, "Juan", 4, 7); 
	}

}
