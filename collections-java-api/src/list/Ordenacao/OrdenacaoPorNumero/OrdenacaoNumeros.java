package list.Ordenacao.OrdenacaoPorNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscedente() {
        List<Numero> numeroAscedente = new ArrayList<>(numeroList);
        Collections.sort(numeroAscedente);
        return numeroAscedente;
    }

    public List<Numero> ordenarDescrecente() {
        List<Numero> numeroDescrecente = new ArrayList<>(numeroList);
        Collections.sort(numeroDescrecente, new ComparatorPorAltura());
        return numeroDescrecente;
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println(ordenacaoNumeros.ordenarAscedente());
        System.out.println(ordenacaoNumeros.ordenarDescrecente());
    }
}
