package aston;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExtSerializable {
    public static void main(String[] args) {
        Book book1 = new Book("The Pragmatic Programmer", 2020, 368);
        Book book2 = new Book("Clean Code", 2021, 464);

        String filePath = new String("E:\\development\\java\\materials\\text\\ClassBook");

        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(book1); // Записываем объект в файл
            out.writeObject(book2); // Записываем объект в файл
            System.out.println("Объект сериализован и сохранен в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации: " + e.getMessage());
        }
    }
}
