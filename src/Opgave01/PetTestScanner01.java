package Opgave01;

import java.util.Scanner;

public class PetTestScanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Velkommen til!");

        System.out.print("Hvor mange kæledyr vil du registrere? ");
        int antal = scanner.nextInt();
        scanner.nextLine(); // Ryd scanner-bufferen

        // 3. Array
        Pet01[] pets = new Pet01[antal];

        for (int i = 0; i < antal; i++) {
            System.out.println("\nRegistrer kæledyr #" + (i + 1));

            System.out.print("Type (dog, cat, lizard): ");
            String type = scanner.nextLine().toLowerCase();

            System.out.print("Navn: ");
            String navn = scanner.nextLine();

            if (type.equals("dog")) {
                pets[i] = new Dog01(navn);
            } else if (type.equals("cat")) {
                pets[i] = new Cat01(navn);
            } else if (type.equals("lizard")) {
                pets[i] = new Lizard01(navn);
            } else {
                System.out.println("Ukendt type. Bruger standard Pet.");
                pets[i] = new Pet01(navn);
            }
        }

        System.out.println("\nRegistrerede kæledyr:");
        for (Pet01 pet : pets) {
            System.out.println(pet);
        }

        scanner.close();
    }
}
