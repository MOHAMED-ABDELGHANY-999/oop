package ZOO;
public class Dog extends Animal implements Swimmable {
    public Dog(String name, int age) {
        super(name, age, "Dog");
    }
    @Override
    public void swim() {
        System.out.println("Dog can swim");
    }
}