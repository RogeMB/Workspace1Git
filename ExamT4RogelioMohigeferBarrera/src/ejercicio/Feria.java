package ejercicio;

import java.util.Arrays;

public class Feria {

		private int anno;
		private VisitanteGeneral listado [];
		private double totalRecaudado; // queremos tener un registro de lo recaudado cada año y no tener que calcularlo en cada consulta
		
		
		
		// Const
		
		
		public Feria(int anno, VisitanteGeneral[] listado, double totalRecaudado) {
			super();
			this.anno = anno;
			this.listado = listado;
			this.totalRecaudado = totalRecaudado;
		}


		// ToString
		
		@Override
		public String toString() {
			return "Feria [anno=" + anno + ", listado=" + Arrays.toString(listado) + ", totalRecaudado="
					+ totalRecaudado + "]";
		}


		public int getAnno() {
			return anno;
		}


		public void setAnno(int anno) {
			this.anno = anno;
		}


	
		
		// GandS
		
		public VisitanteGeneral[] getListado() {
			return listado;
		}

		public void setListado(VisitanteGeneral[] listado) {
			this.listado = listado;
		}

		public double getTotalRecaudado() {
			return totalRecaudado;
		}

		public void setTotalRecaudado(double totalRecaudado) {
			this.totalRecaudado = totalRecaudado;
		}
		
		
		// Métodos
		
		public double calcularUna (int id) {
			return listado [id].calcularPrecioEntrada(); 
			 
		}
		
		public void mostrarListado () {
			for (int i = 0; i < listado.length && listado[i] != null; i++) {
				System.out.println((i+1) + ". " + listado [i]);
				if (listado [i] instanceof Empresario) {
					((Empresario)listado[i]).invitarCafe();
				}
			}
		}
		
		public double calcularRecaudado (int id) {
			for (int i = 0; i < listado.length && listado[i] != null; i++) {
				this.totalRecaudado += calcularUna(id);
				id++;
			}
			return totalRecaudado;
		}
		
		public double calcularRecaudadoFamiliar (int id) {
			double totalFamiliar = 0.0;
			if (listado[id] instanceof Familiar) {
				for (int i = 0; i < listado.length && listado[i] != null; i++) {
					totalFamiliar += calcularUna(id);
					id++;
				}
			}
			return totalFamiliar;
		}
		
		public void addVisitante (VisitanteGeneral vg) {
			listado = Arrays.copyOf(listado, listado.length+1);
			listado[listado.length - 1] = vg; 
		}
		
}
