package model;

import java.util.ArrayList;
import java.util.List;

public class Partida {
	
	private int numJugadores=0;
	private static List<Jugador> listaJugadores = new ArrayList<Jugador>();  
	private int dineroApostadoTotal;
	private int dineroJugador [];
	private int apuestaJugador []; 
	

	public int getNumJugadores() {
		return numJugadores;
	}
	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}
	
	public int getDineroApostadoTotal() {
		return dineroApostadoTotal;
	}
	public void setDineroApostadoTotal(int dineroApostadoTotal) {
		this.dineroApostadoTotal = dineroApostadoTotal;
	}
	public int[] getDineroJugador() {
		return dineroJugador;
	}
	public void setDineroJugador(int[] dineroJugador) {
		this.dineroJugador = dineroJugador;
	}
	public int[] getApuestaJugador() {
		return apuestaJugador;
	}
	public void setApuestaJugador(int apuestaJugador, int iDjugador) {
		this.apuestaJugador[iDjugador] = apuestaJugador;
	}
	public static List<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	public static void setListaJugadores(List<Jugador> listaJugadores) {
		Partida.listaJugadores = listaJugadores;
	}

	
	
	
}
