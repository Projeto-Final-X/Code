package Jogo;

import java.util.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// questao
		List<Pergunta> perguntas = new ArrayList<Pergunta>();
		Pergunta perg1 = new Pergunta();
		perg1.setEnunciadoP("Qual e o tipo de diagrama da UML que exibe o fluxo de controle entre açoes que compoem um processo e especifica a ordem de execuçao das açoes no tempo, englobando parte da dimensao temporal do modelo de um sistema?");
		perg1.setAlternativaA("A - Atividades");
		perg1.setAlternativaB("B - Classes");
		perg1.setAlternativaC("C - Pacotes");
		perg1.setAlternativaD("D - Casos de uso");
		perg1.setAlternativaCorreta('a');

		Pergunta perg2 = new Pergunta();
		perg2.setEnunciadoP("Para que serve o diagrama de casos de uso?");
		perg2.setAlternativaA("A - Mostrar o fluxo de atividades em um unico processo e como uma atividade depende da outra");
		perg2.setAlternativaB("B - Descrever um conjunto de objetos e seus relacionamentos em um ponto no tempo");
		perg2.setAlternativaC("C - Descreve um cenario que mostra as funcionalidades do sistema do ponto de vista do usuario");
		perg2.setAlternativaD("D - Representar interaçoes entre objetos de um sistema");
		perg2.setAlternativaCorreta('c');

		Pergunta perg3 = new Pergunta();
		perg3.setEnunciadoP("Na linguagem UML, qual e o diagrama que descreve uma determinada interaçao entre o sistema e seus usuarios?");
		perg3.setAlternativaA("A - Diagrama de classes");
		perg3.setAlternativaB("B - Diagrama de casos de uso");
		perg3.setAlternativaC("C - Diagrama de objetos");
		perg3.setAlternativaD("D - Diagrama de componentes");
		perg3.setAlternativaCorreta('b');

		Pergunta perg4 = new Pergunta();
		perg4.setEnunciadoP("Tendo em vista o suporte para orientaçao a objetos na linguagem java, caso um objeto do tipo enumeraçao fosse criado, o que seria necessario para liberar seu armazenamento na memoria?");
		perg4.setAlternativaA("A - Invocar o coletor de lixo");
		perg4.setAlternativaB("B - Aguardar o coletor de lixo");
		perg4.setAlternativaC("C - invocar um metodo delete");
		perg4.setAlternativaD("D - Aguardar a chamada automatica do metodo dispose");
		perg4.setAlternativaCorreta('b');

		Pergunta perg5 = new Pergunta();
		perg5.setEnunciadoP("Assinale a alternativa correta sobre as caracteristicas da linguagem de programaçao java:");
		perg5.setAlternativaA("A - A execuçao do codigo-objeto e feita diretamente pelo sistema operacional");
		perg5.setAlternativaB("B - Nao possui tratamento de exceçoes");
		perg5.setAlternativaC("C - A linguagem e totalmente interpretada");
		perg5.setAlternativaD("D - Nao suporta o uso de ponteiros");
		perg5.setAlternativaCorreta('d');

		Pergunta perg6 = new Pergunta();
		perg6.setEnunciadoP("No contexto de Engenharia de Software, qual a definicao que melhor se enquadra a Regras de negocio?");
		perg6.setAlternativaA("A - Uma politica, diretriz, norma ou regulamento que defina ou restrinja algum aspecto do negocio");
		perg6.setAlternativaB("B - Uma restricao que e imposta as escolhas disponiveis para o desenvolvedor para o projeto e construcao de um produto");
		perg6.setAlternativaC("C - Um tipo de requisito nao-funcional que descreve um servico ou uma caracteristica de desempenho de um produto");
		perg6.setAlternativaD("D - Uma meta de negocios da organizacao que constroi um produto ou do cliente que o adquire");
		perg6.setAlternativaCorreta('a');

		Pergunta perg7 = new Pergunta();
		perg7.setEnunciadoP("Assinale a opçao que apresenta um dos principios da etapa de entrega de um incremento de sistema, programa ou software");
		perg7.setAlternativaA("A - Estabelecer estrutura de suporte antes da entrega do software");
		perg7.setAlternativaB("B - Levantar os requisitos funcionais do produto");
		perg7.setAlternativaC("C - Fornecer material instrucional adequado aos usuarios");
		perg7.setAlternativaD("D - Montar e testar parcialmente o pacote de entrega");
		perg7.setAlternativaCorreta('c');

		Pergunta perg8 = new Pergunta();
		perg8.setEnunciadoP("Qual e o diagrama que visa identificar os atores que utilizarão o software?");
		perg8.setAlternativaA("A - Diagrama de sequencia");
		perg8.setAlternativaB("B - Diagrama de casos de uso");
		perg8.setAlternativaC("C - Diagrama de objetos");
		perg8.setAlternativaD("D - Diagrama de classes");
		perg8.setAlternativaCorreta('b');

		Pergunta perg9 = new Pergunta();
		perg9.setEnunciadoP("Em um diagrama de caso de uso, o que ator representa?");
		perg9.setAlternativaA("A - Maquinas que interagem com o sistema");
		perg9.setAlternativaB("B - Papeis que os humanos tomam ao interagir com o sistema");
		perg9.setAlternativaC("C - Uma elipse e um rotulo com o nome do caso de uso");
		perg9.setAlternativaD("D - Humanos e outros sistemas que interagem com o assunto ou com o sistema");
		perg9.setAlternativaCorreta('d');

		Pergunta perg10 = new Pergunta();
		perg10.setEnunciadoP("Qual e o objetivo de um desenvolvimento em espiral?");
		perg10.setAlternativaA("A - Ser mais agil");
		perg10.setAlternativaB("B - Construir um ambiente seguro para aplicaçao");
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
						System.out.println("1 - CRIAR JOGO");
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
