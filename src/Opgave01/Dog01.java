package Opgave01;

//Subklasse: dog01
public class Dog01 extends Pet01 {

    public Dog01(String name) {
        super(name);
    }


    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String toString() {
        return "Dog: " + name + "Says: " + makeSound();
    }
}
