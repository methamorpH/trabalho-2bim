package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio24 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite a quantidade de discos: ");
		int discos = input.nextInt();
		
		funcaoHanoi(discos, 'A', 'B', 'C' );

		}
	
	private static void funcaoHanoi(int discos, char origem, char auxiliar, char destino){
		
		if(discos > 0){
			funcaoHanoi(discos - 1, origem, destino, auxiliar);
			
			System.out.printf("Mover de %s para %s\n", origem, destino);
			
			funcaoHanoi(discos - 1, auxiliar, origem, destino);
		}
	}

}