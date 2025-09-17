package Assignment;

// Subclass: Book
public class Book extends Items {

    // Kald superklassens konstruktor med titlen
    public Book(String name) {
        super(name);
    }

    // Metode til at returnere typen af item
    public String getType() {
        return "Book";
    }

    @Override
    public String toString() {
        // Her bruger vi getType() for at få typen med i output
        return getType() + ": " + title;
    }
}
