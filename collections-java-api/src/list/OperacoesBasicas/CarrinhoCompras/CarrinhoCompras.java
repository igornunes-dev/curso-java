package list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoCompras {
    //Atributo
    private List<Item> ItemLista;

    public CarrinhoCompras() {
        this.ItemLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        ItemLista.add(item);
    }
    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if(!ItemLista.isEmpty()){
            for(Item i : ItemLista) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
                }
            }
        }
        ItemLista.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if(!ItemLista.isEmpty()) {
            for(Item item : ItemLista) {
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public void exibirItens() {
        if(!ItemLista.isEmpty()) {
            System.out.println(this.ItemLista);
        } else {
            System.out.println("A lista esta vazia");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + ItemLista +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoCompras.adicionarItem("Açai", 50d, 1);
        carrinhoCompras.adicionarItem("teclado", 243.50, 1);

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("Lapis");

        carrinhoCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
    }



}
