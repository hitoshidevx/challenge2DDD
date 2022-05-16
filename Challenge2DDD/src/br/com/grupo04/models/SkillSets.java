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
			
			System.out.println("\nSkill: " + descricaoCandidato + " - " + "Nível: Básico");
			
		} else if (nivelSkill == EnumNivelSkill.INTERMEDIARIO) {
			
			System.out.println("\nSkill: " + descricaoCandidato + " - " + "Nível: Intermediário");
		
		} else if (nivelSkill == EnumNivelSkill.AVANCADO) {
			
			System.out.println("\nSkill: " + descricaoCandidato + " - " + "Nível: Avançado");
			
		} 
	}
	
	public void AlterarDescricaoSkill(String novaDescricao) {
		this.descricaoCandidato = novaDescricao;
	}
	
	public void AlterarNivelSkill(int escolha) {
		//1 - BÁSICO | 2 - INTERMEDIARIO | 3 - AVANCADO
		do {
			if(escolha == 1) {
				nivelSkill = EnumNivelSkill.BASICO;
				System.out.println("Nível da Skill definido para: Básico.");
			} else if (escolha == 2) {
				nivelSkill = EnumNivelSkill.INTERMEDIARIO;
				System.out.println("Nível da Skill definido para: Intermediário.");
			} else if (escolha == 3) {
				nivelSkill = EnumNivelSkill.AVANCADO;
				System.out.println("Nível da Skill definido para: Avançado.");
			}
		} while (escolha != 1 | escolha != 2 | escolha != 3);
	}
	
	
}
