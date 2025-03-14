package baseOOP;

public class Encapsulation {
    public static void main(String[] args) {
        Students student = new Students();
        student.setName("Alex");
        System.out.println(student.getName());
        Students stud = new StudTwoMans();
        stud.setName("Billy");
        stud.walk();
    }
}
