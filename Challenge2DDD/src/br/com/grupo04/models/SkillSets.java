package br.com.grupo04.models;

import br.com.gabriel.grupo04.enums.EnumNivelSkill;

public class SkillSets {
	
	private String descricaoCandidato;
	private EnumNivelSkill nivelSkill;
	private VideoUpload upload;
	
	public String getDescricaoCandidato() {
		return descricaoCandidato;
	}

	public void setDescricaoCandidato(String descricaoCandidato) {
		this.descricaoCandidato = descricaoCandidato;
	}

	public EnumNivelSkill getNivelSkill() {
		return nivelSkill;
	}

	public void setNivelSkill(EnumNivelSkill nivelSkill) {
		this.nivelSkill = nivelSkill;
	}

	public VideoUpload getUpload() {
		return upload;
	}

	public void setUpload(VideoUpload upload) {
		this.upload = upload;
	}

	public SkillSets() {}
	
	public SkillSets(String descricaoCandidato, EnumNivelSkill nivelSkill) {
		this.descricaoCandidato = descricaoCandidato;
		this.nivelSkill = nivelSkill;
	}
	
}
