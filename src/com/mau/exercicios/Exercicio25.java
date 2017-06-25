package com.mau.exercicios;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite quantos números de Pell deseja gerar: ");
        int x = input.nextInt();

        imprimeSequencia(x, 0);
    }

    private static void imprimeSequencia(int x, int c) {
        if (x > c) {
            System.out.printf("Pell de  %d = %d \n", c, numeroPell(c));

            imprimeSequencia(x, ++c);
        }
    }

    static int numeroPell(int x) {
        if (x == 0 || x == 1)
            return x;
        else
            return 2 * numeroPell(x - 1) + numeroPell(x - 2);

    }
}