package Jogo;

import java.util.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// questao
		List<Pergunta> perguntas = new ArrayList<Pergunta>();
		Pergunta perg1 = new Pergunta();
		perg1.setEnunciadoP("Voce e um desenvolvedor?");
		perg1.setAlternativaA("A - Sim");
		perg1.setAlternativaB("B - talvez");
		perg1.setAlternativaC("C - nao");
		perg1.setAlternativaD("D - nao sei");
		perg1.setAlternativaCorreta('a');

		Pergunta perg2 = new Pergunta();
		perg2.setEnunciadoP("Voce tem quantos anos?");
		perg2.setAlternativaA("A - 22");
		perg2.setAlternativaB("B - 23");
		perg2.setAlternativaC("C - 26");
		perg2.setAlternativaD("D - 28-30");
		perg2.setAlternativaCorreta('c');

		Pergunta perg3 = new Pergunta();
		perg3.setEnunciadoP("Voce namora?");
		perg3.setAlternativaA("A - Sim");
		perg3.setAlternativaB("B - Nao");
		perg3.setAlternativaC("C - Talvez");
		perg3.setAlternativaD("D - Nao mesmo");
		perg3.setAlternativaCorreta('a');

		Pergunta perg4 = new Pergunta();
		perg4.setEnunciadoP("Um Computador deve sempre possuir um cooler para ligar?");
		perg4.setAlternativaA("A - Sim");
		perg4.setAlternativaB("B - Nao");
		perg4.setAlternativaC("C - Talvez");
		perg4.setAlternativaD("D - Nao mesmo");
		perg4.setAlternativaCorreta('a');

		Pergunta perg5 = new Pergunta();
		perg5.setEnunciadoP("Um Computador precisa de um processador?");
		perg5.setAlternativaA("A - Sim");
		perg5.setAlternativaB("B - Nao");
		perg5.setAlternativaC("C - Talvez");
		perg5.setAlternativaD("D - Nao mesmo");
		perg5.setAlternativaCorreta('a');

		Pergunta perg6 = new Pergunta();
		perg6.setEnunciadoP("Em qual ano o JAVA foi criado?");
		perg6.setAlternativaA("A - 1992");
		perg6.setAlternativaB("B - 1991");
		perg6.setAlternativaC("C - 1995");
		perg6.setAlternativaD("D - 1990");
		perg6.setAlternativaCorreta('b');

		Pergunta perg7 = new Pergunta();
		perg7.setEnunciadoP("Em qual ano o JAVASCRIPT foi criado?");
		perg7.setAlternativaA("A - 1992");
		perg7.setAlternativaB("B - 1991");
		perg7.setAlternativaC("C - 1995");
		perg7.setAlternativaD("D - 1990");
		perg7.setAlternativaCorreta('c');

		Pergunta perg8 = new Pergunta();
		perg8.setEnunciadoP("A linguagem C e considerada uma linguagem procedural?");
		perg8.setAlternativaA("A - Nao");
		perg8.setAlternativaB("B - Sim");
		perg8.setAlternativaC("C - Talvez");
		perg8.setAlternativaD("D - Ela e considerada uma linguagem comum");
		perg8.setAlternativaCorreta('b');

		Pergunta perg9 = new Pergunta();
		perg9.setEnunciadoP("Qual a linguagem mais utilizada hoje em dia em program��o?");
		perg9.setAlternativaA("A - Javascript");
		perg9.setAlternativaB("B - Java");
		perg9.setAlternativaC("C - C++");
		perg9.setAlternativaD("D - Angular");
		perg9.setAlternativaCorreta('a');

		Pergunta perg10 = new Pergunta();
		perg10.setEnunciadoP("Qual o objetivo de um desenvolvimento em espiral??");
		perg10.setAlternativaA("A - Ser mais agil");
		perg10.setAlternativaB("B - Construir um ambiente seguro para aplicacao!");
		perg10.setAlternativaC("C - Prover um metamodelo que pode acomodar processos especificos");
		perg10.setAlternativaD("D - Rodar programas mais complexos");
		perg10.setAlternativaCorreta('c');

		perguntas.add(perg1);
		perguntas.add(perg2);
		perguntas.add(perg3);
		perguntas.add(perg4);
		perguntas.add(perg5);
		perguntas.add(perg6);
		perguntas.add(perg7);
		perguntas.add(perg8);
		perguntas.add(perg9);
		perguntas.add(perg10);

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
		perso4.setHabilidadeP(
				"Futuro Gamer - Esta habilidade o ajuda em caracteristicas como: Intelecto aumentado, Poder Geek acima de 8000");

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
					int respostaFinal;
					do {
						Menu menu = new Menu();
						Partida novaPartida = new Partida();
						List<Jogador> salvaJogadores = new ArrayList<Jogador>();
						salvaJogadores = menu.chamarMenuEscolhaJogador();
						menu.menuPersonagem(personagens, salvaJogadores);
						novaPartida.inicioPartida(salvaJogadores, perguntas);
						System.out.println("1 - JOGAR NOVAMENTE");
						System.out.println("2 - VOLTAR AO MENU");
						respostaFinal = sc.nextInt();
					} while (respostaFinal == 1);
					break;
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
