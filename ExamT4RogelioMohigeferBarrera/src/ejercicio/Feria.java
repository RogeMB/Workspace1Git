package ejercicio;

import java.util.Arrays;

public class Feria {

		private int anno;
		private VisitanteGeneral listado [];
		private static double totalRecaudado; // queremos tener un registro de lo recaudado cada año y no tener que calcularlo en cada consulta
		
		
		
		// Const
		
		public Feria(int anno, VisitanteGeneral[] listado) {
			super();
			this.anno = anno;
			this.listado = listado;
		}
	
		
		// ToString
		
		@Override
		public String toString() {
			return "Feria [anno=" + anno + ", listado=" + Arrays.toString(listado) + ", totalRecaudado="
					+ totalRecaudado + "]";
		}

		
		//GandS

		public int getAnno() {
			return anno;
		}


		public void setAnno(int anno) {
			this.anno = anno;
		}

		
		public VisitanteGeneral[] getListado() {
			return listado;
		}

		public void setListado(VisitanteGeneral[] listado) {
			this.listado = listado;
		}

		public static double getTotalRecaudado() {
			return totalRecaudado;
		}


		public static void setTotalRecaudado(double totalRecaudado) {
			Feria.totalRecaudado = totalRecaudado;
		}
		
		
		
		// Métodos
		

		public double calcularUna (int id, double descuentoMenores, double descuentoAncianos, double descuentoEmpresario, double cantidadPorHijo) {
			return listado[id].calcularPrecioEntrada(descuentoMenores, descuentoMenores, descuentoEmpresario, cantidadPorHijo);
		}
		
		public void mostrarListado () {
			for (int i = 0; i < listado.length && listado[i] != null; i++) {
				System.out.println((i+1) + ". " + listado [i]);
				if (listado [i] instanceof Empresario) {
					((Empresario)listado[i]).invitarCafe();
				}
			}
		}
		
		public double calcularRecaudado (int id, double descuentoMenores, double descuentoAncianos, double descuentoEmpresario, double cantidadPorHijo) {
			for (int i = 0; i < listado.length && listado[i] != null; i++) {
				Feria.totalRecaudado += calcularUna(id, descuentoMenores, descuentoAncianos, descuentoEmpresario, cantidadPorHijo);
				id++;
			}
			return totalRecaudado;
		}
		
		public double calcularRecaudadoFamiliar (int id, double descuentoMenores, double descuentoAncianos, double descuentoEmpresario, double cantidadPorHijo) {
			double totalFamiliar = 0.0;
			for (int i = 0; i < listado.length && listado[i] != null; i++) {
				if (listado[id] instanceof Familiar) {
					totalFamiliar += calcularUna(id, descuentoMenores, descuentoAncianos, descuentoEmpresario, cantidadPorHijo);
				}
				id++;
			}
			return totalFamiliar;
		}
		
		public void addVisitante (VisitanteGeneral vg) {
			listado = Arrays.copyOf(listado, listado.length+1);
			listado[listado.length - 1] = vg; 
		}
		
}
