public class Circle{
    private static final double PI = 3.141592;
    private double radius;
    private double circumference(){
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        Circle circle2 = new Circle(7.1);
        System.out.println("Длина окружности с радиусом " + circle1.getRadius() + " равна: " + circle1.circumference());
        System.out.println("Длина окружности с радиусом " + circle2.getRadius() + " равна: " + circle2.circumference());
        Class<?> clazz = circle1.getClass();
        System.out.println("Fields:");
        for (var field : clazz.getDeclaredFields()) {
            System.out.println(field.getName());
        }
        System.out.println(Class.class.getClassLoader());
        System.out.println(System.class.getClassLoader());
    }
}
