package EstruturaCondicional;
import java.util.Scanner;
public class ParImpar {
    /**
     * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
     * @param args
     */
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        
        if(num % 2 == 0) System.out.println("PAR");
        else System.out.println("IMPAR");

        sc.close();
    }
}
