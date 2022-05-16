package br.com.grupo04.models;

public class DadosEmpresa {
	
	private String unidade;
	private String endereco;
	private int cnpj;
	private Departamento departamento;
	
	public DadosEmpresa() {}
	
	public DadosEmpresa(String unidade, String endereco, int cnpj, Departamento departamento) {
		this.unidade = unidade;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.departamento = departamento;
	}
	
}
