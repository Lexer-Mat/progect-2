package aston;

import java.io.File;

public class MainFileTreeRecursion {
    public static void main(String[] args) {
        File directory = new File("E:\\development\\java\\dev\\private\\progect-2");
        fileTree(directory, 0);
        }

    public static void fileTree(File dir, int level){
        System.out.println("  ".repeat(level) + "Директория \"" + dir.getName() + "\":");
        if (dir.exists() && dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    fileTree(file, level + 1);
                } else if (file.isFile()) {
                    System.out.println("  ".repeat(level) + "  Файл \"" + file.getName() + "\"");
                }
            }
        }
        else System.out.println("Директория по указанному пути не найдена.");
    }
}
