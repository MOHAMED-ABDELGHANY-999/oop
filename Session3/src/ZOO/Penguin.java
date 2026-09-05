package ZOO;
public class Penguin extends Animal implements Swimmable {
    public Penguin(String name, int age) {
        super(name, age, "Penguin");
    }
    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}