package unarios;

public class OperadorUnario {

    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println(- numero);

        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

    /*
        numero = numero + 1;
        System.out.println(numero);
    */


        System.out.println(numero++);
        //Ele imprimi o numero mas só depois ele incrementa
        System.out.println(++numero);
        //Ele incrementa e depois imprimi o numero incrementado




        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);


    }
}
