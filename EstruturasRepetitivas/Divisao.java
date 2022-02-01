package EstruturasRepetitivas;
import java.util.Scanner;
public class Divisao {
    /**
     * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
     * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant, a, b;

        System.out.println("Digite um numero inteiro: ");
        quant = sc.nextInt();
        sc.close();

        for(int i = 1; i <= quant; i++){
            System.out.println("Digite valor de A: ");
            b = sc.nextInt();
            System.out.println("Digite valor de B: ");
            a = sc.nextInt();

            if(b == 0) System.out.println("Divisão impossivel!");
            else System.out.printf("Resultado: %d\n", a/b);
        }
    }
}
