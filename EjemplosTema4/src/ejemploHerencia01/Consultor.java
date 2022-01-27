package ejemploHerencia01;

public class Consultor extends Trabajador{
	
	private int horas;
	private double tarifa; //precioHora
	
	
	//Constructor
	public Consultor(String nombre, String puesto, int horas, double tarifa) {
		super(nombre, puesto);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	
	//ToStringSuper
	@Override
	public String toString() {
		return super.toString() + " Consultor [horas=" + horas + ", tarifa=" + tarifa + "]"; //está puesto manualmente. El automático pone el Super.toString detrás
	}

	
	
	//GettersSetters
	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	//Cálculos
	public double calcularPaga () { //REESCRIBIR UN METODO. NO SE LE PASA VARIABLES PUES ESO SERIA SOBRECARGAR
		return this.horas * this.tarifa;
	}
	
	public void avisarHorasExtra (int tope) {
		if (horas > tope) {
			System.out.println("No trabajes tanto.");
		}else {
			System.out.println("Sigue currando malandrín");
		}
	}
	
}
