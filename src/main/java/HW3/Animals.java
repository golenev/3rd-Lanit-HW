package HW3;

public abstract class Animals {
    public abstract  void eat();
    public abstract  void swim();
    public abstract  void run();
    public abstract  void voice();

    private String name;
    private String type;
    private AviarySize size;

    public Animals(String name, String type, AviarySize size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AviarySize getSize() {
        return size;
    }

    public void setSize(AviarySize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Имя='" + name + '\'' +
                ", Тип='" + type + '\'' +
                ", Размер вольера=" + size +
                '}';
    }
}
