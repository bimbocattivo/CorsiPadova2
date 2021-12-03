package com.lorenz.architecture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.lorenz.architecture.model.Corsista;

public class CorsistaDAO implements GenericDAO<Corsista>, DAOConstants {
	private CachedRowSet rowSet;

	private CorsistaDAO() throws DAOException {
		try {
			rowSet = RowSetProvider.newFactory().createCachedRowSet();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public static CorsistaDAO getFactory() throws DAOException {
		return new CorsistaDAO();
	}

	@Override
	public void create(Connection conn, Corsista model) throws DAOException {
		try {
			rowSet.setCommand(SELECT_CORSISTI);
			rowSet.execute(conn);
			rowSet.moveToInsertRow();
			
			rowSet.updateString(1, model.getNomeCorsista());
			rowSet.updateString(2, model.getCognomeCorsista());
			rowSet.updateLong(3, model.getCodCorsista());
			rowSet.updateInt(4, model.getPrecedentiFormativi());
			
			rowSet.insertRow();
			rowSet.moveToCurrentRow();
			rowSet.acceptChanges();
		} catch (SQLException e) {
			throw new DAOException(e);
		}

	}

	@Override
	public void update(Connection conn, Corsista model) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Connection conn, Corsista model) throws DAOException {
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(DELETE_CORSISTI);
			ps.setLong(1, model.getCodCorsista());
			ps.execute();
			conn.commit();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	@Override
	public Corsista[] getAll(Connection conn) throws DAOException {
		Corsista[] corsisti = null;
		try {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(SELECT_CORSISTI);
			rs.last();
			corsisti = new Corsista[rs.getRow()];
			rs.beforeFirst();

			for (int i = 0; rs.next(); i++) {
				Corsista c = new Corsista();
				c.setNomeCorsista(rs.getString(1));
				c.setCognomeCorsista(rs.getString(2));
				c.setCodCorsista(rs.getLong(3));
				c.setPrecedentiFormativi(rs.getInt(4));
				corsisti[i] = c;
			}
			rs.close();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
		return corsisti;
	}

	@Override
	public Corsista getById(Connection conn, Corsista model) throws DAOException {
		Corsista corsista = null;
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SELECT_CORSISTI_BY_ID);
			ps.setLong(1, model.getCodCorsista());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				corsista = new Corsista();
				corsista.setNomeCorsista(rs.getString(1));
				corsista.setCognomeCorsista(rs.getString(2));
				corsista.setCodCorsista(rs.getLong(3));
				corsista.setPrecedentiFormativi(rs.getInt(4));
			}
		} catch (SQLException e) {
			throw new DAOException(e);
		}
		return corsista;
	}

}
