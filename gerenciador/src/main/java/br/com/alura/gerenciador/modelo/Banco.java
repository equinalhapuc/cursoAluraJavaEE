package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<Empresa>();
	
	public void adiciona(Empresa empresa) {
		empresas.add(empresa);
	}
	
	public static List<Empresa> getEmpresas() {
		return empresas;
	}

	public void removeEmpresa(int empresaId) {
		
		Optional<Empresa> empresaOptional = empresas.stream().filter( e -> e.getId().equals(empresaId)).findFirst();
		if(empresaOptional.isPresent()) {
			empresas.remove(empresaOptional.get());
		}
	}

	public Empresa buscaEmpresa(int id) {
		
		Optional<Empresa> empresaOpt = empresas.stream().filter( e -> e.getId().equals(id)).findFirst();
		
		if(empresaOpt.isPresent())
			return empresaOpt.get();
		
		return null;
	}
	
}
