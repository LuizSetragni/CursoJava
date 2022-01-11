package EstruturaSequencial;

import java.util.Scanner;

public class SalarioFuncionario {
    /**
     * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
     * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        int d = sc.nextInt();

        sc.close();

        int diferenca = (a*b-c*d);

        System.out.println(diferenca);
    }
}
