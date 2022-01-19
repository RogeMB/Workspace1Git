package ejercicio02prof;

public class Prueba {
	
	public String contrasenna = "yatusabe";
	
	
	//Constructores
	public Prueba(String contrasenna) {
		this.contrasenna = contrasenna;
	}
	
	public Prueba() {
		
	}

	//ToString
	@Override
	public String toString() {
		return "Prueba [contrasenna=" + contrasenna + "]";
	}
	

	//GettersSetters
	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	
	
	//impresiones
	public static void imprimirBienvenida() {
		System.out.println("\r\n"
				+ "__/\\\\\\\\____________/\\\\\\\\____________________________/\\\\\\________/\\\\\\_____________________________________________/\\\\\\\\\\\\____        \r\n"
				+ " _\\/\\\\\\\\\\\\________/\\\\\\\\\\\\___________________________\\/\\\\\\_______\\/\\\\\\____________________________________________\\////\\\\\\____       \r\n"
				+ "  _\\/\\\\\\//\\\\\\____/\\\\\\//\\\\\\__/\\\\\\________________/\\\\\\_\\/\\\\\\_______\\/\\\\\\___________________/\\\\\\________________________\\/\\\\\\____      \r\n"
				+ "   _\\/\\\\\\\\///\\\\\\/\\\\\\/_\\/\\\\\\_\\///___/\\\\/\\\\\\\\\\\\___\\///__\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\_____/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\_____\\/\\\\\\____     \r\n"
				+ "    _\\/\\\\\\__\\///\\\\\\/___\\/\\\\\\__/\\\\\\_\\/\\\\\\////\\\\\\___/\\\\\\_\\/\\\\\\/////////\\\\\\___/\\\\\\///\\\\\\__\\////\\\\\\////____/\\\\\\/////\\\\\\____\\/\\\\\\____    \r\n"
				+ "     _\\/\\\\\\____\\///_____\\/\\\\\\_\\/\\\\\\_\\/\\\\\\__\\//\\\\\\_\\/\\\\\\_\\/\\\\\\_______\\/\\\\\\__/\\\\\\__\\//\\\\\\____\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\____   \r\n"
				+ "      _\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\_\\/\\\\\\___\\/\\\\\\_\\/\\\\\\_\\/\\\\\\_______\\/\\\\\\_\\//\\\\\\__/\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\____  \r\n"
				+ "       _\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\_\\/\\\\\\___\\/\\\\\\_\\/\\\\\\_\\/\\\\\\_______\\/\\\\\\__\\///\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\_ \r\n"
				+ "        _\\///______________\\///__\\///__\\///____\\///__\\///__\\///________\\///_____\\/////_________\\/////______\\//////////__\\/////////__\r\n"
				+ "\r\n"
				+ "\nBienvenido/a al programa de Gestión del Minihotel.");
	}
	
	public static void imprimirMenuPrincipal () {
		System.out.println("\nIntroduzca un número entre las siguientes opciones: "
				+ "\n\t0. Salir "
				+ "\n\t1. Operaciones Personal"
				+ "\n\t2. Nuevo Cliente");
	}
	
	public static void imprimirSubMenuPersonal () {
		System.out.println("\nIntroduzca un número entre las siguientes opciones: "
				+ "\n\t0. Volver "
				+ "\n\t1. Cambiar Contraseña"
				+ "\n\t2. Establecer precio lavandería"
				+ "\n\t3. Establecer precio parking"
				+ "\n\t4. Establecer precio desayuno"
				+ "\n\t5. Crear tipo habitación"
				+ "\n\t6. Modificar habitación"
				+ "\n\t7. Servicio limpieza");
	}
	
	public static void imprimirSubMenuCliente () {
		System.out.println("\nIntroduzca un número entre las siguientes opciones: "
				+ "\n\t0. Volver "
				+ "\n\t1. Nombre cliente"
				+ "\n\t2. Asignar habitación"
				+ "\n\t3. Número de noches"
				+ "\n\t4. Contratar extras"
				+ "\n\t5. Checkout");
	}
	
	public static void imprimirIncorrecto ( ) {
		System.out.println("System.out.println(\"\\n\\t***¡Ah, ah, ah! ¡No has dicho la palabra mágica!***\\n \"\r\n"
				+ "				+ \"\\n  		   .:/shmmmmmmmmmmmmmmh/`                   \\r\\n\"\r\n"
				+ "				+ \"                 .odddmmmmmmNNNmNNNNNNNmh:                  \\r\\n\"\r\n"
				+ "				+ \"               .sdmmmmNmNNNNNNNNNNmNmmNNNms.                \\r\\n\"\r\n"
				+ "				+ \"              `ymmmNNNNNNNNNNNNmmmmmNNNmNNNd-               \\r\\n\"\r\n"
				+ "				+ \"              ommmNNmdhysssyysyssssyyddmNNmNd.              \\r\\n\"\r\n"
				+ "				+ \"             .mmNNmhs+//:::::------:/++symNNNy`             \\r\\n\"\r\n"
				+ "				+ \"             omNmhyo//::----...------::/+sdNNN+             \\r\\n\"\r\n"
				+ "				+ \"             hmmhoo+/:-----.......-----:/oshmmd`            \\r\\n\"\r\n"
				+ "				+ \"            .mmho++/::----------------::/ooshmm`            \\r\\n\"\r\n"
				+ "				+ \"            /mds++/:::--------------::::/+osydm`            \\r\\n\"\r\n"
				+ "				+ \"            omho++/::----.........----:://+syhd`            \\r\\n\"\r\n"
				+ "				+ \"           `dmdo+////::////-.....-::::///++oyhh`            \\r\\n\"\r\n"
				+ "				+ \"           `dmho+++/+/++///:-..-:///////+o+oymm.            \\r\\n\"\r\n"
				+ "				+ \"            ohyo++/++/++++/::::///++ss+ooo+oydd`            \\r\\n\"\r\n"
				+ "				+ \"            +yso+/::::::::::/::/:--::::/+//o+s+             \\r\\n\"\r\n"
				+ "				+ \"            +yso+/:-------://:-://--:::::/+s-y.             \\r\\n\"\r\n"
				+ "				+ \"            /ys++/:--.---//::-.-/+:-..--:/o//h.             \\r\\n\"\r\n"
				+ "				+ \"            -yo++/::///::///++/+o+/://:::+s/o++/`           \\r\\n\"\r\n"
				+ "				+ \"            `yo///:::/++/::::://////+///+:/s://:/           \\r\\n\"\r\n"
				+ "				+ \"             ss+/::---:/++/////++ooo/--:/-+oo:+:/           \\r\\n\"\r\n"
				+ "				+ \"           ::oho/::---::////////++/::--:o/-:++/:            \\r\\n\"\r\n"
				+ "				+ \"         :+-.-shs+:::::::-:--:::::::::::+/---.o`            \\r\\n\"\r\n"
				+ "				+ \"        +/`  `:yhyo//+//::-----::::/++//++---./.            \\r\\n\"\r\n"
				+ "				+ \"       `s.    `:oyyso+o+/:--..--::/os+++sy.--.-y:           \\r\\n\"\r\n"
				+ "				+ \"       -+`     `-/ossosso++//::/+osssoosyh:--..odo          \\r\\n\"\r\n"
				+ "				+ \"       +:`       `-/ooossoo++++oosssoooo:/s//-..yd:         \\r\\n\"\r\n"
				+ "				+ \"       s-         `./++oossoooooooooo+:` -o--//:/d+         \\r\\n\"\r\n"
				+ "				+ \"      `s.        -o:.`-//++oooooo++/-`   .o-` `-/do         \\r\\n\"\r\n"
				+ "				+ \"      :o.       .+:`  --`-://////:-`     -+-`   `-s         \\r\\n\"\r\n"
				+ "				+ \"      o:.      ` `   `+` `/::..-:.:`-.:` .o-.     /.        \\r\\n\"\r\n"
				+ "				+ \"     .s-`     .-     /+::..+  -.: //-`+.  o-.`    /`        \\r\\n\"\r\n"
				+ "				+ \"     +/-`     o.    -y.-+``/``/   .--./.  :+-.    /         \\r\\n\"\r\n"
				+ "				+ \"    `s:.     :o.   `s:  ./.`..` `:-..:o-.``/+:.  ./         \\r\\n\"\r\n"
				+ "				+ \"    ++:.     y/-` `/:     .--.``/. `--`    `-o---:`         \\r\\n\"\r\n"
				+ "				+ \"   .y:-.     d+--...          ``..`.`    `.:s:              \\r\\n\"\r\n"
				+ "				+ \"   o/:-`     dy:--....```    `.:--:::/++/+//+:              \\r\\n\"\r\n"
				+ "				+ \"  -s:--.     ys++/:--------:/+o+oyhhh+:s.  `o.              \\r\\n\"\r\n"
				+ "				+ \" `y::-..`    s:...+-/s/::--h//dmdyssys/o.  `o               \\r\\n\"\r\n"
				+ "				+ \" .o+::-.`  .-y+.``+ o:.`   y/:myyyhdms+y:---+               \\r\\n\"\r\n"
				+ "				+ \"   -oyhs+++/ydhs:/- s-.``` s//mddhs+//+-`   +               \\r\\n\"\r\n"
				+ "				+ \"      `s--:.-hy+    ::::/::so/:--:/o+-`    -:               \\r\\n\"\r\n"
				+ "				+ \"      .+..s.-dho        ```.sooo++:`       o                \\r\\n\"\r\n"
				+ "				+ \"      -/.-/+ydhs  ``        `.--`   `.:.  -/                \\r\\n\"\r\n"
				+ "				+ \"       :+//osdhy.  :/:.``     ```.-//-`   /-                \\r\\n\"\r\n"
				+ "				+ \"        `..``hdy+   `.:////::::/++/-`     -:                \\r\\n\"\r\n"
				+ "				+ \"             sdyo       ```.y///:-.`      ./                \\r\\n\"\r\n"
				+ "				+ \"             +dh+           y/::-.`       `+                \\r\\n\"\r\n"
				+ "				+ \"             /dh/           y::-.``        o                \\r\\n\"\r\n"
				+ "				+ \"             /dy:           y::-``         :-               \\r\\n\"\r\n"
				+ "				+ \"             ody-`          y::..`          +               \\r\\n\"\r\n"
				+ "				+ \"            -dyy.`          y::.``          ./`             \\r\\n\"\r\n"
				+ "				+ \"           -hhs:`           s::.```          ./.            \\r\\n\"\r\n"
				+ "				+ \"          +hhs:.            s::-...``         `:-           \\r\\n\"\r\n"
				+ "				+ \"         `/sy+--.....--:::+.:.-s///+///:::::+-..`           \\r\\n\"\r\n"
				+ "				+ \"          ./..-://////::::o.   +//:o:---.`   ---`           \\r\\n\"\r\n"
				+ "				+ \"      `---.   `.-:-/++//::-`    `...-://:-.``` `----        \\r\\n\"\r\n"
				+ "				+ \"    `+-...-:://::--- `                 `.---::::::-:    \"\r\n"
				+ "				+ \".\\n<<----<<----<<----<<----<<----<<----<<----<<----<<\"\r\n"
				+ "				+ \"----<<----\");");
	}
	
	
	//Gestiones
	public double establecerPrecioLavanderia (double precioLavanderia) {
		return precioLavanderia;
	}
	
	

}
