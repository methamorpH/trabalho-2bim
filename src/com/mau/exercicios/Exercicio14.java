package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio14 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int faltas = 0;
		int media = recebeFaltas(faltas, 0);
		System.out.println("A m�dia das faltas �: "+media/10);

	}
	
	private static int recebeFaltas(int faltas, int c){
		
		System.out.println("Digite as faltas do(a) " +(c +1) +" � aluno(a): ");
		faltas += input.nextInt();
		c++;
		
			if(c == 10){
				return faltas;
			}else{
				return recebeFaltas(faltas, c); 
			}
	}

}