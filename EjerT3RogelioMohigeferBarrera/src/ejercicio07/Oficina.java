package ejercicio07;

public class Oficina {
	
	private CuentaCorriente c; //no ponemos = new Cuenta ()//
	private int id; //id de la oficina//

	//Constructores lleno y vacío
	
	public Oficina(CuentaCorriente c, int id) {
		this.c = c;
		this.id = id;
	}
	
	public Oficina() {
		/*constructor vacío*/
	}
	
	//Getters & Setters
	
	public CuentaCorriente getC() {
		return c;
	}
	public void setC(CuentaCorriente c) {
		this.c = c;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	//toString
	
	@Override
	public String toString() {
		return "Oficina [c=" + c + ", id=" + id + "]";
	}
	
	//Métodos de Cálculo
	
	public boolean ingresarDinero (double cantidad) {
		int cero = 0;
		if (cantidad > cero) {
			c.setSaldo(c.getSaldo() + cantidad);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean retirarDinero (double cantidad) {
		if (cantidad >= 0 && cantidad <= c.getSaldo()) {
			c.setSaldo(c.getSaldo() - cantidad);
			return true;
		} else 
			return false;	
	}
	

	public double cambiarDolar (double divisa) {
	  	return c.getSaldo()*divisa;
	}  
	
	//Métodos de impresión//
	
	public void imprimirDolar (double divisa) {
		System.out.println("\nEl euro se cambia a: $" +divisa);
		System.out.printf("Su saldo en dólares americanos es: $%.2f\n", this.cambiarDolar(divisa));  
	}
	
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
	
	public void imprimirValidez(boolean b) {
		if (b) {
			System.out.println(
					"\n*****¡Operación realizada con éxito!*****\n_______________________________________"
					+ "_____________________________________________________");
		}else {
			System.out.println(
					"\n*****Operación rechazada*****.\n<<----<<----<<----<<----<<----<<----<<----<<----"
					+ "<<----<<----<<----<<----<<----<<----<<----<<----<<----<<----");
		}
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
	
	
	
	//ejemplo si no tenemos una cuenta como atributo. Por ejemplo, para un quiosco, que no hay que 
	//crear una clase tipo cuenta. Hay que poner en comentario el atributo de arriba
	
	public void ingresarSinObjeto (double cantidad, CuentaCorriente c) {
		c.setSaldo(c.getSaldo()+cantidad);
	}
	
	

}
