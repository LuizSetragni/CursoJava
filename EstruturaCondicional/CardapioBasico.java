package EstruturaCondicional;
import java.util.Scanner;
public class CardapioBasico {
    /**
     *Escreva um programa que leia o código de um item e a quantidade deste item. A
     seguir, calcule e mostre o valor da conta a pagar
     * @param args
     */
    public static void main(String[] args) {
        int codigo, quant;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto:");
        codigo = sc.nextInt();
        if(codigo < 1 || codigo > 5){
            System.out.println("Codigo Invalido!");
            System.exit(0);
        } 
        
        System.out.println("Quantidade: ");
        quant = sc.nextInt();
        sc.close();
        if(quant <= 0){
            System.out.println("Quantidade Invalida");
            System.exit(0);
        } 
        switch(codigo){
            case 1:{
                System.out.printf("Cachorro Quente:\nTOTAL: R$ %.2f\n", (quant * 4.00));
                break;
            }
            case 2:{
                System.out.printf("X-Salada:\nTOTAL: R$ %.2f\n", (quant * 4.50));
                break;
            }
            case 3:{
                System.out.printf("X-Bacon:\nTOTAL: R$ %.2f\n", (quant * 5.00));
                break;
            }
            case 4:{
                System.out.printf("Torrada Simples:\nTOTAL: R$ %.2f\n", (quant * 2.00));
                break;
            }
            case 5:{
                System.out.printf("Refrigerante:\nTOTAL: R$ %.2f\n", (quant * 1.50));
                break;
            }
        }
    }
}
