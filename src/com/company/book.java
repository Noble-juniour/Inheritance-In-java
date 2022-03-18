
package com.company;

public class book extends Literature {
    private String title;
    private String author;
    private String publisher;
    private String genre;

    public book(String title, String author, String publisher, String genre) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }
     @Override public void Print()
    {
        System.out.println("       BOOK");
        super.Print();
        //System.out.println("book: " + title);
        //System.out.println("\t written By: " + author);
        System.out.println("\tPublished By: " + publisher);
        System.out.println("\tIs a:" + genre);
    }
}
