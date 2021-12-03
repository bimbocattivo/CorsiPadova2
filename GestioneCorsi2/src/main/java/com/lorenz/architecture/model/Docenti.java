package com.lorenz.architecture.model;

public class Docenti {
	private String nome;
	private String cognome;
	private String curriculum;
	private int codDocente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}
	public int getCodDocente() {
		return codDocente;
	}
	public void setCodDocente(int codDocente) {
		this.codDocente = codDocente;
	}
	
	
	@Override
	public String toString() {
		return "Docenti [nome=" + nome + ", cognome=" + cognome + ", curriculum=" + curriculum + ", codDocente="
				+ codDocente + "]";
	}
	
	
}
