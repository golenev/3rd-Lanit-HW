package HW3;

import java.util.HashMap;

public class Aviary<T extends Animals> {
    private AviarySize size;
    private final HashMap<Integer, T> aviary = new HashMap<>();

    public Aviary(AviarySize predatorSmall) {
    }
}
