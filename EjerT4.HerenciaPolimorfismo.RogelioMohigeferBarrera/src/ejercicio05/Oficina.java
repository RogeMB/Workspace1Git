package ejercicio05;

import java.util.Arrays;

public class Oficina {

	int numEmpleados;
	int iCero = 0;
	double dCero = 0.0;
	
	Empleado[] e;
	EmpleadoAComision[] ec;
	EmpleadoFijo[] ef;
	
	// Constructor 
	public Oficina() {
		/* Instanciamos los arrays que hemos declarado en la cabecera
		 * con longitud 0 (no tenemos empleados al inicio):
		 */
		numEmpleados = iCero;
		e = new Empleado[numEmpleados];
		ec = new EmpleadoAComision[numEmpleados];
		ef = new EmpleadoFijo[numEmpleados];
	}
	
	
	// Métodos
	
	// Crear Empleado genérico:
	public void CrearEmpleadoGenerico(String nombre, double sueldoBase) {
		// Aumentamos en 1 el número de empleados de la oficina:
		numEmpleados++;
		e = Arrays.copyOf(e, numEmpleados);
		e[numEmpleados-1] = new Empleado(numEmpleados,nombre,sueldoBase);
	}
	
	// Crear Empleado a comisión:
	public void CrearEmpleadoAComision(String nombre, double sueldoBase, int porcentajeComision) {
		numEmpleados++;
		e = Arrays.copyOf(e, numEmpleados);
		ec = Arrays.copyOf(ec, ec.length + 1);
		ec[ec.length-1] = new EmpleadoAComision(numEmpleados, nombre, sueldoBase, porcentajeComision);
		e[numEmpleados-1] = ec[ec.length-1];
	}
	
	// Crear Empleado a Fijo:
	public void CrearEmpleadoFijo(String nombre, double sueldoBase, int porcentajeRetencion) {
		
		numEmpleados++;	
		e = Arrays.copyOf(e, numEmpleados);
		ef = Arrays.copyOf(ef, ef.length + 1);
		ef[ef.length-1] = new EmpleadoFijo(numEmpleados, nombre, sueldoBase, porcentajeRetencion);
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
		empleado.setVentas(nuevasVentas);
	}
	
	// Aumentar las ventas de un empleado en una cantidad:
	public void setNuevasVentas(Empleado empleado, double importe) {
		empleado.setNuevasVentas(importe);
	}
	
	// Calcular el sueldo neto final de un empleado:
	public double calcularSueldoNetoFinal(Empleado empleado) {
		return empleado.calcularSueldoNetoFinal();
	}
	
	// Inicializar (nuevo mes):
	public void inicializar() {
		Empleado emp;
		for(int numEmpleado = 1; numEmpleado <= numEmpleados; numEmpleado++) {
			emp = getEmpleado(numEmpleado);
			if (emp.isActivo()) {
	
				emp.inicializar();
			}
		}
	}
	
	
	
	// Métodos dirigidos a clases específicas de empleados
	
	// Obtener porcentaje de comisión de un empleado a comisión activo (devuelve 0 si no lo es):
	public int getPorcentajeComision(Empleado emp) {
		if (emp instanceof EmpleadoAComision && emp.isActivo()) {
			return ((EmpleadoAComision)emp).getPorcentajeComision();		
		}
		else
			return 0;
	}
	
	// Poner nuevo porcentaje de comisión a un empleado (sólo lo hace para los empleados a comisión activos):
	public void setPorcentajeComision(Empleado emp, int porcentajeComision) {
		if (emp instanceof EmpleadoAComision && emp.isActivo()) {
			((EmpleadoAComision)emp).setPorcentajeComision(porcentajeComision);;  
		}
	}
	
	// Obtener la comisión obtenida por un empleado a comisión (si no lo es o no está activo, devuelve 0):
	public double getComisionObtenida(Empleado emp) {
		if (emp instanceof EmpleadoAComision && emp.isActivo()) {
			return ((EmpleadoAComision)emp).getComisionObtenida();	
		}
		return dCero;
	}
	
	// Obtener el porcentaje de retención de un empleado fijo (0, si no lo es o no está activo):
	public int getPorcentajeRetencion(Empleado emp) {
		
		if (emp instanceof EmpleadoFijo && emp.isActivo()) {
			return ((EmpleadoFijo)emp).getPorcentajeRetencion();
		}
		return iCero;
	}
	
	// Establecer el porcentaje de retención de un empleado, sólo si es fijo y activo:
	public void setPorcentajeRetencion(Empleado emp, int porcentajeRetencion) {
		
		if (emp instanceof EmpleadoFijo && emp.isActivo()) {
			((EmpleadoFijo)emp).setPorcentajeRetencion(porcentajeRetencion);
		}		
	}
	
	// Obtener la retención de un empleado fijo y activo (0 si no lo es):
	public double getRetencion(Empleado emp) {
		
		if (emp instanceof EmpleadoFijo && emp.isActivo()) {
			return ((EmpleadoFijo)emp).getRetencion();
		}
		return dCero;
	}
	
	// Actualizar las retenciones de un empleado fijo y activo:
	public void actualizarRetencion(Empleado emp) {
		
		if (emp instanceof EmpleadoFijo && emp.isActivo()) {
			((EmpleadoFijo)emp).actualizarRetencion();
		}	
	}
	
	
	
	// Otros métodos
	
	// Listar empleados:
	public void listarEmpleados() {
		
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
		
		for (int i=0; i<ef.length; i++) {
			if (ef[i].isActivo()) {
			
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
