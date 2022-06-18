package br.com.alura.gerenciador.acoes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class listaEmpresas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		Banco banco = new Banco();
		List<Empresa> empresas = Banco.getEmpresas();
		
		PrintWriter writer = response.getWriter();
		request.setAttribute("empresas", empresas);
			
		return "forward:listaEmpresas.jsp";
		
	}

	
}
