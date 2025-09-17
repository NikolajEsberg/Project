package Assignment;

//Subclass: Video
public class Video extends Items {

    public Video(String name) {
        super(title);
        super(type);
    }

    //Her overrider vi type, da det er specifikt en video
    @Override
    public String type{
        return "video";
    }

    @Override
    public String toString() {
        return "video" +
                ": " + title;
    }
}