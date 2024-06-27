package aritmeticos;

import javax.swing.*;

public class OperadorAritmeticos {

    public static void main(String[] args) {

        double soma = 15.5 + 15.6;

        int substracao = 113 - 25;

        int multiplicacao = 20 * 6;

        int divisao = 15 / 3;

        int modulo = 18 % 3;

        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
        //Apartir do momento que ele detecta um caracter ele realiza uma concatenação
        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    }
}
