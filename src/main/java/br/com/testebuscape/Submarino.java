package br.com.testebuscape;

import static br.com.testebuscape.enumeration.Direcao.NORTE;
import br.com.testebuscape.enumeration.Direcao;
import br.com.testebuscape.enumeration.Movimento;

public class Submarino {

	private Posicao posicao;

	public Submarino() {
		this(0, 0, 0, NORTE);
	}

	public Submarino(int pontoX, int pontoY, int pontoZ, Direcao direcaoInicial) {
		posicao = new Posicao(pontoX, pontoY, pontoZ, direcaoInicial);
	}

	public Posicao realizaComandos(String comandos) {

		for (char caracter : comandos.toCharArray()) {
			
			if (Movimento.contains(caracter)) {

				Movimento movimento = Movimento.valueOf(caracter);

				switch (movimento) {
				case L:
					moveEsquerda(posicao.getDirecao());
					break;
				case R:
					moveDireita(posicao.getDirecao());
					break;
				case M:
					posicao = posicao.moveX(posicao.getDirecao().getPontoX());
					posicao = posicao.moveY(posicao.getDirecao().getPontoY());
					break;
				case U:
					if (posicao.getPontoZ() < 0) {
						posicao = posicao.moveZ(1);
					}
					break;
				case D:
					posicao = posicao.moveZ(-1);
					break;
				}
				
			} else {
				return null;
			}
		}

		return posicao;
	}

	private void moveEsquerda(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			posicao.moveDirecao(Direcao.OESTE);
			break;
		case OESTE:
			posicao.moveDirecao(Direcao.SUL);
			break;
		case SUL:
			posicao.moveDirecao(Direcao.LESTE);
			break;
		case LESTE:
			posicao.moveDirecao(Direcao.NORTE);
			break;
		}
	}

	private void moveDireita(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			posicao.moveDirecao(Direcao.LESTE);
			break;
		case LESTE:
			posicao.moveDirecao(Direcao.SUL);
			break;
		case SUL:
			posicao.moveDirecao(Direcao.OESTE);
			break;
		case OESTE:
			posicao.moveDirecao(Direcao.NORTE);
			break;
		}
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
}
