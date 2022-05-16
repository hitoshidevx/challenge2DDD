package br.com.grupo04.models;

import br.com.gabriel.grupo04.enums.EnumTipoUsuario;

public class Candidato extends Usuario {
	
	private Curriculo curriculo;
	public EnumTipoUsuario tipoUsuario = EnumTipoUsuario.CANDIDATO;
	
	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

	public Candidato() {}
	
	public Candidato(Curriculo curriculo) {
		this.curriculo = curriculo;
	}
	
	public void AlterarTipoUsuario(Candidato cd) {
		cd.setTipoUsuario(EnumTipoUsuario.EMPRESA);
		cd.curriculo.setSkills(null);
		System.out.println("\nSeu tipo de usuário foi alterado.\nSuas skills foram anuladas.\n");
	}
	
	public String ExibirNomeEmailETelefone() {
		return "Nome: " + nome + " - " + "Email: " + email + " - " + "Telefone: " + telefone;
	}
	
}
