package test2;

public class Test {
    public static void main(String[] args) {
        House house1 = new House(1, 1759);
        House house2 = (House)house1.clone();
        System.out.println(house1.compareTo(house2));
        System.out.println(house1.getWhenBuilt() == house2.getWhenBuilt());
    }
}
