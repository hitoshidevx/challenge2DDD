package br.com.grupo04.models;

import br.com.gabriel.grupo04.enums.EnumNivelSkill;

public class SkillSets {
	
	private int id;
	private String descricaoCandidato;
	private EnumNivelSkill nivelSkill;
	private VideoUpload upload;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
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
	
	public SkillSets(int id, String descricaoCandidato, EnumNivelSkill nivelSkill) {
		this.id = id;
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
		
		if(escolha == 1) {
			if(nivelSkill != EnumNivelSkill.BASICO) {
				nivelSkill = EnumNivelSkill.BASICO;
				System.out.println("\nNível Alterado para BÁSICO.");
			} else {
				System.out.println("\nA skill já tem nível BÁSICO.");
			}
		} else if (escolha == 2) {
			if(nivelSkill != EnumNivelSkill.INTERMEDIARIO) {
				nivelSkill = EnumNivelSkill.INTERMEDIARIO;
				System.out.println("\nNível Alterado para INTERMEDIÁRIO.");
			} else {
				System.out.println("\nA skill já tem nível INTERMEDIÁRIO.");
			}
		} else if (escolha == 3) {
			if(nivelSkill != EnumNivelSkill.AVANCADO) {
				nivelSkill = EnumNivelSkill.AVANCADO;
				System.out.println("\nNível Alterado para AVANCADO.");
			} else {
				System.out.println("\nA skill já tem nível AVANCADO.");
			}
		}
		
	}
	
	
}
