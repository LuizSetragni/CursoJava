package EstruturasRepetitivas;
import java.util.Scanner;
public class ExibeImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        //validação
        do{
            System.out.printf("Digite um numero: ");
            num = sc.nextInt();
        }while(num <= 1 && num <= 1000);
        //conferencia se é impar
        for(int i = 1; i <= num; i++){
            if(i % 2 == 1)System.out.println(i);
        }
        sc.close();
    }
}
