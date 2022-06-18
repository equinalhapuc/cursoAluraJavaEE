package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acoes.Acao;

@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		String nomeClasse = "br.com.alura.gerenciador.acoes." + paramAcao;
		String returnAction = null;
		
		// Carrega a classe com o respectivo nome
		Class classe;
		Acao acao = null;
		try {
			classe = Class.forName(nomeClasse);
			acao = (Acao)classe.newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			throw new ServletException(e);
		}
		
		returnAction = acao.executa(request, response);
			
		String action = returnAction.split(":")[0];
		String view = returnAction.split(":")[1];
		
		if(action.equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + view);
			rd.forward(request, response);
		}
		else {
			response.sendRedirect(view);
		}
	}
}
