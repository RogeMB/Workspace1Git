package ejercicio05;

public class Electrodomestico {
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	
	//Constructores
	
	//Constructor con valores por defecto (sin argumentos)
	public Electrodomestico() {
		this.precioBase = 100.0;
		this.color = "blanco";
		this.consumoEnergetico = 'F'; 
		this.peso = 5.0;	
	}
	
	//Constructor con precio y peso
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0)
			this.precioBase = precioBase;
		else
			this.precioBase = 100.0;
		if (peso > 0)
			this.peso = peso;
		else
			this.peso = 5.0;
		this.color = "blanco";  		//Valor por defecto: blanco
		this.consumoEnergetico = 'F';  	//valor por defecto : F
	}

	//Constructor completo
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		if (precioBase > 0)
			this.precioBase = precioBase;
		else
			this.precioBase = 100.0;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		if (peso > 0)
			this.peso = peso;
		else
			this.peso = 5.0;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	

	//GettersSetters, pero compruebo directamente válidez de consumoEnergetico y de color
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = comprobarColor(color);	//Compruebo validez aquí
	}
	
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);	//Compruebo validez aquí
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Cálculos
	public char comprobarConsumoEnergetico (char cE) {
		
		cE = Character.toUpperCase(cE); //Convierto la entrada (char) en mayúsculas
		if (cE >= 'A' && cE <= 'F') {	//Compruebo que es una de las permitidas
			return cE;		//
		} else
			return 'F';		//devuelvo el valor por defecto
	}
	
	public String comprobarColor(String color) {
		
		color = color.toLowerCase();		//Convierto la entrada en minúsculas
		if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris"))
			return color;  
		else
			return "blanco";	//color no permitido: devuelvo el valor por defecto
	}
	
	public double precioFinal() {
		 
		double suplemento;
		switch (this.consumoEnergetico) {
			case 'A': {
				suplemento = 100.0;
				break;
			}
			case 'B': {
				suplemento = 80.0;
				break;
			}	
			case 'C': {
				suplemento = 60.0;
				break;
			}
			case 'D': {
				suplemento = 50.0;
				break;
			}
			case 'E': {
				suplemento = 30.0;
				break;
			}
			default:  //sólo puede ser ya 'F' por descarte, no hace falta ponerla
				suplemento = 10.0;
		}
		return this.precioBase + suplemento;
	}
}

