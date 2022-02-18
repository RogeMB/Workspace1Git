package ejercicio02Examen;

public class EspadaLaser extends Producto {
	
	private String tipo;

	
	//Constructor
	public EspadaLaser(double precioBase, int cantidadStock, String nombre, boolean activo, String tipo) {
		super(precioBase, cantidadStock, nombre, activo);
		this.tipo = tipo;
	}

	
	//GandS
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// ToString
	@Override
	public String toString() {
		return super.toString() + "EspadaLaser [tipo=" + tipo + "]";
	}



	
	// Métodos
	
	public int verSiesDoble (int fijo) {
		if (this.tipo.equalsIgnoreCase("Doble")) {
			return fijo;
		}else {
			return 0;
		}
	}
	
	
	
	@Override
	public void avisarPeligro() {
		// TODO Auto-generated method stub
		super.avisarPeligro();
			System.out.println("¡Cuidado al sacarla de la bolsa que hace pupa!");
	}


	@Override
	public double calcularPVP(double porcentaje, int fijo) {
		// TODO Auto-generated method stub
		double divisor = 100.0;
		return super.calcularPVP(porcentaje, fijo) + (getPrecioBase () + verSiesDoble (fijo)) * (1+(porcentaje/divisor)); 		
	}

	
	
	
	
}
