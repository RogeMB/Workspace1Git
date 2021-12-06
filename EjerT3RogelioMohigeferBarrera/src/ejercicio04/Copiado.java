package ejercicio04;

public class Copiado {
	
	int copias;
	String texto = "";
	
	public Copiado (String texto, int copias) {
		this.texto = texto;
		this.copias = copias;
	}
	
	public void ImprimirTexto () {
		for (int i=0; i<copias; i++) {
			System.out.println(texto);
		}
	}
}
