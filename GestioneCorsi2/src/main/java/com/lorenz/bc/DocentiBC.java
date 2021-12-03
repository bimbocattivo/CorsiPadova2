package com.lorenz.bc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.lorenz.architecture.dao.DAOException;
import com.lorenz.architecture.dao.DocentiDAO;
import com.lorenz.architecture.model.Docenti;
import com.lorenz.dbacess.DBAccess;

public class DocentiBC {
	private Connection conn;
	
	public DocentiBC() throws ClassNotFoundException, DAOException, FileNotFoundException, IOException{
		conn = DBAccess.getConnection();
	}
	
	public Docenti[] getDocenti() throws DAOException {
		Docenti[] docenti =  null;
		try {
			docenti = DocentiDAO.getFactory().getAll(conn);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
		return docenti;
	}
	
	public Docenti getDocentiById(Docenti docente) throws DAOException {
		try {
			return DocentiDAO.getFactory().getById(conn, docente);
		} catch (SQLException sql) {
			throw new DAOException(sql);
		}
	}
}
