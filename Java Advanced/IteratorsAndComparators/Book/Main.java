package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book bookOne = new Book("The Bible", 2016,"Peter Parker");
        Book bookTwo = new Book("The book", 2012,"Peter Parker", "John Bro", "Who knows");
        Book bookThree = new Book("The Bible", 2016);

        List<Book> books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        for (Book book: books) {
            System.out.println(book.getTitle());
        }

    }
}
