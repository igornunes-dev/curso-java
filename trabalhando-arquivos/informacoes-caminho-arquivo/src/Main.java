import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

//        pega o nome do arquivo
        System.out.println("getName: " + path.getName());

//        pega o caminho
        System.out.println("getParent: " + path.getParent());

//        caminho completo
        System.out.println("getPath: " + path.getPath());





        scanner.close();
    }
}