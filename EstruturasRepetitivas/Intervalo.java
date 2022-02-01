package EstruturasRepetitivas;
import java.util.Scanner;
public class Intervalo {
    /**
     * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
     * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
     * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int inteiro, in = 0, out = 0;

        System.out.println("Digite quantidade de numero: ");
        int quant = sc.nextInt();
        
        for(int i = 0; i < quant; i++){
            System.out.println("Digite um valor Inteiro: ");
            inteiro = sc.nextInt();

            if(inteiro >= 10 && inteiro <= 20) in++; 
            else out++;
        }
        sc.close();        
        System.out.printf("%d in \n%d out\n", in, out);
    }
}
