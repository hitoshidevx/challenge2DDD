package br.com.grupo04.models;

import java.util.Calendar;

public class Experiencia {
	
	private String id;
	private String emprego;
	private String empresa;
	private Calendar dataInicio;
	private Calendar dataFim;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmprego() {
		return emprego;
	}

	public void setEmprego(String emprego) {
		this.emprego = emprego;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public Experiencia() {}
	
	public Experiencia(String id, String emprego, String empresa, Calendar dataInicio, Calendar dataFim) {
		this.id = id;
		this.emprego = emprego;
		this.empresa = empresa;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	public String ExibirEmpregoEmpresa() {
		return "Emprego: " + emprego + " - " + "\nEmpresa: " + empresa;
	}
	
	public void AlterarExperiencia(String novoEmprego, String novaEmpresa) {
		this.emprego = novoEmprego;
		this.empresa = novaEmpresa;
	}
	
}
