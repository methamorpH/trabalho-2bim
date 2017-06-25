package com.mau.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Sequencia();
	}
	
	static int x = 0;
	
	static public void Sequencia(){
		
		System.out.print(x +", ");
		x ++;
		
		if(x <= 100){
			Sequencia();
		}
	}

}