package com.mau.exercicios;

public class Exercicio09 {

	public static void main(String[] args) {
		
		NumerosImpares();
	}
	
	static int x = 99;
	
	static public void NumerosImpares(){
		
		System.out.print(x +", ");
		x -= 2;
		
		if(x >= 1){
			NumerosImpares();
		}
	}

}