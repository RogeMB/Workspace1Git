package ejemploInterfazDos;

public class Musica3 {

	
	static void afinar (IInstrumento i) {
		i.tocar();
	}
	
	static void afinarTodo (IInstrumento[] e) {
		for (int i = 0; i < e.length; i++) {
			afinar (e[i]);
		}
	}
}
