package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio23 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite o 1º número: ");
		int x = input.nextInt();
		
		System.out.println("Agora digite o 2º número: ");
		int y = input.nextInt();
		
		System.out.println("O MDC é: " +funcaoCalcula(x, y));

	}
	
	private static int funcaoCalcula(int x, int y){
		
		if(x < y){
			System.out.println("Erro! O segundo número deve ser menor que o primeiro.");
			System.exit(0);
		}
		
		int c = x % y;
			if(c == 0){
				return y;
			}else{
				return funcaoCalcula(y, c);
			}
	}

}