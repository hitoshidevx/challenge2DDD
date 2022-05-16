package br.com.grupo04.models;

import br.com.gabriel.grupo04.enums.EnumStackVaga;

public class Vagas {
	
	private String id;
	private String nome;
	private String descricao;
	private EnumStackVaga stackVaga;
	
	public Vagas() {}
	
	public Vagas(String id, String nome, String descricao, EnumStackVaga stackVaga) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.stackVaga = stackVaga;
	}
	
}
