package EstruturaSequencial;
import java.util.Scanner;

public class DadosFuncionarios {
    /**
     * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
     * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
     * decimais
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matricula: ");
        int matricula = sc.nextInt();
        System.out.println("Horas Trabalhadas: ");
        double hora = sc.nextDouble();
        System.out.println("Valor Hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("NUMBER: " + matricula);
        System.out.println("SALARY: " + (hora * valorHora));

        sc.close();
    }
}
