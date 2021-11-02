package HW3;

public class Lion extends Predators {
    public Lion(String name, String type, AviarySize size) {
        super(name, type, AviarySize.PredatorBig);
    }

    @Override
    public void swim() {
        System.out.println("Побаиваюсь воды");

    }

    @Override
    public void run() {
        System.out.println("Бегаю очень быстро");

    }

    @Override
    public void voice() {
        System.out.println("Arghrrrrrrrrrrr");

    }
}
