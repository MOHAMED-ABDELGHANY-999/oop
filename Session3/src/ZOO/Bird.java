package ZOO;
public class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age, "Bird");
    }
    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}