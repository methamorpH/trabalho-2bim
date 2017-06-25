package com.mau.exercicios;

public class Exercicio07 {

	public static void main(String[] args) {
		
		NumerosImpares();
	}
	
	static int x = 1;
	
	static public void NumerosImpares(){
		
		System.out.print(x +", ");
		x += 2;
		
		if(x <= 100){
			NumerosImpares();
		}
	}

}