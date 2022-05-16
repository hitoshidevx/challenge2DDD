package br.com.grupo04.models;

public class Feedback {
	
	private String id;
	private String resposta;
	private String avaliacao;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Feedback() {}
	
	public Feedback(String id, String resposta, String avaliacao) {
		this.id = id;
		this.resposta = resposta;
		this.avaliacao = avaliacao;
	}
	
	public String ExibirFeedback() {
		return "\nResposta: " + resposta +
			   "Avaliação: " + avaliacao;
	}
	
	public void AlterarFeedback(String novaResposta, String novaAvaliacao) {
		this.resposta = novaResposta;
		this.avaliacao = novaAvaliacao;
	}
	
}
