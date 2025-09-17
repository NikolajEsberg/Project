package Opgave01;

//Subklasse: Cat01
public class Cat01 extends Pet01 {

    public Cat01(String name) {
        super(name);
    }


    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat" +
                ": " + name + "Says: " + makeSound();
    }
}