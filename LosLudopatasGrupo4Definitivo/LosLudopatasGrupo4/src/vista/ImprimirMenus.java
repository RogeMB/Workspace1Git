package vista;

import lectura.Leer;

import java.util.List;

import controller.Controller;
import model.Jugador;
import model.Partida;
import model.Ruleta;
import crud.CrudJugador;

public class ImprimirMenus {

	//Controller c = new Controller();

	// Nombre del juego
	public void nombreJuego() {
		String intro;
		System.out.println("\r\n"
				+ " ________      _______       ___           ___  ___      _________    ________          ________       ___  ___      ________    _______       ________     \r\n"
				+ "|\\   __  \\    |\\  ___ \\     |\\  \\         |\\  \\|\\  \\    |\\___   ___\\ |\\   __  \\        |\\   ____\\     |\\  \\|\\  \\    |\\   __  \\  |\\  ___ \\     |\\   __  \\    \r\n"
				+ "\\ \\  \\|\\  \\   \\ \\   __/|    \\ \\  \\        \\ \\  \\\\\\  \\   \\|___ \\  \\_| \\ \\  \\|\\  \\       \\ \\  \\___|_    \\ \\  \\\\\\  \\   \\ \\  \\|\\  \\ \\ \\   __/|    \\ \\  \\|\\  \\   \r\n"
				+ " \\ \\   _  _\\   \\ \\  \\_|/__   \\ \\  \\        \\ \\  \\\\\\  \\       \\ \\  \\   \\ \\   __  \\       \\ \\_____  \\    \\ \\  \\\\\\  \\   \\ \\   ____\\ \\ \\  \\_|/__   \\ \\   _  _\\  \r\n"
				+ "  \\ \\  \\\\  \\|   \\ \\  \\_|\\ \\   \\ \\  \\____    \\ \\  \\\\\\  \\       \\ \\  \\   \\ \\  \\ \\  \\       \\|____|\\  \\    \\ \\  \\\\\\  \\   \\ \\  \\___|  \\ \\  \\_|\\ \\   \\ \\  \\\\  \\| \r\n"
				+ "   \\ \\__\\\\ _\\    \\ \\_______\\   \\ \\_______\\   \\ \\_______\\       \\ \\__\\   \\ \\__\\ \\__\\        ____\\_\\  \\    \\ \\_______\\   \\ \\__\\      \\ \\_______\\   \\ \\__\\\\ _\\ \r\n"
				+ "    \\|__|\\|__|    \\|_______|    \\|_______|    \\|_______|        \\|__|    \\|__|\\|__|       |\\_________\\    \\|_______|    \\|__|       \\|_______|    \\|__|\\|__|\r\n"
				+ "                                                                                          \\|_________|                                                      \r\n"
				+ "                                                                                                                                                            \r\n"
				+ "                                                                                                                                                            \r\n"
				+ "         ________       ________       ___    ___  ________       ___    ___  ___      ________            _____           ________                         \r\n"
				+ "        |\\   ____\\     |\\   __  \\     |\\  \\  /  /||\\   __  \\     |\\  \\  /  /||\\  \\    |\\   ___  \\         / __  \\         |\\   __  \\                        \r\n"
				+ "        \\ \\  \\___|_    \\ \\  \\|\\  \\    \\ \\  \\/  / /\\ \\  \\|\\  \\    \\ \\  \\/  / /\\ \\  \\   \\ \\  \\\\ \\  \\       |\\/_|\\  \\        \\ \\  \\|\\  \\                       \r\n"
				+ "         \\ \\_____  \\    \\ \\   __  \\    \\ \\    / /  \\ \\   __  \\    \\ \\    / /  \\ \\  \\   \\ \\  \\\\ \\  \\      \\|/ \\ \\  \\        \\ \\  \\\\\\  \\                      \r\n"
				+ "          \\|____|\\  \\    \\ \\  \\ \\  \\    \\/  /  /    \\ \\  \\ \\  \\    \\/  /  /    \\ \\  \\   \\ \\  \\\\ \\  \\          \\ \\  \\  ___   \\ \\  \\\\\\  \\                     \r\n"
				+ "            ____\\_\\  \\    \\ \\__\\ \\__\\ __/  / /       \\ \\__\\ \\__\\ __/  / /       \\ \\__\\   \\ \\__\\\\ \\__\\          \\ \\__\\|\\__\\   \\ \\_______\\                    \r\n"
				+ "           |\\_________\\    \\|__|\\|__||\\___/ /         \\|__|\\|__||\\___/ /         \\|__|    \\|__| \\|__|           \\|__|\\|__|    \\|_______|                    \r\n"
				+ "           \\|_________|              \\|___|/                    \\|___|/                                                                                     \r\n"
				+ "                                                                                                                                                            \r\n"
				+ "                                                                                                                                                            \r\n"
				+ "\n\n\n");
		System.out.println("\t\t\t      										 __________ \r\n"
				+ "\t\t\t     										|\\_______ /|\r\n"
				+ "\t\t\t     										||       | |\r\n"
				+ "\t\t\t										||     E | |\r\n"
				+ "\t\t\t╔═╗╦ ╦╦  ╔═╗╔═╗  ╔═╗╔╗╔╔╦╗╔═╗╦═╗  ╔═╗╔═╗╦═╗╔═╗  ╔═╗╔╦╗╔═╗╔═╗╔═╗╔═╗╦═╗		||___  N | |\r\n"
				+ "\t\t\t╠═╝║ ║║  ╚═╗║╣   ║╣ ║║║ ║ ║╣ ╠╦╝  ╠═╝╠═╣╠╦╝╠═╣  ║╣ ║║║╠═╝║╣ ╔═╝╠═╣╠╦╝		|/_/ | T | |\r\n"
				+ "\t\t\t╩  ╚═╝╩═╝╚═╝╚═╝  ╚═╝╝╚╝ ╩ ╚═╝╩╚═  ╩  ╩ ╩╩╚═╩ ╩  ╚═╝╩ ╩╩  ╚═╝╚═╝╩ ╩╩╚═		   | | E | |\r\n"
				+ "\t\t\t										   | | R | |\r\n"
				+ "\t\t\t     										   | |___| |\r\n"
				+ "\t\t\t     										   |/_____\\|");
		intro = Leer.dato();
	}

	public static void mostrarSimple(Partida p) {
		List<Jugador> listaJugadores = model.Partida.getListaJugadores();
		System.out.print("\nNOMBRE\t\t ID\t\tDINERO\n________________________________________________\n");
		for (Jugador j : listaJugadores) {
			System.out.printf("%s \t\t %d \t\t %d\n", j.getNombre(), j.getID(), j.getdinero());
		}
		System.out.println("\n________________________________________________\n");
	}

	public void mostrarCompleto(Partida p) {
		List<Jugador> listaJugadores = model.Partida.getListaJugadores();
		System.out.print("\nNOMBRE\t\t ID\t\tDINERO\n___________________________________________\n");
		for (Jugador j : listaJugadores) {
			System.out.printf("%s \t\t %d \t\t %d\n", j.getNombre(), j.getID(), j.getdinero());
		}
		System.out.println("\n________________________________________________\n");
	}

	private void imprimirInstrucciones() {
		System.out
				.println("============================================================================================="
						+ "\nBienvenidos, el juego es de 1 a 4 jugadores. Cada jugador tendra su ID y su dinero inicial.\n"
						+ "Lo primero es añadir al menos un jugador, con su respectivo nombre y dinero. Después se\n"
						+ "le dará la opción de 'Empezar la partida'. Una vez introducido la ID para distinguir a un\n"
						+ "jugador de otro, tendr�s la opción de girar la ruleta para 'calentarla' (girar sin apostar)\n"
						+ "para ir sacando números. O, puedes apostar directamente siguiendo esta ayuda:\n\n"
						+ "\t1. Pleno: Apuesta a un número a tu elección."
						+ "\tPor número acertado se multiplica el dinero apostado a ese número x36.\n\n"
						+ "\t2. Rojo/Negro: Se apuesta a los número que tienen una R o N a la derecha para Rojo o \n"
						+ "\tnegro respectivamente. El dinero apostado en esta apuesta sera x2 en caso de acierto.\n\n"
						+ "\t3. Alto/Bajo: Las ganancias serán x2, apostar a bajo supone apostar a los números del 1 al 18\n"
						+ "\tmientras que apostar a alto serán los números del 19 al 36\n\n"
						+ "\t4. Par/Impar: Dependiendo si el número es par o impar y tu apuesta sale ganadora, tendrás\n"
						+ "\tun x2 de ganancias en el dinero apostado.\n\n"
						+ "\t5.1ª, 2ª, 3ª Docena: Si el número ganador está comprendido entre el 1 y el 12, pertenece a la primera docena;\n"
						+ "\tsi el número ganador es del 13 al 24, es un número de la segunda docena; para el resto de números\n"
						+ "\tse dirá que pertenece a la tercera docena. Para este tipo de apuesta las ganancias serán x3.\n\n"
						+ "\t6. Apuesta a 0: Si se apuesta al 0 en Pleno tendrá una ganacia de x100.\n"
						+ "\t7. Si no sale su apuesta, perderá siempre la cantidad apostada. El 0 supone, excepto en Pleno\n"
						+ "siempre una pérdida.\n\n"
						+ "\t\t\t\t¡¡ATENCIÓN!!\n"
						+ "Para salir del modo apuestas tendrás que introducir una cantidad la cual no se cobrará\n"
						+ "a menos que el usuario lo desee. Luego podrás elegir la opción '10. Volver'.\n"
						+ "===========================================================================================\n");
	}

	// Men� principal
	private void ruletaTableroVacio() {
		System.out.print("			| 28 N | 12 R | 35 N | 03 R | 26 N | 00 V | 32 R | 15 N | 19 R |\r\n"
				+ "		| 07 R |								| 04 N |\r\n"
				+ "	| 29 N |	       				     			   	   | 21 R |\r\n"
				+ "	| 18 R |				     ____				   | 02 N |\r\n"
				+ "| 22 N |				            /    \\			   	  	   | 25 R |\r\n"
				+ "| 09 R |				           |  /\\  |==o	               		           | 17 N |\r\n"
				+ "| 31 N |				        o==|  \\/  |				   	   | 34 R |\r\n"
				+ "| 14 R |				            \\____/			           	   | 06 N |\r\n"
				+ "	| 20 N |									   | 27 N |\r\n"
				+ "	| 01 R | 									   | 13 N |\r\n"
				+ "		| 33 N |							   | 36 R |\r\n"
				+ "			| 16 R | 24 N | 05 R | 10 N | 23 R |  08 N  | 30 R | 11 N |\r\n" + "\r\n" + "\r\n"
				+ "       	      |-----|-----------------------------------------------------------------------|\r\n"
				+ "              |     | 03R | 06N | 09R | 12R | 15N | 18R | 21R | 24N | 27R | 30R | 33N | 36R |\r\n"
				+ "              |     |-----------------------------------------------------------------------|\r\n"
				+ "              |  0  | 02N | 05R | 08N | 11N | 14R | 17N | 20N | 23R | 26N | 29N | 32R | 35N |\r\n"
				+ "              |     |-----------------------------------------------------------------------|\r\n"
				+ "              |     | 01R | 04N | 07R | 10N | 13N | 16R | 19N | 22N | 25R | 28N | 31N | 34R |\r\n"
				+ "              |-----|-----------------------------------------------------------------------|\r\n"
				+ "                    |    1�  D O C E N A    |    2�  D O C E N A    |    3�  D O C E N A    |\r\n"
				+ "                    |-----------------------------------------------------------------------|\r\n"
				+ "                    |   P A R   | I M P A R |  R O J O  | N E G R O |  A L T O  |  B A J O  |\r\n"
				+ "                    |-----------------------------------------------------------------------|\n\n\n");
	
	/*controller.Controller.mostrarHistoricoRuleta();*/
	}



	private void imprimirMenuPrincipal() {
		System.out.print("\nPulse una opción entre las siguientes: \n\t0. Instrucciones\n\t1. Añadir Jugadores"
				+ "\n\t2. Editar Jugador\n\t3. Borrar Jugador\n\t4. Empezar Partida\n\t5. Mostrar Jugadores"
				+ "\n\t6. Salir del Juego\nRespuesta: ");
	}

	private void imprimirMenuAcciones() {
		System.out.print(
				"\nPulse una opción entre las siguientes: \n\t0. Girar Ruleta sin apostar\n\t1. Apostar"
						 + "\n\t2. Terminar Turno\nRespuesta: ");
	}

	public static void imprimirMenuApostar() {
		System.out.print("\nPulse una opción entre las siguientes: \n\t0. Pleno\n\t1. Rojo "
				+ "\n\t2. Negro \n\t3. Par \n\t4. Impar\n\t5. Alto\n\t6. Bajo \n\t7. 1ª Docena"
				+ "\n\t8. 2ª Docena \n\t9. 3ª Docena \n\t10. Volver\nRespuesta: ");
	}

	public void menuPrincipal(Partida p) {
		// éste es el método principal del proyecto
		Controller c = new Controller();
		int opcion = 0, salir = 6, cero = 0;

		do {
			imprimirMenuPrincipal();
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				imprimirInstrucciones();
				break;
			case 1:
				c.preguntarJugadores(p);
				break;
			case 2:
				c.editarJugador(p);
				break;
			case 3:
				c.borrarJugador(p);
				break;
			case 4:
				if (p.getNumJugadores() > cero) {
					List<Jugador> listaJugadores = model.Partida.getListaJugadores();
					for (Jugador j : listaJugadores) {
						ruletaTableroVacio();
						subMenuPartida(j);
					}
				} else {
					System.out.println("\n\t***ERROR. No ha introducido ningún jugador.***");
				}
				break;
			case 5:
				mostrarCompleto(p);
				break;
			case 6:
				System.out.println("\n\n"
						+ "         __...__\r\n"
						+ "          \"-._  \"\"--.._     \\-.\r\n"
						+ "              \"-.      \"-.   \\ `.\r\n"
						+ "                 \\        `. |   \\\r\n"
						+ "                  |   \\  \\  \\`|   \\   _.---..__\r\n"
						+ " -..\"\"\"\"\"\"\"---..  |          \\|   |,-\" __   __..\"--\r\n"
						+ "    \"\"--._      \"\"-|   | |  \\ |   `_.-\"  \"\"--._		  ______________________________________\r\n"
						+ "         _`-.       `.         _.-\"         ___.\"-	 /					|\r\n"
						+ "       \"-.\"\"-`. `.    `.     -\" _-\"  ,' .-\"\"__		<   ¡Gracias por jugar, vuelve pronto!  |\r\n"
						+ "           \"-. \\  \\     _.._        / ,'     _\"-	 \\______________________________________|\r\n"
						+ "          _.----\\           `.       /  =._   `\\\\\r\n"
						+ "        ,/ _.--   /    \\,-.   \\\"\"-.     -._  :.\\\r\n"
						+ "       /  __... / |   /\"   `. |   )          _)\\\r\n"
						+ "      /-\"\"  /  (   `.|   ./ _\\|  ',-\"\"\\  _.-\"\r\n"
						+ "           | .-/\\ /|\"6=.,.=6\"/`    ,9 |-\"     \r\n"
						+ "           '  '\" \\|`(--')`--'      /',\\\r\n"
						+ "                  `  \\\"/_ \"\"\"    _.-'  \\       \r\n"
						+ "                      . .--     /\\      \\         \r\n"
						+ "                       `.\"   .-   |      \\\r\n"
						+ "                         \"--\"    /       |\"-.----._\r\n"
						+ "                   ,-.---,|    ,'   ______   `.    `--..__\r\n"
						+ "               .-\"/   .'' |   .--\"\"\"      \"\"-.|           `--.\r\n"
						+ "              /     /' \"-. _.'                |      _.--\"\"\"`-.\r\n"
						+ "             /    ./      /         --\"\"\"\"\",/'     ,'        \\ \\\r\n"
						+ "           /'|/   (      |             ,/'        /           \\ \\\r\n"
						+ "          /  /    `\\     |          ,/'          /            |  )\r\n"
						+ "          | /       `._.- ---..__,/'            ( \\          /   /\r\n"
						+ "           (          `.      ,/'                `.`-..__    `--._\r\n"
						+ "         / `.          `\\_,/'                     \\      \"`\\     \\");
				break;
			default:
				System.out.println("\n\t***ERROR. Introduzca una opción válida***\n");
			}
		} while (opcion != salir);

	}

	public void subMenuPartida(Jugador j) {
		int opcion, salir = 3, resultadoImprimir=0;
		Controller c = new Controller();
		do {
			imprimirMenuAcciones();
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				ruletaTableroVacio();
				resultadoImprimir = c.girarRuleta();
				imprimirCero(resultadoImprimir);
				imprimirUno(resultadoImprimir);
				imprimirDos(resultadoImprimir);
				imprimirTres(resultadoImprimir);
				imprimirCuatro(resultadoImprimir);
				imprimirCinco(resultadoImprimir);
				imprimirSeis(resultadoImprimir);
				imprimirSiete(resultadoImprimir);
				imprimirOcho(resultadoImprimir);
				imprimirNueve(resultadoImprimir);
				imprimirDiez(resultadoImprimir);
				imprimirOnce(resultadoImprimir);
				imprimirDoce(resultadoImprimir);
				imprimirTrece(resultadoImprimir);
				imprimirCatorce(resultadoImprimir);
				imprimirQuince(resultadoImprimir);
				imprimirDieciseis(resultadoImprimir);
				imprimirDiecisiete(resultadoImprimir);
				imprimirDieciocho(resultadoImprimir);
				imprimirDiecinueve(resultadoImprimir);
				imprimirVeinte(resultadoImprimir);
				imprimirVeintiuno(resultadoImprimir);
				imprimirVeintidos(resultadoImprimir);
				imprimirVeintitres(resultadoImprimir);
				imprimirVeinticuatro(resultadoImprimir);
				imprimirVeinticinco(resultadoImprimir);
				imprimirVeintiseis(resultadoImprimir);
				imprimirVeintisiete(resultadoImprimir);
				imprimirVeintiocho(resultadoImprimir);
				imprimirVeintinueve(resultadoImprimir);
				imprimirTreinta(resultadoImprimir);
				imprimirTreintayuno(resultadoImprimir);
				imprimirTreintaydos(resultadoImprimir);
				imprimirTreintaytres(resultadoImprimir);
				imprimirTreintaycuatro(resultadoImprimir);
				imprimirTreintaycinco(resultadoImprimir);
				imprimirTreintayseis(resultadoImprimir);
				
				break;
			case 1:
				System.out.println("Jugador: " + j.getNombre());
				subMenuApuesta(j);
				break;
			case 2:
				System.out.println("\n ¡¡Has terminado tu turno!!");
				break;
			default:
				System.out.println("\n\t***ERROR. Introduzca una opción válida***\n");
			}

		} while (opcion != salir);
	}

	public void subMenuApuesta(Jugador j) {
		int opcion=10, salir = 10, numeroApostado=0, cantidad, cero=0;
		Controller c = new Controller();
		do {
			do {
				System.out.print("\nIntroduzca el dinero que va a apostar (máximo " + j.getDineroFinal() +"): ");
				cantidad = Leer.datoInt();
			} while (cantidad < cero || cantidad > j.getDineroFinal());
			if (cantidad>0) {
				j.setCantidadApuesta(cantidad);
				imprimirMenuApostar();
				opcion = Leer.datoInt();
				switch (opcion) {
				case 0:
					System.out.println("\n ¡¡Has apostado a Pleno!!");
					do {
						System.out.println("¿A qué número apuestas (0 - 36)?");
						numeroApostado = Leer.datoInt();	
					} while (numeroApostado < cero || numeroApostado > 36);
					break;
				case 1:
					System.out.println("\n ¡¡Has apostado a Rojo!!");
					break;
				case 2:
					System.out.println("\n ¡¡Has apostado a Negro!!");
					break;
				case 3:
					System.out.println("\n ¡¡Has apostado a Par!!");
					break;
				case 4:
					System.out.println("\n ¡¡Has apostado a Impar!!");
					break;
				case 5:
					System.out.println("\n ¡¡Has apostado a Alto!!");
					break;
				case 6:
					System.out.println("\n ¡¡Has apostado a Bajo!!");
					break;
				case 7:
					System.out.println("\n ¡¡Has apostado a la 1ª Docena!!");
					break;
				case 8:
					System.out.println("\n ¡¡Has apostado a la 2ª Docena!!");
					break;
				case 9:
					System.out.println("\n ¡¡Has apostado a la 3ª Docena!!");
					break;
				case 10:
					System.out.println("\n\t ¡¡GENIAL!! ¡¡BUENA SUERTE!!");
					break;
				default:
					System.out.println("\n\t***ERROR. Introduzca una opción válida***\n");
				}
				
				if (opcion < 10) {
					int resultado = c.girarRuleta();
					ruletaTableroVacio();
					resultado = c.girarRuleta();
					imprimirCero(resultado);
					imprimirUno(resultado);
					imprimirDos(resultado);
					imprimirTres(resultado);
					imprimirCuatro(resultado);
					imprimirCinco(resultado);
					imprimirSeis(resultado);
					imprimirSiete(resultado);
					imprimirOcho(resultado);
					imprimirNueve(resultado);
					imprimirDiez(resultado);
					imprimirOnce(resultado);
					imprimirDoce(resultado);
					imprimirTrece(resultado);
					imprimirCatorce(resultado);
					imprimirQuince(resultado);
					imprimirDieciseis(resultado);
					imprimirDiecisiete(resultado);
					imprimirDieciocho(resultado);
					imprimirDiecinueve(resultado);
					imprimirVeinte(resultado);
					imprimirVeintiuno(resultado);
					imprimirVeintidos(resultado);
					imprimirVeintitres(resultado);
					imprimirVeinticuatro(resultado);
					imprimirVeinticinco(resultado);
					imprimirVeintiseis(resultado);
					imprimirVeintisiete(resultado);
					imprimirVeintiocho(resultado);
					imprimirVeintinueve(resultado);
					imprimirTreinta(resultado);
					imprimirTreintayuno(resultado);
					imprimirTreintaydos(resultado);
					imprimirTreintaytres(resultado);
					imprimirTreintaycuatro(resultado);
					imprimirTreintaycinco(resultado);
					imprimirTreintayseis(resultado);
					
					switch (opcion) {
						case 0:
							if (numeroApostado==resultado) {
								if (resultado==cero) {
									acierto(100,j);
								} else {
									acierto(36,j);
								}
							} else {
								fallo(j);
							}
							break;
						case 1:
							if (c.esRojo(resultado)) {
								acierto(2,j);
							} else {
								fallo(j);
							}
							break;
						case 2:
							if (c.esNegro(resultado)) {
								acierto(2,j);
							} else {
								fallo(j);
							}
							break;
						case 3:
							if (c.esPar(resultado)) {
								acierto(2,j);
							} else {
								fallo(j);
							}
							break;
						case 4:
							if (c.esImpar(resultado)) {
								acierto(2,j);
							} else {
								fallo(j);
							}
							break;
						case 5:
							if (c.esAlto(resultado)) {
								acierto(2,j);
							} else {
								fallo(j);
							}
							break;
						case 6:
							if (c.esBajo(resultado)) {
								acierto(2,j);
							} else {
								fallo(j);
							}
							break;
						case 7:
							if (c.esPrimeraColumna(resultado)) {
								acierto(3,j);
							} else {
								fallo(j);
							}
							break;
						case 8:
							if (c.esSegundaColumna(resultado)) {
								acierto(3,j);
							} else {
								fallo(j);
							}
							break;
						case 9:
							if (c.esTerceraColumna(resultado)) {
								acierto(3,j);
							} else {
								fallo(j);
							}
							break;
						case 10:
							System.out.println("\nHas salido de las apuestas.");
							break;
						default: 
							System.out.println("No se puede ser más torpe.");
					}
					j.setDineroFinal(j.getDineroFinal()+j.getGanancias());
					System.out.println("Tu saldo actual es: " + j.getDineroFinal());
				}
			}

		} while (opcion != salir || cantidad == cero);
	}
	
	private void acierto(int factor,Jugador j) {
		System.out.println("Has acertado. Ganas " +j.getCantidadApuesta()*2);
		j.setGanancias(j.getCantidadApuesta()*factor);
	}
	
	private void fallo(Jugador j) {
		System.out.println("Has perdido lo apostado (" + j.getCantidadApuesta() +").");
		j.setGanancias(-j.getCantidadApuesta());
	}
	
	//Números
	
	private void imprimirCero(int resultadoImprimir) {
		if (resultadoImprimir == 0) {
		System.out.println("     $$$$$$$$$     \r\n"
				+ "   $$:::::::::$$   \r\n"
				+ " $$:::::::::::::$$ \r\n"
				+ "$:::::::$$$:::::::$\r\n"
				+ "$::::::$   $::::::$\r\n"
				+ "$:::::$     $:::::$\r\n"
				+ "$:::::$     $:::::$\r\n"
				+ "$:::::$ $$$ $:::::$\r\n"
				+ "$:::::$ $$$ $:::::$\r\n"
				+ "$:::::$     $:::::$\r\n"
				+ "$:::::$     $:::::$\r\n"
				+ "$::::::$   $::::::$\r\n"
				+ "$:::::::$$$:::::::$\r\n"
				+ " $$:::::::::::::$$ \r\n"
				+ "   $$:::::::::$$   \r\n"
				+ "     $$$$$$$$$\n");
		}
	}
	
	private void imprimirUno (int resultadoImprimir) {
		if (resultadoImprimir == 1) {
					System.out.println("\r\n"
				+ "  __    \r\n"
				+ " /  |   \r\n"
				+ " `| |   \r\n"
				+ "  | |   \r\n"
				+ " _| |_  \r\n"
				+ "|_____| \r\n"
				+ "        \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirDos(int resultadoImprimir) {
		if (resultadoImprimir == 2) {
					System.out.println("\r\n"
				+ "  _____   \r\n"
				+ " / ___ `. \r\n"
				+ "|_/___) | \r\n"
				+ " .'____.' \r\n"
				+ "/ /_____  \r\n"
				+ "|_______| \r\n"
				+ "          \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirTres(int resultadoImprimir) {
		if (resultadoImprimir == 3) {
					System.out.println("\r\n"
				+ "  ______   \r\n"
				+ " / ____ `. \r\n"
				+ " `'  __) | \r\n"
				+ " _  |__ '. \r\n"
				+ "| \\____) | \r\n"
				+ " \\______.' \r\n"
				+ "           \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirCuatro(int resultadoImprimir) {
		if (resultadoImprimir == 4) {
					System.out.println("\r\n"
				+ " _    _    \r\n"
				+ "| |  | |   \r\n"
				+ "| |__| |_  \r\n"
				+ "|____   _| \r\n"
				+ "    _| |_  \r\n"
				+ "   |_____| \r\n"
				+ "           \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/    \n "
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirCinco(int resultadoImprimir) {
		if (resultadoImprimir == 5) {
					System.out.println("\r\n"
				+ " _______   \r\n"
				+ "|  _____|  \r\n"
				+ "| |____    \r\n"
				+ "'_.____''. \r\n"
				+ "| \\____) | \r\n"
				+ " \\______.' \r\n"
				+ "           \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirSeis(int resultadoImprimir) {
		if (resultadoImprimir == 6) {
					System.out.println("\r\n"
				+ "  ______   \r\n"
				+ ".' ____ \\  \r\n"
				+ "| |____\\_| \r\n"
				+ "| '____`'. \r\n"
				+ "| (____) | \r\n"
				+ "'.______.' \r\n"
				+ "           \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/ \n");
		}

	}
	
	private void imprimirSiete(int resultadoImprimir) {
		if (resultadoImprimir == 7) {
					System.out.println("\r\n"
				+ " _______  \r\n"
				+ "|  ___  | \r\n"
				+ "|_/  / /  \r\n"
				+ "    / /   \r\n"
				+ "   / /    \r\n"
				+ "  /_/     \r\n"
				+ "          \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirOcho(int resultadoImprimir) {
		if (resultadoImprimir == 8) {
					System.out.println("\r\n"
				+ "   ____    \r\n"
				+ " .' __ '.  \r\n"
				+ " | (__) |  \r\n"
				+ " .`____'.  \r\n"
				+ "| (____) | \r\n"
				+ "`.______.' \r\n"
				+ "           \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	private void imprimirNueve(int resultadoImprimir) {
		if (resultadoImprimir == 9) {
					System.out.println("\r\n"
				+ "  ______   \r\n"
				+ ".' ____ '. \r\n"
				+ "| (____) | \r\n"
				+ "'_.____. | \r\n"
				+ "| \\____| | \r\n"
				+ " \\______,' \r\n"
				+ "           \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\\n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/    \n");
		}

	}
	
	private void imprimirDiez(int resultadoImprimir) {
		if (resultadoImprimir == 10) {
					System.out.println("\r\n"
				+ "  __       ____    \r\n"
				+ " /  |    .'    '.  \r\n"
				+ " `| |   |  .--.  | \r\n"
				+ "  | |   | |    | | \r\n"
				+ " _| |_  |  `--'  | \r\n"
				+ "|_____|  '.____.'  \r\n"
				+ "                   \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\  \n"
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirOnce(int resultadoImprimir) {
		if (resultadoImprimir == 11) {
					System.out.println("\r\n"
				+ "  __      __    \r\n"
				+ " /  |    /  |   \r\n"
				+ " `| |    `| |   \r\n"
				+ "  | |     | |   \r\n"
				+ " _| |_   _| |_  \r\n"
				+ "|_____| |_____| \r\n"
				+ "                \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\\n "
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirDoce(int resultadoImprimir) {
		if (resultadoImprimir == 12) {
					System.out.println("\r\n"
				+ "  __      _____   \r\n"
				+ " /  |    / ___ `. \r\n"
				+ " `| |   |_/___) | \r\n"
				+ "  | |    .'____.' \r\n"
				+ " _| |_  / /_____  \r\n"
				+ "|_____| |_______| \r\n"
				+ "                  \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/    \n "
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\  \n "
				+ "       __                     \r\n"
				+ " /|   |  \\  _   _  _  _   _   \r\n"
				+ "  |   |__/ (_) (_ (- | ) (_| \n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirTrece(int resultadoImprimir) {
		if (resultadoImprimir == 13) {
					System.out.println("\r\n"
				+ "  __      ______   \r\n"
				+ " /  |    / ____ `. \r\n"
				+ " `| |    `'  __) | \r\n"
				+ "  | |    _  |__ '. \r\n"
				+ " _| |_  | \\____) | \r\n"
				+ "|_____|  \\______.' \r\n"
				+ "                   \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\\n "
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirCatorce(int resultadoImprimir) {
		if (resultadoImprimir == 14) {
					System.out.println("\r\n"
				+ "  __     _    _    \r\n"
				+ " /  |   | |  | |   \r\n"
				+ " `| |   | |__| |_  \r\n"
				+ "  | |   |____   _| \r\n"
				+ " _| |_      _| |_  \r\n"
				+ "|_____|    |_____| \r\n"
				+ "                   \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirQuince(int resultadoImprimir) {
		if (resultadoImprimir == 15) {
					System.out.println("\r\n"
				+ "  __     _______   \r\n"
				+ " /  |   |  _____|  \r\n"
				+ " `| |   | |____    \r\n"
				+ "  | |   '_.____''. \r\n"
				+ " _| |_  | \\____) | \r\n"
				+ "|_____|  \\______.' \r\n"
				+ "                   \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/    \n "
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirDieciseis(int resultadoImprimir) {
		if (resultadoImprimir == 16) {
					System.out.println("\r\n"
				+ "  __      ______   \r\n"
				+ " /  |   .' ____ \\  \r\n"
				+ " `| |   | |____\\_| \r\n"
				+ "  | |   | '____`'. \r\n"
				+ " _| |_  | (____) | \r\n"
				+ "|_____| '.______.' \r\n"
				+ "                   \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirDiecisiete(int resultadoImprimir) {
		if (resultadoImprimir == 17) {
					System.out.println("\r\n"
				+ "  __     _______  \r\n"
				+ " /  |   |  ___  | \r\n"
				+ " `| |   |_/  / /  \r\n"
				+ "  | |       / /   \r\n"
				+ " _| |_     / /    \r\n"
				+ "|_____|   /_/     \r\n"
				+ "                  \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/   \n "
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\  \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirDieciocho(int resultadoImprimir) {
		if (resultadoImprimir == 18) {
					System.out.println("\r\n"
				+ "  __       ____    \r\n"
				+ " /  |    .' __ '.  \r\n"
				+ " `| |    | (__) |  \r\n"
				+ "  | |    .`____'.  \r\n"
				+ " _| |_  | (____) | \r\n"
				+ "|_____| `.______.' \r\n"
				+ "                   \r\n"
				+ " __            __             \r\n"
				+ "|__)  /\\    | /  \\            \r\n"
				+ "|__) /--\\ __) \\__/     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirDiecinueve(int resultadoImprimir) {
		if (resultadoImprimir == 19) {
					System.out.println("\r\n"
				+ "  __      ______   \r\n"
				+ " /  |   .' ____ '. \r\n"
				+ " `| |   | (____) | \r\n"
				+ "  | |   '_.____. | \r\n"
				+ " _| |_  | \\____| | \r\n"
				+ "|_____|  \\______,' \r\n"
				+ "                   \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirVeinte(int resultadoImprimir) {
		if (resultadoImprimir == 20) {
					System.out.println("\r\n"
				+ "  _____      ____    \r\n"
				+ " / ___ `.  .'    '.  \r\n"
				+ "|_/___) | |  .--.  | \r\n"
				+ " .'____.' | |    | | \r\n"
				+ "/ /_____  |  `--'  | \r\n"
				+ "|_______|  '.____.'  \r\n"
				+ "                     \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirVeintiuno(int resultadoImprimir) {
		if (resultadoImprimir == 21) {
					System.out.println("\r\n"
				+ "  _____     __    \r\n"
				+ " / ___ `.  /  |   \r\n"
				+ "|_/___) |  `| |   \r\n"
				+ " .'____.'   | |   \r\n"
				+ "/ /_____   _| |_  \r\n"
				+ "|_______| |_____| \r\n"
				+ "                  \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirVeintidos(int resultadoImprimir) {
		if (resultadoImprimir == 22) {
					System.out.println("\r\n"
				+ "  _____     _____   \r\n"
				+ " / ___ `.  / ___ `. \r\n"
				+ "|_/___) | |_/___) | \r\n"
				+ " .'____.'  .'____.' \r\n"
				+ "/ /_____  / /_____  \r\n"
				+ "|_______| |_______| \r\n"
				+ "                    \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirVeintitres(int resultadoImprimir) {
		if (resultadoImprimir == 23) {
					System.out.println("\r\n"
				+ "  _____     ______   \r\n"
				+ " / ___ `.  / ____ `. \r\n"
				+ "|_/___) |  `'  __) | \r\n"
				+ " .'____.'  _  |__ '. \r\n"
				+ "/ /_____  | \\____) | \r\n"
				+ "|_______|  \\______.' \r\n"
				+ "                     \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirVeinticuatro(int resultadoImprimir) {
		if (resultadoImprimir == 26) {
					System.out.println("\r\n"
				+ "  _____    _    _    \r\n"
				+ " / ___ `. | |  | |   \r\n"
				+ "|_/___) | | |__| |_  \r\n"
				+ " .'____.' |____   _| \r\n"
				+ "/ /_____      _| |_  \r\n"
				+ "|_______|    |_____| \r\n"
				+ "                     \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " /__   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirVeinticinco(int resultadoImprimir) {
		if (resultadoImprimir == 25) {
					System.out.println("\r\n"
				+ "  _____    _______   \r\n"
				+ " / ___ `. |  _____|  \r\n"
				+ "|_/___) | | |____    \r\n"
				+ " .'____.' '_.____''. \r\n"
				+ "/ /_____  | \\____) | \r\n"
				+ "|_______|  \\______.' \r\n"
				+ "                     \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirVeintiseis(int resultadoImprimir) {
		if (resultadoImprimir == 26) {
					System.out.println("\r\n"
				+ "  _____     ______   \r\n"
				+ " / ___ `. .' ____ \\  \r\n"
				+ "|_/___) | | |____\\_| \r\n"
				+ " .'____.' | '____`'. \r\n"
				+ "/ /_____  | (____) | \r\n"
				+ "|_______| '.______.' \r\n"
				+ "                     \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\  \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n "
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirVeintisiete(int resultadoImprimir) {
		if (resultadoImprimir == 27) {
					System.out.println("\r\n"
				+ "  _____    _______  \r\n"
				+ " / ___ `. |  ___  | \r\n"
				+ "|_/___) | |_/  / /  \r\n"
				+ " .'____.'     / /   \r\n"
				+ "/ /_____     / /    \r\n"
				+ "|_______|   /_/     \r\n"
				+ "                    \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/ \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\ \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirVeintiocho(int resultadoImprimir) {
		if (resultadoImprimir == 28) {
					System.out.println("\r\n"
				+ "  _____      ____    \r\n"
				+ " / ___ `.  .' __ '.  \r\n"
				+ "|_/___) |  | (__) |  \r\n"
				+ " .'____.'  .`____'.  \r\n"
				+ "/ /_____  | (____) | \r\n"
				+ "|_______| `.______.' \r\n"
				+ "                     \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirVeintinueve(int resultadoImprimir) {
		if (resultadoImprimir == 29) {
					System.out.println("\r\n"
				+ "  _____     ______   \r\n"
				+ " / ___ `. .' ____ '. \r\n"
				+ "|_/___) | | (____) | \r\n"
				+ " .'____.' '_.____. | \r\n"
				+ "/ /_____  | \\____| | \r\n"
				+ "|_______|  \\______,' \r\n"
				+ "                     \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\\n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirTreinta(int resultadoImprimir) {
		if (resultadoImprimir == 30) {
					System.out.println("\r\n"
				+ "  ______      ____    \r\n"
				+ " / ____ `.  .'    '.  \r\n"
				+ " `'  __) | |  .--.  | \r\n"
				+ " _  |__ '. | |    | | \r\n"
				+ "| \\____) | |  `--'  | \r\n"
				+ " \\______.'  '.____.'  \r\n"
				+ "                      \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\  \n "
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/  \n ");
		}

	}
	
	private void imprimirTreintayuno(int resultadoImprimir) {
		if (resultadoImprimir == 31) {
					System.out.println("\r\n"
				+ "  ______     __    \r\n"
				+ " / ____ `.  /  |   \r\n"
				+ " `'  __) |  `| |   \r\n"
				+ " _  |__ '.   | |   \r\n"
				+ "| \\____) |  _| |_  \r\n"
				+ " \\______.' |_____| \r\n"
				+ "                   \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\\n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirTreintaydos(int resultadoImprimir) {
		if (resultadoImprimir == 32) {
					System.out.println("\r\n"
				+ "  ______     _____   \r\n"
				+ " / ____ `.  / ___ `. \r\n"
				+ " `'  __) | |_/___) | \r\n"
				+ " _  |__ '.  .'____.' \r\n"
				+ "| \\____) | / /_____  \r\n"
				+ " \\______.' |_______| \r\n"
				+ "                     \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                    \n "
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\   \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_| \n"
				+ "__   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirTreintaytres(int resultadoImprimir) {
		if (resultadoImprimir == 33) {
			System.out.println("\r\n"
					+ "  ______     ______   \r\n"
					+ " / ____ `.  / ____ `. \r\n"
					+ " `'  __) |  `'  __) | \r\n"
					+ " _  |__ '.  _  |__ '. \r\n"
					+ "| \\____) | | \\____) | \r\n"
					+ " \\______.'  \\______.' \r\n"
					+ "                      \r\n"
					+ "         ___  __              \r\n"
					+ " /\\  |    |  /  \\             \r\n"
					+ "/--\\ |__  |  \\__/             \r\n"
					+ "                     \n"
					+ "        __        __          \r\n"
					+ "| |\\/| |__)  /\\  |__)         \r\n"
					+ "| |  | |    /--\\ | \\\n"
					+ " __     __                    \r\n"
					+ "  _)   |  \\  _   _  _  _   _  \r\n"
					+ " __)   |__/ (_) (_ (- | ) (_|\n"
					+ "      __  __   __   __        \r\n"
					+ "|\\ | |_  / _  |__) /  \\       \r\n"
					+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirTreintaycuatro(int resultadoImprimir) {
		if (resultadoImprimir == 35) {
					System.out.println("\r\n"
				+ "  ______    _    _    \r\n"
				+ " / ____ `. | |  | |   \r\n"
				+ " `'  __) | | |__| |_  \r\n"
				+ " _  |__ '. |____   _| \r\n"
				+ "| \\____) |     _| |_  \r\n"
				+ " \\______.'    |_____| \r\n"
				+ "                      \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                    \n"
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\    \n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   \n");
		}

	}
	
	private void imprimirTreintaycinco(int resultadoImprimir) {
		if (resultadoImprimir == 35) {
					System.out.println("\r\n"
				+ "  ______    _______   \r\n"
				+ " / ____ `. |  _____|  \r\n"
				+ " `'  __) | | |____    \r\n"
				+ " _  |__ '. '_.____''. \r\n"
				+ "| \\____) | | \\____) | \r\n"
				+ " \\______.'  \\______.' \r\n"
				+ "                      \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                     \n"
				+ "        __        __          \r\n"
				+ "| |\\/| |__)  /\\  |__)         \r\n"
				+ "| |  | |    /--\\ | \\\n"
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|\n"
				+ "      __  __   __   __        \r\n"
				+ "|\\ | |_  / _  |__) /  \\       \r\n"
				+ "| \\| |__ \\__) | \\  \\__/\n");
		}

	}
	
	private void imprimirTreintayseis(int resultadoImprimir) {
		if (resultadoImprimir == 36) {
					System.out.println("\r\n"
				+ "  ______     ______   \r\n"
				+ " / ____ `. .' ____ \\  \r\n"
				+ " `'  __) | | |____\\_| \r\n"
				+ " _  |__ '. | '____`'. \r\n"
				+ "| \\____) | | (____) | \r\n"
				+ " \\______.' '.______.' \r\n"
				+ "                      \r\n"
				+ "         ___  __              \r\n"
				+ " /\\  |    |  /  \\             \r\n"
				+ "/--\\ |__  |  \\__/             \r\n"
				+ "                    "
				+ " __        __                 \r\n"
				+ "|__)  /\\  |__)                \r\n"
				+ "|    /--\\ | \\    "
				+ " __     __                    \r\n"
				+ "  _)   |  \\  _   _  _  _   _  \r\n"
				+ " __)   |__/ (_) (_ (- | ) (_|"
				+ " __   __       __             \r\n"
				+ "|__) /  \\   | /  \\            \r\n"
				+ "| \\  \\__/ __) \\__/   ");
		}

	}

}
