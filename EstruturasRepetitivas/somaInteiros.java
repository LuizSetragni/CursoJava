package EstruturasRepetitivas;
import java.util.Scanner;
public class somaInteiros {
    public static void main(String[] args) {
        int num = 0, result = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade a ser Inserida: ");
        int quant = sc.nextInt();

        for(int i = 0; i < quant; i++){
            System.out.println("Digite um Numero: ");
            num = sc.nextInt();
            result += num;
        }

        System.out.printf("Resultado: %d\n", result);

        sc.close();
    }   
}
