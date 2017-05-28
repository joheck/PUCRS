package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import gui.ContatosView;
import negocio.Contatos;

public class ContatosDAOoracle implements ContatosDAO {

	Connection connection;

	public ContatosDAOoracle() throws ClassNotFoundException {
		this.connection = ConnectionFactory.getConnection();		
	}

	public int contId(){

		int cont = 0;
		String sql = "SELECT * FROM CONTATOS";		
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();	
			while(result.next()){
				result.getString("nome");
				cont++;			
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cont+1;		
	}

	public  Connection getConnection(){
		return connection;
	}

	@Override
	public void armazenarContato(String nome, String numeroTelefone) {
		String sql = "insert into contatos" +
				"(id_contatos, nome, telefone) "+
				"values (?, ?, ?)";
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			System.out.println(this.getContatosOrdemAlfabetica().size()+1);
			stmt.setInt(1, contId()+1);
			stmt.setString(2, nome.toUpperCase());
			stmt.setString(3, numeroTelefone);
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Contato inserido com sucesso!", "Persistencia", 1);
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();					
		}
	}

	@Override
	public String getTelefonePorNome(String nome) {
		String sql = "SELECT C.TELEFONE FROM "
				+ "CONTATOS C WHERE C.NOME = ? ";			
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, nome.toUpperCase());
			ResultSet result =  stmt.executeQuery();
			result.next();
			return result.getString("telefone");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "'"+nome+ "' não encontrado na agenda.", "Persistencia", 0);
		}					
		return null;
	}

	@Override
	public ArrayList<ContatosView> getContatosOrdemAlfabetica() {

		ArrayList<ContatosView> contatos = new ArrayList<ContatosView>();		
		String sql = "SELECT * FROM CONTATOS ORDER BY NOME";
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();

			while(result.next()){				
				String nome = result.getString("nome");
				String telefone = result.getString("telefone");
				contatos.add(new ContatosView(nome, telefone));				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("lll");
		}
		return contatos;
	}
}