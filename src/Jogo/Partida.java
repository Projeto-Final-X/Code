package Jogo;

import java.util.List;
import java.util.Scanner;

public class Partida {

	
	public void inicioPartida(List <Jogador> salvaJogadores, List <Pergunta> perguntas) {
		Scanner sc = new Scanner(System.in);
		for(int a=0; a<salvaJogadores.size();a++) {
			boolean vezJogador1 = true;
			boolean vezJogador2 = false;
			int i = 0;
				while(vezJogador1 == true) {
					
					System.out.println("");
					System.out.println("JOGADOR 1 E SUA VEZ DE JOGAR!");
					
					
					System.out.println("------------------------------------------------------");
					System.out.println(perguntas.get(i).getEnunciadoP());
					System.out.println("------------------------------------------------------");
					
					System.out.println(perguntas.get(i).getAlternativaA());
					System.out.println(perguntas.get(i).getAlternativaB());
					System.out.println(perguntas.get(i).getAlternativaC());
					System.out.println(perguntas.get(i).getAlternativaD());
					
					//Pega a String e a primeira posição
					char respostaJogador1 = sc.next().charAt(0);
					
					if(respostaJogador1 == perguntas.get(i).getAlternativaCorreta()) {
						
						System.out.println("Voce acertou!!!");
						vezJogador1 = true;
						i++;
						
					} else if(respostaJogador1 != perguntas.get(i).getAlternativaCorreta()) {
						
						System.out.println("Voce errou!!!");
						
						vezJogador1 = false;
						vezJogador2 = true;
						
						//DEFINE O TEMPO DE VIDA DO JOGADOR 1 PARA 100 E DEPOIS DIMINUI EM 10 PELO ERRO.
						salvaJogadores.get(0).getJogador1P().setTempoDeVida(salvaJogadores.get(0).getJogador1P().getTempoDeVida()-10);
						System.out.print(salvaJogadores.get(0).getJogador1P().getTempoDeVida());
						i++;
					}
				
				}
					
					//While do jogador2
				while(vezJogador2 == true) {
						System.out.println("JOGADOR 2 E SUA VEZ DE JOGAR!");

						System.out.println("------------------------------------------------------");
						System.out.println(perguntas.get(i).getEnunciadoP());
						System.out.println("------------------------------------------------------");
						
						System.out.println(perguntas.get(i).getAlternativaA());
						System.out.println(perguntas.get(i).getAlternativaB());
						System.out.println(perguntas.get(i).getAlternativaC());
						System.out.println(perguntas.get(i).getAlternativaD());
						
						//Pega a String e a primeira posição
						char respostaJogador2 = sc.next().charAt(0);
						
						if(respostaJogador2 == perguntas.get(i).getAlternativaCorreta()) {
							
							System.out.println("Voce acertou!!!");
							vezJogador2 = true;
							i++;
							
						} else if(respostaJogador2 != perguntas.get(i).getAlternativaCorreta()) {
							
							System.out.println("Voce errou!!!");
							vezJogador1 = true;
							vezJogador2 = false;
							
							//DEFINE O TEMPO DE VIDA DO JOGADOR 2 PARA 100 E DEPOIS DIMINUI EM 10 PELO ERRO.
							salvaJogadores.get(1).getJogador1P().setTempoDeVida(salvaJogadores.get(1).getJogador1P().getTempoDeVida()-10);
							System.out.print(salvaJogadores.get(1).getJogador1P().getTempoDeVida());
							i++;
						}
					
				}
		}
		
		
	}

}

