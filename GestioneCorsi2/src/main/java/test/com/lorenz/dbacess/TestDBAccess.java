package test.com.lorenz.dbacess;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.lorenz.architecture.dao.DAOException;
import com.lorenz.dbacess.DBAccess;

class TestDBAccess {

	@Test
	void testConnection() {
		try {
			DBAccess.getConnection();
		} catch ( DAOException | ClassNotFoundException | IOException exc) {
			exc.printStackTrace();
			fail("Connessione non funzionante");
		} finally {
			try {
				DBAccess.closeConnection();
			} catch(DAOException exc) {
				exc.printStackTrace();
				fail("Impossibile chiudere la connessione");
			}
		}
	}

}
