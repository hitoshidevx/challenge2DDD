package br.com.grupo04.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.gabriel.grupo04.enums.EnumNivelSkill;
import br.com.grupo04.models.Candidato;
import br.com.grupo04.models.Curriculo;
import br.com.grupo04.models.Empresa;
import br.com.grupo04.models.Experiencia;
import br.com.grupo04.models.Formacao;
import br.com.grupo04.models.SkillSets;
import br.com.grupo04.models.Usuario;

public class Testing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Listas de Usuários (e seus tipos)
		ArrayList<Usuario> listaUsuarios = new ArrayList<>();
		ArrayList<Candidato> listaCandidatos = new ArrayList<>();
		ArrayList<Empresa> listaEmpresas = new ArrayList<>();
		
		// Lista do Currículo do Candidato
		ArrayList<Curriculo> listaCurriculos = new ArrayList<>();
		ArrayList<Formacao> listaFormacoes = new ArrayList<>();
		ArrayList<SkillSets> listaSkills = new ArrayList<>();
		ArrayList<Experiencia> listaExperiencias = new ArrayList<>();
		
		// Informações Iniciais
		int escolhaTipoUsuario;
		String nome;
		String email;
		String telefone;
		
		// Seleção de escolha - Candidato
		int escolhaCandidato;
		int escolhaCurriculo;
		int escolhaPerfilCandidato;
		int escolhaNivelSkill;
		int escolhaProximoPasso;
		
		// Seleção de escolha - Empresa
		int escolhaEmpresa;
		
		System.out.println("Qual o seu nome? (ou nome da empresa)");
		nome = sc.next();
		
		do {
			System.out.printf("\nBeleza, %s. Escolha o tipo de usuário de seu interesse:\n1 - Candidato\n2 - Empresa\n", nome);
			escolhaTipoUsuario = sc.nextInt();
			
			// 1 - CANDIDATO
			// 2 - EMPRESA
			if(escolhaTipoUsuario == 1) {
				System.out.println("\nVocê selecionou candidato.");
				Candidato cd = new Candidato();
				
				listaUsuarios.add(cd);
				listaCandidatos.add(cd);
				
				int idCandidato = listaCandidatos.size() + 1;
				cd.setId(idCandidato);
				
				cd.setNome(nome);
				
				Curriculo cr = new Curriculo();
				
				int idCurriculo = listaCurriculos.size() + 1;
				cr.setId(idCurriculo);
				
				cd.setCurriculo(cr);
				
				listaCurriculos.add(cr);
				
				System.out.println("\nPor favor, digite seu email:");
				email = sc.next();
				cd.setEmail(email);
				
				System.out.println("\nSeu telefone:");
				telefone = sc.next();
				cd.setTelefone(telefone);
				
				do {
					System.out.printf("\nBem-vindo, %s. O que deseja fazer?\n", cd.getNome());
					System.out.println("\nCurrículo\n"
									+ "1. Cadastrar meu currículo.\n"
									+ "2. Editar meu currículo.\n"
									+ "3. Excluir meu currículo.\n"
									+ "\nPerfil\n"
									+ "4. Editar meu nome/email/telefone.\n"
									+ "5. Excluir meu perfil.\n"
									+ "\nSkills\n"
									+ "6. Adicionar uma ou mais skills.\n"
									+ "7. Editar uma skill.\n"
									+ "8. Excluir uma skill.\n"
									+ "9. Finalizar meu programa");
					escolhaCandidato = sc.nextInt();
					
					switch (escolhaCandidato) {
					case 1:
						System.out.printf("\n\n%s, qual parte do currículo deseja cadastrar/alterar?\n", cd.getNome());
						System.out.println("\nFormação\n"
								+ "1. Cadastrar uma ou mais formações.\n"
								+ "2. Alterar uma formação.\n"
								+ "3. Excluir uma formação.\n"
								+ "\nSkills\n"
								+ "4. Cadastrar uma ou mais skills.\n"
								+ "5. Alterar uma skill.\n"
								+ "6. Excluir uma skill.\n"
								+ "\nExperiência\n"
								+ "7. Cadastrar uma ou mais experiências.\n"
								+ "8. Alterar uma experiência.\n"
								+ "9. Excluir uma skill.\n");
						
						escolhaCurriculo = sc.nextInt();
						
						switch(escolhaCurriculo) {
							case 1:
								
								Formacao fm = new Formacao();
								
								int idFormacao = listaFormacoes.size() + 1;
								
								fm.setId(idFormacao);
								
								System.out.println("\nDigite o nome da escola onde fez E.M:");
								String ensinoMedio = sc.next();
								fm.setEnsinoMedio(ensinoMedio);
								
								System.out.println("\nDigite o ano de início:");
								int anoInicioEM = sc.nextInt();
								fm.setAnoInicioMedio(anoInicioEM);
								
								System.out.println("\nDigite o ano de conclusão:");
								int anoConclusaoEM = sc.nextInt();
								fm.setAnoConclusaoMedio(anoConclusaoEM);
								
								System.out.println("\n\nDigite o nome da escola onde fez Ensino Superior:");
								String ensinoSuperior = sc.next();
								fm.setEnsinoSuperior(ensinoSuperior);
								
								System.out.println("\nDigite o ano de início:");
								int anoInicioSuperior = sc.nextInt();
								fm.setAnoInicioSuperior(anoInicioSuperior);
								
								System.out.println("\nDigite o ano de conclusão:");
								int anoConclusaoSuperior = sc.nextInt();
								fm.setAnoFimSuperior(anoConclusaoSuperior);
								
								System.out.println("\n\nDigite o nome da escola onde fez Especialização:");
								String especializacao = sc.next();
								fm.setEspecializacao(especializacao);
								
								System.out.println("\nDigite o ano de início:");
								int anoInicioEspec = sc.nextInt();
								fm.setAnoInicioEspecializacao(anoInicioEspec);
								
								System.out.println("\nDigite o ano de conclusão:");
								int anoConclusaoEspec = sc.nextInt();
								fm.setAnoFimEspecializacao(anoConclusaoEspec);
								
								listaFormacoes.add(fm);
								
								System.out.println("\nFormações adicionadas.");
								
								System.in.read();
								
								break;
								
							case 2:
								System.out.println("\nMétodo em manutenção.");
								break;
								
							case 3:
								System.out.println("\nMétodo em manutenção.");
								break;
								
							case 4:
								System.out.println("\nQuantas skills deseja cadastrar?");
								int qtdSkills = sc.nextInt();
								
								for(int i = 0; i < qtdSkills; i++) {
									SkillSets skill = new SkillSets();
									
									System.out.println("\nDigite o nome da " + (i + 1) + "ª skill:");
									String nomeSkill = sc.next();
									skill.setDescricaoCandidato(nomeSkill);
									
									do {
										System.out.println("\nQual é o nível dela?\n1 - Básico\n2 - Intermediário\n3 - Avançado");
										escolhaNivelSkill = sc.nextInt();
										
										if(escolhaNivelSkill == 1) {
											skill.setNivelSkill(EnumNivelSkill.BASICO);
											System.out.println("\nO nível da sua skill é BÁSICO.");
										} else if (escolhaNivelSkill == 2) {
											skill.setNivelSkill(EnumNivelSkill.INTERMEDIARIO);
											System.out.println("\nO nível da sua skill é INTERMEDIÁRIO.");
										} else if (escolhaNivelSkill == 3) {
											skill.setNivelSkill(EnumNivelSkill.AVANCADO);
											System.out.println("\nO nível da sua skill é AVANÇADO.");
										} else {
											System.out.println("\nOpção inválida. Insira novamente.");
										}
									} while (escolhaNivelSkill < 0 | escolhaNivelSkill > 3);
									
									System.out.println("\nSkill adicionada.");
		
								}
								
								System.out.println("\nO que deseja fazer agora?\n1 - Voltar para currículo\n2 - Voltar para Home\n3 - Sair");
								escolhaProximoPasso = sc.nextInt();
								
								if(escolhaProximoPasso == 1) {
									escolhaCandidato = 1;
								} else if (escolhaProximoPasso == 2) {
									System.in.read();
								} else if (escolhaProximoPasso == 3) {
									escolhaCandidato = 9;
								}
								
								break;
								
							case 5:
								
								System.out.println("Método em manutenção.");
								
								break;
								
							case 6:
								
								System.out.println("Método em manutenção.");
								
								break;
								
							case 7:
								
								System.out.println("\nQuantas experiências deseja cadastrar?");
								int qtdExperiencias = sc.nextInt();
								
								for(int i = 0; i < qtdExperiencias; i++) {
									Experiencia exp = new Experiencia();
									
									int idExperiencia = listaExperiencias.size() + 1;
									
									exp.setId(idExperiencia);
									
									System.out.println("\nDigite seu cargo " + (i + 1) + "ª empresa: ");
									String emprego = sc.next();
									exp.setEmprego(emprego);
									
									System.out.println("\nDigite o nome da " + (i + 1) + "ª empresa:");
									String empresa = sc.nextLine();
									exp.setEmpresa(empresa);
									
									System.out.println("\nDigite o ano de início:");
									int anoInicio = sc.nextInt();
									exp.setAnoInicio(anoInicio);
									
									System.out.println("\n\nDigite o ano final:");
									int anoFinal = sc.nextInt();
									exp.setAnoFim(anoFinal);							
									
									listaExperiencias.add(exp);
									
									System.out.println("\nExperiência adicionada.");
								}

								System.out.println("\nO que deseja fazer agora?\n1 - Voltar para currículo\n2 - Voltar para Home\n3 - Sair");
								escolhaProximoPasso = sc.nextInt();
								
								if(escolhaProximoPasso == 1) {
									escolhaCandidato = 1;
								} else if (escolhaProximoPasso == 2) {
									System.in.read();
								} else if (escolhaProximoPasso == 3) {
									escolhaCandidato = 9;
								}
								
								break;
								
							case 8:
								
								break;
							
							case 9:
								
								break;
							
							default:
								
								break;
						}
						
						break;
						
					case 2:
						
						break;
						
					case 3:
						
						break;
						
					case 4:
						
						break;
						
					case 5:
						
						break;
						
					case 6:
						
						break;
						
					case 7:
						
						break;
						
					case 8:
						
						break;
						
					case 9:
						System.out.println("Finalizando sistema...");
						escolhaTipoUsuario = 3;
						System.in.read();
						break;
					
					default:
						System.out.println("\nOpção inválida. Tente novamente.");
						break;
					}
					
					
				} while (escolhaCandidato > 0 && escolhaCandidato < 9);
				
				System.out.println("\nSistema Finalizado.");
				
				
			} else if (escolhaTipoUsuario == 2) {
						
			} 
		} while (escolhaTipoUsuario == 1 | escolhaTipoUsuario == 2);
		
		System.out.println("Sistem finalizado.");
		
		
	}

}
