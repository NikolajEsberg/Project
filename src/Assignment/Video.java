package Assignment;

//Subclass: Video
public class Video extends Items {

    // Kald superklassens konstruktør med titlen
    public Video(String name) {
        super(name);
    }

    // Metode til at returnere typen af item
    public String getType() {
        return "video";
    }

    @Override
    public String toString() {
        // Her bruger vi getType() for at få typen med i output
        return getType() + ": " + title;

    }
}