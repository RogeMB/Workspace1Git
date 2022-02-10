package ejercicio03;

import java.util.Arrays;

/**
 * Main class for administrative methods
 * @version JDK 11, minimum jKD 5
 * @author mohigefer.barog22
 *
 */

public class Gestion {
	
	private VehiculoMotor listado [];
	private String contrasenna;

	
	// Constructors
	public Gestion(VehiculoMotor[] listado, String contrasenna) {
		super();
		this.listado = listado;
		this.contrasenna = "elmejordiademivida";
	}

	
	// ToString
	@Override
	public String toString() {
		return "Gestion [listado=" + Arrays.toString(listado) + ", contrasenna=" + contrasenna + "]";
	}
	
	

	// GettersSetteers
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



	// Methods
	public double calcularUnVehiculo (VehiculoMotor vm, int incremento) { //hay que añadir incremento
		return vm.calcularImpuestoCirculacion(incremento);
	}
	
	
	public double calcularTotal (int incremento) {  //hay que añadir incremento
		double total = .0;
		for (int i = 0; i < listado.length; i++) {
			total=total+listado[i].calcularImpuestoCirculacion(incremento);
		}
		return total;
	}
	
	
	public double calcularTotalOtraforma (int incremento) { //hay que añadir incremento
		double total = .0;
		for (int i = 0; i < listado.length; i++) {
			total=total+calcularUnVehiculo(listado[i], incremento);
		}
		return total;
	}
	
	
	/**
	 * 
	 * @param posicion
	 * @param vm
	 * @return add a new position in the array' s memory with a new VehiculoMotor.
	 * @exception no exception found
	 * @see VehiculoMotor's constructor
	 */
	public void annadirVehiculo (int posicion, VehiculoMotor vm) {
		listado [posicion] = vm;
	}
	
	/**
	 * Method that find a position in the array by the bastidor attribute
	 * @param bastidor
	 * @return array's position if it is found, -1 if not.
	 * @see eliminarVehiculo
	 */
	
	public int buscarVehiculo (String bastidor) { 
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
	
	
	
	public VehiculoMotor buscarVehiculoDos (String bastidor) {
		int j = 0;
		boolean encontrado = false;
		
		while (j < listado.length && !encontrado) {
			VehiculoMotor vm = listado [j];
		
			if (vm.getBastidor().equals(bastidor)){
				encontrado = true;
			}else {
				j++;
			}
		}
		
		if (encontrado) {
			return listado [j];
		}else {
			return null;
		}
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
