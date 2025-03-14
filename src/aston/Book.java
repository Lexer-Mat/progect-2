package aston;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;
import java.io.Externalizable;

public class Book implements Externalizable {
    private String title;
    private int year;
    private int len;

    public Book() {}

    public Book(String title, Integer year, Integer len){
        this.title = title;
        this.year = year;
        this.len = len;
    }
    public int getYear() {
        return year;
    }
    public int getLen() {
        return len;
    }
    @Override
    public String toString() {
        return "Book: " + title +
                ", " + year +
                ", " + len;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && len == book.len && title.equals(book.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, year, len);
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(title);
        out.writeInt(year);
        out.writeInt(len);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        title = (String) in.readObject();
        year = in.readInt();
        len = in.readInt();
    }
}
