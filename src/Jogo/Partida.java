package Jogo;

import java.util.List;
import java.util.Scanner;

public class Partida {

	public void fimPartida(List<Jogador> salvaJogadores) {
		if (salvaJogadores.size() == 1) {
			System.out.print(salvaJogadores.get(0).getNome() + " Voce Perdeu!! Sinto Muito, ");
			System.out.print("Sua vida restante chegou a: " + salvaJogadores.get(0).getJogador1P().getTempoDeVida());
			System.exit(0);
		} else {
			if (salvaJogadores.get(0).getJogador1P().getTempoDeVida() > salvaJogadores.get(1).getJogador1P()
					.getTempoDeVida()) {
				System.out.print("O jogador vencedor �" + salvaJogadores.get(0).getNome());
			} else if (salvaJogadores.get(0).getJogador1P().getTempoDeVida() < salvaJogadores.get(1).getJogador1P()
					.getTempoDeVida()) {
				System.out.print("O jogador vencedor �" + salvaJogadores.get(1).getNome());
			} else {
				System.out.print("O jogo empatou");
			}
		}

	}

	public void inicioPartida(List<Jogador> salvaJogadores, List<Pergunta> perguntas) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		// Se tiver somente 1 jogador
		if (salvaJogadores.size() == 1) {
			// enquanto a vida do personagem do jogador 1 for maior do que 0 ele joga
			// avontade
			while (salvaJogadores.get(0).getJogador1P().getTempoDeVida() > 0) {
				System.out.println("------------------------------------------------------");
				System.out.println("JOGUE!");
				System.out.println("------------------------------------------------------");
				System.out.println(perguntas.get(i).getEnunciadoP());
				System.out.println("------------------------------------------------------");
				System.out.println(perguntas.get(i).getAlternativaA());
				System.out.println(perguntas.get(i).getAlternativaB());
				System.out.println(perguntas.get(i).getAlternativaC());
				System.out.println(perguntas.get(i).getAlternativaD());
				// Pega a String e a primeira posi��o
				char respostaJogador1 = sc.next().charAt(0);
				int confirmacaoJogador;
				do {
					System.out.println("Voce tem certeza da respota?");
					System.out.println("1- SIM?");
					System.out.println("2- NAO?");
					confirmacaoJogador = sc.nextInt();
				} while (confirmacaoJogador != 1 && confirmacaoJogador != 2);
				switch (confirmacaoJogador) {
					case 1:
						if (respostaJogador1 == perguntas.get(i).getAlternativaCorreta()) {
							System.out.println("Voce acertou!!!");
							i++;
						} else if (respostaJogador1 != perguntas.get(i).getAlternativaCorreta()) {
							System.out.println("Voce errou!!!");
							// DEFINE O TEMPO DE VIDA DO JOGADOR 1 PARA 100 E DEPOIS DIMINUI EM 10 PELO
							// ERRO.
							salvaJogadores.get(0).getJogador1P()
									.setTempoDeVida(salvaJogadores.get(0).getJogador1P().getTempoDeVida() - 30);
							System.out.print("Voce perdeu 30 de vida!!");
							System.out.print(" O restante de vida disponivel �: ");
							System.out.print(salvaJogadores.get(0).getJogador1P().getTempoDeVida());
							System.out.println("");
							System.out.println("------------------------------------------------------");
							i++;
						}
						break;
					case 2:
						break;
				}

			}
			fimPartida(salvaJogadores);
		} else {
			for (int a = 0; a < salvaJogadores.size(); a++) {
				if (salvaJogadores.size() == 2) {
					boolean vezJogador1 = true;
					boolean vezJogador2 = false;

					while (vezJogador1 == true) {
						System.out.println("------------------------------------------------------");
						System.out.println("JOGADOR 1 E SUA VEZ DE JOGAR!");
						System.out.println("------------------------------------------------------");
						System.out.println(perguntas.get(i).getEnunciadoP());
						System.out.println("------------------------------------------------------");
						System.out.println(perguntas.get(i).getAlternativaA());
						System.out.println(perguntas.get(i).getAlternativaB());
						System.out.println(perguntas.get(i).getAlternativaC());
						System.out.println(perguntas.get(i).getAlternativaD());
						// Pega a String e a primeira posi��o
						char respostaJogador1 = sc.next().charAt(0);
						int confirmacaoJogador;
						do {
							System.out.println("Voce tem certeza da respota?");
							System.out.println("1- SIM?");
							System.out.println("2- NAO?");
							confirmacaoJogador = sc.nextInt();
						} while (confirmacaoJogador != 1 && confirmacaoJogador != 2);
						switch (confirmacaoJogador) {
							case 1:
								if (respostaJogador1 == perguntas.get(i).getAlternativaCorreta()) {
									System.out.println("Voce acertou!!!");
									vezJogador1 = true;
									i++;
								} else if (respostaJogador1 != perguntas.get(i).getAlternativaCorreta()) {
									System.out.println("Voce errou!!!");
									vezJogador1 = false;
									vezJogador2 = true;
									// DEFINE O TEMPO DE VIDA DO JOGADOR 1 PARA 100 E DEPOIS DIMINUI EM 10 PELO
									// ERRO.
									salvaJogadores.get(0).getJogador1P()
											.setTempoDeVida(salvaJogadores.get(0).getJogador1P().getTempoDeVida() - 10);
									System.out.print("Voce perdeu 10 de vida!!");
									System.out.print(" O restante de vida disponivel �: ");
									System.out.print(salvaJogadores.get(0).getJogador1P().getTempoDeVida());
									System.out.println("");
									System.out.println("------------------------------------------------------");
									i++;
								}
								break;
							case 2:
								break;
						}
					}
					// While do jogador2
					while (vezJogador2 == true) {
						System.out.println(" JOGADOR 2 E SUA VEZ DE JOGAR!");
						System.out.println("------------------------------------------------------");
						System.out.println(perguntas.get(i).getEnunciadoP());
						System.out.println("------------------------------------------------------");
						System.out.println(perguntas.get(i).getAlternativaA());
						System.out.println(perguntas.get(i).getAlternativaB());
						System.out.println(perguntas.get(i).getAlternativaC());
						System.out.println(perguntas.get(i).getAlternativaD());
						// Pega a String e a primeira posi��o
						char respostaJogador2 = sc.next().charAt(0);
						int confirmacaoJogador;
						do {
							System.out.println("Voce tem certeza da respota?");
							System.out.println("1- SIM?");
							System.out.println("2- NAO?");
							confirmacaoJogador = sc.nextInt();
						} while (confirmacaoJogador != 1 && confirmacaoJogador != 2);
						switch (confirmacaoJogador) {
							case 1:
								if (respostaJogador2 == perguntas.get(i).getAlternativaCorreta()) {
									System.out.println("Voce acertou!!!");
									vezJogador1 = true;
									i++;
								} else if (respostaJogador2 != perguntas.get(i).getAlternativaCorreta()) {
									System.out.println("Voce errou!!!");
									vezJogador1 = false;
									vezJogador2 = true;
									// DEFINE O TEMPO DE VIDA DO JOGADOR 1 PARA 100 E DEPOIS DIMINUI EM 10 PELO
									// ERRO.
									salvaJogadores.get(0).getJogador1P()
											.setTempoDeVida(salvaJogadores.get(0).getJogador1P().getTempoDeVida() - 10);
									System.out.print("Voce perdeu 10 de vida!!");
									System.out.print(" O restante de vida disponivel �: ");
									System.out.print(salvaJogadores.get(0).getJogador1P().getTempoDeVida());
									System.out.println("");
									System.out.println("------------------------------------------------------");
									i++;
								}
								break;
							case 2:
								break;
						}
					}
					fimPartida(salvaJogadores);
				}
				System.out.println("SAI DO ELSE");
			}
		}

	}
}
