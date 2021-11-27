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

		Personagem perso2 = new Personagem();

		perso2.setNomeP("Hommer Simpson");
		perso2.setStatusP(false);
		perso2.setTempoDeVida(100);
		perso2.setIdP(02);

		Personagem perso3 = new Personagem();

		perso3.setNomeP("Luan");
		perso3.setStatusP(true);
		perso3.setTempoDeVida(10);
		perso3.setIdP(03);

		Personagem perso4 = new Personagem();

		perso4.setNomeP("gui");
		perso4.setStatusP(true);
		perso4.setTempoDeVida(1000);
		perso4.setIdP(04);

		Personagem perso5 = new Personagem();

		perso5.setNomeP("Nirlandao");
		perso5.setStatusP(false);
		perso5.setTempoDeVida(3000);
		perso5.setIdP(05);

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
					
					
					
					

			}
		}
		System.out.println("Tchau");
		System.exit(0);
	}

}
