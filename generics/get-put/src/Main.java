import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(15);

        List<? extends Number> list = intList;

        Number x = list.get(0);

//        list.add(20); => erro PUT - covariancia

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(15);

//        Number x = myNums.get(0); => erro GET - contravariancia

    }
}