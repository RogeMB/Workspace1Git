package main;

import java.util.ArrayList;
import java.util.List;

import crud.CrudJugador;
import model.Jugador;
import model.Partida;
import datos.Data;
import vista.ImprimirMenus;
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Partida p = new Partida();

		Controller c = new Controller ();
		
		
		ImprimirMenus i = new ImprimirMenus ();
		
		i.nombreJuego ();
		i.menuPrincipal (p);
	
	}

}
