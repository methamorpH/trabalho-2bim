package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio20 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		Integer x;
		System.out.println("Digite o número para ser calculado o fatorial:");
		x = input.nextInt();
		System.out.println("O fatorial de "+x+ " é: "+fatorial(x));	
	}
	
	public static Integer fatorial (Integer x){
		if (x<=1){
			return 1;
			
		}else{
			return x * fatorial (x - 1);
		}
	}
}