package TrabalhoEstruturaSequencial;
import java.util.Scanner;
public class Soma {
    /**
     * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
     * mensagem explicativa
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Soma**********");
        System.out.printf("Primeiro Valor: ");
        int a = sc.nextInt();
        System.out.printf("Segundo Valor: ");
        int b = sc.nextInt();
        System.out.printf("Resultado: %d\n", a + b);

        sc.close();
    }
    
}
