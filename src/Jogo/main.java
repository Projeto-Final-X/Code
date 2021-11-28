package Jogo;

import java.util.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// questao
		
		List<Pergunta> perguntas = new ArrayList<Pergunta>();
		
		Pergunta perg1 = new Pergunta();
		perg1.setEnunciadoP("voce tem 21 anos?");
		perg1.setAlternativaA("A - Sim");
		perg1.setAlternativaB("B - talvez");
		perg1.setAlternativaC("C - nao");
		perg1.setAlternativaD("D - nao sei");

		perg1.setAlternativaCorreta('b');
		
		Pergunta perg2 = new Pergunta();
		perg2.setEnunciadoP("voce tem 22 anos?");
		perg2.setAlternativaA("A - Sim");
		perg2.setAlternativaB("B - talvez");
		perg2.setAlternativaC("C - nao");
		perg2.setAlternativaD("D - nao sei");

		perg2.setAlternativaCorreta('c');
		
		perguntas.add(perg1);
		perguntas.add(perg2);


		// personagem
		Personagem perso1 = new Personagem();

		perso1.setNomeP("MKJackson");
		perso1.setStatusP(false);
		perso1.setTempoDeVida(100);
		perso1.setIdP(01);
		perso1.setHabilidadeP("Thriller - Morde um de seus zumbis e fica super atento a todos os passos do outro jogador");

		Personagem perso2 = new Personagem();

		perso2.setNomeP("Hommer Simpson");
		perso2.setStatusP(false);
		perso2.setTempoDeVida(100);
		perso2.setIdP(02);
		perso2.setHabilidadeP("Donnuts - Hommer se alimenta muito bem e fica mais animado para batalha");

		Personagem perso3 = new Personagem();

		perso3.setNomeP("Neymar");
		perso3.setStatusP(true);
		perso3.setTempoDeVida(100);
		perso3.setIdP(03);
		perso3.setHabilidadeP("Jogador - Seu andado e diferenciado, o que o faz ser muito veloz dentro de jogo");

		Personagem perso4 = new Personagem();

		perso4.setNomeP("Jogador n1");
		perso4.setStatusP(true);
		perso4.setTempoDeVida(100);
		perso4.setIdP(04);
		perso4.setHabilidadeP("Futuro Gamer - Esta habilidade o ajuda em caracteristicas como: Intelecto aumentado, Poder Geek acima de 8000");

		Personagem perso5 = new Personagem();

		perso5.setNomeP("Super Homem");
		perso5.setStatusP(false);
		perso5.setTempoDeVida(100);
		perso5.setIdP(05);
		perso5.setHabilidadeP("Raio Lazer - Ele enxerga alem do momento muito astuto, cuidado com o seu raio");

		int continua = 1;

		while (continua != 10) {

			List<Personagem> personagens = new ArrayList<Personagem>();
			personagens.add(perso1);
			personagens.add(perso2);
			personagens.add(perso3);
			personagens.add(perso4);
			personagens.add(perso5);

			System.out.print("\n");

			System.out.println("----------------------BEM VINDO AO ASK DEV----------------------");

			System.out.println("----------------------------------------------------------------");
			System.out.println("1 - INICIALIZAR JOGO \n2 - SOBRE OS DESENVOLVEDORES \n3 - REGRAS DO JOGO \n4 - SAIR");
			System.out.println("----------------------------------------------------------------");

			int opcaoJogador = sc.nextInt();
			switch (opcaoJogador) {
				case 1:
					Menu menu = new Menu();
					
					Partida novaPartida = new Partida();

					List<Jogador> salvaJogadores = new ArrayList<Jogador>();
					salvaJogadores = menu.chamarMenuEscolhaJogador();
					menu.menuPersonagem(personagens, salvaJogadores);
					
					novaPartida.inicioPartida(salvaJogadores, perguntas);
					
				case 2:
					Menu menu2 = new Menu();
					menu2.sobreDesenvolvedores();
					break;
				case 3:
					Menu menu3 = new Menu();
					menu3.sobreOJogo();
					break;
				case 4:
					break;
					

			}
		}
		System.out.println("Tchau");
		System.exit(0);
	}

}
