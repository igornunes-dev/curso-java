import java.util.Scanner;
public class Salario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double valorSalario = scanner.nextDouble();
        double valorBeneficio = scanner.nextDouble();

        double valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05 * valorSalario;
        } else if(valorSalario >= 1100.01 && valorSalario <= 2500.00){
            valorImposto = 0.10 * valorSalario;
        } else {
            valorImposto = 0.15 * valorSalario;
        }

        double saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida));
    }
}
