package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio10 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] matriz = new int [5][5];
		recebeValores(matriz, 0, 0, 0);
		imprimeMatriz(matriz, 0, 0, 0);

	}
	
	private static int[][] recebeValores(int [][] matriz, int x, int y, int c){
		
		System.out.println("Digite o " +(c + 1) +" º número da matriz: ");
		matriz[x][y] = input.nextInt();
		y++;
		c++;
		
			if(y == 5){
				x++;
				y = 0;
			}
			
			if(x > 4){
				return matriz;
			}
			return recebeValores(matriz, x, y, c);
	}
	
	private static void imprimeMatriz(int[][] matriz, int x, int y, int c ){
		
		System.out.print(matriz[x][y] + "    ");
		
		y++;
		c++;
		
			if(y == 5){
				x++;
				y = 0;
			}
				if(x < 5){
					imprimeMatriz(matriz, x, y, c);
			}
	}

}
