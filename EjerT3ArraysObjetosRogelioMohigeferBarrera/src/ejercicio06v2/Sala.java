package ejercicio06v2;

import java.util.Arrays;

public class Sala {
	
	private int idSala;
	private static int totalLocalidades;
	private String contrasenna;
	Entrada ent;
	Entrada [] localidades;
	
	//Contructores
	public Sala(Entrada ent, Entrada[] localidades) {
		this.idSala = 1;
		this.ent = ent;
		this.localidades = localidades;
	}
	
	public Sala () {
	}
	
	public Sala(String contrasenna) {
		this.contrasenna = "yatusabe";
	}
	
	//ToString
	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", ent=" + ent + ", localidades=" + Arrays.toString(localidades) + "]";
	}
	
	
	//GettersSetters
	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public static int getTotalLocalidades() {
		return totalLocalidades;
	}

	public static void setTotalLocalidades(int totalLocalidades) {
		Sala.totalLocalidades = totalLocalidades;
	}

	public String getContraseña() {
		return contrasenna;
	}

	public void setContraseña(String contraseña) {
		this.contrasenna = contraseña;
	}

	public Entrada getEnt() {
		return ent;
	}

	public void setEnt(Entrada ent) {
		this.ent = ent;
	}

	public Entrada[] getLocalidades() {
		return localidades;
	}

	public void setLocalidades(Entrada[] localidades) {
		this.localidades = localidades;
	}
	
	
	//Calculos

	public static void imprimirMenu () {
		System.out.println("\t\tBienvenido/a a Cutriccini, cine y cataplines.\nIntroduce una opción entre "
				+ "las siguientes:"
				+ "\n\t0. Salir"
				+ "\n\t1. Ver Cartelera"
				+ "\n\t2. Comprar una localidad"
				+ "\n\t3. Voy a tener suerte"
				+ "\n\t4. Opciones para el personal autorizado");
		
	}

	public static void imprimirSubMenu () {
		System.out.println("¿Qué desea hacer? Introduce una opción entre las siguientes:"
				+ "\n\t0. Volver"
				+ "\n\t1. Cambiar Contraseña"
				+ "\n\t2. Calcular ganancias totales del día."
				+ "\n\t3. Modificar precio de la entrada"
				+ "\n\t4. Modificar película"
				+ "\n\t5. Añadir localidades"
				+ "\n\t6. Eliminar localidades");
	}
	
	public boolean comprobarContrasenna (String clave) {
		if (clave.equals(getContraseña())) {
			return true;
		}else {
			return false;
		}
	}
	public void imprimirTrueFalse (boolean b) {
		if (b) {
			System.out.println("Clave correcta");
		}else {
			System.out.println("Clave incorrecta");
		}
	}
	

}
