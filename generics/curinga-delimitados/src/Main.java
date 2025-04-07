import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

//    A lista vai ser do tipo de Shape ou qualquer tipo que seja um subtipo de Shape
    public static double totalArea(List<? extends Shape> list) {
//        list.add(new Circle(2.0)); => Erro
        double sum = 0.0;
        for(Shape e : list) {
            sum+=e.area();
        }
        return sum;
    }
}