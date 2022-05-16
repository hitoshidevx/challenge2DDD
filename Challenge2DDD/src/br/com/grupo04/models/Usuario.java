package br.com.grupo04.models;

import java.util.Calendar;

import br.com.gabriel.grupo04.enums.EnumTipoUsuario;

public class Usuario {
	
	protected String nome;
	protected String email;
	protected String telefone;
	protected Calendar dataNasc;
	protected EnumTipoUsuario tipoUsuario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	public EnumTipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(EnumTipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Usuario() {}
	
	public Usuario(String nome, String email, String telefone, Calendar dataNasc, EnumTipoUsuario tipoUsuario) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.tipoUsuario = tipoUsuario;
	}
	
	public void SelecionarTipoUsuario(int resposta) {
		do {
			if(resposta == 1) {
				tipoUsuario = EnumTipoUsuario.CANDIDATO;
			} else if (resposta == 2) {
				tipoUsuario = EnumTipoUsuario.EMPRESA;
			} else {
				System.out.println("\nAlternativa inválida.\n");
			}
		} while (resposta != 1 | resposta != 2);
	}
}
