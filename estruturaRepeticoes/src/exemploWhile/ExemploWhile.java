package exemploWhile;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce> mesada)
                valorDoce = mesada;
            System.out.println("Valor do Doce: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou tudo em doce");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
