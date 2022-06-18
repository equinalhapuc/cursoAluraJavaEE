package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acoes.alteraEmpresa;
import br.com.alura.gerenciador.acoes.criaNovaEmrpesa;
import br.com.alura.gerenciador.acoes.excluiEmpresa;
import br.com.alura.gerenciador.acoes.listaEmpresas;
import br.com.alura.gerenciador.acoes.mostraEmpresa;

@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		switch(paramAcao) {
		case "listaEmpresas":
			listaEmpresas.executa(request, response);
			break;
		
		case "criaNovaEmpresa":
			criaNovaEmrpesa.executa(request, response);
			break;
			
		case "mostraEmpresa":
			mostraEmpresa.executa(request, response);
			break;
			
		case "alteraEmpresa":
			alteraEmpresa.executa(request, response);
			break;
			
		case "excluiEmpresa":
			excluiEmpresa.executa(request, response);
				break;
		default:
			break;
		}
			
	}

}
