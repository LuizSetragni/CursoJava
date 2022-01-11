package EstruturaCondicional;
import java.util.Scanner;
public class IntervaloValor {
    /**
     * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
     * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
     * nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
     * @param args
     */
    public static void main(String[] args) {
        double val;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Valor: ");
        val = sc.nextDouble();
        sc.close();
        if(val >= 0 && val <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(val > 25 && val <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(val > 50 && val <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(val > 75 && val <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora do Intervalo!");
        }

    }
}
