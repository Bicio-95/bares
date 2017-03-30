package bares;

public enum genero {
	M("Masculino"), F("Feminino");

	private String nomeGenero;

	public String getNomeCategoria() {
		return nomeGenero;
	}

	genero(String nome) {
		nomeGenero = nome;
	}
}