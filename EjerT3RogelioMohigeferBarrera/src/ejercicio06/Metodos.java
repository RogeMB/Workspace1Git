package ejercicio06;

import lectura.Leer;

public class Metodos {
	
	private String nNombre = "Nombre";
	private String nEnter = "Enter";
	private int eleccion = 0;
	
	public int getEleccion() {
		return eleccion;
	}

	public void setEleccion(int eleccion) {
		this.eleccion = eleccion;
	}

	public void imprimirTitulo () {
		System.out.println("\r\n"
				+ "  __  __   __         ____                                      ____                \r\n"
				+ " |  \\/  | /_/_ ___   / ___|__ _ _ __ __ _    __ _ _   _  ___   / ___|_ __ _   _ ____\r\n"
				+ " | |\\/| |/ _` / __| | |   / _` | '__/ _` |  / _` | | | |/ _ \\ | |   | '__| | | |_  /\r\n"
				+ " | |  | | (_| \\__ \\ | |__| (_| | | | (_| | | (_| | |_| |  __/ | |___| |  | |_| |/ / \r\n"
				+ " |_|  |_|\\__,_|___/  \\____\\__,_|_|  \\__,_|  \\__, |\\__,_|\\___|  \\____|_|   \\__,_/___|\r\n"
				+ "                                               |_|                                  \r\n"
				+ "\n");
		
	}
	
	public void bienvenido () {
		System.out.print("Bienvenido/a,\n Ingrese su nombre: ");
		nNombre = Leer.dato();
		System.out.println("\n¡Hola " +nNombre+"!. Para comenzar pulsa la tecla:  \r\n\t\t\t\t"
				+ "╔═╗╔╗╔╔╦╗╔═╗╦═╗\r\n\t\t\t\t"
				+ "║╣ ║║║ ║ ║╣ ╠╦╝\r\n\t\t\t\t"
				+ "╚═╝╝╚╝ ╩ ╚═╝╩╚═\r\n");
		nEnter= Leer.dato();
	}
	
	public void imprimirInstrucciones () {
		System.out.println("\n____________________________________________________________________________________________"
				+ "______________________________\n"
				+ "¡Ajá! ¿No sabes jugar al juego de Cara o Cruz? No te preocupes, ¡es muy sencillo!"
				+ "Lo primero que debes hacer es seleccionar \nla opción 2 del menú para elegir una de las siguientes"
				+ "opciones:"
				+ "\n\t*Cara"
				+ "\n\t*Cruz"
				+ "\nElige la que tu quieras sabiamente. Luego elige la opción de lanzar la moneda. Si el resultado "
				+ "del lanzamiento es el mismo \nque tú elegiste, ya sea Cara o Cruz, habrás ganado, pero si "
				+ "el resultado es diferente al que elegiste, has perdido. Si \nquieres ver tu porcentaje ganador "
				+ "elige la opción 4. Para salir del juego pulsa la tecla 0. ¡Mucha suerte!"
				+ "\n____________________________________________________________________________________________"
				+ "______________________________");
	}
	
	public int elegirCaraCruz () {
		eleccion = Leer.datoInt();
		return eleccion;
	} 	
	
	public void imprimirIncorrecto () {
		System.out.println(
				"\n\t\t*****ERROR. Opción no válida*****.\n<<----<<----<<----<<----<<----<<----<<----<<----"
				+ "<<----<<----<<----<<----<<----<<----<<----<<----<<----<<----");
	}

	public void imprimirPalabraMagica () {
		System.out.println("\n\t***¡Ah, ah, ah! ¡No has dicho la opción correcta!***\n "
				+ "\n  		   .:/shmmmmmmmmmmmmmmh/`                   \r\n"
				+ "                 .odddmmmmmmNNNmNNNNNNNmh:                  \r\n"
				+ "               .sdmmmmNmNNNNNNNNNNmNmmNNNms.                \r\n"
				+ "              `ymmmNNNNNNNNNNNNmmmmmNNNmNNNd-               \r\n"
				+ "              ommmNNmdhysssyysyssssyyddmNNmNd.              \r\n"
				+ "             .mmNNmhs+//:::::------:/++symNNNy`             \r\n"
				+ "             omNmhyo//::----...------::/+sdNNN+             \r\n"
				+ "             hmmhoo+/:-----.......-----:/oshmmd`            \r\n"
				+ "            .mmho++/::----------------::/ooshmm`            \r\n"
				+ "            /mds++/:::--------------::::/+osydm`            \r\n"
				+ "            omho++/::----.........----:://+syhd`            \r\n"
				+ "           `dmdo+////::////-.....-::::///++oyhh`            \r\n"
				+ "           `dmho+++/+/++///:-..-:///////+o+oymm.            \r\n"
				+ "            ohyo++/++/++++/::::///++ss+ooo+oydd`            \r\n"
				+ "            +yso+/::::::::::/::/:--::::/+//o+s+             \r\n"
				+ "            +yso+/:-------://:-://--:::::/+s-y.             \r\n"
				+ "            /ys++/:--.---//::-.-/+:-..--:/o//h.             \r\n"
				+ "            -yo++/::///::///++/+o+/://:::+s/o++/`           \r\n"
				+ "            `yo///:::/++/::::://////+///+:/s://:/           \r\n"
				+ "             ss+/::---:/++/////++ooo/--:/-+oo:+:/           \r\n"
				+ "           ::oho/::---::////////++/::--:o/-:++/:            \r\n"
				+ "         :+-.-shs+:::::::-:--:::::::::::+/---.o`            \r\n"
				+ "        +/`  `:yhyo//+//::-----::::/++//++---./.            \r\n"
				+ "       `s.    `:oyyso+o+/:--..--::/os+++sy.--.-y:           \r\n"
				+ "       -+`     `-/ossosso++//::/+osssoosyh:--..odo          \r\n"
				+ "       +:`       `-/ooossoo++++oosssoooo:/s//-..yd:         \r\n"
				+ "       s-         `./++oossoooooooooo+:` -o--//:/d+         \r\n"
				+ "      `s.        -o:.`-//++oooooo++/-`   .o-` `-/do         \r\n"
				+ "      :o.       .+:`  --`-://////:-`     -+-`   `-s         \r\n"
				+ "      o:.      ` `   `+` `/::..-:.:`-.:` .o-.     /.        \r\n"
				+ "     .s-`     .-     /+::..+  -.: //-`+.  o-.`    /`        \r\n"
				+ "     +/-`     o.    -y.-+``/``/   .--./.  :+-.    /         \r\n"
				+ "    `s:.     :o.   `s:  ./.`..` `:-..:o-.``/+:.  ./         \r\n"
				+ "    ++:.     y/-` `/:     .--.``/. `--`    `-o---:`         \r\n"
				+ "   .y:-.     d+--...          ``..`.`    `.:s:              \r\n"
				+ "   o/:-`     dy:--....```    `.:--:::/++/+//+:              \r\n"
				+ "  -s:--.     ys++/:--------:/+o+oyhhh+:s.  `o.              \r\n"
				+ " `y::-..`    s:...+-/s/::--h//dmdyssys/o.  `o               \r\n"
				+ " .o+::-.`  .-y+.``+ o:.`   y/:myyyhdms+y:---+               \r\n"
				+ "   -oyhs+++/ydhs:/- s-.``` s//mddhs+//+-`   +               \r\n"
				+ "      `s--:.-hy+    ::::/::so/:--:/o+-`    -:               \r\n"
				+ "      .+..s.-dho        ```.sooo++:`       o                \r\n"
				+ "      -/.-/+ydhs  ``        `.--`   `.:.  -/                \r\n"
				+ "       :+//osdhy.  :/:.``     ```.-//-`   /-                \r\n"
				+ "        `..``hdy+   `.:////::::/++/-`     -:                \r\n"
				+ "             sdyo       ```.y///:-.`      ./                \r\n"
				+ "             +dh+           y/::-.`       `+                \r\n"
				+ "             /dh/           y::-.``        o                \r\n"
				+ "             /dy:           y::-``         :-               \r\n"
				+ "             ody-`          y::..`          +               \r\n"
				+ "            -dyy.`          y::.``          ./`             \r\n"
				+ "           -hhs:`           s::.```          ./.            \r\n"
				+ "          +hhs:.            s::-...``         `:-           \r\n"
				+ "         `/sy+--.....--:::+.:.-s///+///:::::+-..`           \r\n"
				+ "          ./..-://////::::o.   +//:o:---.`   ---`           \r\n"
				+ "      `---.   `.-:-/++//::-`    `...-://:-.``` `----        \r\n"
				+ "    `+-...-:://::--- `                 `.---::::::-:    "
				+ ".\n<<----<<----<<----<<----<<----<<----<<----<<----<<"
				+ "----<<----");
	}
	
	public void imprimirAdios () {
		System.out.println("\r\n\n"
				+ "                                                                                                      \r\n"
				+ " _  ____ ____     _    ____ ___    _    ____    ____   ___  ____        _ _   _  ____    _    ____  _ \r\n"
				+ "| |/ ___|  _ \\   / \\  / ___|_ _|  / \\  / ___|  |  _ \\ / _ \\|  _ \\      | | | | |/ ___|  / \\  |  _ \\| |\r\n"
				+ "| | |  _| |_) | / _ \\| |    | |  / _ \\ \\___ \\  | |_) | | | | |_) |  _  | | | | | |  _  / _ \\ | |_) | |\r\n"
				+ "|_| |_| |  _ < / ___ | |___ | | / ___ \\ ___) | |  __/| |_| |  _ <  | |_| | |_| | |_| |/ ___ \\|  _ <|_|\r\n"
				+ "(_)\\____|_| \\_/_/   \\_\\____|___/_/   \\_|____/  |_|    \\___/|_| \\_\\  \\___/ \\___/ \\____/_/   \\_|_| \\_(_)\r\n"
				+ "                                                                                                      \r\n"
				+ "");
	}
	
}
