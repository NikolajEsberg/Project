package Assignment;

//Subclass: Video
public class Video extends Items {

    public Video(String name) {
        super(name);
    }


    public String getType() {
        return "video";
    }

    @Override
    public String toString() {
        // Her bruger vi getType() for at få typen med i output
        return getType() + ": " + title;

    }
}