package LexiconJava.Exercises.Week3.OOP;

public class OOPExercisesMain {
    public static void main(String[] args) {

        Car Skoda = new Car("Skoda Octavia", 1.6);
        Skoda.drive();

        Rectangle rectangle = new Rectangle(2.2,3.3);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());


        //Author and Books
        Book book1 = new Book("The apple tree");
        Book book2 = new Book("");
        book2.setBook("The orange tree");
        Book book3 = new Book("The banana tree");
        Book[] books = {book1,book2,book3};

        Author author1 = new Author("Husayn the great author", books);

        Author[] authors = new Author[5];
        authors[0] = author1;
        System.out.println(authors[0].getAuthorName());
        System.out.println("All books by Husayn: ");
        author1.getAllBooks();
        System.out.println("The author of the book "+book1.getBook()+" is: "+author1.getAuthorName());
        book1.setAuthor(author1);
        System.out.println(book1.getAuthor().getAuthorName());


    }
}
