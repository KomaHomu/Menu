package hw.tuan3.hw2.book2;

import hw.tuan3.hw2.book1.Author;

public class Book {

    private final String name;
    private final Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String str = "";

        for (Author author : getAuthors()) {
            str = author + ", ";
        }

        str = str.substring(0, str.length() - 2);

        return "Book[name = " + getName() + ", author = {" + str + "}, price = " + getPrice() + ", qty = " + getQty() + "]";
    }
}
