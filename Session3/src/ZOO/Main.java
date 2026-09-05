package ZOO;
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Simba", 3),
                new Bird("Sky", 1),
                new Fish("Nemo", 1),
                new Bat("Batman", 2),
                new Penguin("Snow", 2),
                new Dolphin("Dolly", 3),
                new Dog("Dahab", 3)
        };

        for (Animal animal : animals) {
            animal.display();
            animal.eat();

            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }

            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
    }
}