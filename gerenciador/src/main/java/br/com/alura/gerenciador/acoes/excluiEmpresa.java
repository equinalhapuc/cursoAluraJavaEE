package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class excluiEmpresa {

	public static void executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int empresaId = Integer.parseInt(request.getParameter("id"));
		Banco banco = new Banco();
		
		banco.removeEmpresa(empresaId);
		
		response.sendRedirect("listaEmpresas");
		
	}

}
