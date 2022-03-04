package ejercicio02;

import java.util.List;
import java.util.Random;

public class Gestion {
	
	private List <Socio> listado;
	private static double totalRecaudado;

	
	
	// Constructor
	
	public Gestion(List<Socio> listado) {
		super();
		this.listado = listado;
	}

	
	// ToString
	
	@Override
	public String toString() {
		return "Gestion [listado=" + listado + "]";
	}


	// Getters&Setters
	
	public List<Socio> getListado() {
		return listado;
	}

	public void setListado(List<Socio> listado) {
		this.listado = listado;
	}
	
	
	// Métodos
	
	public int generarID () {
		int var=0, max=9999999, min=1;
		Random r = new Random (System.nanoTime());
		var=r.nextInt(max - min + 1) + min;
			
		return var;
	}
	
	public void annadirSocio (Socio s) {
		listado.add(s);
	}
	
	public int calcularCantidadSocios () {
		return listado.size();
	}
	
	public double calcularRecaudado (double descuentoMenores, double descuentoAncianos, double descuentoPremium, int minimoMiembros, int cantidadMiembros) {
		
		if (!listado.isEmpty()) {
			for (Socio socio : listado) {
				 totalRecaudado+=socio.calcularCuota(descuentoMenores, descuentoAncianos, descuentoPremium, minimoMiembros, cantidadMiembros);
				 
			 }
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
			return totalRecaudado;
	}
	
	public void mostrarListado () {
		int i=0;
		if (!listado.isEmpty()) {
			for (Socio socio : listado) {
				System.out.println((i+1) + ". " + socio + ".");
				if (socio instanceof SocioPremium) {
					((SocioPremium) socio).imprimirPremium();
				}
			}
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	public void mostrarActivos () {
		int i=0;
		if (!listado.isEmpty()) {
			for (Socio socio : listado) {
				if (socio.isActivo() && socio != null) {
					System.out.println((i+1) + ". " + socio + ".");
					if (socio instanceof SocioPremium) {
						((SocioPremium) socio).imprimirPremium();
					}
				}
			}
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	public void mostrarPremiums () {
		int i=0;
		if (!listado.isEmpty()) {
			for (Socio socio : listado) {
				if (socio instanceof SocioPremium) {
					System.out.println((i+1) + ". " + socio + ".");
				}
			}
		}else {
			System.out.println("\t\t***EL LISTADO ESTÁ VACÍO***");
		}
	}
	
	
	public Socio buscarSocio (int id) {
		boolean encontrado = false;
		for (Socio socio : listado) {
			if (socio.getId() == id) {
				encontrado=true;
			}
		}
		if (encontrado) {
			return listado.get(id);
		}else {
			return null;
		}
	}
	
	public void editarSocio (int id, String nombre, String apellidos, int edad, double cuota) {
		if (!listado.isEmpty() && buscarSocio(id) != null) {
			buscarSocio(id).setNombre(nombre);
			buscarSocio(id).setApellidos(apellidos);
			buscarSocio(id).setEdad(edad);
			buscarSocio(id).setCuota(cuota);
		}else {
			imprimirNoEncontrado();
		}
	
	}
	
	
	public void borrarSocio (int id) {
		if (!listado.isEmpty() && buscarSocio(id) != null) {
			buscarSocio(id).setActivo(false);
			imprimirBorrado();
		}else {
			imprimirNoEncontrado();
		}
	}
	
	public void imprimirNoEncontrado () {
		System.out.println("\n\t\t***Socio no encontrado***");
	}
	
	public void imprimirBorrado () {
		System.out.println("\n\t\t***Proceso de baja correcto***");
	}
	

}
