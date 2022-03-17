package ejercicio06;

import java.util.Map;

import java.util.TreeMap;

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
	
	public int calcularTamanno(Map <String, Trabajador> l) {
		if(!l.isEmpty()) {
			return l.size();
		}else {
			return 0;
		}
	}
	
	public void mostrarListado(Map <String, Trabajador> l) {
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
	
	public void mostrarListadoOrdenadoHora(TreeMap <String, Trabajador> l) {
		int i = 1;
		CompararPorHora ca = new CompararPorHora ();
		ca.compare(null, null);		
		l = new TreeMap (ca.compare(o1, o2));
		for (Map.Entry<String, Trabajador> entry : l.entrySet()) {
			String key = entry.getKey();
			Trabajador val = entry.getValue();
			//System.out.println((i++) + ". " + key + " " + val.getNombre() + " " +  val.getApellidos() + " " + val.getHorasTrabajadas() + " " + val.getSueldoFinal());
			System.out.println("============================================================================================================================");
			System.out.println((i++) + ". Dni: " + key + " - " +  val);
		}
		System.out.println("============================================================================================================================");
		
	}
	
	public double calcularSueldoFinal (double horasTrabajas, double horasExtra, double euroHora, double euroHoraExtra, double Bono) {
		return calcularSueldoFinal(horasTrabajas, horasExtra, euroHora, euroHoraExtra, Bono);
	}
	
}
