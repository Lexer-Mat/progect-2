package baseString;

public class StringExamples {
    public static void main(String[] args) {
        Human max = new Human("Макс");
        String out = "java объект: " + max;
        System.out.println(out);
    }
    static class Human {
        public String name;
        public Human (String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Человек по имени " + name;
        }
    }
}
