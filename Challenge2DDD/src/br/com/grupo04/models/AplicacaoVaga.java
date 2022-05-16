package br.com.grupo04.models;

public class AplicacaoVaga {
	
	private String id;
	private String nome;
	private Candidato candidato;
	private Empresa empresa;
	
	public AplicacaoVaga() {}
	
	public AplicacaoVaga(String id, String nome, Candidato candidato, Empresa empresa) {
		this.id = id;
		this.nome = nome;
		this.candidato = candidato;
		this.empresa = empresa;
	}
	
}
