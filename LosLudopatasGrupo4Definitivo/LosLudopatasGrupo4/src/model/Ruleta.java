package model;

public class Ruleta {

	private int resultado;
	private int maxTamHistorico = 100;
	private int historicoLista[] = new int[maxTamHistorico];
	private int i = 0;


	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public int getMaxTamHistorico() {
		return maxTamHistorico;
	}

	public void setMaxTamHistorico(int maxTamHistorico) {
		this.maxTamHistorico = maxTamHistorico;
	}

	public int[] getHistoricoLista() {
		return historicoLista;
	}

	public void setHistoricoLista(int numero) {
		this.historicoLista[i] = numero;
		i++;
	}

}
