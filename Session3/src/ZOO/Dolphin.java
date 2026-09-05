package ZOO;
public class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name, int age) {
        super(name, age, "Dolphin");
    }
    @Override
    public void swim() {
        System.out.println("Dolphin can swim");
    }
}