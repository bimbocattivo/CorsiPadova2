package test.com.lorenz.architecture.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.util.Iterator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lorenz.architecture.dao.DAOException;
import com.lorenz.architecture.dao.DocentiDAO;
import com.lorenz.architecture.model.Docenti;
import com.lorenz.dbacess.DBAccess;

class DocentiDAOTest {
	private static Docenti docente;
	private static Connection conn;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		conn = DBAccess.getConnection();
		docente = new Docenti();
		docente.setCodDocente(3);
	}
	
	@Test
	void testGetByID() {
		try {
			Docenti doc = new Docenti();
			doc = DocentiDAO.getFactory().getById(conn, docente);
			System.out.println("----------get by id----------");
			System.out.println(doc.getNome());
			System.out.println(doc.getCognome());
			System.out.println(doc.getCurriculum());
			
		}catch (DAOException exc) {
			exc.printStackTrace();
			fail(exc.getMessage());
		}
	}
	
	@Test
	void testGetAll() {
		try {
			Docenti[] docenti = DocentiDAO.getFactory().getAll(conn);
			for(Docenti d: docenti) {
				System.out.println("----------get All----------");
				System.out.println(d.getNome());
				System.out.println(d.getCognome());
				System.out.println(d.getCurriculum());
				System.out.println(d.getCodDocente());
				System.out.println("------------------");
			}
			assertNotNull(docenti);
		} catch (DAOException exc) {
			exc.printStackTrace();
			fail(exc.getMessage());
		}
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		docente = null;
		DBAccess.closeConnection();
	}

	

}
