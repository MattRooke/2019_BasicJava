package week8;

public class BookArray {
    public static void main(String[] args) {

        Book[] books = {new Fiction("FBook 1"), new NonFiction("NFBook 1"), new Fiction("FBook 2"),
                new Fiction("FBook 3"), new NonFiction("NFBook 2"), new Fiction("FBook 4"),
                new Fiction("FBook 5"), new Fiction("FBook 6"), new NonFiction("NFBook 3"),
                new NonFiction("NFBook 4"),};

        for (Book book : books
        ) {
            System.out.println(book.toString());
        }
    }

}
