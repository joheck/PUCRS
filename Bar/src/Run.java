import Persistence.*;
import Business.*;
import UIInterface.*;
public class Run {

	public static void main(String[] args) {

		Bar bar = new Bar();
		Clientes cliente = new Clientes("João", "344545", 23, 'M');
		Clientes cliente2 = new Clientes("Maria", "543345", 25, 'F');
		Clientes cliente3 = new Clientes("Debora", "6535", 22, 'F');
		
		bar.entradaCliente(cliente3);
		

		bar.gravaClientesDoDia();


	}
}
