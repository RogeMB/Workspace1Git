package ejercicio06;

public class CuentaCorriente extends Cuenta {

	int sumaPuntos;
	int puntosUsoCajero;  
	
	// Constructor 
	public CuentaCorriente(int idCuenta, float saldoInicial, int puntosIniciales,
			int puntosUsoCajero, int costeMantenimiento) {

		super(idCuenta, saldoInicial, costeMantenimiento);  
		this.sumaPuntos = puntosIniciales;  
		this.puntosUsoCajero = puntosUsoCajero;
		this.costeMantenimiento = costeMantenimiento;
	}
	
	// Métodos 
	
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
