package com.company
import classes.Books;
import classes.BookGenres;
import classes.Librarian;
import classes.Reader;


public class Main {

    public static void main(String[] args) {

        Reader r1 = new Reader(20,077,"Tom", "23 California", "tom123@gmail.com");
        Reader r2 = new Reader(22,077,"Tommy", "23 Pompile", "tomy123@gmail.com");
        Reader r3 = new Reader(32,077,"Cezar", "23 Manius", "caesar23@gmail.com");
        Librarian l1 = new Librarian(45, 077, "Matilda", "32 Miss Green", "matty@gmail.com");
        Librarian l2 = new Librarian(47, 077, "Iulia", "38 Topp", "iuy@gmail.com");
        Books b1 = new Books(BookGenres.ROMANCE, 5647, "Pride and Prejudice", "Jane Austen" );
        Books b2 = new Books(BookGenres.SCI_FI, 347, "Hail Mary project", "Andy Widen" );
        Books b3 = new Books(BookGenres.CLASSICS, 5647, "The Picture of Dorian Grey", "Oscar Wilde" );

        System.out.println("First reader is: ");
        System.out.println(r1.getName());
        System.out.println("Address: ");
        System.out.println(r1.getAddress());
        System.out.println("Email: ");
        System.out.println(r1.getEmail());
        System.out.println("His librarian is: ");
        System.out.println(l1.getName());
        System.out.println("He issued 3 books: ");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);













    }
}
