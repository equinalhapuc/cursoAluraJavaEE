package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

@WebServlet("/removeEmpresa")
public class removeEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empresaId = Integer.parseInt(request.getParameter("id"));
		Banco banco = new Banco();
		
		banco.removeEmpresa(empresaId);
		
		response.sendRedirect("listaEmpresas");
	}

}
