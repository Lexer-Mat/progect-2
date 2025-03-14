public class Main {


    public static void main(String[] args) {
        Main app = new Main();
        app.print();
        printStatic();

        FirstCastomClass firstCastomClass = new FirstCastomClass();
        System.out.println(firstCastomClass.getText());


    }

    void print() {
        String text;
        text = "Hello in Hell";
        System.out.println(text);
    }

    static void printStatic() {
        String text = "Hello, World!";
        System.out.println(text);

    }
}