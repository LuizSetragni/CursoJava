package EstruturasRepetitivas;
import java.util.Scanner;
public class MediaPonderada {
    /**
     * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
     * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
     * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
     * peso 5.
     * @param args
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite Quantidade: ");
    int quant = sc.nextInt();

    Double a, b, c, result;

    for(int i = 1; i <= quant; i++){
        System.out.println("Primeiro Valor: ");
        a = sc.nextDouble();
        System.out.println("Segundo Valor: ");
        b = sc.nextDouble();
        System.out.println("Terceiro Valor: ");
        c = sc.nextDouble();
        //formula media ponderada
        result = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5);
        System.out.printf("Resultado: %.2f\n", result);
    }
    sc.close();    
    }
}
