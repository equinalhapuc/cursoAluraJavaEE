package br.com.alura.gerenciador.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<Empresa>();
	private static List<Usuario> usuarios = new ArrayList<Usuario>();

	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			empresa.setDataAbertura(sdf.parse("01/01/2001"));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		empresas.add(empresa);

		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			empresa2.setDataAbertura(sdf.parse("01/02/2002"));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		empresas.add(empresa2);

		Usuario user1 = new Usuario();
		user1.setLogin("user1");
		user1.setSenha("teste123");

		usuarios.add(user1);

		Usuario user2 = new Usuario();
		user2.setLogin("user2");
		user2.setSenha("teste123");

		usuarios.add(user2);
	}

	public void adiciona(Empresa empresa) {
		empresas.add(empresa);
	}

	public static List<Empresa> getEmpresas() {
		return empresas;
	}

	public void removeEmpresa(int empresaId) {

		Optional<Empresa> empresaOptional = empresas.stream().filter(e -> e.getId().equals(empresaId)).findFirst();
		if (empresaOptional.isPresent()) {
			empresas.remove(empresaOptional.get());
		}
	}

	public Empresa buscaEmpresa(int id) {

		Optional<Empresa> empresaOpt = empresas.stream().filter(e -> e.getId().equals(id)).findFirst();

		if (empresaOpt.isPresent())
			return empresaOpt.get();

		return null;
	}

	public Usuario validaUsuario(String login, String senha) {

		Optional<Usuario> usuarioOptional = usuarios.stream()
				.filter(u -> u.ehIgual(login, senha)).findFirst();

		Usuario usuario = null;

		if (usuarioOptional.isPresent())
			usuario = usuarioOptional.get();

		return usuario;
	}

}
