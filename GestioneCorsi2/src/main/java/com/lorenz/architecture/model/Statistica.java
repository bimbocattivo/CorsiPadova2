package com.lorenz.architecture.model;

import java.util.Date;

public class Statistica {
	private String CorsoFrequentato;
	private Date DataInizioUltimoCorso;
	private float DurataMediaDeiCorsi;
	private String Docentetipologie;
	private String CorsiPostiDisponibili;
	
	public String getCorsoFrequentato() {
		return CorsoFrequentato;
	}
	public void setCorsoFrequentato(String corsoFrequentato) {
		CorsoFrequentato = corsoFrequentato;
	}
	public Date getDataInizioUltimoCorso() {
		return DataInizioUltimoCorso;
	}
	public void setDataInizioUltimoCorso(Date dataInizioUltimoCorso) {
		DataInizioUltimoCorso = dataInizioUltimoCorso;
	}
	public float getDurataMediaDeiCorsi() {
		return DurataMediaDeiCorsi;
	}
	public void setDurataMediaDeiCorsi(float durataMediaDeiCorsi) {
		DurataMediaDeiCorsi = durataMediaDeiCorsi;
	}
	public String getDocentetipologie() {
		return Docentetipologie;
	}
	public void setDocentetipologie(String docentetipologie) {
		Docentetipologie = docentetipologie;
	}
	public String getCorsiPostiDisponibili() {
		return CorsiPostiDisponibili;
	}
	public void setCorsiPostiDisponibili(String corsiPostiDisponibili) {
		CorsiPostiDisponibili = corsiPostiDisponibili;
	}
	
	@Override
	public String toString() {
		return "Statistica [CorsoFrequentato=" + CorsoFrequentato + ", DataInizioUltimoCorso=" + DataInizioUltimoCorso
				+ ", DurataMediaDeiCorsi=" + DurataMediaDeiCorsi + ", Docentetipologie=" + Docentetipologie
				+ ", CorsiPostiDisponibili=" + CorsiPostiDisponibili + "]";
	}
	
}
