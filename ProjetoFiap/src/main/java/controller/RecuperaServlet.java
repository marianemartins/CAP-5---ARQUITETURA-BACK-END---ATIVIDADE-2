package controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// import ...
import model.Teatro;


@WebServlet("/recupera.do")
public class RecuperaServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, 
                HttpServletResponse response) 
             throws IOException, ServletException {
/* Bloco 1 - iniciando um vetor de usu�rios para simular um Banco
             de Dados */
		ArrayList<Teatro> bd = new ArrayList<Teatro>();
		bd.add(new Teatro(1,"Teatro Claro",
                             "Bela e a Fera"));
		bd.add(new Teatro(2,"Teatro West Plaza",
                             "Her�is! O incr�vel musical"));
		bd.add(new Teatro(3,"Teatro West Plaza", 
                             "Qcom�dia stand-up"));
		bd.add(new Teatro(4,"Teatro Gazeta", 
                             "Um Picasso"));
/* Bloco 2 - simulando a recupera��o do banco (s� que no vetor)*/
		
		// recuperando o ID da requisi��o
		int id = Integer.parseInt(
                           request.getParameter("id"));
		Teatro result = null;
		for (Teatro user : bd) {
			if (user.getId() == id) {
				result = user;
				break;
			}
		}
/* Bloco 3 - Definindo qual p�gina ser� exibida em fun��o do que foi recuperado */
		String paginaDestino;
		if (result != null) 
		{
			request.setAttribute("Teatro", result);
			paginaDestino ="/info.jsp";
		}
		else {
			paginaDestino  ="/erro.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(paginaDestino);
		dispatcher.forward(request, response);
	}

}