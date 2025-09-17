package Assignment;

// Importerer Scanner til at læse input
import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        // Opretter en Scanner til at læse input fra brugeren
        Scanner scanner = new Scanner(System.in);

        // Skriver en velkomstbesked til kunden
        System.out.println("Velkommen til vores bibliotek!");

        // Kunden indtaste, hvor mange items der skal registreres
        System.out.print("Hvor mange Items vil du gerne registrere? ");
        // Læser antal items fra kunden
        int antal = scanner.nextInt();
        scanner.nextLine();

        // Opretter et array af Items
        Items[] items = new Items[antal];

        // Starter en for løkke til at registrere hvert enkelt item
        for (int i = 0; i < antal; i++) {
            // Informerer kunden om, hvilket item nummer der skal indtastes
            System.out.println("\nRegistrer Item #" + (i + 1));

            // Spørger kunden hvilken Iten (enten 'Book' eller 'Video')
            System.out.print("Type (Book, Video): ");
            // Læser item som en streng og laver til små bogstaver
            String type = scanner.nextLine().toLowerCase();

            // Spørger om titlen på item
            System.out.print("Title: ");
            // Læser titlen som en streng
            String title = scanner.nextLine();

            // Afhængig af kundens input oprettes det korrekte obje kt
            if (type.equals("book")) {
                // Opretter et Book-objekt med den indtastede titel og gemmer i arrayet
                items[i] = new Book(title);
            } else if (type.equals("video")) {
                // Opretter et Video-objekt med den indtastede titel og gemmer i arrayet
                items[i] = new Video(title);
            } else {
                // Hvis typen ikke er genkendt, gives besked til brugeren
                System.out.println("Ukendt Item");
                items[i] = new Items(title);
            }
        }

        // Udskriver overskriften for listen af registrerede items
        System.out.println("\nListe af låne Items");
        System.out.println("--------------------\n");
        System.out.println("ID\tType\tTitle");

        // Løkke til at udskrive hvert item med ID
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + "\t" + items[i].getType() + "\t" + items[i].title);
        }

        // Lukker Scanner
        scanner.close();
    }
}
