package EstruturaCondicional;
import java.util.Scanner;
public class CordenadasDePonto {
    /**
     * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
     * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
     * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
     * @param args
     */
    public static void main(String[] args) {
        Double x, y;
        String resp = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        x = sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y = sc.nextDouble();
        sc.close();

        //Verificar se alguma variavel é igual a 0
        if(x == 0){
            if(y == 0){
                resp = "Origem";
            }else{
                resp = "Eixo X";
            }
        }else if(y == 0){
            resp = "Eixo Y";
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
}
