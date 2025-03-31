public class Main {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.PRETO, 2.0);
        AbstractShape s2 = new Rectangule(Color.PRETO, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangule color " + s2.getColor());
        System.out.println("Rectangule area " + String.format("%.2f", s2.area()));
    }
}