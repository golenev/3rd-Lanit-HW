package HW3;

public abstract class Predators extends Animals {
    public Predators(String name, String type, AviarySize size) {
        super(name, type, size);
    }

    @Override
    public void eat() {
        System.out.println("Мы едим мясо");
    }
}
