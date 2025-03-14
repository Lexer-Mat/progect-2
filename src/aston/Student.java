package aston;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private List<Book> books;

    public Student(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }
    @Override
    public String toString() {
        return "Student: " +
                "Name = " + name +
                ", Books = " + books;
    }
}
