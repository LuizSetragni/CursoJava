package EstruturasRepetitivas;
import java.util.Scanner;
public class QuadradoCubo {
    /**
     * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
     * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inteiro;

        System.out.println("Digite um numero inteiro: ");
        inteiro = sc.nextInt();
        sc.close();

        for(Double i = 1.0; i <= inteiro; i++){
            System.out.printf("%.1f %.1f %.1f\n", i, Math.pow(i,2), Math.pow(i,3));
        }
    }
}
