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
		
		if(escolha == 1) {
			if(nivelSkill != EnumNivelSkill.BASICO) {
				nivelSkill = EnumNivelSkill.BASICO;
				System.out.println("\nN�vel Alterado para B�SICO.");
			} else {
				System.out.println("\nA skill j� tem n�vel B�SICO.");
			}
		} else if (escolha == 2) {
			if(nivelSkill != EnumNivelSkill.INTERMEDIARIO) {
				nivelSkill = EnumNivelSkill.INTERMEDIARIO;
				System.out.println("\nN�vel Alterado para INTERMEDI�RIO.");
			} else {
				System.out.println("\nA skill j� tem n�vel INTERMEDI�RIO.");
			}
		} else if (escolha == 3) {
			if(nivelSkill != EnumNivelSkill.AVANCADO) {
				nivelSkill = EnumNivelSkill.AVANCADO;
				System.out.println("\nN�vel Alterado para AVANCADO.");
			} else {
				System.out.println("\nA skill j� tem n�vel AVANCADO.");
			}
		}
		
	}
	
	
}
