package aston;

import java.io.*;

public class MainDeserializable {
    public static void main(String[] args) {
        String filePath = new String("E:\\development\\java\\materials\\text\\ClassStudent");

        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
            Student student = (Student) objIn.readObject();
            System.out.println("Десериализация выполнена: " + student);
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Что-то пошло не так: " + e.getMessage());
        }
    }
}
