package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] vetorValores = new int[10];
		int soma = somaValores(vetorValores, 0, 0);
		System.out.println("Resultado: "+soma);
		
	}
	
	private static int somaValores(int[] vetorValores, int x, int soma){
		
		if(x == 10){
			return soma;
		}else{
			System.out.print("Digite o " +(x + 1) + "º valor: ");
			vetorValores[x] = input.nextInt();
			soma += vetorValores[x];
			x++;
			return somaValores(vetorValores, x, soma);
		}
	}
}		