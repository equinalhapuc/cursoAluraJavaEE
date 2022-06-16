package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<Empresa>();
	
	public void adiciona(Empresa empresa) {
		empresas.add(empresa);
	}
	
	public static List<Empresa> getEmpresas() {
		return empresas;
	}
	
}
