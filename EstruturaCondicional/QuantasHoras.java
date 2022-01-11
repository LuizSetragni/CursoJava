package EstruturaCondicional;
import java.util.Scanner;
public class QuantasHoras {
    public static void main(String[] args) {
        int hora;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas Horas? ");
        hora = sc.nextInt();

        if(hora >= 6 && hora < 12) System.out.println("Bom Dia!");
        else if(hora >= 12 && hora < 18) System.out.println("Boa Tarde!");
        else System.out.println("Boa Noite!");

        sc.close();
    } 
}
