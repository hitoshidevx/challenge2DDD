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
		
		// Listas de Usu�rios (e seus tipos)
		ArrayList<Usuario> listaUsuarios = new ArrayList<>();
		ArrayList<Candidato> listaCandidatos = new ArrayList<>();
		ArrayList<Empresa> listaEmpresas = new ArrayList<>();
		
		// Lista do Curr�culo do Candidato
		ArrayList<Curriculo> listaCurriculos = new ArrayList<>();
		ArrayList<Formacao> listaFormacoes = new ArrayList<>();
		ArrayList<SkillSets> listaSkills = new ArrayList<>();
		ArrayList<Experiencia> listaExperiencias = new ArrayList<>();
		
		// Informa��es Iniciais
		int escolhaTipoUsuario;
		String nome;
		String email;
		String telefone;
		
		// Sele��o de escolha - Candidato
		int escolhaCandidato;
		int escolhaCurriculo;
		int escolhaPerfilCandidato;
		int escolhaNivelSkill;
		int escolhaProximoPasso;
		int escolhaId;
		int escolhaIdFormacao;
		int escolhaIdSkill;
		int escolhaIdExp;
		int escolhaNovoNivelSkill;
		
		// Sele��o de escolha - Empresa
		int escolhaEmpresa;
		
		System.out.println("Qual o seu nome? (ou nome da empresa)");
		nome = sc.next();
		
			System.out.printf("\nBeleza, %s. Escolha o tipo de usu�rio de seu interesse:\n1 - Candidato\n2 - Empresa\n", nome);
			escolhaTipoUsuario = sc.nextInt();
			
			// 1 - CANDIDATO
			// 2 - EMPRESA
			if(escolhaTipoUsuario == 1) {
				System.out.println("\nVoc� selecionou candidato.");
				Candidato cd = new Candidato();
				
				listaUsuarios.add(cd);
				listaCandidatos.add(cd);
				
				int idCandidato = listaCandidatos.size();
				cd.setId(idCandidato);
				
				System.out.println("\nSeu Id �: " + cd.getId() + ". Lembre-se disso.");
				
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
					System.out.println("\nCurr�culo\n"
									+ "1. Cadastrar/Alterar meu curr�culo.\n"
									+ "\nPerfil\n"
									+ "2. Editar meu nome/email/telefone.\n"
									+ "3. Excluir meu perfil.\n"
									+ "\nSkills\n"
									+ "4. Adicionar uma ou mais skills.\n"
									+ "5. Editar uma skill.\n"
									+ "6. Excluir uma skill.\n"
									+ "7. Finalizar meu programa");
					escolhaCandidato = sc.nextInt();
					
					switch (escolhaCandidato) {
					case 1:
						System.out.printf("\n\n%s, qual parte do curr�culo deseja cadastrar/alterar?\n", cd.getNome());
						System.out.println("\nForma��o\n"
								+ "1. Cadastrar forma��o.\n"
								+ "2. Alterar forma��o.\n"
								+ "3. Excluir forma��o.\n"
								+ "\nSkills\n"
								+ "4. Cadastrar uma ou mais skills.\n"
								+ "5. Alterar uma skill.\n"
								+ "6. Excluir uma skill.\n"
								+ "\nExperi�ncia\n"
								+ "7. Cadastrar uma ou mais experi�ncias.\n"
								+ "8. Alterar uma experi�ncia.\n"
								+ "9. Excluir uma skill.\n");
						
						escolhaCurriculo = sc.nextInt();
						
						switch(escolhaCurriculo) {
							case 1:
								
								Formacao fm = new Formacao();
								
								System.out.println("\nDigite o nome da escola onde fez E.M:");
								String ensinoMedio = sc.next();
								fm.setEnsinoMedio(ensinoMedio);
								
								System.out.println("\nDigite o ano de in�cio:");
								int anoInicioEM = sc.nextInt();
								fm.setAnoInicioMedio(anoInicioEM);
								
								System.out.println("\nDigite o ano de conclus�o:");
								int anoConclusaoEM = sc.nextInt();
								fm.setAnoConclusaoMedio(anoConclusaoEM);
								
								System.out.println("\n\nDigite o nome da escola onde fez Ensino Superior:");
								String ensinoSuperior = sc.next();
								fm.setEnsinoSuperior(ensinoSuperior);
								
								System.out.println("\nDigite o ano de in�cio:");
								int anoInicioSuperior = sc.nextInt();
								fm.setAnoInicioSuperior(anoInicioSuperior);
								
								System.out.println("\nDigite o ano de conclus�o:");
								int anoConclusaoSuperior = sc.nextInt();
								fm.setAnoFimSuperior(anoConclusaoSuperior);
								
								System.out.println("\n\nDigite o nome da escola onde fez Especializa��o:");
								String especializacao = sc.next();
								fm.setEspecializacao(especializacao);
								
								System.out.println("\nDigite o ano de in�cio:");
								int anoInicioEspec = sc.nextInt();
								fm.setAnoInicioEspecializacao(anoInicioEspec);
								
								System.out.println("\nDigite o ano de conclus�o:");
								int anoConclusaoEspec = sc.nextInt();
								fm.setAnoFimEspecializacao(anoConclusaoEspec);
								
								listaFormacoes.add(fm);
								
								int idFormacao = listaFormacoes.size();
								
								fm.setId(idFormacao);
								
								cr.setFormacao(fm);
								
								System.out.println("\nForma��o adicionada. Id: " + fm.getId());
								
								System.in.read();
								
								break;
								
							case 2:
								System.out.println("Por favor, digite o Id da sua forma��o:");
								escolhaIdFormacao = sc.nextInt();
								
								Formacao formacao = listaFormacoes.get(escolhaIdFormacao - 1);
								
								System.out.println("\nDigite o nome da escola onde fez E.M:");
								String novoEnsinoMedio = sc.next();
								formacao.setEnsinoMedio(novoEnsinoMedio);
								
								System.out.println("\nDigite o ano de in�cio:");
								int novoAnoInicioEM = sc.nextInt();
								formacao.setAnoInicioMedio(novoAnoInicioEM);
								
								System.out.println("\nDigite o ano de conclus�o:");
								int novoAnoConclusaoEM = sc.nextInt();
								formacao.setAnoConclusaoMedio(novoAnoConclusaoEM);
								
								System.out.println("\n\nDigite o nome da escola onde fez Ensino Superior:");
								String novoEnsinoSuperior = sc.next();
								formacao.setEnsinoSuperior(novoEnsinoSuperior);
								
								System.out.println("\nDigite o ano de in�cio:");
								int novoAnoInicioSuperior = sc.nextInt();
								formacao.setAnoInicioSuperior(novoAnoInicioSuperior);
								
								System.out.println("\nDigite o ano de conclus�o:");
								int novoAnoConclusaoSuperior = sc.nextInt();
								formacao.setAnoFimSuperior(novoAnoConclusaoSuperior);
								
								System.out.println("\n\nDigite o nome da escola onde fez Especializa��o:");
								String novaEspecializacao = sc.next();
								formacao.setEspecializacao(novaEspecializacao);
								
								System.out.println("\nDigite o ano de in�cio:");
								int novoAnoInicioEspec = sc.nextInt();
								formacao.setAnoInicioEspecializacao(novoAnoInicioEspec);
								
								System.out.println("\nDigite o ano de conclus�o:");
								int novoAnoConclusaoEspec = sc.nextInt();
								formacao.setAnoFimEspecializacao(novoAnoConclusaoEspec);
								
								System.out.println("\nSua forma��o foi alterada.");
								System.out.printf("\nEnsino M�dio: %s - Ano de �nicio: %d - Ano de Conclus�o: %d", formacao.getEnsinoMedio(), formacao.getAnoInicioMedio(), formacao.getAnoConclusaoMedio());
								System.out.printf("\nEnsino Superior: %s - Ano de �nicio: %d - Ano de Conclus�o: %d", formacao.getEnsinoSuperior(), formacao.getAnoInicioSuperior(), formacao.getAnoFimSuperior());
								System.out.printf("\nEspecializa��o: %s - Ano de �nicio: %d - Ano de Conclus�o: %d", formacao.getEspecializacao(), formacao.getAnoInicioEspecializacao(), formacao.getAnoFimEspecializacao());
								
								System.in.read();
								
								break;
								
							case 3:
								System.out.println("\nDigite o Id da sua forma��o:");
								escolhaIdFormacao = sc.nextInt();
								
								listaFormacoes.remove(escolhaIdFormacao);
								
								System.out.println("\nSua forma��o foi exclu�da.");
								
								System.in.read();
								
								break;
								
							case 4:
								System.out.println("\nQuantas skills deseja cadastrar?");
								int qtdSkills = sc.nextInt();
								
								for(int i = 0; i < qtdSkills; i++) {
									SkillSets skill = new SkillSets();
									
									System.out.println("\nDigite o nome da " + (i + 1) + "� skill:");
									String nomeSkill = sc.next();
									skill.setDescricaoCandidato(nomeSkill);
									
									do {
										System.out.println("\nQual � o n�vel dela?\n1 - B�sico\n2 - Intermedi�rio\n3 - Avan�ado");
										escolhaNivelSkill = sc.nextInt();
										
										if(escolhaNivelSkill == 1) {
											skill.setNivelSkill(EnumNivelSkill.BASICO);
											System.out.println("\nO n�vel da sua skill � B�SICO.");
										} else if (escolhaNivelSkill == 2) {
											skill.setNivelSkill(EnumNivelSkill.INTERMEDIARIO);
											System.out.println("\nO n�vel da sua skill � INTERMEDI�RIO.");
										} else if (escolhaNivelSkill == 3) {
											skill.setNivelSkill(EnumNivelSkill.AVANCADO);
											System.out.println("\nO n�vel da sua skill � AVAN�ADO.");
										} else {
											System.out.println("\nOp��o inv�lida. Insira novamente.");
										}
									} while (escolhaNivelSkill <= 0 | escolhaNivelSkill > 3);
									
									listaSkills.add(skill);
									
									int idSkill = listaSkills.size();
									
									skill.setId(idSkill);
									
									System.out.println("\nSkill adicionada. Id: " + skill.getId());
									
									skill.ExibirSkill();
									
									cr.setSkills(skill);
		
								}
								
								break;
								
							case 5:
								
								System.out.println("\nPor favor, insira o Id da Skill:");
								escolhaIdSkill = sc.nextInt();
								
								SkillSets skill = listaSkills.get(escolhaIdSkill - 1);
								
								System.out.println("\nDigite o novo nome da skill:");
								String novoNomeSkill = sc.next();
								skill.setDescricaoCandidato(novoNomeSkill);
				
								System.out.println("\nAgora escolha um n�vel:\n1 - B�SICO\n2 - INTERMEDI�RIO\n3 - AVAN�ADO");
								escolhaNovoNivelSkill = sc.nextInt();
								
								skill.AlterarNivelSkill(escolhaNovoNivelSkill);
								
								System.in.read();
															
								break;
								
							case 6:
								
								System.out.println("\nPor favor, insira o Id da Skill:");
								escolhaIdSkill = sc.nextInt();
								
								listaSkills.remove(escolhaIdSkill - 1);
								
								System.out.println("\nSkill exclu�da.");
								
								System.in.read();
								
								break;
								
							case 7:
								
								System.out.println("\nQuantas experi�ncias deseja cadastrar?");
								int qtdExperiencias = sc.nextInt();
								
								for(int i = 0; i < qtdExperiencias; i++) {
									Experiencia exp = new Experiencia();
									
									
									
									System.out.println("\nDigite seu cargo " + (i + 1) + "� empresa: ");
									String emprego = sc.next();
									exp.setEmprego(emprego);
									
									System.out.println("\nDigite o nome da " + (i + 1) + "� empresa:");
									String empresa = sc.next();
									exp.setEmpresa(empresa);
									
									System.out.println("\nDigite o ano de in�cio:");
									int anoInicio = sc.nextInt();
									exp.setAnoInicio(anoInicio);
									
									System.out.println("\n\nDigite o ano final:");
									int anoFinal = sc.nextInt();
									exp.setAnoFim(anoFinal);							
									
									listaExperiencias.add(exp);
									
									int idExperiencia = listaExperiencias.size();
									
									exp.setId(idExperiencia);
									
									cr.setExperiencia(exp);
									
									System.out.println("\nExperi�ncia adicionada. Id: " + exp.getId());
								}

								System.out.println("\nO que deseja fazer agora?\n1 - Voltar para curr�culo\n2 - Voltar para Home\n3 - Sair");
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
								System.out.println("\nPor favor, digite o Id da sua experi�ncia:");
								int idExperiencia = sc.nextInt();
								
								Experiencia experiencia = listaExperiencias.get(idExperiencia - 1);
								
								System.out.println("\nDigite seu cargo na empresa: ");
								String novoEmprego = sc.next();
								experiencia.setEmprego(novoEmprego);
								
								System.out.println("\nDigite o novo nome da empresa:");
								String novaEmpresa = sc.nextLine();
								experiencia.setEmpresa(novaEmpresa);
								
								System.out.println("\nDigite o ano de in�cio:");
								int novoAnoInicio = sc.nextInt();
								experiencia.setAnoInicio(novoAnoInicio);
								
								System.out.println("\nDigite o ano final:");
								int novoAnoFinal = sc.nextInt();
								experiencia.setAnoFim(novoAnoFinal);	
								
								System.out.println("\nSua experi�ncia foi alterada.");
								System.out.printf("\nEmprego: %s\nEmpresa: &s\nAno de In�cio: %d\nAno de Fim: %d",
										experiencia.getEmprego(), experiencia.getEmpresa(), experiencia.getAnoInicio(), experiencia.getAnoFim());
								
								System.in.read();
								
								break;
							
							case 9:
								System.out.println("\nPor favor, digite o Id da sua experi�ncia:");
								idExperiencia = sc.nextInt();
								
								listaExperiencias.remove(idExperiencia - 1);
								
								System.out.println("\nExperi�ncia exclu�da.");
								
								System.in.read();
								
								break;
							
							default:
								System.out.println("\nAlternativa inv�lida.");
								break;
						}
						
						break;
						
					case 2:
						System.out.println("\nPor favor, digite seu Id:");
						
						escolhaId = sc.nextInt();
						
						Candidato candidato = listaCandidatos.get(escolhaId - 1);
						
						System.out.println("\nDigite seu novo nome:");
						nome = sc.next();
						candidato.setNome(nome);
						
						System.out.println("\nDigite seu novo email:");
						email = sc.next();
						candidato.setEmail(email);
						
						System.out.println("\nDigite seu novo telefone:");
						telefone = sc.next();
						candidato.setTelefone(telefone);
						
						System.out.printf("\nSeus dados foram atualizados.\n\nNome: %s\nEmail: %s\nTelefone: %s", candidato.getNome(), candidato.getEmail(), candidato.getTelefone());
						
						System.in.read();
						
						break;
						
					case 3:
						System.out.println("\nPor favor, digite seu Id:");
						
						escolhaId = sc.nextInt();
						
						listaCandidatos.remove(escolhaId - 1);
						
						System.out.println("\nSeu usu�rio foi removido.");
						escolhaCandidato = 7;
						 	
						break;
					
					// Perfil
					case 4:
						System.out.println("\nQuantas skills deseja cadastrar?");
						int qtdSkills = sc.nextInt();
						
						for(int i = 0; i < qtdSkills; i++) {
							SkillSets skill = new SkillSets();
							
							System.out.println("\nDigite o nome da " + (i + 1) + "� skill:");
							String nomeSkill = sc.next();
							skill.setDescricaoCandidato(nomeSkill);
							
							do {
								System.out.println("\nQual � o n�vel dela?\n1 - B�sico\n2 - Intermedi�rio\n3 - Avan�ado");
								escolhaNivelSkill = sc.nextInt();
								
								if(escolhaNivelSkill == 1) {
									skill.setNivelSkill(EnumNivelSkill.BASICO);
									System.out.println("\nO n�vel da sua skill � B�SICO.");
								} else if (escolhaNivelSkill == 2) {
									skill.setNivelSkill(EnumNivelSkill.INTERMEDIARIO);
									System.out.println("\nO n�vel da sua skill � INTERMEDI�RIO.");
								} else if (escolhaNivelSkill == 3) {
									skill.setNivelSkill(EnumNivelSkill.AVANCADO);
									System.out.println("\nO n�vel da sua skill � AVAN�ADO.");
								} else {
									System.out.println("\nOp��o inv�lida. Insira novamente.");
								}
							} while (escolhaNivelSkill <= 0 | escolhaNivelSkill > 3);
							
							listaSkills.add(skill);
							
							int idSkill = listaSkills.size();
							
							skill.setId(idSkill);
							
							System.out.println("\nSkill adicionada. Id: " + skill.getId());
							
							skill.ExibirSkill();
							
							cr.setSkills(skill);

						}
						
					case 5:
						System.out.println("\nPor favor, insira o Id da Skill:");
						escolhaIdSkill = sc.nextInt();
						
						SkillSets skill = listaSkills.get(escolhaIdSkill - 1);
						
						System.out.println("\nDigite o novo nome da skill:");
						String novoNomeSkill = sc.next();
						skill.setDescricaoCandidato(novoNomeSkill);
		
						System.out.println("\nAgora escolha um n�vel:\n1 - B�SICO\n2 - INTERMEDI�RIO\n3 - AVAN�ADO");
						escolhaNovoNivelSkill = sc.nextInt();
						
						skill.AlterarNivelSkill(escolhaNovoNivelSkill);
						
						System.in.read();
						
					// Skills
					case 6:
						System.out.println("\nPor favor, insira o Id da Skill:");
						escolhaIdSkill = sc.nextInt();
						
						listaSkills.remove(escolhaIdSkill - 1);
						
						System.out.println("\nSkill exclu�da.");
						
						System.in.read();
						
						break;
						
					
					// Finalizar Sistema
					case 7:
						System.out.println("\nFinalizando sistema...");
						System.in.read();
						break;
					
					default:
						System.out.println("\nOp��o inv�lida. Tente novamente.");
						break;
					}
					
					
				} while (escolhaCandidato > 0 && escolhaCandidato < 7);
			
			// Empresa
			} else if (escolhaTipoUsuario == 2) {
						
			} 
		
		System.out.println("Sistema finalizado.");
		
		
	}

}
