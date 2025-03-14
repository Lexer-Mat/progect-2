package aston;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExDeserializable {
    public static void main(String[] args) {
        String filePath = new String("E:\\development\\java\\materials\\text\\ClassBook");

        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Book book1 = (Book) in.readObject(); // Читаем объект из файла
            Book book2 = (Book) in.readObject(); // Читаем объект из файла
            System.out.println("Объект десериализован: " + book1);
            System.out.println("Объект десериализован: " + book2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}
