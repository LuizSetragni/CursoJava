package EstruturasRepetitivas;
import java.util.Scanner;
public class ConversãoCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result, valor;
        char condicao;
        do{
            System.out.println("Digite a temperatura em Celsius: ");
            valor = sc.nextDouble();
            result = ((9 * valor) / 5.0) + 32;
            System.out.printf("Equivalente Fahrenheit: %.2f\n", result);
            //Validação de s/n
            do{
            System.out.println("Deseja repetir? (S/N)");
            condicao = sc.next().charAt(0);
            if(condicao != 's' && condicao != 'S' && condicao != 'n' && condicao != 'N') System.out.println("Opção invalida!");
            }while(condicao != 's' && condicao != 'S' && condicao != 'n' && condicao != 'N');
            //se sim volta para a repetição
        }while(condicao == 's' || condicao == 'S');
        sc.close();
    }
}
