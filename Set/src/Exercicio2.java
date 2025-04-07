import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A? ");
        int n = scanner.nextInt();
        for(int i = 1; i<= n;i++) {
            int student = scanner.nextInt();
            a.add(student);
        }
        System.out.println("How many students for course B? ");
        n = scanner.nextInt();
        for(int i = 1; i<= n;i++) {
            int student = scanner.nextInt();
            b.add(student);
        }
        System.out.println("How many students for course C? ");
        n = scanner.nextInt();
        for(int i = 1; i<= n;i++) {
            int student = scanner.nextInt();
            c.add(student);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total student: " + total.size());

    }
}
