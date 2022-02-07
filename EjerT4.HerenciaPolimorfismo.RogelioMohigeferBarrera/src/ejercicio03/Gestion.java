package ejercicio03;

import java.util.Arrays;

public class Gestion {
	
	private VehiculoMotor listado [];
	private String contrasenna;

	
	//Constructores
	public Gestion(VehiculoMotor[] listado, String contrasenna) {
		super();
		this.listado = listado;
		this.contrasenna = "elmejordiademivida";
	}

	
	//ToString
	@Override
	public String toString() {
		return "Gestion [listado=" + Arrays.toString(listado) + ", contrasenna=" + contrasenna + "]";
	}
	
	

	//GettersSetteers
	public VehiculoMotor[] getListado() {
		return listado;
	}

	public void setListado(VehiculoMotor[] listado) {
		this.listado = listado;
	}
	
	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}



	//Métodos
	public double calcularUnVehiculo (VehiculoMotor vm, double incremento, double incremento2) { //hay que añadir incremento
		return vm.calcularImpuestoCirculacion(incremento, incremento2);
	}
	
	public double calcularTotal (double incremento, double incremento2) {  //hay que añadir incremento
		double total = .0;
		for (int i = 0; i < listado.length; i++) {
			total=total+listado[i].calcularImpuestoCirculacion(incremento, incremento2);
		}
		return total;
	}
	
	public double calcularTotalOtraforma (double incremento, double incremento2) { //hay que añadir incremento
		double total = .0;
		for (int i = 0; i < listado.length; i++) {
			total=total+calcularUnVehiculo(listado[i], incremento, incremento2);
		}
		return total;
	}
	
	
	
	public void annadirVehiculo (int posicion, VehiculoMotor vm) {
		listado [posicion] = vm;
	}
	
	public int buscarVehiculo (String bastidor) { //habría que devolver un vehiculo completo en lugar de un int
		int j = 0;
		boolean encontrado = false;

		while (j < listado.length && !encontrado) {
			VehiculoMotor vm = listado [j];
			if (vm.getBastidor().equalsIgnoreCase(bastidor))
				encontrado = true;
			else
				j++;
		}
		if (encontrado)
			return j;
		else
			return -1;
	}
	
	public void eliminarVehiculo (String bastidor) {
		int elegido = buscarVehiculo (bastidor);
		if (elegido >= 0) {
			listado [elegido].setActivo(false);
		}
	}
	
	public void editarVehiculo (String bastidor, double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible) {
		int elegido = buscarVehiculo (bastidor);
		if (elegido >= 0) {
			listado [elegido].setCilindrada(cilindrada);
			listado [elegido].setCaballos(caballos);
			listado [elegido].setCilindros(cilindros);
			listado [elegido].setTipoCombustible(tipoCombustible);
		}
	}
	
	public void mostrarSeleccionado (String bastidor) {
		int elegido = buscarVehiculo (bastidor);
		System.out.println(listado[elegido]);
	}
	
	public void mostrarActivos () {
		for (int i = 0; i < listado.length && listado [i] != null; i++) {
			if (listado[i].isActivo()) 
				System.out.println((i+1)+ ". " +listado[i]);
		}
	}
	
	public void mostrarToitosTos () {
		for (int i = 0; i < listado.length; i++) {
			System.out.println((i+1)+ ". " +listado[i]);
		}
	}
	
	
	public void comprobarContrasenna (String clave) {
		int intentos = 3;
		do{
			if (clave.equals(getContrasenna())){
				System.out.println("\t\t===Contraseña correcta===");
			}else {
				intentos--;
				System.out.println("\t\t***ERROR***. Te quedan " +intentos+ " intentos.");
			}
		}while (clave != getContrasenna () && intentos > 0);
		
		if (intentos == 0) {
			do {
				System.out.println("\t\t¡Ah, ah, ah! ¡No has dicho la palabra mágica!");
			}while (intentos == Math.PI);
		}
	}
	
	
	public boolean cambiarContrasenna (String nuevaClave) {
		if (nuevaClave.length()<=20 && nuevaClave.length()>=8) {
			setContrasenna(nuevaClave);
			System.out.println("\t\t===Contraseña cambiada correctamente.===");
			return true;
		}else {
			System.out.println("\t\t***ERROR***. Prueba con otra.");
			return false;
		}
	}
	


}
