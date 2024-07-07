import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (continuar) {

            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch(opcao){
                case 1:
                    int saldoAtual = scanner.nextInt();
                    saldo+=saldoAtual;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    int valorSacado = scanner.nextInt();
                    if(valorSacado >saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo-=valorSacado;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
