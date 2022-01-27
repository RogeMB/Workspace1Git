package aleatorios;



import java.time.LocalDate;
import java.util.Random;

public class Pipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam=2000, segundos, minuto, hora, dia, dia2, mes, anio;
		String estado;
		
	
		
		for(int i=0;i<tam;i++) {
			
			Random aleatorio = new Random ();
			
			
			anio= aleatorio.nextInt(2022-2019 +1) +2019;
			
			mes = (aleatorio.nextInt(12) +1);
			
			dia = aleatorio.nextInt(28) +1;
			
			hora = aleatorio.nextInt(90)+1;
			
			minuto = aleatorio.nextInt(14)+1;
			
			
			
			int max=99999999, min=10000000, ale, maxL=90, minL=65, aleL;

		
	    		Random r=new Random(System.nanoTime());
	    		ale=r.nextInt(max-min+1)+min;
	        	
	    		aleL=r.nextInt(maxL-minL+1)+minL;
	    		
	            int asciiValue = aleL;
			
	            String convertedChar = Character.toString(aleL);
	            /*System.out.println("'"+ale+convertedChar+"'");*/
	        	
		
			LocalDate fecha = LocalDate.of(anio, mes, dia); 
			LocalDate fecha2 = fecha.plusDays(hora);
			LocalDate fecha3 = fecha2.plusDays(minuto); 
			
			if(aleatorio.nextInt(2)+1 ==1) {
				estado = "En vigor";
			}
			else {
				estado = "cancelada";
			}
			
			
			segundos = aleatorio.nextInt(100); //porcentaje
			
			dia2 = aleatorio.nextInt(5)+1; //numPersonas
			
			
			int tipopago = 0;
			tipopago= aleatorio.nextInt(4)+1;
			
			String consulta = "(SELECT dni_cliente "
					+ "FROM cliente "
					+ "ORDER BY RANDOM "
					+ "LIMIT 1)";
			
			String habitacion = "(SELECT num_habitacion "
					+ "FROM habitacion "
					+ "ORDER BY RANDOM "
					+ "LIMIT 1)";
			
			if (segundos>50 || segundos == 0) {
				System.out.println("(DEFAULT, '" +consulta+"', '"+fecha+"', '"+fecha2+"', '"+fecha3+"', '"+estado+"', "+tipopago+", "+habitacion+", null, "+dia2+"),");
			}
			else {
				System.out.println("(DEFAULT, '" +consulta+"', '"+fecha+"', '"+fecha2+"', '"+fecha3+"', '"+estado+"', "+tipopago+", "+habitacion+", "+segundos+", "+dia2+"),");
			
			}
			
		}
	}
}