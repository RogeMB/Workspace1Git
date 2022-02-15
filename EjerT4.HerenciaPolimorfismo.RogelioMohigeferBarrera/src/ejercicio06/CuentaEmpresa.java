package ejercicio06;

public class CuentaEmpresa extends Cuenta {
	/* Esta cuenta no tiene gastos de mantenimiento,pero se le cobra por cada reintegro */ 
	int costeReintegro;  // Cargo por cada reintegro
	int sumaCargosReintegros; // Total de cargos por reintegros
	
	// Constructor ---------------------------------------
	public CuentaEmpresa(int idCuenta, float saldoInicial, int costeReintegro) {
		super(idCuenta, saldoInicial, 0);
		this.costeReintegro = costeReintegro;
		this.sumaCargosReintegros = 0;
	}
	
	
	// Métodos -------------------------------------------
	
	// Reintegro por ventanilla (si la cuenta está activa y el saldo lo permite):
	@Override
	public boolean reintegrar(double cantidad) {
		// El reintegro es de la cantidad que se requiere + el costeReintegro, para lo que tiene que tener saldo
		if (super.reintegrar(cantidad+costeReintegro)) {
			// Reajustamos: costeReintegro no va en sumaReintegros, sino en sumaCargosReintegro:
			sumaReintegros -= costeReintegro;
			sumaCargosReintegros += costeReintegro;
			return true;
		}
		return false;
	}
	
	// Reintegro por cajero (si la cuenta está activa y el saldo lo permite):
	@Override
	public boolean reintegrarPorCajero(int cantidad) {
		// El reintegro es de la cantidad que se requiere + el costeReintegro, para lo que tiene que tener saldo
		if (super.reintegrarPorCajero(cantidad+costeReintegro)) {
			// Reajustamos: costeReintegro no va en sumaReintegros, sino en sumaCargosReintegro:
			sumaReintegros -= costeReintegro;
			sumaCargosReintegros += costeReintegro;
			return true;
		}
		return false;
	}
	
	// Suma de los cargos por reintegros:
	@Override
	public int getSumaCargosReintegros() {
		return sumaCargosReintegros; 
	}
	
	// Devolver las condiciones de la cuenta, en un String:
	@Override
	public String verCondicionesCuenta() {
		return super.verCondicionesCuenta() + " [Tipo: \"Empresa\". Coste de cada reintegro: " + costeReintegro + "€]";
	}
	
	@Override
	public String toString () {
		return super.toString() + "\n\t[Tipo de cuenta: \"Empresa\". Cargos por reintegros: " +
				sumaCargosReintegros + "€]";
	}
}

