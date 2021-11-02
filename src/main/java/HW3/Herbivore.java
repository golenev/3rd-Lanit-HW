package HW3;

public abstract class Herbivore extends Animals {
    public Herbivore(String name, String type, AviarySize size) {
        super(name, type, size);
    }

    @Override
    public void eat() {
        System.out.println("едим травку и зерно");
    }
}
