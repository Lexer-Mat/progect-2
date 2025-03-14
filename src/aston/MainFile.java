package aston;

import java.io.File;

public class MainFile {
    public static void main(String[] args) {
        File directory = new File("E:\\development\\java\\dev\\private\\progect-2\\src");
        if (directory.exists() && directory.isDirectory()){
            File[] files = directory.listFiles();
            if (files.length > 0){
                System.out.println("Директория \"" + directory.getName() + "\" содержит:");
                for (File file : files){
                    if (file.isDirectory()){
                        System.out.println("    Директория \"" + file.getName() + "\"");
                    }
                    else if (file.isFile()){
                        System.out.println("    Файл \"" + file.getName() + "\"");
                    }
                }
            }
            else System.out.println("Директория \"" + directory.getName() + "\" пуста.");
        }
        else System.out.println("Директория по указанному пути отсутствует.");
    }
}
