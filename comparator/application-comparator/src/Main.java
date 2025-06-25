import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1900.00));
        list.add(new Product("Tablet", 500.00));

        //Comparator<Product> comp = new Comparator<Product>() {
        //    @Override
        //    public int compare(Product o1, Product o2) {
        //        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        //    }
        //};

        //Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p : list) {
            System.out.println(p);
        }

    }
}