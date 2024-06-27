package relacionais;

public class OperadorRelacionais {

    public static void main(String[] args) {

        String nome1 = "IGOR";
        //Método equals compara contéudos de dois objetos
        String nome2 = new String("IGOR");

        System.out.println(nome1.equals(nome2));



        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("Numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero1 é diferente a numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior que numero numero2? " + simNao);


    }
}
