package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CrudPlantilla {
	
	private Map <String,Trabajador> listado;  // tenemos un map de String (dni) Key, y Trabajador Value.

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
	
	/* método para calcular el tamaño del mapa. Le estamos pasando un SortedMap como parámetro queriendo 
	*para ver que podemos hacerlo, pero no es necesario en este caso*/
	public int calcularTamanno(SortedMap <String, Trabajador> l) {
		if(!l.isEmpty()) {
			return l.size();
		}else {
			return 0;
		}
	}
	
	// Método para calcular el sueldo de un trabajador pasándole el dni. Antes comprobamos que la Key exista en el listado
	public boolean calcularSueldoUno (String dni, double horasTrabajas, double horasExtra, double euroHora, double euroHoraExtra, double Bono) {
		if (listado.containsKey(dni)) {
			listado.get(dni).setSueldoFinal(listado.get(dni).calcularSueldo(horasTrabajas, euroHora, Bono, horasExtra, euroHoraExtra));
			// con .get(key) con seguimos un objeto.
			return true;
		}else {
			return false;
		}
	}
	// Método para mostrar un solo trabajador buscándolo por dni.
	public void mostrarUno (String dni) {
		if (!listado.isEmpty()) {  // el método isEmpty para comprobar que no esté vacío el mapa.
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
		int i = 1;   /* esta es la forma de iterar sobre un mapa, creando una entrada con la clase Map.Entry y 
					  * un Set con el método entrySet()*/
		for (Map.Entry<String, Trabajador> entry : listado.entrySet()) {
			String key = entry.getKey();
			Trabajador val = entry.getValue(); /*prueba a poner un punto después del paréntesis. Verás como puedes acceder a
												*métodos como el calcularSueldo() propio de la POJO */
			
			System.out.println("============================================================================================================================");
			System.out.println((i++) + ". Dni: " + key + " - " +  val);
			//Estamos haciendo lo mismo que lo siguiente:
			//System.out.println((i++) + ". " + key + " " + val.getNombre() + " " +  val.getApellidos() + " " + val.getHorasTrabajadas() + " " + val.getSueldoFinal());
		}
		System.out.println("============================================================================================================================");
	}
	
	
	// igual que el anterior pero con un TreeMap como parámetro 
	public void mostrarListadoTree(TreeMap<Trabajador, Trabajador> l) {
		int i = 1;   
		for (Map.Entry<Trabajador, Trabajador> entry : l.entrySet()) {
			Trabajador key = entry.getKey();
			Trabajador val = entry.getValue();
			System.out.println("============================================================================================================================");
			System.out.println((i++) + ". " + key + " - " + val);
		}
		System.out.println("============================================================================================================================");
	}
	
	
	
	 /* Esta es un método para ordenar el mapa por valores de forma diferente con un comparador
	  * Lo que hacemos sacar los valores con .values() y meterlos en una Lista para poder trabajar sobre ella. 
	  * Además le pasamos un comparador genérico que podemos definir cuál desde el principal al haberlos creado allí*/
	
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
	
	// Método para trabajar sobre el valor de la primera key, y a través de get(key). 
	//Necesitamos pasarle un SortedMap en el argumento ya que es un método de Sorted.
	public void mostrarElPrimero(SortedMap<String, Trabajador> listado) {
		if(!listado.isEmpty()) {
			System.out.println(listado.get(listado.firstKey()));
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	// Igual que el anterior pero con la última key.
	public void mostrarElUltimo(SortedMap<String, Trabajador> listado) {
		if(!listado.isEmpty()) {
			System.out.println(listado.get(listado.lastKey()));
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	
	/*
	 * Método para que nos devuelva un listado de valores. Necesitamos utilizar un iterador sobre un mapa. 
	 * No podemos hacerlo directamente. Necesitamos transformarlo en una lista
	 * como hemos hecho antes.
	 */
	public List<Trabajador> buscarPorNombre (String nombre) {
		Iterator <Trabajador> it = listado.values().iterator();
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
	
	/*
	 * Método para conseguir un trabajador, es decir un valor. Muy parecido al anterior.
	 */
	public Trabajador buscarPorClave (String dni) {
		Iterator <Trabajador> it = listado.values().iterator();
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
	
	// Método para eliminar una entrada (K, V) a través de una key.
	public void eliminarTrabajador (String dni) {
			listado.remove(dni);
	}
	
	// Método para vaciar el mapa al completo. Todas las entradas.
	public void vaciarMapa () {
			listado.clear();
	}
}
