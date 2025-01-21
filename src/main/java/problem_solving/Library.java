package problem_solving;

import java.util.ArrayList;

public class Library {

    ArrayList<Books> bookList = new ArrayList<Books>();

    public void addBook(Books books) {
        bookList.add(books);

    }

    public void removeBook(Books books) {
        bookList.remove(books);
    }

    public ArrayList<Books> getBookList() {
        return bookList;
    }

}
