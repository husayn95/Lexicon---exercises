package LexiconJava.Exercises.Week3.OOP;

public class Author {
    private String author;
    private Book[] books;


    public Author(String author, Book[] books){
        this.author = author;
        this.books = books;
    }

    public void getAllBooks(){

        for (int i = 0; i < books.length; i++){
            System.out.println(books[i].getBook());
        }
       // String allBooks = "All books written by the author "+getAuthor()+": "+book.getBook()+", ";
       // return allBooks;
    }

//    public void setBook(Book book) {
//        this.book = book;
//    }

//    public Book getBook() {
//        return book;
//    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorName() {
        return author;
    }
}
