package br.com.testebuscape;

import br.com.testebuscape.enumeration.Direcao;

public class Posicao {

	private int pontoX;
	private int pontoY;
	private int pontoZ;
	private Direcao direcao;

	public Posicao(int pontoX, int pontoY, int pontoZ, Direcao direcao) {
		this.pontoX = pontoX;
		this.pontoY = pontoY;
		this.pontoZ = pontoZ;
		this.direcao = direcao;
	}

	public Posicao moveX(int movimento) {
		this.pontoX += movimento;
		return this;
	}

	public Posicao moveY(int movimento) {
		this.pontoY += movimento;
		return this;
	}

	public Posicao moveZ(int movimento) {
		this.pontoZ += movimento;
		return this;
	}

	public Posicao moveDirecao(Direcao novaDirecao) {
		this.direcao = novaDirecao;
		return this;
	}

	public int getPontoX() {
		return pontoX;
	}

	public void setPontoX(int pontoX) {
		this.pontoX = pontoX;
	}

	public int getPontoY() {
		return pontoY;
	}

	public void setPontoY(int pontoY) {
		this.pontoY = pontoY;
	}

	public int getPontoZ() {
		return pontoZ;
	}

	public void setPontoZ(int pontoZ) {
		this.pontoZ = pontoZ;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
}
