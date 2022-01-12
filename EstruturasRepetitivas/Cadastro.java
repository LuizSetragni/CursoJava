package EstruturasRepetitivas;
import java.util.Scanner;
public class Cadastro {
    /**
     * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
     * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
     * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
     * @param args
     */
    public static void main(String[] args) {
        int senha = 00, senhaValida;
        String usuario = "", usuarioValido = "";
        Boolean validacao;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Cadastro**********");
        //Fazendo uma repetição para validar o cadastro de login com o primeiro caracter sendo @
        do{
            System.out.println("Login: ");
            usuario = sc.nextLine();

            if(usuario.charAt(0) != '@'){
                validacao = false;
                System.out.println("Login Invalido. (@exemplo)");
            }else{
                validacao = true;
            }

        }while(!validacao);

        validacao = false;
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
        //validacao = false;
        //validando login e senha
        while(validacao){
            System.out.println("Login: ");
            usuarioValido = sc.nextLine();
            System.out.println("Senha: ");
            senhaValida = sc.nextInt();
            sc.nextLine();

            if(usuarioValido == usuario && senhaValida == senha){
                System.out.println("Login efetuado com sucesso!");
                validacao = false;
            }else{
                System.out.println("Login ou Senha Incorreta, Tente novamente.");
                validacao = true;
            }
        }
    }
}
