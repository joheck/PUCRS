package Application;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Business.Bar;
import Business.Clientes;
import Persistence.BarPersistence;


@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static Clientes cliente;
	Bar bar = new Bar();
	BarPersistence barPersistence = new BarPersistence();
  
    public ClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		int idade = Integer.parseInt(request.getParameter("idade")); 
		String parse = request.getParameter("genero");
		char genero = parse.charAt(0);
		int socio = 0;
		if(request.getParameter("socio") != null )
		socio = Integer.parseInt(request.getParameter("socio"));		
		
		this.cliente = new Clientes(nome, cpf, idade, genero, socio);
		System.out.println(cliente);
		bar.entradaClientes(cliente);
		response.sendRedirect("form.jsp");
	}

}