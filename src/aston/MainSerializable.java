package aston;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerializable {
    public static void main(String[] args) {
        Student student = new Student("Alex");
        String filePath = new String("E:\\development\\java\\materials\\text\\ClassStudent");

        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
            objOut.writeObject(student);
            System.out.println("Сериализация выполнена в файл: " + filePath);
        }
        catch (IOException e) {
            System.out.println("Что-то пошло не так: " + e.getMessage());
        }
    }
}
