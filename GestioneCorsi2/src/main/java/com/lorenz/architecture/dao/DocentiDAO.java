package com.lorenz.architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;

import com.lorenz.architecture.model.Docenti;

public class DocentiDAO implements DAOConstants, GenericDAO<Docenti>{
	
	private CachedRowSet rowSet;
	
	public static DocentiDAO getFactory() throws DAOException{
		return new DocentiDAO();
	}

	@Override
	public void create(Connection conn, Docenti model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Connection conn, Docenti model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Connection conn, Docenti model) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Docenti[] getAll(Connection conn) throws DAOException {
		Docenti[] docenti = null;
		try {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(SELECT_DOCENTI);
			rs.last();
			docenti = new Docenti[rs.getRow()];
			rs.beforeFirst();
			
			for (int i=0; rs.next(); i++) {
				Docenti d = new Docenti();
				d.setNome(rs.getString(1));
				d.setCognome(rs.getString(2));
				d.setCurriculum(rs.getString(3));
				d.setCodDocente(rs.getInt(4));
				docenti[i] = d;
			}
			rs.close();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return docenti;
	}

	@Override
	public Docenti getById(Connection conn, Docenti model) throws DAOException {
		Docenti docente = null;
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SELECT_DOCENTI_BY_ID);
			ps.setInt(1, model.getCodDocente());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				docente = new Docenti();
				docente.setNome(rs.getString(1));
				docente.setCognome(rs.getString(2));
				docente.setCurriculum(rs.getString(3));
				docente.setCodDocente(rs.getInt(4));
			}
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return docente;
	}
	
}
