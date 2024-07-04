import java.util.Scanner;
public class CalculadoraDeMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String alunos [] = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scanner);

        System.out.printf("Media da turma %.1f", media);
    }

    static double calculaMediaDaTurma(String[] alunos, Scanner scan){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scan.nextDouble();
            soma+=nota;

        }
        return soma / alunos.length;

    }
}
