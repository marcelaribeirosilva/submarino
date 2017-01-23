package br.com.testebuscape.enumeration;

public enum Direcao {

	NORTE(0, 1), SUL(0, -1), LESTE(1, 0), OESTE(-1, 0);

	private int pontoX;
	private int pontoY;

	Direcao(int pontoX, int pontoY) {
		this.pontoX = pontoX;
		this.pontoY = pontoY;
	}

	public int getPontoX() {
		return pontoX;
	}

	public int getPontoY() {
		return pontoY;
	}

}
