package list.Ordenacao.OrdenacaoPorNumero;


import java.util.Comparator;

public class Numero implements Comparable<Numero>{
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(numero, n.numero);
    }


}

class ComparatorPorAltura implements Comparator<Numero> {

    @Override
    public int compare(Numero n1, Numero n2) {
        return n2.compareTo(n1);
    }
}
