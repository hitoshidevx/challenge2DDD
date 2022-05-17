package br.com.grupo04.models;

public class Formacao {
	
	private int id;
	private String ensinoMedio;
	private int anoInicioMedio;
	private int anoConclusaoMedio;
	private String ensinoSuperior;
	private int anoInicioSuperior;
	private int anoFimSuperior;
	private String especializacao;
	private int anoInicioEspecializacao;
	private int anoFimEspecializacao;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(String ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}
	
	public int getAnoInicioMedio() {
		return anoInicioMedio;
	}

	public void setAnoInicioMedio(int anoInicioMedio) {
		this.anoInicioMedio = anoInicioMedio;
	}

	public int getAnoConclusaoMedio() {
		return anoConclusaoMedio;
	}

	public void setAnoConclusaoMedio(int anoConclusaoMedio) {
		this.anoConclusaoMedio = anoConclusaoMedio;
	}

	public String getEnsinoSuperior() {
		return ensinoSuperior;
	}

	public void setEnsinoSuperior(String ensinoSuperior) {
		this.ensinoSuperior = ensinoSuperior;
	}

	public int getAnoInicioSuperior() {
		return anoInicioSuperior;
	}

	public void setAnoInicioSuperior(int anoInicioSuperior) {
		this.anoInicioSuperior = anoInicioSuperior;
	}

	public int getAnoFimSuperior() {
		return anoFimSuperior;
	}

	public void setAnoFimSuperior(int anoFimSuperior) {
		this.anoFimSuperior = anoFimSuperior;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public int getAnoInicioEspecializacao() {
		return anoInicioEspecializacao;
	}

	public void setAnoInicioEspecializacao(int anoInicioEspecializacao) {
		this.anoInicioEspecializacao = anoInicioEspecializacao;
	}

	public int getAnoFimEspecializacao() {
		return anoFimEspecializacao;
	}

	public void setAnoFimEspecializacao(int anoFimEspecializacao) {
		this.anoFimEspecializacao = anoFimEspecializacao;
	}

	public Formacao() {}
	
	public Formacao(int id, String ensinoMedio, int anoConclusaoMedio, String ensinoSuperior, int anoInicioSuperior, int anoFimSuperior, String especializacao, int anoInicioEspecializacao, int anoFimEspecializacao) {
		this.id = id;
		this.ensinoMedio = ensinoMedio;
		this.anoConclusaoMedio = anoConclusaoMedio;
		this.ensinoSuperior = ensinoSuperior;
		this.anoInicioSuperior = anoInicioSuperior;
		this.anoFimSuperior = anoFimSuperior;
		this.especializacao = especializacao;
		this.anoInicioEspecializacao = anoInicioEspecializacao;
		this.anoFimEspecializacao = anoFimEspecializacao;
	}
	
	public String ExibirFormacao() {
		return "\nEnsino médio: " + ensinoMedio +
			   "Ano de Início: " + anoInicioMedio +
			   "Ano do Fim: " + anoConclusaoMedio +
			   "\nEnsino Superior: " + ensinoSuperior +
			   "Ano de Início: " + anoInicioSuperior +
			   "Ano do Fim: " + anoFimSuperior +
			   "\nEspecialização: " + especializacao +
			   "Ano de Início: " + anoInicioEspecializacao +
			   "Ano do Fim: " + anoFimEspecializacao;
	}
	
	public void AlterarEnsinoMedio(String novoEnsinoMedio, int novoAnoInicioEM, int novoAnoConclusaoEM) {
		this.ensinoMedio = novoEnsinoMedio;
		this.anoInicioMedio = novoAnoInicioEM;
		this.anoConclusaoMedio = novoAnoConclusaoEM;
	}
	
	public void AlterarEnsinoSuperior(String novoEnsinoSuperior, int novoAnoInicioSuperior, int novoAnoFimSuperior) {
		this.ensinoSuperior = novoEnsinoSuperior;
		this.anoInicioSuperior = novoAnoInicioSuperior;
		this.anoFimSuperior = novoAnoFimSuperior;
	}
	
	public void AlterarEspecializacao(String novaEspecializacao, int novoAnoInicioEspec, int novoAnoFimEspec) {
		this.especializacao = novaEspecializacao;
		this.anoInicioEspecializacao = novoAnoInicioEspec;
		this.anoFimEspecializacao = novoAnoFimEspec;
	}
}
