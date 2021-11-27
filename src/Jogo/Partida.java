package Jogo;

import java.util.List;
import java.util.Scanner;

public class Partida {
	
	public void inicioPartida(List <Jogador> salvaJogadores, List <Pergunta> perguntas) {
		
		for(int a=0; a<salvaJogadores.size();a++) {
			
			for(int i=0; i<10;i++) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("------------------------------------------------------");
				System.out.println(perguntas.get(i).getEnunciadoP());
				System.out.println("------------------------------------------------------");
				
				System.out.println(perguntas.get(i).getAlternativaA());
				System.out.println(perguntas.get(i).getAlternativaB());
				System.out.println(perguntas.get(i).getAlternativaC());
				System.out.println(perguntas.get(i).getAlternativaD());
				
				//Pega a String e a primeira posição
				char respostaJogador = sc.next().charAt(0);
				
				if(respostaJogador == perguntas.get(i).getAlternativaCorreta()) {
					
					System.out.println("Voce acertou!!!");
					
				} else {
					
					System.out.println("Voce errou!!!");
					
				}
			}
		}
		
		
		
		
		
	}

}

