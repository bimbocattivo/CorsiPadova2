package com.lorenz.architecture.model;

public class CorsoCorsista {
	private long idCorsista;
	private long idCorso;
	
	
	public long getIdCorsista() {
		return idCorsista;
	}
	public void setIdCorsista(long idCorsista) {
		this.idCorsista = idCorsista;
	}
	public long getIdCorso() {
		return idCorso;
	}
	public void setIdCorso(long idCorso) {
		this.idCorso = idCorso;
	}
	
	@Override
	public String toString() {
		return "CorsoCorsista [idCorsista=" + idCorsista + ", idCorso=" + idCorso + "]";
	}
	
	
}
