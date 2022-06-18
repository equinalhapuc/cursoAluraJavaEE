package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class excluiEmpresa {

	public static String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int empresaId = Integer.parseInt(request.getParameter("id"));
		Banco banco = new Banco();
		
		banco.removeEmpresa(empresaId);
		
		return "redirect:entrada?acao=listaEmpresas";
		
	}

}
