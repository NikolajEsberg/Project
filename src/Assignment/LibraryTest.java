package Assignment;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til vores bibliotek!");

        System.out.println("Hvor mange Items vil du gerne registrere? ");
        int antal = scanner.nextInt();
        scanner.nextLine(); //Rydder scanneren

        //Oprettelse af array
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
                System.out.println("Ukendt Items");
                items[i] = new Items(title);
            }
        }
        System.out.println("\nRegistrede Items:");
        for (Items item : items) {
            System.out.println(items);
        }

        scanner.close();
    }
}
