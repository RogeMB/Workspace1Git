package ejercicio06;

import java.util.Arrays;

public class Oficina {
	int numSucursal;

	Cuenta[] c;
	CuentaCorriente[] cc;
	CuentaJoven[] cj;
	CuentaEmpresa[] ce;
	
	// Constructor -----------------------------------
	public Oficina(int numSucursal) {
		this.numSucursal = numSucursal;
		c = new Cuenta[0];
		cc = new CuentaCorriente[0];
		cj = new CuentaJoven[0];
		ce = new CuentaEmpresa[0];
	}
	
	// Métodos
	// Crear nueva cuenta Corriente:
	public void crearCuentaCorriente(float saldoInicial, int puntosIniciales, int puntosUsoCajero, int costeMantenimiento) {
		// Aumentamos en 1 las longitudes de los arrays global y de cuentas "Corriente":
		c = Arrays.copyOf(c, c.length + 1);
		cc = Arrays.copyOf(cc, cc.length + 1);
		cc[cc.length - 1] = new CuentaCorriente(c.length, saldoInicial, puntosIniciales, puntosUsoCajero, costeMantenimiento);
		c[c.length - 1] = cc[cc.length - 1]; 
	}
	
	// Crear nueva cuenta Joven:
	public void crearCuentaJoven(float saldo, int regaloPromocionInicial, int cantidadPromocion) {
		
		c = Arrays.copyOf(c, c.length + 1);
		cj = Arrays.copyOf(cj, cj.length + 1);
		cj[cj.length - 1] = new CuentaJoven(c.length, saldo, regaloPromocionInicial, cantidadPromocion);
		c[c.length - 1] = cj[cj.length - 1]; 
	}
	
	// Crear nueva cuenta Empresa:
	public void crearCuentaEmpresa(float saldo, int costeReintegro) {
	
		c = Arrays.copyOf(c, c.length + 1);
		ce = Arrays.copyOf(ce, ce.length + 1);
		ce[ce.length - 1] = new CuentaEmpresa(c.length, saldo, 1);
		c[c.length - 1] = ce[ce.length - 1]; 
	}
	
	// Devolver un objeto Cuenta por el índice del array
	public Cuenta getCuenta(int indice) {
		return c[indice];
	}
	
	// Ingreso por ventanilla:	
	public boolean ingresar(Cuenta cuenta, int cantidad) {
		return cuenta.ingresar(cantidad);
	}
	
	// Ingreso por cajero:
	public boolean ingresarPorCajero(Cuenta cuenta, int cantidad) {
		return cuenta.ingresarPorCajero(cantidad);
	}
	
	// Reintegro por ventanilla (si el saldo lo permite)
	public boolean reintegrar(Cuenta cuenta, double cantidad) {
		return cuenta.reintegrar(cantidad);
	}
	
	// Reintegro por cajero (si el saldo lo permite)
	public boolean reintegrarPorCajero(Cuenta cuenta, int cantidad) {
		return cuenta.reintegrarPorCajero(cantidad);
	}
	
	// Aplicar comisiones de mantenimiento:
	public void aplicarMantenimiento (Cuenta cuenta) {
		cuenta.aplicarMantenimiento();
	}
	
	// Imprimir estado de una cuenta:
	public void verEstadoCuenta(Cuenta cuenta) {
		System.out.println(cuenta);
	}
	
	// Activar una cuenta:
	public void activar(Cuenta cuenta) {
		cuenta.activar();
	}
	
	// Desactivar una cuenta:
	public void desactivar(Cuenta cuenta) {
		cuenta.desactivar();
	}
	
	// Devolver las condiciones de una cuenta:
	public String verCondiciones(Cuenta cuenta) {
		return cuenta.verCondicionesCuenta();
	}
	
	
	// Devolver el número total de cuentas de la Oficina:
	public int getNumeroCuentas() {
		return c.length;
	}
	
	
	// Calcular saldo total de todas las cuentas de la Oficina:
	public double sumarSaldos() {
		double suma = 0.0;
		for(int i=0; i<c.length; i++) {
			suma += c[i].getSaldo();
		}
		return suma;
	}
	
	// Calcular los ingresos totales en todas las cuentas de la Oficina:
	public double sumarIngresos() {
		double suma = 0.0;
		for(int i=0; i<c.length; i++) {
			suma += c[i].getSumaIngresos();
		}
		return suma;
	}
	
	// Calcular los reintegros totales en todas las cuentas de la Oficina:
	public double sumarReintegros() {
		double suma = 0.0;
		for(int i=0; i<c.length; i++) {
			suma += c[i].getSumaReintegros();
		}
		return suma;
	}
	
	// Calcular los mantenimientos totales en todas las cuentas de la Oficina (son ingresos para la Oficina):
	public double sumarMantenimientos() {
		double suma = 0.0;
		for (int i=0; i<c.length; i++) {
			suma += c[i].getSumaMantenimientos();
		}
		return suma;
	}
	
	// Suma de dinero ingresado en las cuentas por promociones de la Oficina:
	public double sumarDineroPromocional() {
		double suma = 0.0;
		for (int i=0; i<c.length; i++) {
			suma += c[i].getSumaDineroPromocional();
		}
		return suma;
	}
	
	// Suma de puntos obtenidos por las cuentas por promociones de la Oficina:
	public int sumarPuntos() {
		int suma = 0;
		for (int i=0; i<c.length; i++) {
			suma += c[i].getSumaPuntos();
		}
		return suma;
	}
	
	// Suma de cargos en las cuentas por reintegros:
	public double sumarCargosReintegros() {
		double suma = 0.0;
		for (int i=0; i<c.length; i++) {
			suma += c[i].getSumaCargosReintegros();
		}
		return suma;
	}
	
	// Listar todas las cuentas de la oficina:
	public void listarCuentas() {
		if (c.length == 0) {
			System.out.println("No hay, aún, ninguna cuenta creada en la oficina número " + numSucursal);
		} else {
			for (int i=0; i<c.length; i++) {
				System.out.println(c[i]);
			}
		}
	}
	
	// Devolver el número de sucursal:
	public int getNumSucursal() {
		return numSucursal;
	}
}