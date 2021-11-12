package ejemplo01;

public class Alumno {
	//las clases de los contructores no llevan el public static void main!!//
	//Atributos (se hacen siempre al principio del programa//
	//A partir de ahora no les damos valores al principio a las variables//
	
	private int edad;
	private String nombre;
	private String apellidos;
	private double notaMedia;
	//constructor con todos los parámetros//
	
	public Alumno (int edad, String nombre, String apellidos, double notaMedia) { //Así definimos el constructor de una clase//
		this.edad=edad; //this punto nombre del atributo y nombre de la variable, que en este caso se llaman igual//
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.notaMedia=notaMedia; //después de hacer el constructor, nos vamos al main a darle valores//
	}
	//getters and setters. Se establecen DEBAJO de los constructores. Un get y un set por cada atributo.//
	public int getEdad() {
		return edad;
	}
	public void setEdad (int edad) { //void: es para cuando no devuelve nada. Los SET son métodos que no devuelven nada(void).//
		this.edad=edad; 
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) { 
		this.nombre=nombre; 
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos (String apellidos) { 
		this.apellidos=apellidos; 
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia (double notaMedia) { 
		this.notaMedia=notaMedia; 
	}
	//hacemos un nuevo método. Vamos a sumarle los puntos que quiera el profe a la Nota media
	public double sumarPuntosExtra (double puntosExtra) { //DECLARAMOS en el método los puntosExtra que sólo sirve DENTRO del método (lo que esté entre llaves {})//
		notaMedia=notaMedia+puntosExtra; //la operación la hacemos también aquí!! De lo contrario no saldrá la modificación de los datos
		return notaMedia;
	}
	
	//---------------------------------------------------------------------------------------------------//
	//Podemos definir otro constructor con todos solo 3 parámetros//
	public Alumno  (String nombre, String apellidos, double notaMedia) { //Así definimos el constructor de una clase//
		//this punto nombre del atributo y nombre de la variable, que en este caso se llaman igual//
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.notaMedia=notaMedia; //después de hacer el constructor, nos vamos al main a darle valores//
			
	}
}
