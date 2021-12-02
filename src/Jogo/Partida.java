package Jogo;

import java.util.List;
import java.util.Scanner;

public class Partida {

	public void fimPartida(List<Jogador> salvaJogadores) {
		if (salvaJogadores.size() == 1) {
			System.out.println(salvaJogadores.get(0).getNome() + " Voce Perdeu!! Sinto Muito, ");
			System.out.println("Sua vida restante chegou a: " + salvaJogadores.get(0).getJogador1P().getTempoDeVida());

		} else {
			if (salvaJogadores.get(0).getJogador1P().getTempoDeVida() > salvaJogadores.get(1).getJogador1P()
					.getTempoDeVida()) {
				System.out.println("O jogador vencedor é " + salvaJogadores.get(0).getNome());
			} else if (salvaJogadores.get(0).getJogador1P().getTempoDeVida() < salvaJogadores.get(1).getJogador1P()
					.getTempoDeVida()) {
				System.out.println("O jogador vencedor é " + salvaJogadores.get(1).getNome());
			} else {
				System.out.println("A vida do jogador 1 é:  " + salvaJogadores.get(0).getJogador1P().getTempoDeVida());
				System.out.println("A vida do jogador 2 é: " + salvaJogadores.get(1).getJogador1P().getTempoDeVida());
				System.out.println("O jogo empatou");
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
			while (salvaJogadores.get(0).getJogador1P().getTempoDeVida() > 0 && i < perguntas.size()) {
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
					System.out.print(" O restante de vida disponivel é: ");
					System.out.print(salvaJogadores.get(0).getJogador1P().getTempoDeVida());
					System.out.println("");
					System.out.println("------------------------------------------------------");
					i++;
				}
			}
			fimPartida(salvaJogadores);
		} else {

			boolean vezJogador1 = true;
			boolean vezJogador2 = false;

			while (vezJogador1 == true && i < perguntas.size()) {
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
					System.out.print(" O restante de vida disponivel é: ");
					System.out.print(salvaJogadores.get(0).getJogador1P().getTempoDeVida());
					System.out.println("");
					System.out.println("------------------------------------------------------");
					i++;
				}
			}
			// While do jogador2
			while (vezJogador2 == true && i < perguntas.size()) {
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
				if (respostaJogador2 == perguntas.get(i).getAlternativaCorreta()) {
					System.out.println("Voce acertou!!!");
					vezJogador2 = true;
					i++;
				} else if (respostaJogador2 != perguntas.get(i).getAlternativaCorreta()) {
					System.out.println("Voce errou!!!");
					vezJogador1 = true;
					vezJogador2 = false;
					// DEFINE O TEMPO DE VIDA DO JOGADOR 2 PARA 100 E DEPOIS DIMINUI EM 10 PELO
					// ERRO.
					salvaJogadores.get(1).getJogador1P()
							.setTempoDeVida(salvaJogadores.get(1).getJogador1P().getTempoDeVida() - 10);
					System.out.print("Voce perdeu 10 de vida");
					System.out.print(" O restante de vida disponivel é: ");
					System.out.print(salvaJogadores.get(1).getJogador1P().getTempoDeVida());
					System.out.println("");
					i++;
				}
			}
			fimPartida(salvaJogadores);
		}
	}
}
