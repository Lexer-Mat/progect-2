package baseOOP;

public class StudTwoMans extends Students {
    @Override
    void walk() {
        super.walk();
        System.out.println("Very slow...");
    }
}
