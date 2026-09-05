package ZOO;
public class Bat extends Animal implements Flyable {
    public Bat(String name, int age) {
        super(name, age, "Bat");
    }
    @Override
    public void fly() {
        System.out.println("Bat can fly");
    }
}