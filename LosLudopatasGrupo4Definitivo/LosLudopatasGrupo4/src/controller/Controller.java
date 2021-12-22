package controller;

import java.util.Random;

import crud.CrudJugador;
import lectura.Leer;
import model.Partida;
import model.Ruleta;
import model.Jugador;
import vista.ImprimirMenus;

public class Controller {

	private static Ruleta ruleta = new Ruleta();

	public Ruleta getRuleta() {
		return ruleta;
	}

	public void setRuleta(Ruleta ruleta) {
		this.ruleta = ruleta;
	}
	
	// ACCIONES JUEGO - APUESTAS

	public int giroRuleta() {

		Random ra = new Random(System.nanoTime());

		int min = 0, max = 36, numeroG;

		numeroG = ra.nextInt(max - min + 1) + min;

		ruleta.setResultado(numeroG);
		ruleta.setHistoricoLista(numeroG);

		return numeroG;
	}

	public int girarRuleta() {

		Random r = new Random(System.nanoTime());

		int min = 0, max = 36, numeroG;

		numeroG = r.nextInt(max - min + 1) + min;
		
		return numeroG;
	}
	
	public boolean esAlto(int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (!(numeroG > 0 && numeroG <= 18)) {
			return true;
		}
		return false;
	}	
	
	public boolean esBajo(int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (numeroG > 0 && numeroG <= 18) {
			return true;
		}
		return false;
	}
	
	public boolean esRojo (int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (numeroG == 1 || numeroG == 3 || numeroG == 5 || numeroG == 7 || numeroG == 9 || numeroG == 12
				|| numeroG == 14 || numeroG == 16 || numeroG == 18 || numeroG == 19 || numeroG == 21 
				|| numeroG == 23 || numeroG == 25 || numeroG == 27 || numeroG == 30
						|| numeroG == 32 || numeroG == 34 || numeroG == 36) {
			return true;
		}
		return false;
	}
	
	public boolean esNegro (int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (!(numeroG == 1 || numeroG == 3 || numeroG == 5 || numeroG == 7 || numeroG == 9 || numeroG == 12
				|| numeroG == 14 || numeroG == 16 || numeroG == 18 || numeroG == 19 || numeroG == 21 
				|| numeroG == 23 || numeroG == 25 || numeroG == 27 || numeroG == 30
						|| numeroG == 32 || numeroG == 34 || numeroG == 36)) {
			return true;
		}
		return false;
	}
	
	public boolean esPar(int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (numeroG % 2 == 0) {
			return true;
		}
		return false;
	}	
	
	public boolean esImpar(int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (!(numeroG % 2 == 0)) {
			return true;
		}
		return false;
	}	
	
	public boolean esPrimeraColumna (int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (numeroG > 0 && numeroG <= 12) {
			return true;
		} 
		return false;
	}
	
	public boolean esSegundaColumna (int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (numeroG >= 13 && numeroG <= 24) {
			return true;
		} 
		return false;
	}
	
	public boolean esTerceraColumna (int numeroG) {
		if (numeroG == 0) {
			return false;
		}
		if (numeroG >= 25 && numeroG <= 36) {
			return true;
		} 
		return false;
	}
	
	// ACCIONES JUGADORES

	private int preguntarNumJugadores(int numJugadoresActuales) {
		// método auxiliar de preguntar jugadores
		int nuevosJugadores = 0, uno = 1, cuatro = 4;

		if (numJugadoresActuales == cuatro) {
			System.out.println("Se ha alcanzado el máximo de jugadores.");
		} else {
			do {
				System.out.println(
						"\n¿Cuántos jugadores quieres añadir (Entre 1 y " + (cuatro - numJugadoresActuales) + ")?");
				nuevosJugadores = Leer.datoInt();
			} while (nuevosJugadores < uno || nuevosJugadores > cuatro - numJugadoresActuales);
		}
		return nuevosJugadores;
	}

	public void preguntarJugadores(Partida p) {
		// método principal de añadir jugadores
		int nuevosJugadores = 0, numJugadores = p.getNumJugadores(); // número actual de jugadores
		nuevosJugadores = preguntarNumJugadores(numJugadores);

		for (int i = 0; i < nuevosJugadores; i++) {
			String nombre;
			int dinero, cero = 0, uno = 1;
			Jugador j = new Jugador();

			System.out.print("Nombre jugador " + (numJugadores + i + uno) + ": ");
			nombre = Leer.dato();
			do {
				System.out.print("Dinero para el jugador " + (numJugadores + i + uno) + ": ");
				dinero = Leer.datoInt();

				if (dinero <= cero) {
					System.out.println("\n\t***Introduzca un importe v�lido (mayor que cero)***\n.");
				}
			} while (dinero <= cero);

			j.setNombre(nombre);
			j.setID(numJugadores + i);
			j.setdinero(dinero);
			j.setDineroFinal(dinero);

			CrudJugador.annadir(j);
		}
		numJugadores = numJugadores + nuevosJugadores;
		p.setNumJugadores(numJugadores);
	}

	public void borrarJugador(Partida p) {
		int opcionBorrar;

		ImprimirMenus.mostrarSimple(p);
		System.out.print("\nIntroduzca la ID del jugador que desea borrar. Respuesta: ");
		opcionBorrar = Leer.datoInt();

		CrudJugador.borrar(opcionBorrar, p);

	}

	public void editarJugador(Partida p) {
		int IDEditar, dineroEditar, cero = 0;
		String nombreEditar;

		ImprimirMenus.mostrarSimple(p);
		System.out.print("\nIntroduzca la ID del jugador que quiere editar: ");
		IDEditar = Leer.datoInt();
		if (CrudJugador.buscar(IDEditar)) {
			System.out.print("\nBien. Ahora introduzca el nombre correcto del jugador " + "que quiere editar: ");
			nombreEditar = Leer.dato();

			do {
				System.out.print("\nIntroduzca el dinero del jugador que quiere editar: ");
				dineroEditar = Leer.datoInt();

				if (dineroEditar <= cero) {
					System.out.println("\n\t***Introduzca un importe válido (mayor que cero)***.");
				}
			} while (dineroEditar <= cero);

			CrudJugador.editar(IDEditar, nombreEditar, dineroEditar);
		} else {
			System.out.println("\n\t ***¡Jugador no existente!***");
		}
	}

	public int saberQuienJuega(Partida p) {
		int iDjugador;

		ImprimirMenus.mostrarSimple(p);
		System.out.print("\nIntroduzca la ID del jugador que esté jugando: ");
		iDjugador = Leer.datoInt();
		if (CrudJugador.buscar(iDjugador)) {

		} else {
			System.out.println("\n\t ***¡Jugador no existente!***");
			return -1;
		}
		return iDjugador;
	}

	public void saberApuesta(Partida p, int iDjugador) {
		int respuestaApuesta;

		System.out.print("\nIntroduce la opción a la que quieres apostar.");
		ImprimirMenus.imprimirMenuApostar();
		respuestaApuesta = Leer.datoInt();
		p.setApuestaJugador(respuestaApuesta, iDjugador);
	}

}
