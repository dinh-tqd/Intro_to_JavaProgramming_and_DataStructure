package test;

public class Test {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange() };
        for (Object o : objects) {
            if (o instanceof Animal) {
                System.out.println(((Animal) o).sound());
            }
            if (o instanceof Edible) {
                System.out.println(((Edible)o).howToEat());
            }
            System.out.println("---");
        }
    }
}
