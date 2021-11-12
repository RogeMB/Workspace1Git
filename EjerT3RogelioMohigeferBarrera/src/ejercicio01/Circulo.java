package ejercicio01;

public class Circulo {
	
	private double radio;
	 
	//Constructor
	public Circulo (double radio) {
		this.radio=radio;
	}
	//Constructor vacío para objetos vacíos//
	public Circulo () {  //no lo pide el ejercicio// 	
	}
	//Getters and setters
	public double getRadio () {
		return radio;
	}
	public void setRadio (double radio) {
		this.radio=radio;
	}
	//Nuestros métodos:
	public double calcularArea () {
		double dos = 2.0;
		return Math.PI*Math.pow(radio, dos);  //NO PUEDO PONER MAS DE UN RETURN EN UN METODO. LOS METODOS SOLO DEVUELVEN UNA COSA, GRANDE O PEQUEÑA//
									//NO METER SYSOS EN METODOS PARA CALCULAR. EN METODOS DE IMPRIMIR TICKETS, OK//
	
	}

}
