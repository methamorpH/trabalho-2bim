package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio22 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite a posição desejada: ");
		long c = input.nextInt();
		
		System.out.println(fibo(c));

	}
	
	private static int fibo(long x){
		if(x <= 1){
			return 1;
			
		}else{
			return fibo(x -1) + fibo(x -2);
		}
	}

}