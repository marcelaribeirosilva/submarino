package br.com.testebuscape;

import java.util.Scanner;

public class TesteSubmarino {

	public static void main(String[] args) {

		Scanner scannerComandos = new Scanner(System.in);

		System.out.println("Entre aqui com os comandos para o submarino");

		String comandos = scannerComandos.next();
		
		scannerComandos.close();

		Submarino submarino = new Submarino();
		
		Posicao posicao = submarino.realizaComandos(comandos);
		
		if(posicao != null) {
			System.out.println(posicao.getPontoX() + ", " + posicao.getPontoY() + ", " + posicao.getPontoZ() + ", " + posicao.getDirecao());
		} else {
			System.out.println("Comando informado invalido");
		}
	}
}
