import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "/tmp/arquivo.csv";
        List<Product> products = new ArrayList<>();


        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                String name = line.split(",")[0];
                String price = line.split(",")[1];
                double priceValue = Double.parseDouble(price);
                String quantity = line.split(",")[2];
                int quantityValue = Integer.parseInt(quantity);
                products.add( new Product(name, priceValue, quantityValue));

                line = bufferedReader.readLine();
            }
        } catch(FileNotFoundException e) {
            System.out.println("Erro" + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String strPath = "/tmp/";
        boolean successFolder = new File(strPath + "/out").mkdirs();

        if(successFolder) {
            String subTotal = "/tmp/out/arquivo_saida.csv";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(subTotal))) {
                for(Product product : products) {
                    bw.write(product.getName() + "," + product.priceTotal());
                    bw.newLine();
                }
                System.out.println("Arquivo gerado com sucesso");
            }   catch (IOException e) {
                System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
            }
        }
    }
}