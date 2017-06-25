package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	
		int[] vetorValores = new int[10];
		recebeValores(vetorValores, 0);
		int mValor = vetorValores[9];
		
		System.out.print("O menor valor digitado é: " +recebe_mValor(vetorValores, 0, mValor));
		

	}
	
	public static void recebeValores(int[] vetorValores, int x){
		
		System.out.println("Digite o " +(x + 1) +" º valor: ");
		vetorValores[x] = input.nextInt();
		x++;
		
			if(x < 10){
				recebeValores(vetorValores, x);
			}
	}
	
	private static int recebe_mValor(int[] vetorValores, int y, int mValor){
		
			if(vetorValores[y] > mValor){
				mValor = vetorValores[y];
				}
			y++;
			
			if(y < 10){
				return recebe_mValor(vetorValores, y, mValor);
			}
			return mValor;
	}

}