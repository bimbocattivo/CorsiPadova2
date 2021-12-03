package com.lorenz.architecture.dao;

import java.sql.Connection;
import java.util.Date;


import com.lorenz.architecture.model.Statistica;

public class StatisticheDAO implements GenericDAO<Statistica> {
	

	public String  getCorsoFrequentato(Connection conn) throws DAOException {
		return null;
		
	}
	

	public Date getDataInizioUltimoCorso(Connection conn) throws DAOException {
		return null;
		
	}

	public float getDurataMediaCorsi(Connection conn) throws DAOException {
		return 0;
		
	}
	
	public String getDocenteTipologie(Connection conn) throws DAOException {
		return null;

		
	}
	public String getCorsiPostiDisponibili(Connection conn) throws DAOException {
		return null;
		
	}


	@Override
	public void create(Connection conn, Statistica model) throws DAOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Connection conn, Statistica model) throws DAOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Connection conn, Statistica model) throws DAOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Statistica[] getAll(Connection conn) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Statistica getById(Connection conn, Statistica model) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
}
