package com.mau.exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		
		NumerosPares();
	}
	
	static int x = 2;
	
	static public void NumerosPares(){
		
		System.out.print(x +", ");
		x += 2;
		
		if(x <= 100){
			NumerosPares();
		}
	}

}