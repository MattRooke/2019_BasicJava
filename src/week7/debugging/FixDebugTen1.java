package week7.debugging;
// A Play has a title and author
// A Musical is a Play that also has a composer

public class FixDebugTen1 {
    public static void main(String[] args) {
        DebugPlay performance1 =
                new DebugPlay("Death of a Salesman", "Arthur Miller");
        DebugMusical performance2 =
                new DebugMusical("Guys and Dolls", "Jo Swerling", "Frank Loesser");
        performance1.display();
        performance2.display();
    }
}
