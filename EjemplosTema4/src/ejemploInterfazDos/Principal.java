package ejemploInterfazDos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IInstrumento [] orquesta = new IInstrumento [5];
		int i = 0;
		
		orquesta[i++] = new Guitarra();
		orquesta[i++] = new Piano();
		orquesta[i++] = new Saxo();
		orquesta[i++] = new Guzla();
		orquesta[i++] = new Ukelele();
		
		Musica3.afinarTodo(orquesta);
	}

}
