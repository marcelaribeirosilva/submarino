package br.com.testebuscape.enumeration;

public enum Movimento {

	L, R, M, U, D;

	public static boolean contains(char caracter) {
		Movimento mov = valueOf(caracter);
		return mov != null;
	}

	public static Movimento valueOf(char caracter) {
		try {
			return valueOf(String.valueOf(caracter));
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
}
