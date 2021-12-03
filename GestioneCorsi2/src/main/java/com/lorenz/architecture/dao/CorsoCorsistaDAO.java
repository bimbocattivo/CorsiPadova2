package com.lorenz.architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.lorenz.architecture.model.CorsoCorsista;

public class CorsoCorsistaDAO implements GenericDAO<CorsoCorsista>, DAOConstants{
	private CachedRowSet rowSet;
	
	private CorsoCorsistaDAO() throws DAOException{
		try {
			rowSet = RowSetProvider.newFactory().createCachedRowSet();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
	}
	
	public static CorsoCorsistaDAO getFactory() throws DAOException{
		return new CorsoCorsistaDAO();
	}
	
	@Override
	public void create(Connection conn, CorsoCorsista model) throws DAOException {
		try {
			rowSet.setCommand(SELECT_CORSO_CORSISTA);
			rowSet.execute(conn);
			rowSet.moveToInsertRow();
			rowSet.updateLong(1, model.getIdCorso());
			rowSet.updateLong(2, model.getIdCorso());
			rowSet.insertRow();
			rowSet.moveToCurrentRow();
			rowSet.acceptChanges();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}	
	}

	@Override
	public void update(Connection conn, CorsoCorsista model) throws DAOException {
		try {
			rowSet.setCommand(SELECT_CORSO_CORSISTA);
			rowSet.execute(conn);	
			rowSet.updateLong(1, model.getIdCorso());
			rowSet.updateLong(2, model.getIdCorsista());
			rowSet.insertRow();
			rowSet.moveToCurrentRow();
			rowSet.acceptChanges();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		
	}

	@Override
	public void delete(Connection conn, CorsoCorsista model) throws DAOException {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(DELETE_CORSO_CORSISTA);
			ps.setLong(1, model.getIdCorso());
			ps.execute();
			conn.commit();
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
	}

	@Override
	public CorsoCorsista[] getAll(Connection conn) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CorsoCorsista getById(Connection conn, CorsoCorsista model) throws DAOException {
		CorsoCorsista cc = null;
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SELECT_CORSO_CORSISTA_BY_ID);
			ps.setLong(1, model.getIdCorso());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cc = new CorsoCorsista();
				cc.setIdCorso(rs.getLong(1));
				cc.setIdCorsista(rs.getLong(2));
			}
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return cc;
	}
	
}
