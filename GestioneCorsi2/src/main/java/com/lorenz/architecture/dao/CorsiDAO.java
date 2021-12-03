package com.lorenz.architecture.dao;

import java.sql.Connection;

import javax.sql.rowset.CachedRowSet;

import com.lorenz.bc.model.Corsi;

public class CorsiDAO implements GenericDAO<Corsi>, DAOConstants{
	
	CachedRowSet rowSet;
	
	public static CorsiDAO getFactory () throws DAOException {
		return new CorsiDAO();
	}
	@Override
	public void create(Connection conn, Corsi model) throws DAOException {
		// TODO Auto-generated method stub
		//ahahhasd
	}

	@Override
	public void update(Connection conn, Corsi model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, Corsi model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Corsi[] getAll(Connection conn) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Corsi getById(Connection conn, Corsi model) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
