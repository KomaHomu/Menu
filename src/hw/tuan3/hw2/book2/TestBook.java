package hw.tuan3.hw2.book2;

import hw.tuan3.hw2.book1.Author;

public class TestBook {

    public static void main(String[] args) {

        Author[] authors = new Author[2];

        authors[0] = new Author("Tan Ah Teck", "AhTeck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
