package br.com.grupo04.models;

import br.com.gabriel.grupo04.enums.EnumTipoUsuario;

public class Candidato extends Usuario {
	
	private int id;
	private Curriculo curriculo;
	public EnumTipoUsuario tipoUsuario = EnumTipoUsuario.CANDIDATO;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EnumTipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(EnumTipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

	public Candidato() {}
	
	public Candidato(int id, Curriculo curriculo) {
		this.id = id;
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
