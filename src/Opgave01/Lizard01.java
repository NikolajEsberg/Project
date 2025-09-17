package Opgave01;

public class Lizard01 extends Pet01 {

    public Lizard01(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "SSSSssssSSSS";
    }

    @Override
    public String toString() {
        return "Lizard: " + name + "Says: " + makeSound();
    }
}