package ejercicio03;

import java.util.Arrays;

public class Gestion {
	
	private VehiculoMotor listado [];

	
	//Constructores
	public Gestion(VehiculoMotor[] listado) {
		super();
		this.listado = listado;
	}

	
	
	//ToString
	@Override
	public String toString() {
		return "Gestion [listado=" + Arrays.toString(listado) + "]";
	}
	
	

	//GettersSetteers
	public VehiculoMotor[] getListado() {
		return listado;
	}

	public void setListado(VehiculoMotor[] listado) {
		this.listado = listado;
	}
	
	
	
	//Métodos
	public void annadirVehiculo (int posicion, VehiculoMotor vm) {
		listado [posicion] = vm;
	}
	
	public VehiculoMotor buscarVehiculo (String bastidor) {
		int i = 0;
		boolean encontrado = false;

		while (i < listado.length && !encontrado) {
			VehiculoMotor vm = listado [i];
			if (vm.getBastidor().equalsIgnoreCase(bastidor))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return listado[i];
		else
			return null;
	}
	
	public void eliminarVehiculo (String bastidor, VehiculoMotor vm) {
		
	}
	
	public void editarVehiculo (VehiculoMotor vm) {
		
	}
	
	public VehiculoMotor [] muestraListado () {
		return listado;
	}
	
	public void muestraActivos () {
		for (int i = 0; i < listado.length; i++) {
			if (.isac)
			System.out.println((i+1) + ". " + listado[i]);
		}
		
	}

}
