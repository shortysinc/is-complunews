package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionDaoSingleton {

	  protected static ConnectionDaoSingleton myInstanceOfSingleton;
	  public Connection conn;
	  private Statement statement;
	  
	public static ConnectionDaoSingleton getInstance() {
		 if(myInstanceOfSingleton == null) {
	         synchronized (ConnectionDaoSingleton.class) {
	            myInstanceOfSingleton = new ConnectionDaoSingleton();
	         }
	      }
	      return myInstanceOfSingleton;	// TODO Apéndice de método generado automáticamente
	}
	
	private ConnectionDaoSingleton()
	{
		 String url= "jdbc:mysql://localhost:3306/";
	        String dbName = "database_name";
	        String driver = "com.mysql.jdbc.Driver";
	        String userName = "username";
	        String password = "password";
	        try {
	            Class.forName(driver).newInstance();
	            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
	        }
	        catch (Exception sqle) {
	            sqle.printStackTrace();
	        }
	}
	
	  public static synchronized ConnectionDaoSingleton getDbCon() {
	        if ( myInstanceOfSingleton == null ) {
	        	myInstanceOfSingleton = new ConnectionDaoSingleton();
	        }
	        return myInstanceOfSingleton;
	 
	    }
	  
	  
	  public ResultSet query(String query) throws SQLException{
	        statement = myInstanceOfSingleton.conn.createStatement();
	        ResultSet res = statement.executeQuery(query);
	        return res;
	    }
	    /**
	     * Metodo para insertar datos en nuestras tablas
	     * @param insertQuery String The Insert query
	     * @return boolean
	     * @throws SQLException
	     */
	    public int insert(String insertQuery) throws SQLException {
	        statement = myInstanceOfSingleton.conn.createStatement();
	        int result = statement.executeUpdate(insertQuery);
	       
	        return result;
	 
	    }

}
