package binding;

public class EarlyBinding {
    static class Animal {
        static void staticMethod() {
            System.out.println("Static method in Animal");
        }

        final void finalMethod() {
            System.out.println("Final method in Animal");
        }
    }

    static class Dog extends Animal {
        static void staticMethod() {
            System.out.println("Static method in Dog");
        }

        // Этот метод не может быть переопределен
        // void finalMethod() {
        //     System.out.println("Final method in Dog");
        // }
    }
}

