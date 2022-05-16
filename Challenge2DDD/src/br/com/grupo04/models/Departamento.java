package br.com.grupo04.models;

public class Departamento {
	
	private int id;
	private String nome;
	private String atuacao;
	private Vagas vagas;
	
	public Departamento() {}
	
	public Departamento (int id, String nome, String atuacao, Vagas vagas) {
		this.id = id;
		this.nome = nome;
		this.atuacao = atuacao;
		this.vagas = vagas;
	}
	
}
