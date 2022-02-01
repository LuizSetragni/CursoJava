package EstruturaSequencial;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pegando os Valores do Usuario.
        System.out.println("**********Calcular Delta**********");
        System.out.printf("Valor de A: ");
        Double a = sc.nextDouble();
        System.out.printf("Valor de B: ");
        Double b = sc.nextDouble();
        System.out.printf("Valor de C: ");
        Double c = sc.nextDouble();
        //fechando Scanner
        sc.close();
        //Fazendo o uso da biblioteca Math para valor elevado
        Double delta = (Math.pow(b, 2.0) - (4*a*c));

        System.out.println("Delta: " + delta);
        //Fazedo o calculo e salvando nas variaveis usando sqrt para raiz quadrada.
        System.out.println("\n**********Calcular Bhaskara**********\n");
        Double x1 = ((-b + Math.sqrt(delta))/(2.0 * a));
        Double x2 = ((-b - Math.sqrt(delta))/(2.0 * a));

        System.out.printf("Conjunto Solução: %.2f, %.2f\n", x1, x2);
    }
}
