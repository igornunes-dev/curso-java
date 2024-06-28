import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
        /*
        TO-DO:Conhecer e importar a classe Scanner
        Exibir as mensagens para o nosso usuário
        Obter pela scanner os valores digitados no terminal
        Exibir a mensagem conta criada
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência! : ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite a sua Agência! : ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome! : ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome! : ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o valor seu saldo! : ");
        double saldo = scanner.nextDouble();



        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " " + "e seu saldo é " + saldo + " " + "já está disponível para saque.");
    }
}
