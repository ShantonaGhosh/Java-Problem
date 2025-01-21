
package problem_solving;

import java.util.ArrayList;

public class Book {
    private  String title;
    private  String author;
    private  String ISBN;
    private static ArrayList<Book> bookList= new ArrayList<Book>();
    
    Book(String title,String author, String ISBN){
        this.title= title;
        this.author = author;
        this.ISBN = ISBN;       
    }
    
    public static void addBook(Book book){
        bookList.add(book);
    }
    public static void removeBook(Book book){
        bookList.remove(book);
       
    }
    public static ArrayList<Book> getBookList(){
        return bookList;
        
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    
}
