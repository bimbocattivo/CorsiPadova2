package com.lorenz.bc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

import com.lorenz.architecture.dao.CorsiDAO;
import com.lorenz.architecture.dao.DAOException;
import com.lorenz.bc.idgenerator.IdGeneratorCorsi;
import com.lorenz.bc.model.Corsi;
import com.lorenz.dbacess.DBAccess;



public class CorsiBC {
	private IdGeneratorCorsi idGen;
	private Connection conn;
	
	public CorsiBC() throws ClassNotFoundException, DAOException, FileNotFoundException, IOException {
		conn=DBAccess.getConnection();
		idGen=IdGeneratorCorsi.getInstance();
	}
	
	
	public Corsi[] getCorsi() throws DAOException {
		return CorsiDAO.getFactory().getAll(conn);
	}

}
