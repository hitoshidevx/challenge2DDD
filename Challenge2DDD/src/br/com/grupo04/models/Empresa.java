package br.com.grupo04.models;

import br.com.gabriel.grupo04.enums.EnumTipoUsuario;

public class Empresa extends Usuario {
	
	private DadosEmpresa dadosEmpresa;
	private EnumTipoUsuario tipoUsuario = EnumTipoUsuario.EMPRESA;
	
	public Empresa() {}
	
	public Empresa(DadosEmpresa dadosEmpresa, EnumTipoUsuario tipoUsuario) {
		this.dadosEmpresa = dadosEmpresa;
		this.tipoUsuario = tipoUsuario;
	}
	
}
