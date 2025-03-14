package baseString;

public class StringExemples4 {
    public static void main(String[] args) {
        String filePath = "D:\\Movies\\Futurama.mp4";
        int lastFileSepIndex = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(lastFileSepIndex + 1);
        System.out.println(fileName.toUpperCase());
        System.out.println(fileName.length());
    }
}
