package model;

public record Endereco(String localidade, String uf) {
    @Override
	public String toString() {
		return "Localidade: " + localidade + ", UF: " + uf;
	}
}
