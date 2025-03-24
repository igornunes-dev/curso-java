import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();

        System.out.println("Fim do programa");
    }

    public static void method1() {
        System.out.println("Method1 Start");
        method2();
        System.out.println("Method1 End");

    }

    public static void method2() {
        System.out.println("Method2 Start");
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!" + e.getMessage());
            e.printStackTrace();
            scanner.next();
        } catch(InputMismatchException e) {
            System.out.println("Input Error");
        }

        System.out.println("Method2 End");

    }
}