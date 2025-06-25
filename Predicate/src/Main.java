import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1900.00));
        list.add(new Product("Tablet", 500.00));
        list.add(new Product("Tablet", 50.0));

        //Predicate<Product> pred = p -> p.getPrice() >= 100.00;
        //list.removeIf(pred);
        list.removeIf(p -> p.getPrice() >= 100.00);

        for(Product p : list) {
            System.out.println(p);
        }
    }
}