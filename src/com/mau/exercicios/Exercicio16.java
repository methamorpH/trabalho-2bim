package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio16 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] vetorNomes = new String[10];
		recebeNomes(vetorNomes, 0);
		imprimeNomes(vetorNomes, 0);
	}
	
	private static void recebeNomes(String[] vetorNomes, int c){
		
		System.out.println("Digite o nome do(a)" +(c + 1) + " º aluno(a): ");
		vetorNomes[c] = input.nextLine();
		c++;
		
			if(c < 10){
				recebeNomes(vetorNomes, c);
			}
	}
	
	private static void imprimeNomes(String[] vetorNomes, int c){
		
		System.out.println("Nome do(a) " +(c + 1) +"º aluno(a): "+vetorNomes[c]);
		c++;
		
			if(c < 10){
				imprimeNomes(vetorNomes, c);
			}
	}

}