package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuario;

public class login implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario usuario = banco.validaUsuario(login, senha);
		
		if(usuario != null) {
			HttpSession sessao = request.getSession();
			// session persiste por múltiplas requisições
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=listaEmpresas";
		}
		
		return "forward:formLogin.jsp";
	}

}
