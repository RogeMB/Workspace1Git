package ejercicio05;

public class CalculoSuma {
	
	private int a;
	private int b;
	
	// Constructor
	
	public CalculoSuma(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	
	// ToString
	
	@Override
	public String toString() {
		return "CalculoSuma [a=" + a + ", b=" + b + "]";
	}


	// GandS
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	// Métodos
	
	public int calculoSuma (int a, int b) throws MayorQueDiezExc {
		int limite = 10;
		if (a + b > limite) {
			throw new MayorQueDiezExc("***ERROR***. El resultado de A + B no puede ser nunca mayor de 10");
		}else {
			return a + b;
		}
		
	}
	
	
}
