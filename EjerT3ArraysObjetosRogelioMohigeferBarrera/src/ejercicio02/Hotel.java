package ejercicio02;

import java.util.Arrays;

public class Hotel {
	
	Habitacion habitaciones [];
	private double precioLavanderia;
	private double precioParking;
	private double precioDesayuno;
	
	//Constructores
	public Hotel(Habitacion[] habitaciones, double precioLavanderia, double precioParking, double precioDesayuno) {
		this.habitaciones = habitaciones;
		this.precioLavanderia = precioLavanderia;
		this.precioParking = precioParking;
		this.precioDesayuno = precioDesayuno;
	}
	
	public Hotel() {

	}

	//ToString
	@Override
	public String toString() {
		return "Hotel [habitaciones=" + Arrays.toString(habitaciones) + ", precioLavanderia=" + precioLavanderia
				+ ", precioParking=" + precioParking + ", precioDesayuno=" + precioDesayuno + "]";
	}
	
	//GettersSetters
	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	public double getPrecioLavanderia() {
		return precioLavanderia;
	}

	public void setPrecioLavanderia(double precioLavanderia) {
		this.precioLavanderia = precioLavanderia;
	}

	public double getPrecioParking() {
		return precioParking;
	}

	public void setPrecioParking(double precioParking) {
		this.precioParking = precioParking;
	}

	public double getPrecioDesayuno() {
		return precioDesayuno;
	}

	public void setPrecioDesayuno(double precioDesayuno) {
		this.precioDesayuno = precioDesayuno;
	}
	
}
