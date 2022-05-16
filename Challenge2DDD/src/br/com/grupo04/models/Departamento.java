package br.com.grupo04.models;

public class Departamento {
	
	private int id;
	private String nome;
	private String atuacao;
	private Vagas vagas;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtuacao() {
		return atuacao;
	}

	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}

	public Vagas getVagas() {
		return vagas;
	}

	public void setVagas(Vagas vagas) {
		this.vagas = vagas;
	}

	public Departamento() {}
	
	public Departamento (int id, String nome, String atuacao, Vagas vagas) {
		this.id = id;
		this.nome = nome;
		this.atuacao = atuacao;
		this.vagas = vagas;
	}
	
	public String ExibirDepartamento() {
		return "Nome: " + nome +
			   "Atuação: " + atuacao;
	}
	
	public void AlterarInfoDepartamento(String novoNome, String novaAtuacao) {
		this.nome = novoNome;
		this.atuacao = novaAtuacao;
	}
	
}
