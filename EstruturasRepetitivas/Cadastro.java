package EstruturasRepetitivas;
import java.util.*;
public class Cadastro {
    /**
     * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
     * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
     * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
     * @param args
     */
    public static void main(String[] args) {
        int senha = 00, senhaValida = 00, cont = 00;
        Boolean validacao = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Cadastro**********");

        //validando senha com 4 digitos
        while(!validacao){
            System.out.println("Senha: ");
            senha = sc.nextInt();
            sc.nextLine();
            if(senha < 1000 || senha > 9999){
                System.out.println("Senha Invalida. (1111)");
                validacao = false;
            }else{
                validacao = true;
            }
        }
        //validando senha
        while(validacao){
            System.out.println("Senha: ");
            senhaValida = sc.nextInt();
            sc.nextLine();
            cont ++;
            //Bloquear e parar o programa se errar muitas vezes
            if(cont < 4){
                if(senha == senhaValida){
                    validacao = false;
                    System.out.println("Login efetuado com sucesso!");
                }else{
                    System.out.println("Login ou Senha Incorreta, Tente novamente.");
                
                    validacao = true;
                }
            }else{
                System.out.println("Senha bloqueada");
                System.exit(0);
            }
        }
        sc.close();
    }
}
