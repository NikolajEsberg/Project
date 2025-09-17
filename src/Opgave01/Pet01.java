package Opgave01;

import java.util.Scanner;

//Superklasse: Pet01
public class Pet01 {
    protected String name;

    public Pet01 (String name) {
        this.name = name;
    }

    public String makeSound() {
        return "Pet sound";
    }
    @Override
    public String toString() {
        return "Pet: " + name;
    }
}
