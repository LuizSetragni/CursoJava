package EstruturasRepetitivas;
import java.util.Scanner;
public class Divisores {
    /**
     * Ler um número inteiro N e calcular todos os seus divisores.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inteiro;

        System.out.println("Digite um numero inteiro: ");
        inteiro = sc.nextInt();
        sc.close();

        for(int i = 1; i <= inteiro; i++){
            if(inteiro % i == 0) System.out.println(i);
        }
    }
}
