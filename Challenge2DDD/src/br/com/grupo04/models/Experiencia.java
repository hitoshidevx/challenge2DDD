package br.com.grupo04.models;

import java.util.Calendar;

public class Experiencia {
	
	private int id;
	private String emprego;
	private String empresa;
	private int anoInicio;
	private int anoFim;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(int anoFim) {
		this.anoFim = anoFim;
	}

	public Experiencia() {}
	
	public Experiencia(int id, String emprego, String empresa, int anoInicio, int anoFim) {
		this.id = id;
		this.emprego = emprego;
		this.empresa = empresa;
		this.anoInicio = anoInicio;
		this.anoFim = anoFim;
	}
	
	public String ExibirEmpregoEmpresa() {
		return "Emprego: " + emprego + " - " + "\nEmpresa: " + empresa;
	}
	
	public void AlterarExperiencia(String novoEmprego, String novaEmpresa) {
		this.emprego = novoEmprego;
		this.empresa = novaEmpresa;
	}
	
}
