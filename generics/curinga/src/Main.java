import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        List<?> myObjs = new ArrayList<Objects>();
//        List<Integer> myNumbers = new ArrayList<Integer>();
//        myObjs = myNumbers;

        List<Integer> myNumbers = Arrays.asList(5,2,10);
        printList(myNumbers);

        List<String> mystrs = Arrays.asList("Maria" , "Alex", "Bob");

    }

    public static void printList(List<?> list) {
//        list.add(3); => Erro
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}