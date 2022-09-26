package lambda;

public class LambdaPOC {
    public static void main(String[] args) {
        Add withoutLambda = new Add() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(withoutLambda.add(5, 6));

        Add withLambda = (a, b) -> a + b; //kinda method object i.e. method instance which doesn't necessarily belong to any class
        System.out.println(withLambda.add(5, 6));
    }
}


interface Add {
    int add(int a, int b);
}
