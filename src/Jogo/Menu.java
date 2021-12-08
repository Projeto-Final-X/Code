package Jogo;

import java.util.*;

public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public List<Jogador> chamarMenuEscolhaJogador() {

		List<Jogador> jogadores = new ArrayList<Jogador>();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("-----------------Escolha quantos jogadores----------------------");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1 - 1 JOGADOR \n2 - 2 JOGADORES \n3 - SAIR");
		System.out.println("----------------------------------------------------------------");
		int opcaoJogador = sc.nextInt();
		switch (opcaoJogador) {
			case 1:
				// Cria um objeto jogador na classe jogadoln
				Jogador j1 = new Jogador();
				// Declara��o de variavel
				String nomejogador1;
				String apelidojogador1;
				String telefonejogador1;
				String emailjogador1;
				// Scanner proxima linha para nomejogador2
				// PARA SCANEAR MAIS DE 1 ENTRADA NO SCANNER E PRECISO COLOCAR 2 NEXTLINE NA
				// PRIMEIRA LINHA
				System.out.printf("Jogador 1 coloque seu nome por favor: ");
				nomejogador1 = sc.nextLine();
				sc.nextLine();
				System.out.printf("Jogador 1 coloque seu apelido por favor: ");
				apelidojogador1 = sc.nextLine();
				System.out.printf("Jogador 1 coloque seu telefone por favor: ");
				telefonejogador1 = sc.nextLine();
				System.out.printf("Jogador 1 coloque seu email por favor: ");
				emailjogador1 = sc.nextLine();
				// Setando o nomejogador1 para o jogador2
				j1.setNome(nomejogador1);
				j1.setApelido(apelidojogador1);
				j1.setTelefone(telefonejogador1);
				j1.setEmail(emailjogador1);
				System.out.println("O jogador1 com o nome de:" + j1.getApelido() + " Foi cadastrado com sucesso!");
				jogadores.add(j1);
				break;
			case 2:
				// Cria um objeto jogador na classe jogador
				Jogador j3 = new Jogador();
				// Declara��o de variavel
				String nomejogador3;
				String apelidojogador3;
				String telefonejogador3;
				String emailjogador3;
				// Scanner proxima linha para nomejogador2
				System.out.println("----------------------------------------------------------------");
				System.out.println("---------------------CADASTRO DE JOGADOR 1----------------------");
				System.out.println("----------------------------------------------------------------");
				// colocar nome
				System.out.printf("Jogador 1 coloque seu nome por favor: ");
				nomejogador3 = sc.nextLine();
				nomejogador3 = sc.nextLine();
				j3.setNome(nomejogador3);
				// apelido
				System.out.printf("Jogador 1 coloque seu apelido por favor: ");
				apelidojogador3 = sc.nextLine();
				j3.setApelido(apelidojogador3);
				apelidojogador1 = apelidojogador3;
				// telefone
				System.out.printf("Jogador 1 coloque seu telefone por favor: ");
				telefonejogador3 = sc.nextLine();
				j3.setTelefone(telefonejogador3);
				// email
				System.out.printf("Jogador 1 coloque seu email por favor: ");
				emailjogador3 = sc.nextLine();
				j3.setEmail(emailjogador3);
				System.out.println("----------------------------------------------------------------");
				System.out.println("O jogador 1 com o nome de:" + j3.getNome() + " Foi cadastrado com sucesso!");
				System.out.println("----------------------------------------------------------------");
				// Cria um objeto jogador na classe jogador
				Jogador j2 = new Jogador();
				// Declara��o de variavel
				String nomejogador2;
				String apelidojogador2;
				String telefonejogador2;
				String emailjogador2;
				System.out.println("----------------------------------------------------------------");
				System.out.println("----------------------CADASTRO DE JOGADOR 2---------------------");
				System.out.println("----------------------------------------------------------------");
				// Scanner proxima linha para nomejogador2
				System.out.printf("\nJogador 2 coloque seu nome por favor:");
				nomejogador2 = sc2.nextLine();
				j2.setNome(nomejogador2);
				System.out.printf("Jogador 2 coloque seu apelido por favor:");
				apelidojogador2 = sc2.nextLine();
				j2.setApelido(apelidojogador2);
				System.out.printf("Jogador 2 coloque seu telefone por favor:");
				telefonejogador2 = sc2.nextLine();
				j2.setTelefone(telefonejogador2);
				System.out.printf("Jogador 2 coloque seu email por favor:");
				emailjogador2 = sc2.nextLine();
				j2.setEmail(emailjogador2);
				System.out.println("------------------------------------------------------------------------");
				System.out.println("O jogador 2 com o nome de:" + j2.getNome() + " Foi cadastrado com sucesso!");
				System.out.println("------------------------------------------------------------------------");
				jogadores.add(j3);
				jogadores.add(j2);
				break;
			case 3:
				break;
		}
		return jogadores;
	}

	public void menuPersonagem(List<Personagem> personagens, List<Jogador> jogadores) {
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		// decisao de quantidade de jogadores
		if (jogadores.size() == 1) {
			// Colocar as descricoes de habilidade
			System.out.println("----------------------------------------------------------------");
			System.out.println("---------------Jogador 1 escolha seu personagem!----------------");
			System.out.println("----------------------------------------------------------------");
			// Aparecer personagens
			for (int i = 0; i < personagens.size(); i++) {
				System.out.print(
						i + 1 + "-" + personagens.get(i).getNomeP() + " Habilidade: " + personagens.get(i).getHabilidadeP() + "\n");
				System.out.println("----------------------------------------------------------------");
			}
			System.out.println("----------------------------------------------------------------");
			System.out.print("Escolha:");
			int opcaoPersonagem = sc3.nextInt();
			while(opcaoPersonagem <1 || opcaoPersonagem >=6 ){
				System.out.print("Erro voce precisa escolher um numero valido para prosseguir!");
				System.out.printf("Escolha:");
				int opcaoPersonagemE = sc3.nextInt();
				opcaoPersonagem = opcaoPersonagemE;	
			}
			// escolher personagem
			switch (opcaoPersonagem) {
				case 1:
					System.out
							.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(0).getNomeP());
					jogadores.get(0).setJogador1P(personagens.get(0));

					break;
				case 2:
					System.out
							.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(1).getNomeP());
					jogadores.get(0).setJogador1P(personagens.get(1));

					break;
				case 3:
					System.out
							.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(2).getNomeP());
					jogadores.get(0).setJogador1P(personagens.get(2));

					break;
				case 4:
					System.out
							.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(3).getNomeP());
					jogadores.get(0).setJogador1P(personagens.get(3));

					break;
				case 5:
					System.out
							.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(4).getNomeP());
					jogadores.get(0).setJogador1P(personagens.get(4));

					break;
			}
		} else if (jogadores.size() == 2) {
			// Colocar as descricoes de habilidade
			System.out.println("");
			System.out.println("----------------------------------------------------------------");
			System.out.println("---------------Jogador 1 escolha seu personagem!----------------");
			System.out.println("----------------------------------------------------------------");
			// mostrar personagens
			for (int i = 0; i < personagens.size(); i++) {
				System.out.print(
						i + 1 + "-" + personagens.get(i).getNomeP() + " Habilidade: " + personagens.get(i).getHabilidadeP() + "\n");
				System.out.println("----------------------------------------------------------------");
			}
			int opcaoPersonagem;
			System.out.print("Escolha o numero do personagem que voce deseja escolher!: ");
				opcaoPersonagem = sc3.nextInt();
					while(opcaoPersonagem <1 || opcaoPersonagem >=6){
						System.out.print("Erro voce precisa escolher um numero valido para prosseguir!");
						System.out.printf("Escolha:");
						int opcaoPersonagemE = sc3.nextInt();
						opcaoPersonagem = opcaoPersonagemE;		
					}
						// escolha de personagem
						switch (opcaoPersonagem) {
							case 1:
								System.out
										.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(0).getNomeP());
								jogadores.get(0).setJogador1P(personagens.get(0));
								personagens.remove(0);
								break;
							case 2:
								System.out
										.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(1).getNomeP());
								jogadores.get(0).setJogador1P(personagens.get(1));
								personagens.remove(1);
								break;
							case 3:
								System.out
										.printf(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(2).getNomeP());
								jogadores.get(0).setJogador1P(personagens.get(2));
								personagens.remove(2);
								break;
							case 4:
								System.out
										.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(3).getNomeP());
								jogadores.get(0).setJogador1P(personagens.get(3));
								personagens.remove(3);
								break;
							case 5:
								System.out
										.println(jogadores.get(0).getApelido() + " Voce escolheu o personagem " + personagens.get(4).getNomeP());
								jogadores.get(0).setJogador1P(personagens.get(4));
								personagens.remove(4);
								break;
							}
			System.out.println("");
			System.out.println("----------------------------------------------------------------");
			System.out.println("----------------Jogador 2 escolha seu personagem!---------------");
			System.out.println("----------------------------------------------------------------");
			// mostrar personagens
			for (int i = 0; i < personagens.size(); i++) {
				System.out.print(
						i + 1 + "-" + personagens.get(i).getNomeP() + " Habilidade: " + personagens.get(i).getHabilidadeP() + "\n");
				System.out.println("----------------------------------------------------------------");
			}
			System.out.print("Escolha o numero do personagem que voce deseja escolher!: ");
			int opcaoPersonagem2 = sc3.nextInt();
				while(opcaoPersonagem2 <1 || opcaoPersonagem2 >=5){
					System.out.print("Erro voce precisa escolher um numero valido para prosseguir!");
					System.out.printf("Escolha: ");
					int opcaoPersonagemE2 = sc3.nextInt();
					opcaoPersonagem2 = opcaoPersonagemE2;
				}
					// escolha de personagens
					switch (opcaoPersonagem2) {
						case 1:
							System.out
									.println(jogadores.get(1).getApelido() + " Voce escolheu o personagem " + personagens.get(0).getNomeP());
							jogadores.get(1).setJogador1P(personagens.get(0));
							personagens.remove(0);
							break;
						case 2:
							System.out
									.println(jogadores.get(1).getApelido() + " Voce escolheu o personagem " + personagens.get(1).getNomeP());
							jogadores.get(1).setJogador1P(personagens.get(1));
							personagens.remove(1);
							break;
						case 3:
							System.out
									.println(jogadores.get(1).getApelido() + " Voce escolheu o personagem " + personagens.get(2).getNomeP());
							jogadores.get(1).setJogador1P(personagens.get(2));
							personagens.remove(2);
							break;
						case 4:
							System.out
									.println(jogadores.get(1).getApelido() + " Voce escolheu o personagem " + personagens.get(3).getNomeP());
							jogadores.get(1).setJogador1P(personagens.get(3));
							personagens.remove(3);
							break;
					}
		}
	}

	public static void iniciarJogo() {

	}

	public void sobreOJogo() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("O objetivo do jogo e vencer o oponente, que utiliza habilidades tanto quanto voce,");
		System.out.println("essas habilidades tem o poder de influenciar no decorrer do jogo");
		System.out.println("tanto quanto a vida quanto as perguntas que serao apresentadas.");
		System.out.println("Todos os jogadores possuem vida, da qual e diminuida se responder a resposta de forma errada.");
		System.out.println("Essas perguntas e respostas sao sobre Tecnologia da Informa�ao.");
		System.out.println("O jogo termina quando a vida do oponente chegar a 0.");
		System.out.println("----------------------------------------------------------------");
		System.out.println("--------------------Pronto pra Jogar Ask Dev?-------------------");
	}

	public void sobreDesenvolvedores() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("-----------------O ASK DEV foi desenvolvido por:----------------");
		System.out.println("----------------------------------------------------------------");
		System.out
				.println("Nirlando Oliveira, cursando Analise e Desenvolvimento de sistemas na unidade UNA Cristiano machado");
		System.out.println("----------------------------------------------------------------");
		System.out.println(
				"Luan Victor Miranda Santiago, atualmente esta cursando Gestao em Ti na unidade UNA Cristiano machado");
		System.out.println("----------------------------------------------------------------");
		System.out
				.println("Guilherme Augusto, atualmente esta cursando Ciencia da Computacao na unidade UNA Cristiano machado");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Willian, atualmente esta cursando Ciencia da Computacao na unidade UNA Cristiano machado");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Miguel Veloso, atualmente cursando sistema de informacao");
		System.out.println("----------------------------------------------------------------");
	}

}
