import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriter {
    public static void main(String[] args) {
        String filePath = "E:\\development\\java\\materials\\text\\new_text.doc";
        String appendText = "\nNew Text.";
        try (FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(appendText);
            System.out.println("Текст добавлен успешно.");
        }
        catch (IOException e){
            System.out.println("Не удалось добавить текст: " + e.getMessage());
        }
    }
}
