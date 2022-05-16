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
	
}
