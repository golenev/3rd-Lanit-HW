package HW3;

public enum AviarySize {
    PredatorSmall(1),
    PredatorBig(2),
    HerbivoreSmall(3),
    HerbivoreBig(4);

    private int size;

    AviarySize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "AviarySize{" +
                "size=" +  size +
                '}';
    }
    public int getSize() {
        return size;
    }
}
