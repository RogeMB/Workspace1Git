package ejercicio05;

import java.util.Arrays;

public class Oficina {
	/* Ésta es la clase principal, que constará de una serie de empleados.
	 * Todos los empleados se guardarán en un array de objetos Empleado.
	 * A su vez, existirán arrays para cada tipo de empleados: EmpleadoAComision y EmpleadoFijo
	 * Como todos los objetos de los arrays de las subclases están referenciados en Empleado, para
	 * poder encontrar empleados que sólo sean genéricos, hemos tenido que usar un atributo de la
	 * superclase que los identifique.
	 * La gestión de los empleados se hará a través de esta clase.
	 */

	int numEmpleados;
	int iCero = 0;
	double dCero = 0.0;
	
	Empleado[] e;
	EmpleadoAComision[] ec;
	EmpleadoFijo[] ef;
	
	// Constructor ------------------------------------------
	public Oficina() {
		/* Instanciamos los arrays que hemos declarado en la cabecera
		 * con longitud 0 (no tenemos empleados al inicio):
		 */
		numEmpleados = iCero;
		e = new Empleado[numEmpleados];
		ec = new EmpleadoAComision[numEmpleados];
		ef = new EmpleadoFijo[numEmpleados];
	}
	
	
	// Métodos -----------------------------------------------
	
	// Crear Empleado genérico:
	public void CrearEmpleadoGenerico(String nombre, double sueldoBase) {
		// Aumentamos en 1 el número de empleados de la oficina:
		numEmpleados++;
		// Aumentamos en 1 la longitud del array de empleados genéricos
		// (la nueva longitud será numEmpleados, porque en este array están todos los empleados):
		e = Arrays.copyOf(e, numEmpleados);
		/* Como cada elemento del array e es un objeto Empleado, el nuevo empleado, que se sitúa al final
		 * del array, se añade con el constructor de Empleado:
		 */
		e[numEmpleados-1] = new Empleado(numEmpleados,nombre,sueldoBase);
	}
	
	// Crear Empleado a comisión:
	public void CrearEmpleadoAComision(String nombre, double sueldoBase, int porcentajeComision) {
		// Aumentamos en 1 el número de empleados de la oficina:
		numEmpleados++;
		// Aumentamos en 1 la longitud del array de empleados genéricos
		// (la nueva longitud será numEmpleados, porque en este array están todos los empleados):
		e = Arrays.copyOf(e, numEmpleados);
		// Aumentamos en 1 el número de empleados a comisión. De éstos no sabemos cuántos hay, salvo por
		// la longitud del array. La nueva longitud será la antigua + 1:
		ec = Arrays.copyOf(ec, ec.length + 1);
		/* Usamos el constructor de la clase EmpleadoAComision para instanciar al nuevo empleado, al final
		 * del array. Por tanto, el índice que le corresponde es la longitud nueva del array menos 1.
		 * El nuevo empleado es un objeto de la clase EmpleadoAComision. Y la variable que lo
		 * referencia es el último elemento del array de empleados a comisión.
		 * El número de identificación del nuevo empleado es numEmpleados.
		 */
		ec[ec.length-1] = new EmpleadoAComision(numEmpleados, nombre, sueldoBase, porcentajeComision);
		// Referenciamos el último elemento del array global de empleados al nuevo empleado a comisión:
		e[numEmpleados-1] = ec[ec.length-1];
	}
	
	// Crear Empleado a Fijo:
	public void CrearEmpleadoFijo(String nombre, double sueldoBase, int porcentajeRetencion) {
		// Aumentamos en 1 el número de empleados de la oficina:
		numEmpleados++;
		// Aumentamos en 1 la longitud del array de empleados genéricos
		// (la nueva longitud será numEmpleados, porque en este array están todos los empleados):
		e = Arrays.copyOf(e, numEmpleados);
		// Aumentamos en 1 el número de empleados fijos. De éstos no sabemos cuántos hay, salvo por
		// la longitud del array. La nueva longitud será la antigua + 1:
		ef = Arrays.copyOf(ef, ef.length + 1);
		/* Usamos el constructor de la clase EmpleadoFijo para instanciar al nuevo empleado, al final
		 * del array. Por tanto, el índice que le corresponde es la longitud nueva del array menos 1.
		 * El nuevo empleado es un objeto de la clase EmpleadoFijo. Y la variable que lo
		 * referencia es el último elemento del array de empleados a comisión.
		 * El número de identificación del nuevo empleado es numEmpleados.
		 */
		ef[ef.length-1] = new EmpleadoFijo(numEmpleados, nombre, sueldoBase, porcentajeRetencion);
		// Referenciamos el último elemento del array global de empleados al nuevo empleado fijo:
		e[numEmpleados-1] = ef[ef.length-1];
	}
	
	// Obtener el número de empleados de la oficina:
	public int getNumEmpleados() {
		return e.length;
	}
	
	// Obtener un objeto Empleado por el índice del array:
	public Empleado getEmpleado(int indice) {
		return e[indice];
	}
	
	// Obtener el nombre de un empleado:
	public String getNombre(Empleado empleado) {
		return empleado.getNombre();
	}
	
	// Cambiar el nombe de un empleado:
	public void setNombre(Empleado empleado, String nuevoNombre) {
		empleado.setNombre(nuevoNombre);
	}
	
	// Obtener el número de identificación de un empleado (no se permite cambiarlo):
	public int getNumEmpleado(Empleado empleado) {
		return empleado.getNumEmpleado();
	}
	
	// Obtener el sueldo base de un empleado:
	public double getSueldoBase(Empleado empleado) {
		return empleado.getSueldoBase();
	}
	
	// Cambiar el sueldo base de un empleado:
	public void setSueldoBase(Empleado empleado, double nuevoSueldoBase) {
		empleado.setSueldoBase(nuevoSueldoBase);
	}
	
	// Obtener las ventas efectuadas por un empleado:
	public double getVentas(Empleado empleado) {
		return empleado.getVentas();
	}
	
	// Obtener si un empleado está activo:
	public boolean isActivo(Empleado empleado) {
		return empleado.isActivo();
	}
	
	// Cambiar el estado activo/no activo de un empleado:
	public void setActivo(Empleado empleado, boolean nuevoValorActivo) {
		empleado.setActivo(nuevoValorActivo);
	}
	
	// Establecer el global de ventas efectuadas por un empleado:
	public void setVentas(Empleado empleado, double nuevasVentas) {
		/* Este método está en la superclase Empleado y está sustituido (Override) en EmpleadoAComision.
		 * Por polimorfismo, se ejecutará el método de la subclase.
		 */
		empleado.setVentas(nuevasVentas);
	}
	
	// Aumentar las ventas de un empleado en una cantidad:
	public void setNuevasVentas(Empleado empleado, double importe) {
		/* Este método está en la superclase Empleado y está sustituido (Override) en EmpleadoAComision.
		 * Por polimorfismo, se ejecutará el método del objeto referenciado.
		 */
		empleado.setNuevasVentas(importe);
	}
	
	// Calcular el sueldo neto final de un empleado:
	public double calcularSueldoNetoFinal(Empleado empleado) {
		// El método también es Override
		return empleado.calcularSueldoNetoFinal();
	}
	
	// Inicializar (nuevo mes):
	// Este método pone a 0 las ventas, comisiones y retenciones de todos los empleados activos:
	public void inicializar() {
		Empleado emp;
		for(int numEmpleado = 1; numEmpleado <= numEmpleados; numEmpleado++) {
			emp = getEmpleado(numEmpleado);
			if (emp.isActivo()) {
				// inicializar también es Override. Se ejecuta la versión del método correspondiente a la subclase.
				emp.inicializar();
			}
		}
	}
	
	
	
	// Métodos dirigidos a clases específicas de empleados ---------------------
	
	// Obtener porcentaje de comisión de un empleado a comisión activo (devuelve 0 si no lo es):
	public int getPorcentajeComision(Empleado emp) {
		if (emp instanceof EmpleadoAComision && emp.isActivo()) {
			/* Hay que usar un objeto de la clase EmpleadoAComision para acceder a un método exclusivo de ella.
			 * emp es Empleado, donde no existe el método getPorcentajeComision.
			 * Comprobamos que el objeto es un empleado a comisión y, una vez hecho, lo convertimos, mediante
			 * un cast a EmpleadoAComision y, entonces, ya podemos acceder al método getPorcentajeComision.
			 */
			return ((EmpleadoAComision)emp).getPorcentajeComision();		
		}
		else
			return 0;
	}
	
	// Poner nuevo porcentaje de comisión a un empleado (sólo lo hace para los empleados a comisión activos):
	public void setPorcentajeComision(Empleado emp, int porcentajeComision) {
		if (emp instanceof EmpleadoAComision && emp.isActivo()) {
			/* Necesitamos hacer un cast para convertir desde emp (Empleado) a un objeto empAC de
			 * la subclase EmpleadoAComision, para disponer del método que vamos a usar, exclusivo de
			 * esta última subclase.
			 */
			((EmpleadoAComision)emp).setPorcentajeComision(porcentajeComision);;  
		}
	}
	
	// Obtener la comisión obtenida por un empleado a comisión (si no lo es o no está activo, devuelve 0):
	public double getComisionObtenida(Empleado emp) {
		if (emp instanceof EmpleadoAComision && emp.isActivo()) {
			/* Necesitamos hacer un cast para convertir desde emp (Empleado) a un objeto empAC de
			 * la subclase EmpleadoAComision, para disponer del método que vamos a usar, exclusivo de
			 * esta última subclase.
			 */
			return ((EmpleadoAComision)emp).getComisionObtenida();	
		}
		return dCero;
	}
	
	// Obtener el porcentaje de retención de un empleado fijo (0, si no lo es o no está activo):
	public int getPorcentajeRetencion(Empleado emp) {
		// Necesitamos hacer cast para poder disponer de un método exclusivo de la clase EmpleadoFijo:
		if (emp instanceof EmpleadoFijo && emp.isActivo()) {
			return ((EmpleadoFijo)emp).getPorcentajeRetencion();
		}
		return iCero;
	}
	
	// Establecer el porcentaje de retención de un empleado, sólo si es fijo y activo:
	public void setPorcentajeRetencion(Empleado emp, int porcentajeRetencion) {
		// Necesitamos hacer cast para poder disponer de un método exclusivo de la clase EmpleadoFijo:
		if (emp instanceof EmpleadoFijo && emp.isActivo()) {
			((EmpleadoFijo)emp).setPorcentajeRetencion(porcentajeRetencion);
		}		
	}
	
	// Obtener la retención de un empleado fijo y activo (0 si no lo es):
	public double getRetencion(Empleado emp) {
		// Necesitamos hacer cast para poder disponer de un método exclusivo de la clase EmpleadoFijo:
		if (emp instanceof EmpleadoFijo && emp.isActivo()) {
			return ((EmpleadoFijo)emp).getRetencion();
		}
		return dCero;
	}
	
	// Actualizar las retenciones de un empleado fijo y activo:
	public void actualizarRetencion(Empleado emp) {
		// Necesitamos hacer cast para poder disponer de un método exclusivo de la clase EmpleadoFijo:
		if (emp instanceof EmpleadoFijo && emp.isActivo()) {
			((EmpleadoFijo)emp).actualizarRetencion();
		}	
	}
	
	
	
	// Otros métodos ----------------------------
	
	// Listar empleados:
	public void listarEmpleados() {
		// Usa toString, que es Override
		System.out.println("LISTADO GENERAL DE EMPLEADOS ====================================");
		for (int empl=0; empl<e.length; empl++) {
			System.out.println(e[empl]);
		}
		System.out.println("==================================================================");
	}
	
	// Gastos de la oficina en sueldos base (suma sólo los empleados activos):
	public double calcularTotalSueldosBases() {
		double totalSueldosBase = 0.0;
		for (int i=0; i<e.length; i++) {
			if (e[i].isActivo()) {
				totalSueldosBase += e[i].getSueldoBase();	
			}
		}
		return totalSueldosBase;
	}
	
	// Gastos de la oficina en comisiones (sólo de los empleados activos):
	public double calcularGastosComisiones() {
		double totalComisiones = 0.0;
		// Sólo tienen comisiones los EmpleadoAComision:
		for (int i=0; i<ec.length; i++) {
			if (ec[i].isActivo()) {
				totalComisiones += ec[i].getComisionObtenida();				
			}
		}
		return totalComisiones;
	}
	
	// Retenciones globales de los empleados (activos):
	public double calcularRetenciones() {
		double totalRetenciones = 0.0;
		// Sólo tienen retenciones los EmpleadoFijo:
		for (int i=0; i<ef.length; i++) {
			if (ef[i].isActivo()) {
				// En primer lugar, hay que actualizar las retenciones, 
				// que no se hace si no se ha accedido al sueldo final o a listar al empleado:
				ef[i].actualizarRetencion();
				totalRetenciones += ef[i].getRetencion();
			}
		}
		return totalRetenciones;
	}
	
	// Calcular suma de sueldos netos finales (empleados activos):
	public double calcularSueldosNetosFinales() {
		double totalSueldosNetosFinales = 0.0;
		for(int i=0; i<e.length; i++) {
			if (e[i].isActivo()) {
				totalSueldosNetosFinales += e[i].calcularSueldoNetoFinal();				
			}
		}
		return totalSueldosNetosFinales;
	}
}
