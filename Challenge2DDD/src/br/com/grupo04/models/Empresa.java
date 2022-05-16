package br.com.grupo04.models;

import br.com.gabriel.grupo04.enums.EnumTipoUsuario;

public class Empresa extends Usuario {
	
	private DadosEmpresa dadosEmpresa;
	private EnumTipoUsuario tipoUsuario = EnumTipoUsuario.EMPRESA;
	
	public DadosEmpresa getDadosEmpresa() {
		return dadosEmpresa;
	}

	public void setDadosEmpresa(DadosEmpresa dadosEmpresa) {
		this.dadosEmpresa = dadosEmpresa;
	}

	public EnumTipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(EnumTipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Empresa() {}
	
	public Empresa(DadosEmpresa dadosEmpresa, EnumTipoUsuario tipoUsuario) {
		this.dadosEmpresa = dadosEmpresa;
		this.tipoUsuario = tipoUsuario;
	}
	
	public void AlterarTipoUsuario(Empresa emp) {
		emp.setTipoUsuario(EnumTipoUsuario.CANDIDATO);
		emp.setDadosEmpresa(null);
		emp.dadosEmpresa.setDepartamento(null);
		emp.dadosEmpresa.getDepartamento().setVagas(null);
		System.out.println("\nSeu tipo de usuário foi alterado.\n As informações da sua empresa foram anuladas.\n");
	}

	
}
