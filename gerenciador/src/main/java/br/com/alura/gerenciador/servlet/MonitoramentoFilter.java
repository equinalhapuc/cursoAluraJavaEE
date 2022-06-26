package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter(urlPatterns = "/entrada")
public class MonitoramentoFilter implements Filter {
	
	@Override
	public void init(javax.servlet.FilterConfig filterConfig) throws javax.servlet.ServletException {}
	
	@Override
	public void destroy() {}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Monitoramento ...");
		
		long antes = System.currentTimeMillis();
		
		// Executa a ação
		chain.doFilter(req, res);
		
		long depois = System.currentTimeMillis();
		System.out.println("Tempo decorrido - " + req.getParameter("acao") + ": " + (depois - antes) + " ms");
	}

}
