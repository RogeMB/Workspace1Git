package ejemplodescubirperdidainformacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Descubrir qué problemas podemos encontrar al dividir dos números y guardarlos en distintas variables. ¿Perdemos información?//
		
				int numerador=1, denominador=3;
				int resultado=0;
				double resultadoDos=0.00;
				double resultadoTres=0.00;
				double num1=1.0, num2=3.0;
			
			resultado=numerador/denominador; //Guardamos en un int pero perdemos información al perder decimales//
			System.out.println(resultado);
			
			resultadoDos=numerador/denominador; //Aquí hace la división del int entre int, y quita los decimales (0.3333), y luego lo convierte en double y añade un decimal (0)//
			System.out.println(resultadoDos); //EVITAR DIVIDIR INT ENTRE INT SI SABEMOS QUE NOS DARÁ DECIMALES, AUNQUE LUEGO LO GUARDEMOS EN UN DOUBLE// 
			
			resultadoTres=num1/num2;
			System.out.println(resultadoTres);	//Aquí no perdemos información y si guardamos los decimales ya que dividimos dos double y lo guardamos en un double// 

	}

}
