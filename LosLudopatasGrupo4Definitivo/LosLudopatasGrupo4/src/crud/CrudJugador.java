package crud;

import java.util.List;

import model.Jugador;
import model.Partida;

public class CrudJugador {

	private static List<Jugador> listaJugadores = model.Partida.getListaJugadores();

	public static void annadir(Jugador jugador) {
		listaJugadores.add(jugador);
	}

	public static void borrar(int id, Partida p) {
		int indice = 0;
		listaJugadores.remove(id);
		// Reasignamos todas las iD para que no queden huecos:
		for (Jugador j : listaJugadores) {
			j.setID(indice);
			indice++;
		}
		p.setNumJugadores(p.getNumJugadores() - 1);
	}


	public static boolean buscar(int id) {
		for (Jugador jugador : listaJugadores) {
			if (jugador.getID() == id) {
				return true;
			}
		}
		return false;
	}

	public static void editar(int id, String nombre, int dinero) {
		for (Jugador jugador : listaJugadores) {
			if (jugador.getID() == id) {
				jugador.setNombre(nombre);
				jugador.setdinero(dinero);
			}
		}

	}
}
