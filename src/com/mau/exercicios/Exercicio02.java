package com.mau.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Sequencia();
	}
	
	static int x = 100;
	
	static public void Sequencia(){
		
		System.out.print(x +", ");
		x--;
		
		if(x >= 0){
			Sequencia();
		}
	}

}