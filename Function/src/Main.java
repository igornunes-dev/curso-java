import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1900.00));
        list.add(new Product("Tablet", 500.00));
        list.add(new Product("Tablet", 50.0));

        //Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}