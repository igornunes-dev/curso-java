import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1900.00));
        list.add(new Product("Tablet", 500.00));
        list.add(new Product("Tablet", 50.0));

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}