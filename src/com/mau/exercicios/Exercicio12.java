package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio12 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite um número para gerar a tabuada: ");
		int x = input.nextInt();
		
		imprimeTabuada(x, 0);
	}
	
	private static void imprimeTabuada(int x, int c){
		System.out.println(x + " x " + c + " = " +(x * c));
		c++;
		
			if(c <=10){
				imprimeTabuada(x, c);
			}
	}

}