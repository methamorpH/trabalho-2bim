package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio15 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade = 0;
		int media = recebeIdade(idade, 0);
		System.out.println("A média das idades é: "+media/10);

	}
	
	private static int recebeIdade(int idade, int c){
		
		System.out.println("Digite a idade do(a) " +(c +1) +" º aluno(a): ");
		idade += input.nextInt();
		c++;
		
			if(c == 10){
				return idade;
			}else{
				return recebeIdade(idade, c); 
			}
	}

}