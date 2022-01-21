package ejercicio04;

public class Cliente {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private boolean estado;
	private double peso; //kilos
	private double altura;  //metros
	private int edad;

	
	
	//Constructor
	public Cliente(String dni, String nombre, String apellidos, boolean estado, double peso, double altura, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estado = estado;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}


	//toString

	@Override
	public String toString() {
		return "Cliente [dni=" +dni+ ", nombre=" +nombre+ ", apellidos=" +apellidos+ ", estado=" +estado
				+ ", peso=" +peso+ ", altura=" +altura+ ", edad=" +edad+ "]";
	}

	
	//GettersSetters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//Cálculos
	
	public double calcularIMC () {
		int dos = 2;
		return peso/(Math.pow(altura, dos));
	}
	
}

