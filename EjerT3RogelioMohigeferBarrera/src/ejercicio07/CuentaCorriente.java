package ejercicio07;

import lectura.Leer;

public class CuentaCorriente {
	
	private double saldo=0.00;
	private String nNombre = "Nombre";
	
	public void takeMyCash () {
		System.out.println("\r\n"
				+ "$$$$$$$$\\      $$\\                      $$\\      $$\\                 $$$$$$\\                   $$\\             \r\n"
				+ "\\__$$  __|     $$ |                     $$$\\    $$$ |               $$  __$$\\                  $$ |            \r\n"
				+ "   $$ |$$$$$$\\ $$ |  $$\\ $$$$$$\\        $$$$\\  $$$$ $$\\   $$\\       $$ /  \\__|$$$$$$\\  $$$$$$$\\$$$$$$$\\        \r\n"
				+ "   $$ |\\____$$\\$$ | $$  $$  __$$\\       $$\\$$\\$$ $$ $$ |  $$ |      $$ |      \\____$$\\$$  _____$$  __$$\\       \r\n"
				+ "   $$ |$$$$$$$ $$$$$$  /$$$$$$$$ |      $$ \\$$$  $$ $$ |  $$ |      $$ |      $$$$$$$ \\$$$$$$\\ $$ |  $$ |      \r\n"
				+ "   $$ $$  __$$ $$  _$$< $$   ____|      $$ |\\$  /$$ $$ |  $$ |      $$ |  $$\\$$  __$$ |\\____$$\\$$ |  $$ |      \r\n"
				+ "   $$ \\$$$$$$$ $$ | \\$$\\\\$$$$$$$\\       $$ | \\_/ $$ \\$$$$$$$ |      \\$$$$$$  \\$$$$$$$ $$$$$$$  $$ |  $$ |      \r\n"
				+ "   \\__|\\_______\\__|  \\__|\\_______|      \\__|     \\__|\\____$$ |       \\______/ \\_______\\_______/\\__|  \\__|      \r\n"
				+ "                                           $$$\\     $$\\   $$ |                                                 \r\n"
				+ "                                          $$ $$\\    \\$$$$$$  |                                                 \r\n"
				+ "                                          \\$$$\\ |    \\______/                                                  \r\n"
				+ "                                          $$\\$$\\$$\\                                                            \r\n"
				+ "                                          $$ \\$$ __|                                                           \r\n"
				+ "                                          $$ |\\$$\\                                                             \r\n"
				+ "                                           $$$$ $$\\                                                            \r\n"
				+ "                                           \\____\\__|                                                           \r\n"
				+ "                                    $$$$$$$\\ $$\\   $$\\$$\\   $$\\                                                \r\n"
				+ "                                    $$  __$$\\$$ |  $$ $$$\\  $$ |                                               \r\n"
				+ "                                    $$ |  $$ $$ |  $$ $$$$\\ $$ |                                               \r\n"
				+ "                                    $$$$$$$  $$ |  $$ $$ $$\\$$ |                                               \r\n"
				+ "                                    $$  __$$<$$ |  $$ $$ \\$$$$ |                                               \r\n"
				+ "                                    $$ |  $$ $$ |  $$ $$ |\\$$$ |                                               \r\n"
				+ "                                    $$ |  $$ \\$$$$$$  $$ | \\$$ |                                               \r\n"
				+ "                                    \\__|  \\__|\\______/\\__|  \\__|                                               \r\n"
				+ "                                                                                                               \r\n"
				+ "                                                                                                               \r\n"
				+ "\r\n"
				+ " __ __  __ ______  ____ ____  __  __  ___  ______ __   ___   __  __  ___  __       ____   ___  __  __ __ __   \r\n"
				+ " || ||\\ || | || | ||    || \\\\ ||\\ || // \\\\ | || | ||  // \\\\  ||\\ || // \\\\ ||       || )) // \\\\ ||\\ || || //   \r\n"
				+ " || ||\\\\||   ||   ||==  ||_// ||\\\\|| ||=||   ||   || ((   )) ||\\\\|| ||=|| ||       ||=)  ||=|| ||\\\\|| ||<<    \r\n"
				+ " || || \\||   ||   ||___ || \\\\ || \\|| || ||   ||   ||  \\\\_//  || \\|| || || ||__|    ||_)) || || || \\|| || \\\\   \r\n"
				+ "                                                                                                              \r\n"
				+ "                                                                                                               \r\n"
				+ "");
	}
	
	public void bienvenido () {
		System.out.print("Bienvenido/a, ingrese su nombre: ");
		nNombre = Leer.dato();
		System.out.println("\n¡Hola "+nNombre+"!. \nSu saldo actual es de "+saldo+"€.");
	}
	
	public void imprimirInvalido () {
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
	
	public void imprimirCorrecto () {
		System.out.println(
				"\n*****¡Operación realizada con éxito!*****\n_______________________________________"
				+ "_____________________________________________________");
	}
	
	public void imprimirIncorrecto () {
		System.out.println(
				"\n*****Operación rechazada*****.\n<<----<<----<<----<<----<<----<<----<<----<<----"
				+ "<<----<<----<<----<<----<<----<<----<<----<<----<<----<<----");
	}
	
	public void adios () {
		System.out.println("\n\r\n"
				+ "                                                                  \r\n"
				+ "                                          ,,               M      \r\n"
				+ "  .g8\"\"\"bgd                               db            ,,,M..    \r\n"
				+ ".dP'     `M                                            'P  M `db, \r\n"
				+ "dM'       `  `7Mb,od8  ,6\"Yb.   ,p6\"bo  `7MM   ,6\"Yb.  8m._M  `\"' \r\n"
				+ "MM             MM' \"' 8)   MM  6M'  OO    MM  8)   MM  `YMMM._    \r\n"
				+ "MM.    `7MMF'  MM      ,pm9MM  8M         MM   ,pm9MM     `MYMMb, \r\n"
				+ "`Mb.     MM    MM     8M   MM  YM.    ,   MM  8M   MM  M   M  .M8 \r\n"
				+ "  `\"bmmmdPY  .JMML.   `Moo9^Yo. YMbmd'  .JMML.`Moo9^Yo.YbmmMmd9'  \r\n"
				+ "                                                           M      \r\n"
				+ "                                                                  \r\n"
				+ "");
	}
	
	public void ingresarDinero () {
		double dineroIngresar=0.00; 
		dineroIngresar = Leer.datoDouble();
		if (dineroIngresar >= 0) {
			saldo = saldo + dineroIngresar;
			this.imprimirCorrecto();
		} else 
			this.imprimirIncorrecto();

	}
	
	public void retirarDinero () {
		double dineroRetirar=0.00;
		dineroRetirar = Leer.datoDouble();
		if (dineroRetirar >= 0 && dineroRetirar <= saldo) {
			saldo = saldo - dineroRetirar;
			this.imprimirCorrecto();
		} else 
			this.imprimirIncorrecto();
	}
	
	public void cambioDolar () {
		double precioDolar=1.134, saldoDolar=0.00;
		System.out.println("\nEl valor actual del dóllar Americano es de: " + precioDolar+ "€");
		saldoDolar = precioDolar * saldo; 
		System.out.printf("Su saldo en dóllares americanos es: $%.2f\n", saldoDolar);  
		this.imprimirCorrecto();
	}
	
	public void imprimeSaldo () {
		System.out.printf("\nSu saldo actual es de: %.2f€", saldo);
	}
}
