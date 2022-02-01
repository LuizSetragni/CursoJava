package EstruturaCondicional;
import java.util.Scanner;
public class Negativo {
    /**
     * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
     * @param args
     */
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        
        if(num < 0) System.out.println("Negativo");
        else System.out.println("Não Negativo");

        //testando expressão condicional ternária
        System.out.println((num < 0) ? "Negativo" : "Não Negativo");

        sc.close();
    }
}
