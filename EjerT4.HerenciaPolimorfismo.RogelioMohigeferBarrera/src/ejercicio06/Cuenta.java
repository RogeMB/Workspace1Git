package ejercicio06;

public abstract class Cuenta {

	

	double saldo, sumaIngresos, sumaReintegros, sumaMantenimientos;  // sumaMantenimientos recoge los cargos por mantenimiento
	int idCuenta, costeMantenimiento; 
	boolean activa; 
	
	// Constructor ---------------------------------
	Cuenta(int idCuenta, float saldo, int costeMantenimiento) {
		this.idCuenta = idCuenta;
		this.saldo = saldo;
		this.sumaIngresos = saldo;
		this.sumaMantenimientos = 0.0;
		this.costeMantenimiento = costeMantenimiento;
		this.activa = true;
	}
	
	// Métodos --------------------------------------
	
	// Ingreso por ventanilla (si la cuenta está activa):
	public boolean ingresar(double cantidad) {
		if (activa) {
			saldo += cantidad;
			sumaIngresos += cantidad;
			return true;
		} else {
			imprimirCuentaInactiva();
			return false;
		}
	}
	
	// Ingreso por cajero (si la cuenta está activa):
	public boolean ingresarPorCajero(int cantidad) {
		if (activa) {
			saldo += cantidad;
			sumaIngresos += cantidad;
			return true;
		} else {
			imprimirCuentaInactiva();
			return false;
		}
	}
	
	// Reintegro por ventanilla (si la cuenta está activa y el saldo lo permite):
	public boolean reintegrar(double cantidad) {
		if (activa) {
			if (cantidad <= saldo) {
				saldo -= cantidad;
				sumaReintegros += cantidad;
				return true;
			} else {
				imprimirSaldoInsuficiente();
				return false; 
			}
		} else {
			imprimirCuentaInactiva();
			return false;
		}
	}
	
	// Reintegro por cajero (si la cuenta está activa y el saldo lo permite):
	public boolean reintegrarPorCajero(int cantidad) {
		// Por cajero sólo se permiten reintegros int
		if (activa) {
			if (cantidad <= saldo) {
				saldo -= cantidad;
				sumaReintegros += cantidad;
				return true;
			} else {
				imprimirSaldoInsuficiente();
				return false; 
			}
		} else {
			imprimirCuentaInactiva();
			return false;
		}
	}
	
	// Restar costes de mantenimiento (si la cuenta está activa):
	public boolean aplicarMantenimiento () {
		if (activa) {
			saldo -= costeMantenimiento;  // Se le resta al saldo el coste de mantenimiento
			sumaMantenimientos += costeMantenimiento;  // Se anota el total del mantenimiento de esta cuenta
			return true;
		} else {
			imprimirCuentaInactiva();
			return false;
		}
	}
	
	// Devolver el saldo de la cuenta
	public double getSaldo () {
		return saldo;
	}
	
	// Devolver la suma total de los ingresos efectuados en la cuenta
	public double getSumaIngresos () {
		return sumaIngresos;
	}
	
	// Devolver la suma total de los reintegros efectuados en la cuenta
	public double getSumaReintegros () {
			return sumaReintegros;
	}
		
	// Devolver la suma total de gastos aplicados a la cuenta (beneficios para la oficina)
	public double getSumaMantenimientos () {
		return sumaMantenimientos;
	}
	
	// Devolver la suma de dinero ingresado en la cuenta por promociones:
	public int getSumaDineroPromocional() {
		return 0;
	}
	
	// Devolver la suma de cargos por reintegros:
	public int getSumaCargosReintegros() {
		return 0; 
	}
	
	// Devolver la suma de puntos obtenidos en la cuenta por promociones:
	public int getSumaPuntos() {
		return 0;
	}
	
	// Devolver si la cuenta está activa (true) o inactiva (false)
	public boolean getActiva() {
		return activa;
	}
	
	// Activar la cuenta:
	public void activar() {
		activa = true;
	}
	
	// Desactivar la cuenta:
	public void desactivar() {
		activa = false;
	}
	
	public String verCondicionesCuenta() {
		return "[Cuenta núm: " + idCuenta + ". Coste de mantenimiento: " + costeMantenimiento + "€]";
	}
	
	public String toString() {
		return "[Cuenta núm: " + idCuenta + ". Saldo: " + saldo + ". Suma de ingresos: " + sumaIngresos +
				". Suma de reintegros: " + sumaReintegros + ". Suma de mantenimientos: " +
				sumaMantenimientos + ". Activa: " + activa + "]";
	}
	
	// Métodos privados, que son llamados por otros métodos de la clase:
	private void imprimirSaldoInsuficiente() {
		System.out.println("\t*** Error: Saldo insuficiente ***");
	}
	
	private void imprimirCuentaInactiva() {
		System.out.println("\t*** Error: cuenta inactiva ***");
	}
}

