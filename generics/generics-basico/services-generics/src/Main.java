import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();
        PrintService<String> printServiceString = new PrintService<>();

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
//            int value = scanner.nextInt();
            String valueString = scanner.next();
//            printService.addValue(value);
            printServiceString.addValue(valueString);
        }

        printService.print();
    }
}