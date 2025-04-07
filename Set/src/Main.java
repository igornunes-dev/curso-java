import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Se a ordem nao importa use HashSet por ser mais rapido
//        Set<String> set = new HashSet<>();
//        Ordena os dados
//        Set<String> set = new TreeSet<>();
//        Mantem a ordem e velocidade intermediaria
        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.remove("Tablet");
        set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));

        for(String p : set) {
            System.out.println(p);
        }
    }
}