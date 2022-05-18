package br.com.grupo04.models;

public class Curriculo {
	
	private int id;
	private Formacao formacao;
	private SkillSets skills;
	private Experiencia experiencia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Formacao getFormacao() {
		return formacao;
	}

	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}

	public SkillSets getSkills() {
		return skills;
	}

	public void setSkills(SkillSets skills) {
		this.skills = skills;
	}

	public Experiencia getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(Experiencia experiencia) {
		this.experiencia = experiencia;
	}

	public Curriculo() {}
	
	public Curriculo(int id, Formacao formacao, SkillSets skills, Experiencia experiencia) {
		this.id = id;
		this.formacao = formacao;
		this.skills = skills;
		this.experiencia = experiencia;
	}
}
