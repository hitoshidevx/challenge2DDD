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
	
	public void ExibirSkill() {
		if(nivelSkill == EnumNivelSkill.BASICO) {
			
			System.out.println("\nSkill: " + descricaoCandidato + " - " + "N�vel: B�sico");
			
		} else if (nivelSkill == EnumNivelSkill.INTERMEDIARIO) {
			
			System.out.println("\nSkill: " + descricaoCandidato + " - " + "N�vel: Intermedi�rio");
		
		} else if (nivelSkill == EnumNivelSkill.AVANCADO) {
			
			System.out.println("\nSkill: " + descricaoCandidato + " - " + "N�vel: Avan�ado");
			
		} 
	}
	
	public void AlterarDescricaoSkill(String novaDescricao) {
		this.descricaoCandidato = novaDescricao;
	}
	
	public void AlterarNivelSkill(int escolha) {
		//1 - B�SICO | 2 - INTERMEDIARIO | 3 - AVANCADO
		do {
			if(escolha == 1) {
				nivelSkill = EnumNivelSkill.BASICO;
				System.out.println("N�vel da Skill definido para: B�sico.");
			} else if (escolha == 2) {
				nivelSkill = EnumNivelSkill.INTERMEDIARIO;
				System.out.println("N�vel da Skill definido para: Intermedi�rio.");
			} else if (escolha == 3) {
				nivelSkill = EnumNivelSkill.AVANCADO;
				System.out.println("N�vel da Skill definido para: Avan�ado.");
			}
		} while (escolha != 1 | escolha != 2 | escolha != 3);
	}
	
	
}
