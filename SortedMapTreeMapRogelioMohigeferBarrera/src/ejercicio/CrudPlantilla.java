package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedMap;

public class CrudPlantilla {
	
	private Map <String,Trabajador> listado;

	// Constructor
	
	public CrudPlantilla(Map<String, Trabajador> listado) {
		super();
		this.listado = listado;
	}
	
	

	// ToString
	
	@Override
	public String toString() {
		return "CrudPlantilla [listado=" + listado + "]";
	}
	
	//GandS
	
	public Map<String, Trabajador> getListado() {
		return listado;
	}

	public void setListado(Map<String, Trabajador> listado) {
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
				System.out.println(listado.get(dni));
				System.out.println("============================================================================================================================");
			}else {
				System.out.println("\t\t***TRABAJADOR NO ENCONTRADO***");
			}
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	
	public void mostrarListado() {
		int i = 1;
		for (Map.Entry<String, Trabajador> entry : listado.entrySet()) {
			String key = entry.getKey();
			Trabajador val = entry.getValue();
			//System.out.println((i++) + ". " + key + " " + val.getNombre() + " " +  val.getApellidos() + " " + val.getHorasTrabajadas() + " " + val.getSueldoFinal());
			System.out.println("============================================================================================================================");
			System.out.println((i++) + ". Dni: " + key + " - " +  val);
		}
		System.out.println("============================================================================================================================");
	}
	
	public int random(int max, int min) {
		int valor=0;
		Random r = new Random();
		valor = r.nextInt(max - min +1) +min;
		return valor;
	}

	public void mostrarListadoOrdenado(Comparator<Trabajador> comp) {
		List <Trabajador> list = new ArrayList <Trabajador> (listado.values());
		Collections.sort(list, comp);
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
	
	public List<Trabajador> buscarPorNombre (String nombre) {
		Iterator <Trabajador> it = listado.values().iterator(); // probar con keySet();
		List <Trabajador> tmp = new ArrayList <Trabajador> ();
		Trabajador aux;
		while (it.hasNext()) {
			 aux = it.next();
			if (aux.getNombre().equalsIgnoreCase(nombre)) {
				tmp.add(aux);
			}
		}
		return tmp;
	}
	
	public List<Trabajador> sisisi(String dni){
		List<Trabajador> tmp = new ArrayList <Trabajador> ();
		Iterator<Trabajador> it = listado.values().iterator();
		Trabajador aux;
		while(it.hasNext()) {
			aux=it.next();
			if(aux.getDni().equalsIgnoreCase(dni))
				tmp.add(aux);
		}
		return tmp;
	}
	
	public Trabajador nonono(String dni) {
		Trabajador aux=null;
		Iterator <Trabajador> it = listado.values().iterator();
		boolean encontrado=false;
		while(it.hasNext() && !encontrado) {
			aux=it.next();
			if(aux.getDni().equalsIgnoreCase(dni))
				encontrado=true;
		}
		if(!encontrado) {
			aux=null;
		}
		return aux;
	}
	
	
	public Trabajador buscarPorClave (String dni) {
		Iterator <Trabajador> it = listado.values().iterator(); // probar con keySet();
		//listado.entrySet();
		Trabajador aux = null;
		boolean encontrado = false;
		while (it.hasNext() && !encontrado) {
			aux = it.next();
			if(aux.getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			}
		}
		if (!encontrado) {
			aux = null;
		}
			return aux;
	}
	
	public void eliminarTrabajador (String dni) {
			listado.remove(dni);
	}
	
	public void vaciarMapa () {
			listado.clear();
	}
}
