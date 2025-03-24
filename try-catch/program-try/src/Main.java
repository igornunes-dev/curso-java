import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();
        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.println("Enter amount for withdraw: ");
        double amount = scanner.nextDouble();
        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } catch (ExceptionPerson e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }


    }
}