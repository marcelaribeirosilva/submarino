package br.com.testebuscape;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.testebuscape.enumeration.Direcao;

public class TesteSubmarinoTest {

	private Submarino submarino;

	@Before
	public void setUp() throws Exception {
		submarino = new Submarino();
	}

	@Test
	public void primeiroTeste() {
		Posicao posicao = submarino.realizaComandos("LMRDDMMUU");
		Posicao posicao2 = new Posicao(-1, 2, 0, Direcao.NORTE);

		assertEquals(posicao.getPontoX(), posicao2.getPontoX());
		assertEquals(posicao.getPontoY(), posicao2.getPontoY());
		assertEquals(posicao.getPontoZ(), posicao2.getPontoZ());
		assertEquals(posicao.getDirecao(), posicao2.getDirecao());
	}

	@Test
	public void segundoTeste() {
		Posicao posicao = submarino.realizaComandos("RMMLMMMDDLL");

		Posicao posicao2 = new Posicao(2, 3, -2, Direcao.SUL);

		assertEquals(posicao.getPontoX(), posicao2.getPontoX());
		assertEquals(posicao.getPontoY(), posicao2.getPontoY());
		assertEquals(posicao.getPontoZ(), posicao2.getPontoZ());
		assertEquals(posicao.getDirecao(), posicao2.getDirecao());
	}
}
