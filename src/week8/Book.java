package week8;

public abstract class Book {
    float price;
    String title;

    public Book(String title) {
        this.title = title;
    }

    public abstract void setPrice();

    @Override
    public String toString() {
        return "Title: " + title + " Price: $" + price + "\n";
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }
}
