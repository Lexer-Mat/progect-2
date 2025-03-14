package binding;

public class Main {
    public static void main(String[] args) {
        EarlyBinding.Dog animalEarly = new EarlyBinding.Dog();
        EarlyBinding.Animal animalEarly2 = new EarlyBinding.Dog();
        animalEarly.staticMethod(); // Вывод: "Static method in Animal"
        animalEarly2.staticMethod(); // Вывод: "Static method in Animal"
        animalEarly.finalMethod(); // Вывод: "Final method in Animal"

        LateBinding.Animal animalLate = new LateBinding.Animal();
        LateBinding.Dog animalLate2 = new LateBinding.Dog();
        animalLate.sound(); // Вывод: "Dog barks"
        animalLate2.sound(); // Вывод: "Dog barks"
    }
}
