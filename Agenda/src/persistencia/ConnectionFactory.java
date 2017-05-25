package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {

	public static Connection getConnection() throws ClassNotFoundException{
		String server = "localhost";
		String port = "1521";
		String database = "Agenda";

		String user = "system";
		String password = "root";	

		try{	
			Class.forName("oracle.jdbc.driver.OracleDriver");		
			
			Connection con = DriverManager.getConnection(
							 //"jdbc:oracle:thin:@"+server+":"+port+
							 //":"+database+":"+user+":"+password);	

                       "jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
	
			return con;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}