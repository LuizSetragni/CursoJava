package Aplication1;
import java.util.Scanner;
class App{
    /**
     * Exercício de fixação, fazendo o programa na main e como função para teste.
     * @param args
     */
    public static void main(String[] args) {
        double xA, xB, xC, yA, yB, yC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        double pY = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Triangle X area: %.2f\n", areaX);
        System.out.printf("Triangle Y area: %.2f\n", areaY);

        if(areaX > areaY) System.out.println("Larger area: X");
        else System.out.println("Larger area: Y");

        sc.close();
    }
}