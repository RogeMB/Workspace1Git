package ejercicio01;

/*Hacer un programa que calcule el área de un círculo en cm2. En el main, debemos 
 * crear un objeto tipo Círculo y llamar a dicho método. Mejorar el programa añadiendo
 *  a la clase Círculo otro método que calcule el área del círculo en m2.*/

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
	
	public double calcularAreaMcuad () {
		int diezMil = 10000;
		return calcularArea () /diezMil; 	
	}

}
