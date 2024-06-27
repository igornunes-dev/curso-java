package ternaria;

public class OperadorTernario {
    public static void main(String[] args) {
        int a,b;
        a = 5;
        b = 5;
//        String resultado = a==b ? "verdadeira" : "falso";
        int resultado = a == b ? 1 : 0;

/*
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "false";
*/

        System.out.println(resultado);
    }
}
