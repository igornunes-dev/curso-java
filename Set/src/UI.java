import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UI {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,3,4,5,6,7));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,1,4,4,7));

//        union -> Junta
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

//        intersection -> So oq tem em comum
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

//        difference -> So oq nao tem em comum
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
