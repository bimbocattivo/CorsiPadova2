package com.lorenz.architecture.dao;

public interface DAOConstants {
	//--------DOCENTI--------
	String SELECT_DOCENTI_BY_ID = "Select * from docenti where coddocente = ?";
	String SELECT_DOCENTI = "Select * from docenti";
	
	//--------CORSI--------
	
	
	//--------CORSI_CORSISTI--------
	String SELECT_CORSO_CORSISTA = "Select * from corso_corsista";
	String SELECT_CORSO_CORSISTA_BY_ID = "Select * from corso_corsista where corso_id = ?";
	String INSERT_CORSO_CORSISTA = "Insert into corso_corsista values(?,?)";
	String DELETE_CORSO_CORSISTA = "delete from corso_corsista where corso_id = ?";
	
	//--------CORSISTI--------
	String SELECT_CORSISTI = "Select * from corsisti";
	String SELECT_CORSISTI_BY_ID = "Select * from corsisti where codcorsista = ?";
	String DELETE_CORSISTI = "Delete from corsisti where codcorsista = ?";
	
	//--------AMMINISTRATORI--------
	
	
	//--------STATISTICHE--------
	String INIZIO_ULTIMO_CORSO = "select max(DATAINIZIOCORSO) from corsi";
	
	//--------SEQUENZE--------
	String SELECT_CORSISTA_SEQ = "Select corsisti_seq.nextval from dual";
	String SELECT_CORSO_SEQ = "Select corsi_seq.nextval from dual";
}
