package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acoes.Acao;

public class ControladorFilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		System.out.println("Controlador ...");
		
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
