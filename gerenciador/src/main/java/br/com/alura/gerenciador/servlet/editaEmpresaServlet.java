package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class editaEmpresaServlet
 */
@WebServlet("/editaEmpresa")
public class editaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataAbertura = request.getParameter("data");
		String empresaId = request.getParameter("id");
		int id = Integer.parseInt(empresaId);
		
		Banco banco = new Banco();
		
		
		@SuppressWarnings("unused")
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = banco.buscaEmpresa(id);
		
		empresa.setNome(nomeEmpresa);
		empresa.getDataAbertura();
		
		//banco.atualiza(empresa);
		
		response.sendRedirect("listaEmpresas");
		
	}

}
