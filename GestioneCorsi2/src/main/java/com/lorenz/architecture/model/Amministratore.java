package com.lorenz.architecture.model;

public class Amministratore {

	private String nomeadmin;
	private String cognomeadmin;
	private String codaming;
	
	public String getNomeadmin() {
		return nomeadmin;
	}
	public void setNomeadmin(String nomeadmin) {
		this.nomeadmin = nomeadmin;
	}
	public String getCognomeadmin() {
		return cognomeadmin;
	}
	public void setCognomeadmin(String cognomeadmin) {
		this.cognomeadmin = cognomeadmin;
	}
	public String getCodaming() {
		return codaming;
	}
	public void setCodaming(String codaming) {
		this.codaming = codaming;
	}
	
	@Override
	public String toString() {
		return "admin [nomeadmin=" + nomeadmin + ", cognomeadmin=" + cognomeadmin + ", codaming=" + codaming + "]";
	}
	
}
