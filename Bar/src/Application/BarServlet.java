package Application;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.WSService.InitParams;

import Business.Bar;
import Persistence.BarPersistence;

/**
 * Servlet implementation class BarServlet
 */
@WebServlet("/BarServlet")
public class BarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BarPersistence barP = new BarPersistence();
    private Bar bar = new Bar();
    private String cpfConsulta = "";
  
    public BarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if(request.getParameter("report").equals("radioComp")){
			System.out.println("Teste: "+bar.getClientesNoBar().get(0).getCpf());			
			response.sendRedirect("ListaCompleta.jsp");
		}else
			if(request.getParameter("report").equals("radioCpf")){
				
				bar.setCpfCons(request.getParameter("textPCpf"));
				response.sendRedirect("PorCpf.jsp");
			}else{
				response.sendRedirect("Qtde.jsp");
			}
				
	
		
	}


}
