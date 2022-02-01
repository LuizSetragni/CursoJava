package EstruturasRepetitivas;
import java.util.Scanner;
public class ControleCombustivel {
    public static void main(String[] args) {

        int produto = 0, etanol = 0, gasolina = 0, diesel = 0;
        //Legenda
        System.out.println("**********TABELA**********");
        System.out.println("*      1 - Etanol        *");
        System.out.println("*      2 - Gasolina      *");
        System.out.println("*      3 - Diesel        *");
        System.out.println("*      4 - FIM           *");
        System.out.println("**************************");
        
        Scanner sc = new Scanner(System.in);
    
        do{
            System.out.printf("Produto: ");
            produto = sc.nextInt();
            //Somar quantidade e imprimir a tabela final
            switch(produto){
                case 1:{
                    etanol ++;
                   break; 
                }
                case 2:{
                    gasolina ++;
                   break; 
                }
                case 3:{
                    diesel ++;
                    break; 
                 }
                 case 4:{
                    System.out.printf("******MUITO OBRIGADO*****\n");
                    System.out.printf("*    1 - Etanol:   %d    *\n", etanol);
                    System.out.printf("*    2 - Gasolina: %d    *\n", gasolina);
                    System.out.printf("*    3 - Diesel:   %d    *\n", diesel);
                    System.out.printf("*************************\n");
            
                    break; 
                 }
                default:{
                    System.out.println("opção Invalida");
                    break; 
                }
            }

        }while(produto != 4);

        sc.close();
    }
}
