package ejercicio06;

public class CuentaCorriente extends Cuenta {
	/* Esta cuenta paga un mantenimiento fijo y acumula puntos cuando se unsa el cajero */
	int sumaPuntos;
	int puntosUsoCajero;  // puntos que se reciben cada vez que se usa el cajero
	
	// Constructor --------------------------------
	public CuentaCorriente(int idCuenta, float saldoInicial, int puntosIniciales,
			int puntosUsoCajero, int costeMantenimiento) {
		// El cliente abre la cuenta con determinado saldo inicial:
		super(idCuenta, saldoInicial, costeMantenimiento);  
		
		this.sumaPuntos = puntosIniciales;  // Puede haber promociones de regalo de puntos por abrir cuenta
		
		// Los siguientes valores pueden variar de una cuenta a otra, según el cliente:
		this.puntosUsoCajero = puntosUsoCajero;
		this.costeMantenimiento = costeMantenimiento;
	}
	
	// Métodos ------------------------------------
	
	// Ingreso por cajero (si la cuenta está activa):
	@Override
	public boolean ingresarPorCajero(int cantidad) {
		if(super.ingresarPorCajero(cantidad)) {
			// Por cajero se acumulan puntos por cada operación
			sumaPuntos += puntosUsoCajero;
			return true;
		} else
			return false;
	}
	
	// Reintegro por cajero (si la cuenta está activa y el saldo lo permite):
	@Override
	public boolean reintegrarPorCajero(int cantidad) {
		// Por cajero se acumulan puntos por cada operación
		if (super.reintegrarPorCajero(cantidad)) {
			sumaPuntos += puntosUsoCajero;
			return true;
		} else
			return false;
	}
	
	// Suma de puntos obtenidas por la cuenta:
	@Override
	public int getSumaPuntos() {
		return sumaPuntos;
	}

	// Devolver las condiciones de la cuenta, en un String:
	@Override
	public String verCondicionesCuenta() {
		return super.verCondicionesCuenta() + " [Tipo: \"Corriente\". Puntos por usar cajero: " + puntosUsoCajero + "]";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\n\t[Tipo de cuenta: \"Corriente\". Puntos por haber usado cajero: " +
				sumaPuntos + "]";
	}
	
}
