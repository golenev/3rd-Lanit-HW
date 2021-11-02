package HW3;

public class Rabbit extends Herbivore {
    public Rabbit(String name, String type, AviarySize size) {
        super(name, type, AviarySize.HerbivoreSmall);
    }

    @Override
    public void swim() {
        System.out.println("плавать не умею");
    }

    @Override
    public void run() {
        System.out.println("бегаю быстро");
    }

    @Override
    public void voice() {
        System.out.println("не умею разговаривать");
    }
}
