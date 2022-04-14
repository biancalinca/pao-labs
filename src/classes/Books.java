package classes;

public class Books {
    int isbn;
    String title;
    String author;

    private BookGenres bookGenres;
    public Books() {
    }

    public Books(BookGenres bookGenres, int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.bookGenres = bookGenres;

    }

    public BookGenres getBookGenres(){
        return bookGenres;
    }

    public void setBookGenres(BookGenres bookGenres){
        this.bookGenres = bookGenres;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
    return "Book:" + "isbn=" + isbn + ", title='" + title + '\'' + ", author='" + author + '\'' ;
    }

}
