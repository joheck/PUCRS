import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConncetionDAO {

	public Connection getConnection() throws SQLException, ClassNotFoundException{
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
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection c  = new ConncetionDAO().getConnection();
	
		String sql = "insert into funcionarios (nome) values ('Otavio')";
		PreparedStatement s = c.prepareStatement(sql);
		s.executeQuery();
	}
}
