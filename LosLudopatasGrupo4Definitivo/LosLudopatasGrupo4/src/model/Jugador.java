package model;

public class Jugador {
	
	private String nombre;
	private int ID;
	private int dinero;
	private int ganancias;
	private int cantidadApuesta;
	private int tipoApuesta;
	private int dineroFinal;
	
	//Constructor Jugador
	
	public Jugador(String nombre, int iD, int dinero) {
		this.nombre = nombre;
		this.ID = iD;
		this.dinero = dinero;
		this.ganancias = 0;
		this.cantidadApuesta = 0;
		this.tipoApuesta = 0;
		this.dineroFinal = dinero+ganancias;
	}
	
	public Jugador () {
		//constructor vacío
	}
	
	//Métodos set y get
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getdinero() {
		return dinero;
	}
	public void setdinero(int dinero) {
		this.dinero = dinero;
	}
	
	public int getGanancias() {
		return ganancias;
	}
	
	public void setGanancias(int ganancias) {
		this.ganancias = ganancias;
	}
	
	public int getCantidadApuesta() {
		return cantidadApuesta;
	}
	public void setCantidadApuesta(int cantidadApuesta) {
		this.cantidadApuesta = cantidadApuesta;
	}
	
	public int getTipoApuesta() {
		return tipoApuesta;
	}
	public void setTipoApuesta(int tipoApuesta) {
		this.tipoApuesta = tipoApuesta;
	}
	
	public int getDineroFinal() {
		return dineroFinal;
	}
	public void setDineroFinal(int dineroFinal) {
		this.dineroFinal = dineroFinal;
	}

	
	

}
