package aston;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Alex");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Anna");
        Student student4 = new Student("Fiona");

        Book book1 = new Book("The Pragmatic Programmer", 2020, 368);
        Book book2 = new Book("Clean Code", 2021, 464);
        Book book3 = new Book("Code Complete", 2017, 896);
        Book book4 = new Book("Design Patterns", 2021, 448);
        Book book5 = new Book("Head First Design Patterns", 2021, 656);
        Book book6 = new Book("Patterns of Enterprise Application Architecture", 2020, 544);
        Book book7 = new Book("The Inmates Are Running the Asylum", 2018, 384);
        Book book8 = new Book("Grokking Algorithms", 2021, 288);
        Book book9 = new Book("Introduction to Algorithms", 2020, 1328);
        Book book10 = new Book("The Mythical Man-Month", 2020, 368);
        Book book11 = new Book("Refactoring", 2019, 448);
        Book book12 = new Book("Algorithms", 1990, 384);
        Book book13 = new Book("Преступление и наказание", 1866, 672);
        Book book14 = new Book("Информатика", 1999, 208);
        Book book15 = new Book("Rich Dad Poor Dad", 1997, 336);

        student1.addBook(book2);
        student1.addBook(book4);
        student1.addBook(book6);
        student1.addBook(book8);
        student1.addBook(book10);

        student2.addBook(book1);
        student2.addBook(book3);
        student2.addBook(book5);
        student2.addBook(book7);
        student2.addBook(book9);
        student2.addBook(book11);

        student3.addBook(book2);
        student3.addBook(book4);
        student3.addBook(book5);
        student3.addBook(book8);
        student3.addBook(book9);
        student3.addBook(book14);
        student3.addBook(book15);

        student4.addBook(book1);
        student4.addBook(book7);
        student4.addBook(book10);
        student4.addBook(book12);
        student4.addBook(book13);

        List<Student> students = List.of(student1, student2, student3, student4);

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getLen))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Книга отсутствует.")
                );
    }
}
