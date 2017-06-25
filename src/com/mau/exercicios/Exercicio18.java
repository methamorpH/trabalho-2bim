package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio18 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite o valor do capital: ");
		double x = input.nextDouble();
		
		System.out.println("Digite a taxa em % de empr�stimo: ");
		double y = input.nextDouble();
		
		System.out.println("Digite a quantidade de meses para simula��o: ");
		int z = input.nextInt();
		
		imprimeFuncao(x, y, z, 1);
	}
	
	private static void imprimeFuncao(double x, double y, int z, int c){
		if(c <= z){
			if(c > 1){
				System.out.println(c + " meses = " + x * (y/100) * c);
			}else{
				System.out.println(c + " m�s = " + x * (y/100) * c);
			}
		}
		c++;
		
		if (c <= z) imprimeFuncao(x, y, z, c);
	}

}