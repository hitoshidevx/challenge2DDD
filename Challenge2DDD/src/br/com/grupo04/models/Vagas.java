package br.com.grupo04.models;

import br.com.gabriel.grupo04.enums.EnumStackVaga;
import br.com.gabriel.grupo04.enums.EnumTipoUsuario;

public class Vagas {
	
	private String id;
	private String nome;
	private String descricao;
	private EnumStackVaga stackVaga;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EnumStackVaga getStackVaga() {
		return stackVaga;
	}

	public void setStackVaga(EnumStackVaga stackVaga) {
		this.stackVaga = stackVaga;
	}

	public Vagas() {}
	
	public Vagas(String id, String nome, String descricao, EnumStackVaga stackVaga) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.stackVaga = stackVaga;
	}
	
	public void AdicionarStackVaga(int escolhaStack) {
		do {
			
			if(escolhaStack == 1) {
				stackVaga = EnumStackVaga.FRONTEND;
				System.out.println("\nStack escolhida: FRONT-END\n");
			} else if (escolhaStack == 2) {
				stackVaga = EnumStackVaga.BACKEND;
				System.out.println("\nStack escolhida: BACK-END\n");
			} else if (escolhaStack == 3) {
				stackVaga = EnumStackVaga.FULLSTACK;
				System.out.println("\nStack escolhida: FULL-STACK\n");
			} else {
				System.out.println("\nAlternativa inválida.\n");
			}
			
		} while(escolhaStack != 1 | escolhaStack != 2 | escolhaStack != 3);
	}
	
	public void AlterarStackVaga(int escolhaStack) {
		// 1 - Front-end | 2 - Back-end | 3 - Full-Stack
		do {
			if(escolhaStack == 1) {
				if(stackVaga == EnumStackVaga.FRONTEND) {
					System.out.println("\nA vaga já pertence a stack front-end.\n");
				} else {
					stackVaga = EnumStackVaga.FRONTEND;
				}
			} else if (escolhaStack == 2) {
				if(stackVaga == EnumStackVaga.BACKEND) {
					System.out.println("\nA vaga já pertence a stack back-end.\n");
				} else {
					stackVaga = EnumStackVaga.BACKEND;
				}
			} else if (escolhaStack == 3) {
				if(stackVaga == EnumStackVaga.FULLSTACK) {
					System.out.println("\nA vaga já pertence a stack full-stack.\n");
				} else {
					stackVaga = EnumStackVaga.FULLSTACK;
				}
			}
		} while (escolhaStack != 1 | escolhaStack != 2 | escolhaStack != 3);
	}
	
	public String ExibirNomeEDescricao() {
		return "Nome: " + nome + " - " + "\nDescrição: " + descricao;
	}
	
	
	
}
