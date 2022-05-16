package br.com.grupo04.models;

public class Feedback {
	
	private String id;
	private String resposta;
	private String avaliacao;
	
	public Feedback() {}
	
	public Feedback(String id, String resposta, String avaliacao) {
		this.id = id;
		this.resposta = resposta;
		this.avaliacao = avaliacao;
	}
	
}
