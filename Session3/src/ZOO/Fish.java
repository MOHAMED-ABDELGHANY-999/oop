package ZOO;
public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age, "Fish");
    }
    @Override
    public void swim() {
        System.out.println("Fish can swim");
    }
}