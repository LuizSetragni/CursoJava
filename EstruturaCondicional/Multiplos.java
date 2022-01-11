package EstruturaCondicional;
import java.util.Scanner;
public class Multiplos {
    /**
     * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
     * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
     * ordem crescente ou decrescente.
     * @param args
     */
    public static void main(String[] args) {
        int A, B;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite valor de A: ");
        B = sc.nextInt();
        
        if(A % B == 0 || B % A == 0) System.out.println("Multiplo");
        else System.out.println("Não são multiplos");

        sc.close();
    }
    
}
