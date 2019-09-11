package week7.debugging;

public class DebugPlay {
    protected String author;
    String title;

    public DebugPlay(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("The performance is " + title +
                " by " + author);
    }
}