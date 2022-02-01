package EstruturasRepetitivas;
import java.util.*;
public class SomaRepeticao {
    public static void main(String[] args) {
        
        int x = -1, y = 0;
        
        Scanner sc = new Scanner(System.in);

        while(x != 0){
            System.out.println("Digite um numero (Exit - 0)");
            x = sc.nextInt();
            y += x;
        }

        System.out.printf("Resultado: %d\n", y);
        sc.close();
    }
}
