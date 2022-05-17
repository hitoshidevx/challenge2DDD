package br.com.grupo04.models;

import java.util.ArrayList;

public class Curriculo {
	
	private int id;
	private ArrayList<Formacao> formacao;
	private ArrayList<SkillSets> skills;
	private ArrayList<Experiencia> experiencia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Formacao> getFormacao() {
		return formacao;
	}

	public void setFormacao(ArrayList<Formacao> formacao) {
		this.formacao = formacao;
	}

	public ArrayList<SkillSets> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<SkillSets> skills) {
		this.skills = skills;
	}

	public ArrayList<Experiencia> getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(ArrayList<Experiencia> experiencia) {
		this.experiencia = experiencia;
	}

	public Curriculo() {}
	
	public Curriculo(int id, ArrayList<Formacao> formacao, ArrayList<SkillSets> skills, ArrayList<Experiencia> experiencia) {
		this.id = id;
		this.formacao = formacao;
		this.skills = skills;
		this.experiencia = experiencia;
	}
}
