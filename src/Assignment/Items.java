package Assignment;


//Oprettelse af superklasse: Items
public class Items {
    protected String title;

    public Items (String name) {
        this.title = name;
    }

    @Override
    public String toString () {
        return "Title: " + title;
    }

}
