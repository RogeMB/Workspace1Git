package ejercicio06;

import lectura.Leer;

public class Principal {
	// Clase de prueba
		public static void main (String[] args) {
			
			// Creamos la sucursal nº 1:
			Oficina o = new Oficina(1);
			
			System.out.println("\t*** Bienvenido al programa de prueba ***\n");
			System.out.println("Acabamos de crear la Oficina y no tiene cuentas. Listamos las cuentas:");
			o.listarCuentas();
			pausa();
	
			o.crearCuentaCorriente(100, 200, 10, 60);
		
			o.crearCuentaJoven(100, 0, 1);
		
			
			o.crearCuentaJoven(100, 0, 3);
			
			// Situación inicial:
			System.out.println("Acabamos de crear varias cuentas con 100€ "
					+ "(a la corriente se le han regalado 200 puntos iniciales), que quedan así:");
			o.listarCuentas();
			// Listar las condiciones de las cuentas:
			System.out.println("Condiciones de las cuentas:");
			for(int i=0; i<o.getNumeroCuentas();i++) {
				System.out.println(o.getCuenta(i).verCondicionesCuenta());
			}
			pausa();

			System.out.println("\nEfectuamos varias operaciones en las cuentas:\n");
			// Ingreso de 500€ por ventanilla en cada cuenta:
			System.out.println("Ingresamos 500€ por ventanilla en cada cuenta.");
			for(int i=0; i<o.getNumeroCuentas(); i++) {
				o.ingresar(o.getCuenta(i), 500);	
			}
									
			// Ingreso de 100€ en cajero en cada cuenta:
			System.out.println("Ingresamos 100€ por cajero en cada cuenta.");
			for(int i=0; i<o.getNumeroCuentas(); i++) {
				o.ingresarPorCajero(o.getCuenta(i), 100);	
			}
									
			// Reintegro de 1000€ por ventanilla de cada cuenta (no hay saldo):
			System.out.println("Intentamos reintegrar 1000€ de cada cuenta por ventanilla.");
			for(int i=0; i<o.getNumeroCuentas(); i++) {
				o.reintegrar(o.getCuenta(i),1000);	
			}
									
			// Reintegro de 50€ por ventanilla de cada cuenta:
			System.out.println("Reintegramos 50€ por ventanilla de cada cuenta.");
			for(int i=0; i<o.getNumeroCuentas(); i++) {
				o.reintegrar(o.getCuenta(i),50);	
			}
				
			// Reintegro de 1000€ por cajero de cada cuenta (no hay saldo):
			System.out.println("Intentamos reintegrar 1000€ de cada cuenta por cajero.");
			for(int i=0; i<o.getNumeroCuentas(); i++) {
				o.reintegrarPorCajero(o.getCuenta(i),1000);	
			}
								
			// Reintegro de 50€ por cajero de cada cuentao:
			System.out.println("Reintegramos 50€ de cada cuenta por cajero.");
			for(int i=0; i<o.getNumeroCuentas(); i++) {
				o.reintegrarPorCajero(o.getCuenta(i),50);	
			}
					
			// Aplicamos la comisión de mantenimiento a las cuentas (tendrá efecto sólo en las corrientes):
			System.out.println("Aplicamos la comisión de mantenimiento (sólo afectará a las corrientes).");
			for(int i=0; i<o.getNumeroCuentas(); i++) {
				o.aplicarMantenimiento(o.getCuenta(i));	
			}
				
			
			pausa();
			
			// Resultado final:
			System.out.println("\nSituación actual de las cuentas:");
			o.listarCuentas();
			System.out.println();
			
			// Listar las condiciones de las cuentas:
			System.out.println("Condiciones de las cuentas:");
			for(int i=0; i<o.getNumeroCuentas();i++) {
				System.out.println(o.getCuenta(i).verCondicionesCuenta());
			}
			
			// Listar situación de la oficina:
			System.out.println("\nSituación de la Oficina =====================================");
			System.out.println("\tSucursal: " +o.getNumSucursal());
			System.out.println("\tSaldo de todas las cuentas: " + o.sumarSaldos());
			System.out.println("\tSuma de ingresos en las cuentas: " + o.sumarIngresos());
			System.out.println("\tSuma de reintegros en las cuentas: " + o.sumarReintegros());
			System.out.println("\tSuma de mantenimientos cargados a las cuentas: " + o.sumarMantenimientos());
			System.out.println("\tSuma de cargos por reintegros: " + o.sumarCargosReintegros());
			System.out.println("\tSuma de cantidades promocionales abonadas en las cuentas: " + o.sumarDineroPromocional());
			System.out.println("\tSuma de puntos obtenidos por las cuentas: " + o.sumarPuntos());
			System.out.println("=============================================================");
			
			System.out.println("\n\t*** FIN DEL PROGRAMA DE PRUEBA. Gracias. ***");
		}
		
		public static void pausa() {
			System.out.println("Pulse INTRO para continuar...");
			Leer.dato();
		}

}

