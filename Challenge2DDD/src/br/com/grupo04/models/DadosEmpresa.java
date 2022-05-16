package br.com.grupo04.models;

public class DadosEmpresa {
	
	private String unidade;
	private String endereco;
	private int cnpj;
	private Departamento departamento;
	
	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public DadosEmpresa() {}
	
	public DadosEmpresa(String unidade, String endereco, int cnpj, Departamento departamento) {
		this.unidade = unidade;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.departamento = departamento;
	}
	
	public String ExibirDadosEmpresa() {
		return "\nUnidade: " + unidade +
			   "Endereço: " + endereco + 
			   "Cnpj: " + cnpj;
	}
	
	public void AlterarDadosEmpresa(String novaUnidade, String novoEndereco, int novoCnpj) {
		this.unidade = novaUnidade;
		this.endereco = novoEndereco;
		this.cnpj = novoCnpj;
	}
	
}
