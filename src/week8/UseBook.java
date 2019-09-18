package week8;

public class UseBook {
    public static void main(String[] args) {
        Fiction book1 = new Fiction("The Dark Crystal");
        NonFiction book2 = new NonFiction("Science 101");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
