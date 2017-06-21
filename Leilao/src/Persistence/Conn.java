package Persistence;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author João França
 */
abstract class Conn {    
	private void CadastroDAOJavaDb() throws SQLException {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException ex) {
		}
	}    

	private static Connection getConnection() throws SQLException {
		//derbyDB sera o nome do diretorio criado localmente
		return DriverManager.getConnection("jdbc:derby:derbyDB");
	}	
 
	public static void main(String[] args) throws SQLException {
			
	}
	
}