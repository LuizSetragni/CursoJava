package EstruturaCondicional;
import java.util.Scanner;
public class HoraJogo {
    /**
     * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
     * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
     * @param args
     */
    public static void main(String[] args) {
        int inicio, fim, total = 0;
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Inicio: ");
        inicio = sc.nextInt();

        System.out.println("Digite Fim: ");
        fim = sc.nextInt();
            
        if(inicio > fim){
            total = (24 - inicio) + fim;
        }else if(inicio == fim){
            total = 24;
        }else{
            total = fim - inicio;
        }
        System.out.printf("O jogo durou: %d Hora(s)\n", total);
        sc.close();
    }
}
