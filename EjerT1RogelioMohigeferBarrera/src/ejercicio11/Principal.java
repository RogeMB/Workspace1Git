package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		/*¡Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la sequía. Han tenido que abrir pozos. La capacidad de sacar
		 *  agua de los pozos se cuenta por litros por segundo y la capacidad del depósito para guardar el agua en metros cúbicos. Serías 
		 *  capaz de crear un programa que calcule cuántos metros cúbicos se sacan de uno de los pozos que tiene un caudal de 8 litros por segundo
		 *  si está conectado 24 horas*/
		
		double mCubicDepo=0.0, ltExt=0.00, caudalLt=8.00, tiempHor=24.0, 
				factConverHorSeg=3600, factConverLMcub=1000;
		
	System.out.println("Bienvenido/a, \n\n\tEste programa le va a calcular los metros cúbicos de agua que se almacenarán en el depósito del pueblo.");
	
	ltExt=caudalLt*(factConverHorSeg*tiempHor);  
	System.out.printf("\n\tEn un tiempo de %.0f horas, y con un caudal de %.1f litros por segundo, podremos extraer un total de "
			+ "\n\t%.2f litros de agua.", tiempHor, caudalLt, ltExt);
	
	mCubicDepo=ltExt/factConverLMcub;
	System.out.printf("\n\n\tEl volumen total de agua almacenada en el depósito en ese tiempo será de %.1f metros cúbicos.", mCubicDepo);
	
	System.out.println("\n\nGracias por su confianza.");
	}

}
