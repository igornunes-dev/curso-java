import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/tmp/in.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch(FileNotFoundException e) {
            System.out.println("Erro" + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}