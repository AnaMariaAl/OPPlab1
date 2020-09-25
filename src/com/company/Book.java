package com.company;

public class Book {
    private String author;
    private String titlu;
    private double price;

    public Book(String author, String titlu, double price) {
        this.author = author;
        this.titlu = titlu;
        this.price = price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String print() {
        return
                        "price:" + this.price + "\n" +
                        "author:" + this.author + "\n" +
                        "title:" + this.titlu + "\n";
    }
}
