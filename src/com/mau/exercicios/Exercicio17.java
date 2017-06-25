package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio17 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x = 0 ;
	    int y = 0;

		System.out.println("Digite o 1º número: ");
		x = input.nextInt();

		System.out.println("Digite o 2º número: ");
		y = input.nextInt();

		System.out.print(x + " x " + y + " = ");
		
		imprimeFuncao(y, x);
		
		System.out.print(" = " + (x * y));
	}

	private static String imprimeFuncao(int y, int c) {
		if(c == 0) return "0";
		
		if(c > 1) System.out.print(y + " + ");
		if(c == 1) System.out.print(y);
		c--;
		
		return imprimeFuncao(y, c);
	}
}