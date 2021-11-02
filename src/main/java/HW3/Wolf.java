package HW3;

public class Wolf extends Predators implements Attack {
    public Wolf(String name, String type, AviarySize size) {
        super(name, type, AviarySize.PredatorSmall);
    }

    @Override
    public void eat() {
        System.out.println("Люблю есть кроликов");
    }

    @Override
    public void swim() {
        System.out.println("не умею плавать");

    }

    @Override
    public void run() {
        System.out.println("бегаю быстро");
    }

    @Override
    public void voice() {
        System.out.println("WWWWUUUUUUUUUUUUUUU");
    }

    @Override
    public void Attack() {
        System.out.println("Охочусь и нападаю");
    }
}
