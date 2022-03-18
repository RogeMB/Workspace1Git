package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class CrudPlantilla {
	
	private SortedMap <String,Trabajador> listado;

	// Constructor
	
	public CrudPlantilla(SortedMap<String, Trabajador> listado) {
		super();
		this.listado = listado;
	}
	
	
	// ToString
	
	@Override
	public String toString() {
		return "CrudPlantilla [listado=" + listado + "]";
	}
	
	//GandS
	
	public SortedMap<String, Trabajador> getListado() {
		return listado;
	}

	public void setListado(SortedMap<String, Trabajador> listado) {
		this.listado = listado;
	}
	
	// Métodos
	
	public void annadir(String dni, Trabajador t) {
		listado.put(dni, t);
	}
	
	
	public int calcularTamanno(SortedMap <String, Trabajador> l) {
		if(!l.isEmpty()) {
			return l.size();
		}else {
			return 0;
		}
	}
	
	public boolean calcularSueldoUno (String dni, double horasTrabajas, double horasExtra, double euroHora, double euroHoraExtra, double Bono) {
		if (listado.containsKey(dni)) {
			listado.get(dni).setSueldoFinal(listado.get(dni).calcularSueldo(horasTrabajas, euroHora, Bono, horasExtra, euroHoraExtra));
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarUno (String dni) {
		if (!listado.isEmpty()) {
			if (listado.containsKey(dni)) {
				System.out.println("============================================================================================================================");
				//System.out.println(listado.values());
				System.out.println(listado.get(dni));
				System.out.println("============================================================================================================================");
			}else {
				System.out.println("\t\t***TRABAJADOR NO ENCONTRADO***");
			}
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	
	public void mostrarListado(SortedMap <String, Trabajador> l) {
		int i = 1;
		for (Map.Entry<String, Trabajador> entry : l.entrySet()) {
			String key = entry.getKey();
			Trabajador val = entry.getValue();
			//System.out.println((i++) + ". " + key + " " + val.getNombre() + " " +  val.getApellidos() + " " + val.getHorasTrabajadas() + " " + val.getSueldoFinal());
			System.out.println("============================================================================================================================");
			System.out.println((i++) + ". Dni: " + key + " - " +  val);
		}
		System.out.println("============================================================================================================================");
	}
	

	public void mostrarListadoOrdenadoSueldo(SortedMap<String, Trabajador> listado, Comparator<Trabajador> ch) {
		List <Trabajador> list = new ArrayList <Trabajador> (listado.values());
		Collections.sort(list, ch);
		int i=1;
		if (!list.isEmpty()) {
			System.out.println("============================================================================================================================");
			for (Trabajador trabajador : list) {
				System.out.println((i++) + ". " + trabajador + ".");
			}
			System.out.println("============================================================================================================================");
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	
	public void mostrarListadoOrdenadoHora(SortedMap<String, Trabajador> listado, Comparator<Trabajador> ca) {
		List <Trabajador> list = new ArrayList <Trabajador> (listado.values());
		Collections.sort(list, ca.reversed());
		int i=1;
		if (!list.isEmpty()) {
			for (Trabajador trabajador : list) {
				System.out.println("============================================================================================================================");
				System.out.println((i++) + ". " + trabajador + ".");
			}
			System.out.println("============================================================================================================================");
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	public void mostrarElPrimero(SortedMap<String, Trabajador> listado) {
		if(!listado.isEmpty()) {
			System.out.println(listado.get(listado.firstKey()));
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	public void mostrarElUltimo(SortedMap<String, Trabajador> listado) {
		if(!listado.isEmpty()) {
			System.out.println(listado.get(listado.lastKey()));
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	/*public Trabajador buscarPorNombre (SortedMap<String, Trabajador> listado, String nombre) {
		Iterator <String> it = listado.keySet().iterator();
		Trabajador tmp = null;
		String nombre2 = tmp.getNombre();
		boolean encontrado = false;
		while (it.hasNext() && !encontrado) {
			 tmp = it.next();
			if (tmp.getNombre().equalsIgnoreCase(nombre)) {
				encontrado=true;
				return tmp;
			}
		}
		return tmp;
	}*/
	
}
