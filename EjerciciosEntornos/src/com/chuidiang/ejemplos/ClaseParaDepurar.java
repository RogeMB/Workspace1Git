package com.chuidiang.ejemplos;
 
import java.util.LinkedList;
import java.util.List;
 
public class ClaseParaDepurar {
 
	private double suma;
	private List<Double> lista;
 
	public ClaseParaDepurar() {
    	System.out.println("construyendo clase");
	}
	public double echaCuentas() {
    	lista = new LinkedList<Double>();
    	for (int i = 0; i<100;i++){
        	lista.add((double)i);
    	}
    	suma = 0.0;
    	for (Double valor : lista){
        	suma +=valor;
    	}
    	return suma;
	}
 
}//i%20==0, para ponerlo como condición en puntos de ruptura para que se pare cada 20. Dentro del bucle echacuentas.
