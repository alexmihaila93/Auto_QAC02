package Homework2;

public class Library {

    public static void main(String[] args) {

        Author author = new Author("Adrian Asoltanie", "adrian@asoltanie.com");

        Book book = new Book("Draga, unde-s banii?", 2021, author, 49.99);

        System.out.println(book.getName() + " (" + book.getPrice() + " RON), by " +
                book.getAuthor().getName() + " published in " + book.getYear());
    }

}
