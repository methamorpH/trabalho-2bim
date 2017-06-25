package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio21 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Digite quantos números triângulares deseja: ");
		int entradaUsuario = input.nextInt();
		
		numerosTriang(entradaUsuario, 1, 2);
	}
	
	private static void numerosTriang(int entradaUsuario, int x, int y){
		
		System.out.print(x +", ");
		
			if(entradaUsuario > 1){
				numerosTriang(entradaUsuario -1, x += y, y++);
			}
	}

}