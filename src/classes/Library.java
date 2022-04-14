package classes;

import java.awt.*;
import java.awt.print.Book;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private List<Book> mybooks;

    public Library(){
        mybooks = new ArrayList<Book>();
    }
    public void addBook(Book book){
        mybooks.add(book);
    }
    public String toString(){
        String total = "\n";
        for (int i = 0; i < mybooks.size(); i++){
            Book b = mybooks.get(i);
            total = total + b.toString();
        }
        return total;
    }

}

