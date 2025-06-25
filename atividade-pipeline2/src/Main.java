import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter full path");
        String path = scanner.nextLine();
        System.out.println("enter salary");
        double salary = scanner.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }


            List<String> emailHighestSalary = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            list.forEach(System.out::println);

            double sum = list.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M' : " + sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}