import java.util.Scanner;

public class JogoAdivinhao {
    Scanner scanner = new Scanner(System.in);
    private int numero;

    public JogoAdivinhao() {
        this.numero = (int) (Math.random() * 10) + 1;
    }

    public void Jogar() {
        while(true) {
            System.out.println("Digite um numero: ");
            int palpite = scanner.nextInt();
            if(this.numero > palpite) {
                System.out.println("Seu numero é maior");
            } else if(this.numero < palpite) {
                System.out.println("Seu numero é menor");
            } else {
                System.out.println("Parabens o numero digitado foi " + this.numero);
                break;
            }
        }
    }
}
