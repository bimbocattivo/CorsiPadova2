package com.lorenz.architecture.model;

public class Corsista {
	private String nomeCorsista;
	private String cognomeCorsista;
	private long codCorsista;
	private int precedentiFormativi; // solo SI o NO

	public String getNomeCorsista() {
		return nomeCorsista;
	}

	public void setNomeCorsista(String nomeCorsista) {
		this.nomeCorsista = nomeCorsista;
	}

	public String getCognomeCorsista() {
		return cognomeCorsista;
	}

	public void setCognomeCorsista(String cognomeCorsista) {
		this.cognomeCorsista = cognomeCorsista;
	}

	public long getCodCorsista() {
		return codCorsista;
	}

	public void setCodCorsista(long codCorsista) {
		this.codCorsista = codCorsista;
	}

	public int getPrecedentiFormativi() {
		return precedentiFormativi;
	}

	public void setPrecedentiFormativi(int precedentiFormativi) {
		this.precedentiFormativi = precedentiFormativi;
	}

	@Override
	public String toString() {
		return "Corsista [codCorsista=" + codCorsista + ", nomeCorsista=" + nomeCorsista + ", cognomeCorsista="
				+ cognomeCorsista + ", precedentiFormativi=" + precedentiFormativi + "]";
	}
}
