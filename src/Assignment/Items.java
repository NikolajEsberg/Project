package Assignment;

public class Items {
    protected String title;

    public Items(String name) {
        this.title = name;
    }

    // Standard type, kan overskrives i subklasser
    public String getType() {
        return "Item";
    }

    @Override
    public String toString() {
        return getType() + ": " + title;
    }
}
