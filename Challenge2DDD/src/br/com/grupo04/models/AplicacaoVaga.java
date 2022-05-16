package br.com.grupo04.models;

public class AplicacaoVaga {
	
	private String id;
	private String nome;
	private Candidato candidato;
	private Empresa empresa;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public AplicacaoVaga() {}
	
	public AplicacaoVaga(String id, String nome, Candidato candidato, Empresa empresa) {
		this.id = id;
		this.nome = nome;
		this.candidato = candidato;
		this.empresa = empresa;
	}
	
}
