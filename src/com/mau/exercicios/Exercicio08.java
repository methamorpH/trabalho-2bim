package com.mau.exercicios;

public class Exercicio08 {

	public static void main(String[] args) {
		
		NumerosPares();
	}
	
	static int x = 100;
	
	static public void NumerosPares(){
		
		System.out.print(x +", ");
		x -= 2;
		
		if(x >= 0){
			NumerosPares();
		}
	}

}