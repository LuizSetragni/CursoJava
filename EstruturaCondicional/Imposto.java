package EstruturaCondicional;
import java.util.Scanner;
public class Imposto {
    /**
     * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
     * que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
     * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
     * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
     * mostre o valor que esta pessoa deve pagar de Imposto de Renda
     * @param args
     */
    public static void main(String[] args) {
        //Declarações de variaveis
        Double salario = 0.0, imposto = 0.0, aux = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um Salario: ");
        salario = sc.nextDouble();

        sc.close();
        //Validação de um salario > 0
        if(salario < 0.0) {
            System.out.println("Salario Invalido!");
            System.exit(0);
        }
        //Condição se salario for <= 2000
        if(salario <= 2000.0){
            System.out.printf("Salario: %.2f\n", salario);
            System.out.println("TAXA: Isento");
            System.exit(0);
        }else if(salario > 2000.0){
            if(salario <= 3000.0){
                aux = 3000.0 - salario; //buscando o valor para ser feita porcentagem
                imposto += (aux / 100.0) * 8.0;//porcentagem
            }else{
                imposto += (999.9 / 100.0) * 8.0;
                if(salario <= 4500){
                    aux = salario - 3000;
                    imposto += (aux / 100.0) * 18.0;
                }else{
                    imposto += (1499.99 / 100.0) * 18.0;
                    if(salario > 4500){
                        aux = salario - 4500;
                        imposto += (aux / 100.0) * 28.0;
                    }
                }
            }
        }
        System.out.printf("Taxa Arrecadada: R$ %.2f\n", imposto);
    }
}
