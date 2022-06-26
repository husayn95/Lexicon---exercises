package LexiconJava.Exercises.Week3.OOP;

public class Book {
    private String book;
    private Author author;

    public Book(String book){
        this.book = book;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public Author getAuthor(){
        return author;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getBook() {
        return book;
    }
}
