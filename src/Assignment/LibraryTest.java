package Assignment;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til vores bibliotek!");

        System.out.print("Hvor mange Items vil du gerne registrere? ");
        int antal = scanner.nextInt();
        scanner.nextLine(); // Rydder scanneren

        // Oprettelse af array
        Items[] items = new Items[antal];

        for (int i = 0; i < antal; i++) {
            System.out.println("\nRegistrer Item #" + (i + 1));

            System.out.print("Type (Book, Video): ");
            String type = scanner.nextLine().toLowerCase();

            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (type.equals("book")) {
                items[i] = new Book(title);
            } else if (type.equals("video")) {
                items[i] = new Video(title);
            } else {
                System.out.println("Ukendt Item - oprettes som generisk Item");
                items[i] = new Items(title);
            }
        }

        // Print overskrift
        System.out.println("\nListe af låne Items");
        System.out.println("__________________\n");
        System.out.println("\nID\tType\tTitle");

        // Print listen over items med ID, type og titel
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + " " + items[i].getType() + " " + items[i].title);
        }

        scanner.close();
    }
}
