package com.lorenz.architecture.dao;

import java.sql.SQLException;

public class DAOException extends SQLException{
  //perchè le eccezini sono serializzate
  private static final long serialVersionUID = 1068727244741722006L;
  
  //quando si sbagliano le credenziali al db si usa l eccezione 1017
  private final static int ORA1017 = 1017;
  //quando non si connette ad oracle
  private final static int ORA17002 = 17002;
  //violazione di vincolo della tabella --> + importante
  private final static int ORA00001 = 0;
  
  private String message;

  @Override
  public String getMessage() {
    return message;
  }
  
  public DAOException(SQLException sql) {
    String chiave = "";
    if(sql != null) {
      switch (sql.getErrorCode()) {
      case ORA1017:
        chiave = "Username / password errati";
        log(sql);
        break;
      case ORA17002:
        chiave = "I/O exception di Oracle DB";
        log(sql);
        break;  
      case ORA00001:
        chiave = "Vincolo di tabella violato";
        log(sql);
        break;  
      default:
        chiave = "Eccezione SQL non prevista";
        log(sql);
        break;
      }
    }
    message = chiave;
  }

  private void log(SQLException sql) {
    sql.printStackTrace();
    System.err.print("Motivo: "+sql.getMessage());
    //se l operazione sql è stata richiamata in un punto sbagliato -->getSQLState
    System.err.print("Stato dell'applicazione: "+sql.getSQLState());
    System.err.print("Error code: "+sql.getErrorCode());
    //simile al printstacktrace però posso usarlo dentro al jsp
    System.err.print("Causa dell'errore: "+sql.getCause());
  }
}