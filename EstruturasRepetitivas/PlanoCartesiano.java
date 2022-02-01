package EstruturasRepetitivas;
import java.util.Scanner;
public class PlanoCartesiano {
    /**
     * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
     * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
     * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
     * @param args
     */
    public static void main(String[] args) {
        Double x = 1.0, y = 1.0 ;
        String resp = " ";
        Scanner sc = new Scanner(System.in);

        while (resp != ""){
            System.out.println("Digite o valor de X: ");
            x = sc.nextDouble();
            System.out.println("Digite o valor de Y: ");
            y = sc.nextDouble();
        
            //Verificar se alguma variavel é igual a 0
            if(x == 0 || y == 0){
             resp = "";  
            }
            //Verificar em qual quadrante o ponto está
            if (x > 0 && y > 0){
                resp = "Resposta: Q1";
            }else if(x > 0 && y < 0){
                resp = "Resposta: Q4";
            }else if(x < 0 && y < 0){
                resp = "Resposta: Q3";
            }else if(x < 0 && y > 0){
                resp = "Resposta: Q2";
            }

            System.out.println(resp);
        }
        sc.close();
    }
}
