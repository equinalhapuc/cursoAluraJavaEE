package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class mostraEmpresa {

	public static String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresa(id);
		request.setAttribute("empresa", empresa);
			
		return "forward:mostraEmpresa.jsp";
		
	}

}
