import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua Altura: ");
        Double altura = sc.nextDouble();
        System.out.println("Tamanho de Camisa: ");
        char tamBlusa = sc.next().charAt(0);



        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Tamanho Blusa: " + tamBlusa);
        sc.close();
    }
}
