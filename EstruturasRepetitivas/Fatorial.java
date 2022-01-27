package EstruturasRepetitivas;
import java.util.Scanner;
public class Fatorial {
    /**
     * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
     * Lembrando que, por definição, fatorial de 0 é 1.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inteiro, fatorial = 1;

        System.out.println("Digite um numero inteiro: ");
        inteiro = sc.nextInt();
        sc.close();
        //validadendo fatorial de 0
        if(inteiro == 0){
            fatorial = 1;
        }else{
            for(int i = 2; i <= inteiro; i++){
                fatorial *= i;
            }
        }
        System.out.printf("Fatorial: %d\n", fatorial);
    }
    
}
