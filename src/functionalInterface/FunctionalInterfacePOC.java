package functionalInterface;

public class FunctionalInterfacePOC {
    public static void main(String[] args) {
        Shape iShape = shape -> "I'm a " + shape;
        System.out.println(iShape.greet("Square"));
        System.out.println(iShape.greet("Rectangle"));
        System.out.println(iShape.defaultShape());
        System.out.println(Shape.noShape());
    }
}

@FunctionalInterface
interface Shape {
    String greet(String shape); //only one abstract method

    //can have multiple default and/or static methods
    default String defaultShape() {
        return "I'm a default shape";
    }
    static String noShape() {
        return "I'm a irregular shape";
    }
}
