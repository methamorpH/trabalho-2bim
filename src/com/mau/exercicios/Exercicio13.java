package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio13 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		double nota = 0;
		double media = recebeNotas(nota, 0);
		System.out.println("A média das notas é: "+media/10);

	}
	
	private static double recebeNotas(double nota, int c){
		
		System.out.println("Digite a nota do(a) " +(c +1) +" º aluno(a): ");
		nota += input.nextDouble();
		c++;
		
			if(c == 10){
				return nota;
			}else{
				return recebeNotas(nota, c); 
			}
	}

}