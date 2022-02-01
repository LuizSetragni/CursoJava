package EstruturaSequencial;
import java.util.Scanner;
public class ValorPeca {
    /**
     * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
     * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o codigo: ");
        int cod1 = sc.nextInt();
        System.out.printf("Digite a quantidade de peças: ");
        int quant1 = sc.nextInt();
        System.out.printf("Digite o valor: ");
        Double val1 = sc.nextDouble();

        System.out.printf("\nDigite o codigo: ");
        int cod2 = sc.nextInt();
        System.out.printf("Digite a quantidade de peças: ");
        int quant2 = sc.nextInt();
        System.out.printf("Digite o valor: ");
        double val2 = sc.nextDouble();

        sc.close();

        System.out.printf("Valor a pagar da soma das peças %d e %d: R$ %.2f\n",cod1, cod2, ((quant1 * val1) + (quant2 * val2)));

    }   
}
