package com.radhika.Lecture20;

public class Book {
    String authorName;
    String bookName;
    static String seller = "ESPB";
    static int count = 0;

    public Book(String authorName, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
        count++;
    }

//    public static void main(String[] args) {
//        Book b1 = new Book("J.K Rowling","Harry Potter");
//        System.out.println(Seller);
//    }
}
class Main{
    public static void main(String[] args) {
        Book b2 = new Book("Jenny Han","The Summer I Turned Pretty");
        Book b1 = new Book("J.K Rowling","Harry Potter");
        System.out.println("Author name is "+b2.authorName+" and Book name is "+b2.bookName+" and seller is "+ Book.seller);
       // System.out.println(Seller);
        System.out.println(Book.count);
    }
}
