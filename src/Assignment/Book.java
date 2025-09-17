package Assignment;

//Subclass: Book
public class Book extends Items {

    public Book(String name) {
        super(title);
        super(type);
    }

    //Her overrider vi type, da det er specefikt en bog
    @overide
    public String type{
        return "book";
    }

    @Override
    public String toString() {
        return "book" +
                ": " + title;
    }
}

