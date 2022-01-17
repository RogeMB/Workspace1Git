package ejemploarraysobjetos;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nVs = 0, opcion = 0, tam = 0, cero = 0, seleccion = 0;
		String modelo;
		boolean cRuedas;
		String aux;
		double potencia;
		Vehiculo lista [];
		
		System.out.print("Bienvenido/a,\nDiga el número de vehículos que quiere guardar: ");
		tam=Leer.datoInt();
		
		lista = new Vehiculo [tam];
		
		do {
			System.out.print("\nDiga el nombre del modelo: ");
			modelo = Leer.dato();
			System.out.print("\nDiga la potencia: ");
			
			potencia = Leer.datoDouble();
			
			lista [nVs] = new Vehiculo (modelo, potencia);
			nVs++;
			System.out.print("\nSi desea terminar pulse 0. Si desea continuar pulse cualquier otro número.\nRespuesta: ");
			opcion = Leer.datoInt();
			
		} while (opcion != cero && nVs <lista.length);
		
		
		for (int i = 0; i<nVs; i++) {
			System.out.println(lista [i]);
		}
		
		System.out.print("\nDiga que modelo quiere seleccionar de entre los anteriores: ");
		seleccion=Leer.datoInt();
		System.out.println(lista[seleccion-1].getModelo());
		
		System.out.print("\nDiga que potencia quiere seleccionar de entre los anteriores: ");
		seleccion=Leer.datoInt();
		System.out.println(lista[seleccion-1].getPotencia());
		
	}

}
