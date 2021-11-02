package HW3;

public class Elephant extends Herbivore{

    public Elephant(String name, String type, AviarySize size) {
        super(name, type, AviarySize.HerbivoreBig);
    }



    @Override
    public void swim() {
        System.out.println("люблю купаться, плавать не умею");
    }

    @Override
    public void run() {
        System.out.println("я очень медленный");

    }

    @Override
    public void voice() {
        System.out.println("AaaaaaaaaaaaaAAaAAAaa");

    }
}
