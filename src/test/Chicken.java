package test;

public class Chicken extends Animal
        implements Edible, Audio {
    @Override
    public String sound() {
        return "Chicken goes: \"Cook-a-doodle-doo\"";
    }

    @Override
    public String makeSound() {
        return "Cook-a-doodle-doo";
    }
    public String howToEat() {
        return "Fry it ! I love KFC";
    }


}
