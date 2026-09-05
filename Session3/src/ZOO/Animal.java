package ZOO;
public abstract class Animal {

    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void display() {
        System.out.println(name + " " + age + " " + species);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}