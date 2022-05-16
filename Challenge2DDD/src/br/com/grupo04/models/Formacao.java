package br.com.grupo04.models;

public class Formacao {
	
	private String id;
	private String ensinoMedio;
	private int anoConclusaoMedio;
	private String ensinoSuperior;
	private int anoInicioSuperior;
	private int anoFimSuperior;
	private String especializacao;
	private int anoInicioEspecializacao;
	private int anoFimEspecializacao;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(String ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
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
	
	public Formacao(String id, String ensinoMedio, int anoConclusaoMedio, String ensinoSuperior, int anoInicioSuperior, int anoFimSuperior, String especializacao, int anoInicioEspecializacao, int anoFimEspecializacao) {
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
	
}
