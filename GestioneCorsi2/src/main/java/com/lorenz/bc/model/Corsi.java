package com.lorenz.bc.model;

import java.util.Date;

public class Corsi {
	private long codCorso;
	private String nomeCorso;
	private String CommentiCorso;
	private String aulaCorso;
	private double costoCorso;
	private long codDocente;
	private Date dataInizioCorso;
	private Date dataFineCorso;
	


	public long getCodCorso() {
		return codCorso;
	}

	public void setCodCorso(long codCorso) {
		this.codCorso = codCorso;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public String getCommentiCorso() {
		return CommentiCorso;
	}

	public void setCommentiCorso(String commentiCorso) {
		CommentiCorso = commentiCorso;
	}

	public String getAulaCorso() {
		return aulaCorso;
	}

	public void setAulaCorso(String aulaCorso) {
		this.aulaCorso = aulaCorso;
	}

	public double getCostoCorso() {
		return costoCorso;
	}

	public void setCostoCorso(double costoCorso) {
		this.costoCorso = costoCorso;
	}

	public long getCodDocente() {
		return codDocente;
	}

	public void setCodDocente(long codDocente) {
		this.codDocente = codDocente;
	}

	public Date getDataInizioCorso() {
		return dataInizioCorso;
	}

	public void setDataInizioCorso(Date dataInizioCorso) {
		this.dataInizioCorso = dataInizioCorso;
	}

	public Date getDataFineCorso() {
		return dataFineCorso;
	}

	public void setDataFineCorso(Date dataFineCorso) {
		this.dataFineCorso = dataFineCorso;
	}
	
	
	
	
	
	
	

}
