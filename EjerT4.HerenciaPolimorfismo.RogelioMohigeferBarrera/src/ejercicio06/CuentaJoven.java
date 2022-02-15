package ejercicio06;

public class CuentaJoven extends Cuenta {
	/* Esta cuenta no tiene gastos de mantenimiento y se le abona 1€ cada vez que se hace un ingreso */
	int sumaPromocion;  // Suma de las cantidades que paga la oficina por ingresar dinero
	int cantidadPromocion;  // Lo que paga la oficina por un ingreso
	
	// Constructor ------------------------------------
	public CuentaJoven(int idCuenta, float saldoInicial, int regaloPromocionInicial, int cantidadPromocion) {
		super(idCuenta, saldoInicial, 0);  // El coste de mantenimiento es 0.
		// Se podría decidir que la oficina regale un ingreso inicial promocional:
		this.sumaPromocion = regaloPromocionInicial;  
		// Cantidad que paga la oficina cada vez que ingresan dinero (se prevé que pueda variar para cada cuenta):
		this.cantidadPromocion = cantidadPromocion;  
	}	

	
	// Métodos ------------------------------------
	
	@Override
	// Ingreso por ventanilla (si la cuenta está activa):
	public boolean ingresar(double cantidad) {
		if (super.ingresar(cantidad)) {
		// Por cada ingreso > 0 se le regala cantidadPromocion en su cuenta
			if (cantidad > 0) {
				saldo += cantidadPromocion;
				sumaPromocion += cantidadPromocion;
			}
			return true;
		} else
			return false;
	}
	
	// Ingreso por cajero (si la cuenta está activa):
	@Override
	public boolean ingresarPorCajero(int cantidad) {
		if(super.ingresarPorCajero(cantidad)) {
			// Por cada ingreso > 0 se le regala cantidadPromocion en su cuenta
			if (cantidad > 0) {
				saldo += cantidadPromocion;
				sumaPromocion += cantidadPromocion;
			}
			return true;
		} else
			return false;
	}
	
	@Override
	public int getSumaDineroPromocional() {
		return sumaPromocion;
	}
	
	// Devolver las condiciones de la cuenta, en un String:
	@Override
	public String verCondicionesCuenta() {
		return super.verCondicionesCuenta() + " [Tipo: \"Joven\". Abono por cada ingreso: " + cantidadPromocion + "€]";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\n\t[Tipo de cuenta: \"Joven\". Abonos obtenidos por ingresos: " +
				sumaPromocion + "€]";
	}
}
