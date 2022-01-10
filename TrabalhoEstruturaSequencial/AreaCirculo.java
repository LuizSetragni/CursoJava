package TrabalhoEstruturaSequencial;
import java.util.Scanner;
public class AreaCirculo {
    /**
     * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
     * casas decimais
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Área de um Círculo**********");
        System.out.printf("Raio: ");
        double raio = sc.nextDouble();
        System.out.printf("Resultado: %.4f\n", (Math.pow(raio, 2.0) * 3.14159));
        sc.close();
    } 
}
